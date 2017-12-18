package com.mryao.bigdata.utils;

import com.mryao.bigdata.entity.ResultDataProvince;
import com.mryao.bigdata.entity.ResultDataYear;
import com.mryao.bigdata.service.IRawDaraService;
import com.mryao.bigdata.service.IResultDataProvinceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nelsoner 蒋酱酱
 * @date 2017/12/18 11:58
 * 描述:利用hive实现大数据分析
 * @param
 * @return
 */
public class QueryHiveUtils {

    private static Connection conn=JDBCToHiveUtils.getConnnection();
    private static PreparedStatement ps;
    private static ResultSet rs;

    /**
     *
     * @author Nelsoner 蒋酱酱
     * @date 2017/12/18 11:58
     * 描述:根据省份分析
     * @param []
     * @return java.util.List<com.mryao.bigdata.entity.ResultDataProvince>
     */
    public static List<ResultDataProvince> getResultDataProvince()
    {
        List list = new ArrayList<ResultDataProvince>();
        String sql="SELECT AREA,COUNT(AREA)  FROM articles GROUP BY AREA";
        System.out.println(sql);
        try {
            ps=JDBCToHiveUtils.prepare(conn, sql);
            rs=ps.executeQuery();
            int columns=rs.getMetaData().getColumnCount();
            while(rs.next())
            {
                ResultDataProvince result = new ResultDataProvince();
               /* for(int i=1;i<=columns;i++)
                {
                    System.out.print(rs.getString(i));
                    System.out.print("\t\t");
                }*/
                result.setProvince(rs.getString(1));
                result.setNum(Long.parseLong(rs.getString(2)));

                list.add(result);
                System.out.println();
            }
            return list;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    /**
     *
     * @author Nelsoner 蒋酱酱
     * @date 2017/12/18 11:59
     * 描述:根据年份分析数据
     * @param []
     * @return java.util.List<com.mryao.bigdata.entity.ResultDataYear>
     */
    public static List<ResultDataYear> getResultDataYear()
    {
        List list = new ArrayList<ResultDataYear>();
        String sql="SELECT year(PublishTime),COUNT(year(PublishTime)) FROM articles GROUP BY year(PublishTime)";
        System.out.println(sql);
        try {
            ps=JDBCToHiveUtils.prepare(conn, sql);
            rs=ps.executeQuery();
            int columns=rs.getMetaData().getColumnCount();
            while(rs.next())
            {
                ResultDataYear result = new ResultDataYear();
               /* for(int i=1;i<=columns;i++)
                {
                    System.out.print(rs.getString(i));
                    System.out.print("\t\t");
                }*/
                result.setYear(rs.getString(1));
                result.setNum(Long.parseLong(rs.getString(2)));

                list.add(result);
                //System.out.println();
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

/*    public static void main(String[] args) {
        String tablename="articles";
        QueryHiveUtils.getResultDataProvince(tablename);
    }*/

}
