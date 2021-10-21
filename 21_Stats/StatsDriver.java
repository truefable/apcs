public class StatsDriver{
	public static void main(String args[]){
		Stats.mean(7,7);//return 7
		Stats.mean(1,3);//return 2
		Stats.mean(1,2);//return 1
		Stats.mean(0.12,0.34);//return 0.23
		Stats.max(1,2);//return 2
		Stats.max(1.2,2.1);//return 2.1
		Stats.geoMean(2,2);//return 2
		Stats.geoMean(2,-2);//return error
		Stats.geoMean(-2,-2);//return 2
		Stats.geoMean(1.2,-2.1);//return error
	}
}