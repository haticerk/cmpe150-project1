public class project1 {
	public static void main(String[] args){
		int stickmanHeight = Integer.parseInt(args[0]);
		int stairHeight = Integer.parseInt(args[1]);
		for(int frame=1; frame<=stickmanHeight-stairHeight; frame++){
			kafa(stickmanHeight,stairHeight, frame);
			for(int e=0; e<stickmanHeight-stairHeight-frame; e++){
				g�vde(stickmanHeight,stairHeight,frame,e);
			}
			ayak(stickmanHeight, stairHeight , frame);
			for(int r=0; r<frame-1; r++){
				kalan(stickmanHeight,stairHeight,frame,r);
			}
			
			System.out.println("\n\n\n");
		}
	}
	public static void kafa(int stickmanHeight, int stairHeight,int frame){
		bo�luk(frame);
		System.out.println(" o");
		bo�luk(frame);
		System.out.println("/|\\");
		int height=stickmanHeight-stairHeight-3;
		for(int i=0; i<height; i++){
			bo�luk(frame);
			System.out.println(" | ");
		}
		for(int �izgi=0; �izgi<frame-1; �izgi++){
			bo�luk(frame);
			System.out.println(" |");
		}
		
	}
	public static void g�vde(int stickmanHeight, int stairHeight,int frame, int e){
		bo�luk(frame);
		System.out.print(" | ");
		for(int bo�luk=0; bo�luk<(stickmanHeight-stairHeight-frame-e)*3; bo�luk++){
			System.out.print(" ");
		}
		System.out.print("___|");
		for(int y�ld�z=0; y�ld�z<e*3; y�ld�z++){
			System.out.print("*");
		}
		System.out.println("|");
	}
	public static void ayak(int stickmanHeight, int stairHeight,int frame){
		bo�luk(frame);
		System.out.print("/ \\");
		System.out.print("___|");
		for(int y�ld�z=(stickmanHeight-stairHeight-1)*3; y�ld�z>3*(frame-1); y�ld�z--){
			System.out.print("*");
		}
		System.out.println("|");
	}
	public static void kalan(int stickmanHeight, int stairHeight,int frame, int r){
		for(int bo�luk=0; bo�luk<(frame-1-r)*3; bo�luk++){
			System.out.print(" ");
		}
		System.out.print("___|");
		for(int y�ld�z=3*(stickmanHeight-stairHeight); y�ld�z>3*(frame-1-r); y�ld�z--){
			System.out.print("*");
		}
		System.out.println("|");
	}
    public static void bo�luk(int frame){
    	for(int space=0; space<(frame-1)*3; space++){
    		System.out.print(" ");
    	}
    }
}
