package week3.day2;

public class JavaConnection1 extends MySqlConnection {

	@Override
	public void connect() {
	System.out.println("connected");
		
	}

	@Override
	public void disconnect() {
		System.out.println("disconnected");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("executed");
		
	}

	@Override
	public void executeQuery() {
		System.out.println("query executed");
		

		
	}
	public static void main(String[] args) {
		JavaConnection1 connect=new JavaConnection1();
		connect.connect();
		connect.disconnect();
		connect.executeUpdate();
		connect.executeQuery();
		
		
		
	}
	

}
