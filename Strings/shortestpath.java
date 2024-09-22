public class shortestpath{
    public static float shortPath(String dir){
        int x=0,y=0;
        for(int i=0;i<dir.length();i++){
            if(dir.charAt(i)=='N'){//north
                y+=1;
            }else if(dir.charAt(i)=='E'){//east
                x+=1;
            }else if(dir.charAt(i)=='S'){//south
                y-=1;
            }else if(dir.charAt(i)=='W'){//west
                x-=1;
            }
        }
        System.out.println(x+" "+y);
        float path=(float)Math.sqrt(x*x + y*y);
        return path;
        
    }
    public static void main(String args[]){
        String dir="WNEENESENNN";
        System.out.print(shortPath(dir));
    }
}