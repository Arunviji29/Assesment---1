class circle {
    public static void main(String[] args) {
        int r = 25;
        int diameter = 2*r;
        double circumference = 2*(Math.PI*r);
        double area = Math.PI * Math.pow(r,2); // π * r^2
        System.out.println("Radius of a circle Diameter is : " + diameter);
        System.out.println("Radius of a circle Circumferencer is : " + circumference);
        System.out.println("Radius of a circle Area is : " + area);
    }
}
