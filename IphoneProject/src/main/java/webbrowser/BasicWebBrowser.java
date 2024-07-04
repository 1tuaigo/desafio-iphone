package webbrowser;

public class BasicWebBrowser implements WebBrowser{
    private String currentPage;

    @Override
    public void browse(String url){
        this.currentPage = url;
        System.out.println("Browsing: "+url);
    }
}
