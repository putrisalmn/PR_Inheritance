import java.util.ArrayList;

public class Musuh extends Player{
    @Override
    public int getKekuatan() {
        return kekuatan;
    }

    @Override
    public void setKekuatan(int kekuatan) {
        this.kekuatan = kekuatan;
    }

    private int kekuatan = 10;


    @Override
    public int getKesehatan() {
        return kesehatan;
    }

    @Override
    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    private int kesehatan = 50;
    private String nama = "goblin";
    private ArrayList<String> arrAksi = new ArrayList<>();
    private boolean tau = false;

    public void battle (Player musuh){
        musuh.setKesehatan(musuh.getKesehatan()-getKekuatan());
    }

    public Musuh() {
        arrAksi.add("dekati musuh");
        arrAksi.add("lawan");
    }
    public void aksi(int pil){
        if(pil==1){
            System.out.println("Kamu mendekati musuh");
            tau = true;
        }else if(pil==2){
            if(tau){
                System.out.println("Kamu melawan musuh");

            }

        }else{
            System.out.println("Kamu melarikan diri!");
        }
    }
    public ArrayList<String> getAksi() {
        return arrAksi;
    }









}
