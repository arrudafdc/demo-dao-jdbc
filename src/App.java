

import java.sql.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;


public class App {
    public static void main(String[] args) throws Exception {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = new Seller(null, "João Silva", "joao@gmail.com", new Date(0), 15000.00, new Department(1, null));

        sellerDao.insert(seller);
        System.out.println(seller);

    }
}
