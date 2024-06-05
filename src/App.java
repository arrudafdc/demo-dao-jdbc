import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;



public class App {
    public static void main(String[] args) throws Exception {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(8);

        seller.setName("Bruno Henrique");
        seller.setEmail("bruno@gmail.com");
        seller.setBaseSalary(9000.00);

        sellerDao.update(seller);

    }
}
