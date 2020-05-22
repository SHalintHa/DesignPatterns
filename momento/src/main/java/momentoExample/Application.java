package momentoExample;

public class Application {
	
	public static void main(String[] args) {
		
		CareTaker careTaker = new CareTaker();
		
		
		FileWriterUtil fileWriterUtil = new FileWriterUtil("Test.txt");
		fileWriterUtil.write("First Data set ");
		System.out.println(fileWriterUtil);
		
		careTaker.save(fileWriterUtil);
		
		fileWriterUtil.write("Second Data set ");
		System.out.println(fileWriterUtil);
		
		careTaker.save(fileWriterUtil);
		
		fileWriterUtil.write("Third Data set ");
		System.out.println(fileWriterUtil);
		
		
		
		careTaker.undo(fileWriterUtil);
		System.out.println(fileWriterUtil);
		
		
		
		
		
	}

}
