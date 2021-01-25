
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


import javax.swing.JPanel;
import javax.swing.JTextPane;

/**
 * This is the main class for the Isolation Game. It launches the game and allows the player to play with the computer.
 * If the user wins against the computer, a winning screen is shown.
 * Else a losing screen is shown.
 * The user and computer are only allowed to move like a queen in chess.
 * Every time the user/computer moves, their spot is replaced with a "X".
 * Players are not allowed to move over the X or on the X.
 * @author A. Agrawal
 * @version 1.0
 */
public class GameBoard {
	private JButton[][] isolationButtons = new JButton[5][5];
	private String[][] obstacles = new String[5][5];
	private JFrame mainFrame;
	private JTextPane header;
	private JPanel mainPanel;
	private JTextPane footer;
	private GridBagConstraints gbc = new GridBagConstraints();
	private JButton closeButton;
	private JButton playAgain;
	
	private final String PLAYER1 = "<html><center>" + "<font color=#00cc00 size=7>P1</font>";
	private final String PLAYER2 = "<html><center>" + "<font color=#666666 size=7>P2</font>";
	private final String DISABLED = "<html><center>" + "<font color=#ff3300 size=7>X</font>";
	private final String WON = "<html><p style='font-size:20px;color:blue;text-align:center;'>"
			+ "Yay - You Won !!!</p></body></html>";
	private final String LOST = "<html><p style='font-size:20px;color:blue;text-align:center;'>"
			+ "Sorry - You Lost :-(</p></body></html>";
	private final String VALID_MOVE_TEXT = "<html><p style='font-family: Verdana;font-size:10px;color:black;text-align:center;'>" 
			+ "Please make a valid move according to game rules.</p></body></html>";
	private final String EMPTY_TEXT = "";
	private final String PLAY_AGAIN = "Play Again";
	private final String CLOSE = "Close";
	private final String BLOCKED = "X";
	
	/**
	 * The GameBoard constructor constructs the board of the Isolation Game.
	 * It displays all the UI components for the game including Instructions at the top.
	 * Game board in the middle of the frame. It also displays the feedback if player has made
	 * invalid move. 
	 * In the footer section it displays Play Again and Close buttons, after the game is over. 
	 */

	public GameBoard() {
		mainFrame = new JFrame("Isolation Board Game");
		mainFrame.setSize(680, 680);
		mainFrame.setResizable(false);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLocationRelativeTo(null);

		mainFrame.setLayout(new GridBagLayout());

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.weighty = 0.10;

		header = new JTextPane();
		header.setContentType("text/html");
		header.setText("<html><div style='font-family: Verdana; text-align:center;' text-align=center><b>Isolation Game</b> </div>"
				+ "<span style='font-family: Verdana; font-size:10px;color:black;text-align:left;'>"
				+ "This is turn-based strategy board game where two players try to isolate their opponent." 
				+ "<br> Players move around like a Queen in Chess: up-down, left-right, and diagonal. "
				+ "<br><br><u> 3 conditions for a valid move:</u>"
				+ "<br> 1. A player cannot move to a cell, which has already been visited. These will be marked as <b>X</b>."
				+ "<br> 2. A player cannot cross over already visited cells, which will be marked as <b>X</b>"
				+ "<br> 3. A player cannot cross over other player. </span>");
	
		header.setEditable(false);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		header.setSize(680,50);
		mainFrame.add(header, gbc);

		
		// Set the grid parameters for game board
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weighty = 0.80;
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(5, 5));
		
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(50, 50, 0, 50); // top, left, bottom, right
		mainFrame.add(mainPanel, gbc);

		// Set the grid parameters for final result of game
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.weighty = 0.8;
		footer = new JTextPane();
		footer.setContentType("text/html");
		footer.setEditable(false);
		mainFrame.add(footer, gbc);
		
		//Add buttons for ending the game
		
		playAgain = new JButton(PLAY_AGAIN);
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.weightx = 0.5;
		gbc.gridwidth = 1;
		mainFrame.add(playAgain, gbc);
		

		closeButton = new JButton(CLOSE);
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.weightx = 0.5;
		gbc.gridwidth = 1;
		mainFrame.add(closeButton, gbc);
		
		closeButton.setVisible(false);
		playAgain.setVisible(false);
		
		mainFrame.setVisible(true);

		
		ClickHandler listener = new ClickHandler();
		closeButton.addActionListener(listener);
		playAgain.addActionListener(listener);

		// Setting the board game
		mainPanel.setSize(500, 500);
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{

				isolationButtons[i][j] = new JButton();
				if (i == 2 && j == 2)
				{
					isolationButtons[i][j].setText(PLAYER1);
					isolationButtons[i][j].setActionCommand(PLAYER1);

				} 
				else
				{

					isolationButtons[i][j].setActionCommand(String.valueOf(i) + "," + String.valueOf(j));
				}

				isolationButtons[i][j].addActionListener(listener);
				mainPanel.add(isolationButtons[i][j]);
			}

		}
		mainFrame.setVisible(true);

	}
    /**
     * This method handles all the user clicks. It repaints the game board after the valid or invalid move 
     * made by Player. 
     * It also handles the Close and PlayAgain buttons.
     * @author A. Agrawal
     * @version 1.0
     */
	
	private class ClickHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			Object obj = event.getSource();
			if (obj == closeButton)
			{
				mainFrame.dispose();

			} else if (obj == playAgain)
			{
				mainFrame.dispose();
				new GameBoard();

			} else
			{
				repaintBoardGame(event);

			}
			return;

		}
		
        /**
         * This method uses GameStartegy to choose and show the move of Player 1(computer).
         * It also checks if Player 2 has any valid moves left.
         * If Player 1 has no moves left, the winning screen is shown.
         * Else the losing screen is shown.
         */
		
		public void makeMove() {
			int p1_x = -1;
			int p1_y = -1;
			int p2_x = -1;
			int p2_y = -1;

			for (int i = 0; i < 5; i++)
			{
				for (int j = 0; j < 5; j++)
				{
					// Get the positions of player 1
					if (isolationButtons[i][j].getText().equals(PLAYER1))
					{
						p1_x = i;
						p1_y = j;
						isolationButtons[i][j].setText(DISABLED);
						isolationButtons[i][j].setActionCommand(DISABLED);
						obstacles[i][j] = BLOCKED;

					}
					if (isolationButtons[i][j].getText().equals(PLAYER2))
					{
						p2_x = i;
						p2_y = j;
					}
				}
			}
			
			int[] move = GameStrategy.getMove(p1_x, p1_y, obstacles);
			if (move != null)
			{
				isolationButtons[move[0]][move[1]].setText(PLAYER1);
				isolationButtons[move[0]][move[1]].setActionCommand(PLAYER1);
				obstacles[move[0]][move[1]] = BLOCKED;
				p1_x = move[0];
				p1_y = move[1];
			} 
			else
			{
				isolationButtons[p1_x][p1_y].setText(PLAYER1);
				displayFinalScreen(true);
				disableGameBoard(isolationButtons);
			}
			
			
			// check if Player1 has valid moves left
			boolean hasValidMovesP1 = GameStrategy.hasValidMoves(p1_x, p1_y, obstacles);
			if (!hasValidMovesP1)
			{
				displayFinalScreen(true);
				disableGameBoard(isolationButtons);
			}

			else {
			
				// check if Player2 has valid moves left
				boolean hasValidMovesP2 = GameStrategy.hasValidMoves(p2_x, p2_y, obstacles);
				if (!hasValidMovesP2)
				{
					displayFinalScreen(false);
					disableGameBoard(isolationButtons);
				}
			}

		}
        /**
         * Checks if the user clicked on "P1", "X" or "P2".
         * Then gets the location of P2 and adds it to the obstacles array as "BLOCKED"
         * It also moves P2 to where they clicked if it is a valid move. Also makes it 
         * for the computer if the user's move is valid.
         * 
         * @param event The event that tells what the user clicked.
         */
		public void repaintBoardGame(ActionEvent event) {
			int p2_x = -1;
			int p2_y = -1;

			if (event.getActionCommand().equals(PLAYER1) || event.getActionCommand().equals(PLAYER2)
					|| event.getActionCommand().equals(DISABLED))
			{
				return;
			}
			
			
			// check if player 2 has made valid move
			boolean validMove = false;
			for (int i = 0; i < 5; i++)
			{
				for (int j = 0; j < 5; j++)
				{
					if (isolationButtons[i][j].getText().equals(PLAYER2))
					{
						p2_x = i;
						p2_y = j;
						obstacles[p2_x][p2_y] = BLOCKED;
						obstacles[p2_x][p2_y] = BLOCKED;
						validMove = GameStrategy.isValidMove(p2_x, p2_y,
								Integer.valueOf(event.getActionCommand().substring(0, 1)),
								Integer.valueOf(event.getActionCommand().substring(2)), obstacles);
						break;
					}
					// This should happen only for Player2's first turn
					if (p2_x == -1 && p2_y == -1)
					{
						validMove = true;
						
					}
				}
			}

			if (validMove)
			{
				for (int i = 0; i < 5; i++)
				{
					for (int j = 0; j < 5; j++)
					{
						// Set the old position for both players as disabled
						if (isolationButtons[i][j].getText().equals(PLAYER2))
						{
							isolationButtons[i][j].setText(DISABLED);
							isolationButtons[i][j].setActionCommand(DISABLED);
							obstacles[i][j] = BLOCKED;
						}

						// Change the grid cell to show players position
						String tempPosition = String.valueOf(i) + "," + String.valueOf(j);
						if (tempPosition.equals(event.getActionCommand()))
						{
							// set the new position of player2
							isolationButtons[i][j].setText(PLAYER2);
							isolationButtons[i][j].setActionCommand(PLAYER2);
							footer.setText(EMPTY_TEXT);
							obstacles[i][j] = BLOCKED;
							

						}
					}
				}
				// make move for computer player
				makeMove();
			}
			// not valid move by Player 1
			else
			{
				footer.setText(VALID_MOVE_TEXT);
				return;
			}
		}
        /**
         * Displays the final screen of the game.
         * Displays the winning or lost message to Player.
         * It also shows the "Play Again" and "Close" button.
         * @param result Pass the result of the game(true if the user won, or else false).
         */
		public void displayFinalScreen(boolean result) {
			
			if (result)
			{
				footer.setText(WON);
			}
				
			else
			{
				footer.setText(LOST);
			}
			
			closeButton.setVisible(true);
			playAgain.setVisible(true);

		}
		/**
		 * Disables the game after the game has ended.
		 * @param isolationButtons The array of buttons used in the game.
		 */
		
		public void disableGameBoard(JButton[][] isolationButtons) {
			for (int i = 0; i < 5; i++)
			{
				for (int j = 0; j < 5; j++)
				{ 
					isolationButtons[i][j].setEnabled(false);
				}
			
			}
		}

	}
    /**
     * Calls the GameBoard constructor to start the game.
     * @param args Arguments for the main method. These are ignored by the program.
     */
	public static void main(String[] args) {

		new GameBoard();

	}

}