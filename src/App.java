

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;


public class App {
    public static void main(String[] args) throws Exception {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        List<Seller> list = sellerDao.findAll();

        for (Seller seller : list) {
            System.out.println(seller);
        }

    }
}
