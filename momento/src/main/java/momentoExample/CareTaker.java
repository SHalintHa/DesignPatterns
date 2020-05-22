package momentoExample;

import momentoExample.FileWriterUtil.Memento;


public class CareTaker {
	
	Memento fileWriterUtil;
	
	public void save(FileWriterUtil fileWriterUtil) {
		this.fileWriterUtil = fileWriterUtil.save();
	}
	
	
	public void undo(FileWriterUtil fileWriterUtil) {
		fileWriterUtil.undo(this.fileWriterUtil);
	}
}
