package fileSystem;

import javax.swing.JFileChooser;

public class FileSystemTool {
	private JFileChooser fileChooser = new JFileChooser();
	private Integer responseCod;
	private Boolean done;

	public String chooseAFile() {
		String path;
		
		selectAFile();
		
		if (isDone()) {
			path = fileChooser.getSelectedFile().toPath().toString();
		} else {
			path = null;
		}
		
		return path;
	}

	private void selectAFile() {
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
}
