package fileSystem;

public class FyleSystemApp {
	public static void main(String[] args) {
		FileSystemTool fileSystemTool = new FileSystemTool();
		System.out.println(fileSystemTool.chooseFile());
		System.out.println(fileSystemTool.chooseDirectory());

	}

}
