import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class App {
    public static void main(String[] args) throws Exception {

        DepartmentDao departmentDao = DaoFactory.createDapertmentDao();
        List<Department> list = departmentDao.findAll();

        for (Department department : list) {
            System.out.println(department);
        }

    }
}
