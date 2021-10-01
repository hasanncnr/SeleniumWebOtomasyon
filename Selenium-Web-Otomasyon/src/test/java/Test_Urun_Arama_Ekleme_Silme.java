import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Urun_Arama_Ekleme_Silme {
    HomePage homePage;
    ProductPage productPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;
    LoginPage loginPage;




    @Test
    public void GirisYap(){
        homePage.loginButton();
        Assertions.assertTrue(loginPage.İsOnLoginPage(),"Sayfa Bulunamadı");


    }
    @Test
    public void UrunArama(){
        homePage.searchBox().search("Pantolon");
        Assertions.assertTrue(productPage.İsOnProductPage(),"Sayfa Bulunamadı");


    }
    @Test
    public void DahaFazlaGor(){
        productPage.seeMore();
        Assertions.assertTrue(productPage.İsOnProductPage(),"Sayfa Bulunamadı");



    }
    @Test
    public void UrunSec(){
        productPage.selectProduct(1);
        Assertions.assertTrue(productDetailPage.İsOnProductDeailPage(),"Sayfa Bulunamadı");


    }

    @Test
    public void SepeteEkle(){
        productDetailPage.addToCart();
        Assertions.assertTrue(homePage.İsProductCountUp(),"Sepete eklenen ürün yok");


    }
    @Test
    public void SepeteGit(){
        homePage.gotoCart();
        Assertions.assertTrue(cartPage.CheckİfProductAdded(),"Ürün Eklenemedi");

    }

}
