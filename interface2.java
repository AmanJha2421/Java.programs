interface human{
        void eyeColor(String eye);
        void skinTone(String skin);
        void height(int height);
    }
    class aman implements human{
        public void height(int height){
            System.out.println("height (in cm) = "+height);
        }
        public void eyeColor(String eye){
            System.out.println("eye color = "+eye);
        }
        public void skinTone(String skin){
            System.out.println("Skin color = "+skin);
        }
    }
    public class interface2 {
        public static void main(String[] args) {
            aman features = new aman();
            features.eyeColor("brown");
            features.skinTone("Brown");
            features.height(167);
            
        }
}
