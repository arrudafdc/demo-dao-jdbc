

import model.dao.DaoFactory;
import model.dao.SellerDao;




public class App {
    public static void main(String[] args) throws Exception {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        sellerDao.deleteById(8);
        sellerDao.deleteById(9);

    }
}
