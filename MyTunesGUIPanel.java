import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * 
 */

/**
 * @author trevor.wiedenmann
 *
 */
public class MyTunesGUIPanel extends JPanel {
	/**
	 * GUI representation of songs
	 */
	private JLabel playListInfoLabel;
	private JList<Song> songList;
	private JButton playPreviousButton;
	private JButton playNextButton;
	private JButton upButton;
	private JButton downButton;
	private JButton addSongButton;
	private JButton removeSongButton;
	private JButton playorstopSongButton;
	private JLabel songInformationLabel;
	private PlayList songPlayList = new PlayList("songs");
	private JButton[][] songListButtons;
	String newSong;
	String removeSong;
	int again;

	/**
	 * Creates the GUI panel
	 */
	public MyTunesGUIPanel() {
		setLayout(new BorderLayout());
		this.setPreferredSize(new Dimension(400, 400));

		/**
		 * Sets the main panel
		 */
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
		add(centerPanel, BorderLayout.WEST);

		/**
		 * sets the right sub panel
		 */
		JPanel rightPanel = new JPanel();
		songListButtons = new JButton[5][5];
		rightPanel.setLayout(new GridLayout(songListButtons[0].length, songListButtons[0].length));
		for (int i = 0; i < songListButtons[0].length; i++) {
			for (int j = 0; j < songListButtons[i].length; j++) {
				songListButtons[i][j] = new JButton();
				rightPanel.add(songListButtons[i][j]);
				// songListButtons[i][j].addActionListener(new
				// SongListListener());
			}
			add(rightPanel, BorderLayout.CENTER);
		}

		/**
		 * sets the JList of songs
		 */
		songList = new JList();
		songList.setSelectedIndex(0);
		songPlayList.addSong(new Song("Test", "Name", 15, "sounds/test.wav"));
		songList.setListData(songPlayList.getSongArray());
		
		/**
		 * sets a scroll pane to scroll through the song list
		 */
		JScrollPane scrollPane = new JScrollPane(songList, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		/**
		 * sets the top sub panel
		 */
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));
		add(topPanel, BorderLayout.NORTH);

		/**
		 * sets labels that tell the user the name of the play list, number of
		 * songs, and the total play time of the play list
		 */

		playListInfoLabel = new JLabel("My Playlist     " + songPlayList.getNumSongs() + " song(s)     " + "~ " + songPlayList.getTotalPlayTime() + " minute(s)");

		/**
		 * sets the bottom sub panel
		 */

		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.X_AXIS));
		add(bottomPanel, BorderLayout.SOUTH);

		/**
		 * sets the information of the selected song
		 */
		songInformationLabel = new JLabel("none by nobody");

		/**
		 * sets buttons that play the next and previous songs
		 */

		playPreviousButton = new JButton("<<");
		playNextButton = new JButton(">>");
		// playPreviousButton.addActionListener(new ControlListener());
		// playNextButton.addActionListener(new ControlListener());

		/**
		 * sets a button that plays or stops the current song
		 */
		playorstopSongButton = new JButton("Play/Stop");
		// playorstopSongButton.addActionListener(new ControlListener());

		/**
		 * sets buttons that add or remove songs
		 */

		JPanel addRemovePanel = new JPanel();
		addRemovePanel.setLayout(new BoxLayout(addRemovePanel, BoxLayout.X_AXIS));
		addSongButton = new JButton("Add Song");
		removeSongButton = new JButton("Remove Song");
		addSongButton.addActionListener(new AddButtonActionListener());
		//removeSongButton.addActionListener(new RemoveButtonActionListener());
		
		 /**
		  * sets the left sub panel
		 */

		JPanel upDownPanel = new JPanel();
		upDownPanel.setLayout(new BoxLayout(upDownPanel, BoxLayout.Y_AXIS));
		centerPanel.add(upDownPanel);

		/**
		 * sets buttons that select songs above or below the current one
		 */

		upButton = new JButton("^");
		downButton = new JButton("v");
		//upButton.addActionListener(new ControlListener());
		//downButton.addActionListener(new ControlListener());

		/**
		 * adds all elements into the GUI panels
		 */
		centerPanel.add(topPanel);
		topPanel.add(playListInfoLabel);
		centerPanel.add(scrollPane);
		centerPanel.add(bottomPanel);
		bottomPanel.add(songInformationLabel);
		bottomPanel.add(playPreviousButton);
		bottomPanel.add(playorstopSongButton);
		bottomPanel.add(playNextButton);
		centerPanel.add(addRemovePanel);
		centerPanel.add(addSongButton);
		centerPanel.add(removeSongButton);
		upDownPanel.add(upButton);
		upDownPanel.add(downButton);
		/**
		 * sets the second sub panel to make the song chooser
		 */
		/**
		 * private class SongListListener implements ActionListener {
		 * 
		 * @Override public void actionPerformed(ActionEvent event) { // TODO
		 *           Auto-generated method stub JButton src = (JButton)
		 *           event.getSource(); int index = songList.getSelectedIndex();
		 *           for (int i = 0; i < songListButtons.length; i++) { for (int
		 *           j = 0; j < songListButtons[i].length; j++) { if
		 *           (songListButtons[i][j] == src) { index = (i *
		 *           songListButtons.length + j) %
		 *           songList.getModel().getSize(); } } }
		 *           songList.setSelectedIndex(index); }
		 * 
		 *           }
		 * 
		 *           /**private void setSong(JButton btn, Song song) { try {
		 *           ImageIcon icon = new
		 *           ImageIcon(ImageIO.read(song.getFile())); btn.setIcon(icon);
		 *           } catch (IOException ex) { btn.setText("Image not found
		 *           :("); } }
		 */
	}

	/**
	 * Adds an action listener for the addSong button
	 * @author trevor.wiedenmann
	 *
	 */
	private class AddButtonActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			songAdded();
		}
	}
	
	private void songAdded()
	{
		JPanel formInputPanel = new JPanel();
		formInputPanel.setLayout(new BoxLayout(formInputPanel, BoxLayout.Y_AXIS));
		
		JTextField addSongNameField = new JTextField(50);
		JTextField addSongArtistField = new JTextField(30);
		JTextField addSongLengthField = new JTextField(5);
		JTextField addSongFileField = new JTextField(50);
		
		formInputPanel.add(new JLabel("Add a song."));
		formInputPanel.add(new JLabel("Name:"));
		formInputPanel.add(addSongNameField);
		formInputPanel.add(new JLabel("Artist:"));
		formInputPanel.add(addSongArtistField);
		formInputPanel.add(new JLabel("Length of song:"));
		formInputPanel.add(addSongLengthField);
		formInputPanel.add(new JLabel("File:"));
		formInputPanel.add(addSongFileField);
		
		int added = JOptionPane.showConfirmDialog(null, formInputPanel, "Add Song",
    			JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

		if (added == JOptionPane.OK_OPTION)
		{
			songPlayList.addSong(new Song(addSongNameField.getText(), addSongArtistField.getText(), Integer.parseInt(addSongLengthField.getText()), addSongFileField.getText()));
			songList.setListData(songPlayList.getSongArray());
			playListInfoLabel.setText("My Playlist     " + songPlayList.getNumSongs() + " song(s)     " + "~ " + songPlayList.getTotalPlayTime() + " minute(s)");
		}
	}
	
	/**
	 * Adds an action listener to the removeSong button
	 * @author trevor.wiedenmann
	 *
	 */
	/**private class RemoveButtonActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			songRemoved();
		}
	}
	
	private void songRemoved()
	{
		JPanel formInputPanel = new JPanel();
		formInputPanel.setLayout(new BoxLayout(formInputPanel, BoxLayout.Y_AXIS));
		
		formInputPanel.add(new JLabel("Are you sure you want to remove this song?"));
		
		int removed = JOptionPane.showConfirmDialog(null, formInputPanel, "Remove Song",
    			JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

		if (removed == JOptionPane.OK_OPTION)
		{
			String song = addSongNameField.getText() + addSongArtistField.getText() + addSongLengthField.getText() + addSongFileField.getText();
			
			//songList.add(song);
		}
	}
	*/
	/**
	 * Updates the song on the preview panel
	 * @param song
	 */
			
}
