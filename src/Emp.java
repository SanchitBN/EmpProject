
public class Emp {

	private int eno;
	private String ename;
	private double sal;
	private String desg;
	public Emp()
	{
		super();
	
	}
	public Emp(int eno, String ename, double sal, String desg) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.desg = desg;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	
}
