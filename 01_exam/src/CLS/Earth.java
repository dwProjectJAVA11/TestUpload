package CLS;

// static final => 상수
public class Earth {

	// 상수를 표현할 때 일반적으로 대문자로 표현 
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	// java.lang은 사실 그냥 사용하면 됩니다.
	// ex) String, Sysout.., Math
	
	static {
		EARTH_SURFACE_AREA= 4 * EARTH_RADIUS * EARTH_RADIUS * java.lang.Math.PI;
	}
}