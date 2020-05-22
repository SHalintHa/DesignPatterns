package momentoExample;

import java.util.ArrayList;


public class FileWriterUtil {
	
	String name;
	StringBuilder content;
	
	public FileWriterUtil(String name) {
		super();
		this.name = name;
		this.content = new StringBuilder();
	}

	@Override
	public String toString() {
		return "FileWriterUtil [name=" + name + ", content=" + content + "]";
	}
	
	
	public void write(String string) {
		content.append(string);
	}
	
	public Memento save() {
		return new Memento(this.name, this.content);
	}
	
	public void undo(Memento momento) {
		this.name = momento.getName();
		this.content = momento.getContent();
	}
	
	static class Memento{
		private String name;
		private StringBuilder content;
		
		public Memento(String name, StringBuilder content){
			this.name=name;
			this.content=new StringBuilder(content);
		}

		public String getName() {
			return name;
		}

		public StringBuilder getContent() {
			return content;
		}
		
		
	}
}
