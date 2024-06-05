package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import db.DB;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentDaoJdbc implements DepartmentDao  {

  Connection conn = null;

  public DepartmentDaoJdbc(Connection conn) {
    this.conn = conn;
  }

  @Override
  public void deleteById(Integer id) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public List<Department> findAll() {
    PreparedStatement st = null;
    ResultSet rs = null;
    try {
      st = conn.prepareStatement(
        "select * from department"
      );

      rs = st.executeQuery();

      List<Department> list = new ArrayList<>();

      while (rs.next()) {
        Department dep = new Department();
        dep.setId(rs.getInt("Id"));
        dep.setName(rs.getString("Name"));
        list.add(dep);
      }
      return list;
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
    finally {
      DB.closeResultSet(rs);
      DB.closeStatement(st);
    }
  }

  @Override
  public Department findById(Integer id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void insert(Department obj) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void update(Department obj) {
    // TODO Auto-generated method stub
    
  }
  
}
