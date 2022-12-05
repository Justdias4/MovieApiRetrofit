import java.util.List;

public class Movie {
    Image i;            //image
    String id;          //id
    String l;           //movie name
    String q;           //genre
    String qid;         // qid = "movie"
    int rank;
    String s;     // cast//      s:"Leonardo DiCaprio, Joseph Gordon-Levitt"
    int y;              // year
    public Movie(){
    }

    @Override
    public String toString() {
        return "Movie{" +
                "i=" + i +
                ", id='" + id + '\'' +
                ", l='" + l + '\'' +
                ", q='" + q + '\'' +
                ", qid='" + qid + '\'' +
                ", rank=" + rank +
                ", s='" + s + '\'' +
                ", y=" + y +
                '}';
    }

    public Movie(Image i, String id, String l, String q, String qid, int rank, String s, int y) {
        this.i = i;
        this.id = id;
        this.l = l;
        this.q = q;
        this.qid = qid;
        this.rank = rank;
        this.s = s;
        this.y = y;
    }

    public void setI(Image i) {
        this.i = i;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setL(String l) {
        this.l = l;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public void setQid(String qid) {
        this.qid = qid;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setS(String s) {
        this.s = s;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Image getI() {
        return i;
    }

    public String getId() {
        return id;
    }

    public String getL() {
        return l;
    }

    public String getQ() {
        return q;
    }

    public String getQid() {
        return qid;
    }

    public int getRank() {
        return rank;
    }

    public String getS() {
        return s;
    }

    public int getY() {
        return y;
    }
}
