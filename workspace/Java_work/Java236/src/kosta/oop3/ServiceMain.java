package kosta.oop3;

public class ServiceMain {

	public static void main(String[] args) {
		OracleDAO od = new OracleDAO();
		MySqlDAO msd = new MySqlDAO();
		
		Service s = new Service(od);
		s.insertService();
	}
}
