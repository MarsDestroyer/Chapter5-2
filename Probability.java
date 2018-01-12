public class Probability implements ProbabilityCalc, Comparable <Probability>
{

    private double prob;
    private int sampleSpace;
    private double favorable;
    
    public Probability(int fav, int samplw) {
        this.favorable = fav;
        this.sampleSpace = sample;
        prob = ((double) favorable);
    }
    public void getProbability() {
        this.prob = this.sample(this.sample + this.favorable);
    }
    public double probabilityAND(Probability p2){
        return this.prob * p2.prob;
    }
    
    public double probabilityOR(Probability p2, double overlap){
        return 0;
    }
    
    public int compareTo(Probability ob) {
        if(this.prob > other.prob){
            return 1;
        }
        else if(this.prob < other.prob){
            return -1;
        }
        else{
            return 0;
        }
    }
}