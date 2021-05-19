package Interface.live;
import Interface.music.Playable;
import Interface.music.string.Veena;
import Interface.music.wind.Saxophone;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Saxophone s=new Saxophone();
    Veena v=new Veena();
    Playable pv,ps;
    pv=new Veena();
    ps=new Saxophone();
    pv.play();
    ps.play();
    s.play();
    v.play();
	}

}
