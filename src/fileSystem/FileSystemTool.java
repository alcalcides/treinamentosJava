package fileSystem;

import javax.swing.JFileChooser;

public class FileSystemTool {
	private JFileChooser fileChooser = new JFileChooser();
	private Integer selectionMode;
	private Integer responseCod;
	private Boolean done;

	public String chooseFile() {
		String path;
		selectAFile();
		path = isDone() ? fileChooser.getSelectedFile().toPath().toString() : null;
		return path;
	}

	public String chooseDirectory() {
		String path;
		selectADirectory();
		path = isDone() ? fileChooser.getSelectedFile().toPath().toString() : null;
		return path;
	}

	private void selectAFile() {
		setSelectionMode(JFileChooser.FILES_ONLY);
		Integer codResponse = fileChooser.showOpenDialog(null);
		setResponseCod(codResponse);
	}

	private void selectADirectory() {
		setSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		Integer codResponse = fileChooser.showOpenDialog(null);
		setResponseCod(codResponse);
	}

	private void setResponseCod(Integer responseCod) {
		this.responseCod = responseCod;
		setDone();
	}

	public Integer getResponseCod() {
		return responseCod;
	}

	private boolean setDone() {
		return done = responseCod == JFileChooser.APPROVE_OPTION;
	}

	public boolean isDone() {
		return done;
	}

	private void setSelectionMode(Integer selectionMode) {
		this.selectionMode = selectionMode;
		fileChooser.setFileSelectionMode(selectionMode);
	}

	public Integer getSelectionMode() {
		return selectionMode;
	}
}
