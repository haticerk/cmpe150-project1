public class project1 {
	public static void main(String[] args){
		int stickmanHeight = Integer.parseInt(args[0]);
		int stairHeight = Integer.parseInt(args[1]);
		for(int frame=1; frame<=stickmanHeight-stairHeight; frame++){
			kafa(stickmanHeight,stairHeight, frame);
			for(int e=0; e<stickmanHeight-stairHeight-frame; e++){
				gövde(stickmanHeight,stairHeight,frame,e);
			}
			ayak(stickmanHeight, stairHeight , frame);
			for(int r=0; r<frame-1; r++){
				kalan(stickmanHeight,stairHeight,frame,r);
			}
			
			System.out.println("\n\n\n");
		}
	}
	public static void kafa(int stickmanHeight, int stairHeight,int frame){
		boþluk(frame);
		System.out.println(" o");
		boþluk(frame);
		System.out.println("/|\\");
		int height=stickmanHeight-stairHeight-3;
		for(int i=0; i<height; i++){
			boþluk(frame);
			System.out.println(" | ");
		}
		for(int çizgi=0; çizgi<frame-1; çizgi++){
			boþluk(frame);
			System.out.println(" |");
		}
		
	}
	public static void gövde(int stickmanHeight, int stairHeight,int frame, int e){
		boþluk(frame);
		System.out.print(" | ");
		for(int boþluk=0; boþluk<(stickmanHeight-stairHeight-frame-e)*3; boþluk++){
			System.out.print(" ");
		}
		System.out.print("___|");
		for(int yýldýz=0; yýldýz<e*3; yýldýz++){
			System.out.print("*");
		}
		System.out.println("|");
	}
	public static void ayak(int stickmanHeight, int stairHeight,int frame){
		boþluk(frame);
		System.out.print("/ \\");
		System.out.print("___|");
		for(int yýldýz=(stickmanHeight-stairHeight-1)*3; yýldýz>3*(frame-1); yýldýz--){
			System.out.print("*");
		}
		System.out.println("|");
	}
	public static void kalan(int stickmanHeight, int stairHeight,int frame, int r){
		for(int boþluk=0; boþluk<(frame-1-r)*3; boþluk++){
			System.out.print(" ");
		}
		System.out.print("___|");
		for(int yýldýz=3*(stickmanHeight-stairHeight); yýldýz>3*(frame-1-r); yýldýz--){
			System.out.print("*");
		}
		System.out.println("|");
	}
    public static void boþluk(int frame){
    	for(int space=0; space<(frame-1)*3; space++){
    		System.out.print(" ");
    	}
    }
}
