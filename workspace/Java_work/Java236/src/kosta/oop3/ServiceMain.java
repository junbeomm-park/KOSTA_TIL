package kosta.oop3;

public class ServiceMain {

	public static void main(String[] args) {
		OracleDAO od = new OracleDAO();
		MySqlDAO msd = new MySqlDAO();
		
		Service s = new Service(new DAO() {
			
			@Override
			public void insert() {
				System.out.println("MSSQL 출력");
			}
		});
		s.insertService();
	}
}
