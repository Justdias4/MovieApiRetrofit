public class MovieResponse {
    Movie[] d;
    String q;
    int v;
    public MovieResponse(){

    }
    public MovieResponse(Movie[] d, String q, int v) {
        this.d = d;
        this.q = q;
        this.v = v;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public Movie[] getD() {
        return d;
    }

    public void setD(Movie[] d) {
        this.d = d;
    }

}