public class SquarePyramid {

    int s, h;
    double calcVol(){
        double vol =0;
        vol = (1.0/3.0)*(s*s)*h;
        return vol;
    }
    
    double calcSurface(){
        double sur = 0;
        double la = s*s;
        double sm = Math.sqrt((h*h)+(0.5*s*0.5*s));
        double lsgtg = 0.5*s*sm;
        sur =la+4*lsgtg;
        vol = (1.0/3.0)*(s*s)*h;
        return sur;
    }
} 