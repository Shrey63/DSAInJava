public class SkipAString {
    public static void main(String[] args) {
        String s="ShreyaShyaaSh";
        String rm="Sh";
        System.out.println(skipString(s,rm,"Shreya"));
    }

    private static String skipString(String s, String rm,String nrm) {
        if(s.isEmpty())
            return "";
        if(s.startsWith(rm) && !s.startsWith(nrm))
        {
            return skipString(s.substring(rm.length()),rm,nrm);
        }
        else
        {
            return s.charAt(0)+skipString(s.substring(1),rm,nrm);
        }
    }
}
