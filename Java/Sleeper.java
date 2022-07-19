
public class Sleeper extends Thread{
	int x;
	int offset;
	
	Sleeper(int x, int offset){
		this.x = x;
		this.offset = offset;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(offset+x);
			System.out.println(x);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
