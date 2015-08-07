
package chehui.maichetong.useroperationservice;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.jinouts.xml.namespace.QName;
import org.jinouts.jws.WebMethod;
import org.jinouts.jws.WebParam;
import org.jinouts.jws.WebResult;
import org.jinouts.jws.WebService;
import org.jinouts.xml.bind.annotation.XmlSeeAlso;
import org.jinouts.xml.ws.RequestWrapper;
import org.jinouts.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.4
 * 2015-07-07T22:03:18.924+08:00
 * Generated source version: 3.0.4
 * 
 */
public final class UserOperationServiceSoap_UserOperationServiceSoap12_Client {

    private static final QName SERVICE_NAME = new QName("http://UserOperationService.maichetong.chehui/", "UserOperationService");

    private UserOperationServiceSoap_UserOperationServiceSoap12_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = UserOperationService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        UserOperationService ss = new UserOperationService(wsdlURL, SERVICE_NAME);
        UserOperationServiceSoap port = ss.getUserOperationServiceSoap12();  
        
        {
        System.out.println("Invoking getBrandABC...");
        chehui.maichetong.useroperationservice.ResultOfListOfTBrand _getBrandABC__return = port.getBrandABC();
        System.out.println("getBrandABC.result=" + _getBrandABC__return);


        }
        {
        System.out.println("Invoking orderQueteBy...");
        java.lang.String _orderQueteBy_fieldname = "";
        chehui.maichetong.useroperationservice.ResultOfListOfTQuote _orderQueteBy__return = port.orderQueteBy(_orderQueteBy_fieldname);
        System.out.println("orderQueteBy.result=" + _orderQueteBy__return);


        }
        {
        System.out.println("Invoking getSeriesByMakeName...");
        java.lang.String _getSeriesByMakeName_brandName = "";
        chehui.maichetong.useroperationservice.ResultOfListOfTSeries _getSeriesByMakeName__return = port.getSeriesByMakeName(_getSeriesByMakeName_brandName);
        System.out.println("getSeriesByMakeName.result=" + _getSeriesByMakeName__return);


        }
        {
        System.out.println("Invoking getallQueteByUser...");
        java.lang.String _getallQueteByUser_userid = "";
        chehui.maichetong.useroperationservice.ResultOfListOfTQuote _getallQueteByUser__return = port.getallQueteByUser(_getallQueteByUser_userid);
        System.out.println("getallQueteByUser.result=" + _getallQueteByUser__return);


        }
        {
        System.out.println("Invoking getCarColorByCarID...");
        java.lang.String _getCarColorByCarID_carid = "";
        chehui.maichetong.useroperationservice.ResultOfListOfTSeries _getCarColorByCarID__return = port.getCarColorByCarID(_getCarColorByCarID_carid);
        System.out.println("getCarColorByCarID.result=" + _getCarColorByCarID__return);


        }
        {
        System.out.println("Invoking getQueteByCarID...");
        java.lang.String _getQueteByCarID_carid = "";
        chehui.maichetong.useroperationservice.ResultOfListOfTQuote _getQueteByCarID__return = port.getQueteByCarID(_getQueteByCarID_carid);
        System.out.println("getQueteByCarID.result=" + _getQueteByCarID__return);


        }
        {
        System.out.println("Invoking getSeriesByCar...");
        java.lang.String _getSeriesByCar_brandName = "";
        java.lang.String _getSeriesByCar_makeName = "";
        chehui.maichetong.useroperationservice.ResultOfListOfTSeries _getSeriesByCar__return = port.getSeriesByCar(_getSeriesByCar_brandName, _getSeriesByCar_makeName);
        System.out.println("getSeriesByCar.result=" + _getSeriesByCar__return);


        }
        {
        System.out.println("Invoking getUserTel...");
        java.lang.String _getUserTel_userid = "";
        chehui.maichetong.useroperationservice.ResultOfListOfTUSER _getUserTel__return = port.getUserTel(_getUserTel_userid);
        System.out.println("getUserTel.result=" + _getUserTel__return);


        }
        {
        System.out.println("Invoking getSeriesById...");
        java.lang.String _getSeriesById_seriesid = "";
        chehui.maichetong.useroperationservice.ResultOfListOfTSeries _getSeriesById__return = port.getSeriesById(_getSeriesById_seriesid);
        System.out.println("getSeriesById.result=" + _getSeriesById__return);


        }
        {
        System.out.println("Invoking getALLBrandName...");
        chehui.maichetong.useroperationservice.ResultOfListOfTBrand _getALLBrandName__return = port.getALLBrandName();
        System.out.println("getALLBrandName.result=" + _getALLBrandName__return);


        }
        {
        System.out.println("Invoking getSeriesByBrandidCar...");
        java.lang.String _getSeriesByBrandidCar_brandid = "";
        java.lang.String _getSeriesByBrandidCar_seriesid = "";
        chehui.maichetong.useroperationservice.ResultOfListOfTCar _getSeriesByBrandidCar__return = port.getSeriesByBrandidCar(_getSeriesByBrandidCar_brandid, _getSeriesByBrandidCar_seriesid);
        System.out.println("getSeriesByBrandidCar.result=" + _getSeriesByBrandidCar__return);


        }
        {
        System.out.println("Invoking getOrderCarName...");
        java.lang.String _getOrderCarName_userid = "";
        chehui.maichetong.useroperationservice.ResultOfListOfTCar _getOrderCarName__return = port.getOrderCarName(_getOrderCarName_userid);
        System.out.println("getOrderCarName.result=" + _getOrderCarName__return);


        }
        {
        System.out.println("Invoking getSeriesBybrandsCar...");
        java.lang.String _getSeriesBybrandsCar_brandid = "";
        java.lang.String _getSeriesBybrandsCar_seriesid = "";
        java.lang.String _getSeriesBybrandsCar_seriescar = "";
        chehui.maichetong.useroperationservice.ResultOfListOfTCar _getSeriesBybrandsCar__return = port.getSeriesBybrandsCar(_getSeriesBybrandsCar_brandid, _getSeriesBybrandsCar_seriesid, _getSeriesBybrandsCar_seriescar);
        System.out.println("getSeriesBybrandsCar.result=" + _getSeriesBybrandsCar__return);


        }
        {
        System.out.println("Invoking getBrandName...");
        java.lang.String _getBrandName_brandABC = "";
        chehui.maichetong.useroperationservice.ResultOfListOfTBrand _getBrandName__return = port.getBrandName(_getBrandName_brandABC);
        System.out.println("getBrandName.result=" + _getBrandName__return);


        }
        {
        System.out.println("Invoking getBrandNameByBrandNameEn...");
        java.lang.String _getBrandNameByBrandNameEn_brandNameEn = "";
        chehui.maichetong.useroperationservice.ResultOfListOfTBrand _getBrandNameByBrandNameEn__return = port.getBrandNameByBrandNameEn(_getBrandNameByBrandNameEn_brandNameEn);
        System.out.println("getBrandNameByBrandNameEn.result=" + _getBrandNameByBrandNameEn__return);


        }
        {
        System.out.println("Invoking getMakeNames...");
        java.lang.String _getMakeNames_makename = "";
        chehui.maichetong.useroperationservice.ResultOfListOfTSeries _getMakeNames__return = port.getMakeNames(_getMakeNames_makename);
        System.out.println("getMakeNames.result=" + _getMakeNames__return);


        }
        {
        System.out.println("Invoking getCarByseriesId...");
        java.lang.String _getCarByseriesId_seriesid = "";
        chehui.maichetong.useroperationservice.ResultOfListOfTCar _getCarByseriesId__return = port.getCarByseriesId(_getCarByseriesId_seriesid);
        System.out.println("getCarByseriesId.result=" + _getCarByseriesId__return);


        }
        {
        System.out.println("Invoking getSeriesName...");
        chehui.maichetong.useroperationservice.ResultOfListOfTSeries _getSeriesName__return = port.getSeriesName();
        System.out.println("getSeriesName.result=" + _getSeriesName__return);


        }
        {
        System.out.println("Invoking getMyOrderDetails...");
        java.lang.String _getMyOrderDetails_userid = "";
        java.lang.String _getMyOrderDetails_carId = "";
        chehui.maichetong.useroperationservice.ResultOfListOfTOrder _getMyOrderDetails__return = port.getMyOrderDetails(_getMyOrderDetails_userid, _getMyOrderDetails_carId);
        System.out.println("getMyOrderDetails.result=" + _getMyOrderDetails__return);


        }
        {
        System.out.println("Invoking getSeriesByBrandid...");
        java.lang.String _getSeriesByBrandid_brandid = "";
        chehui.maichetong.useroperationservice.ResultOfListOfTSeries _getSeriesByBrandid__return = port.getSeriesByBrandid(_getSeriesByBrandid_brandid);
        System.out.println("getSeriesByBrandid.result=" + _getSeriesByBrandid__return);


        }
        {
        System.out.println("Invoking getCarByBrandId...");
        java.lang.String _getCarByBrandId_brandid = "";
        chehui.maichetong.useroperationservice.ResultOfListOfTSeries _getCarByBrandId__return = port.getCarByBrandId(_getCarByBrandId_brandid);
        System.out.println("getCarByBrandId.result=" + _getCarByBrandId__return);


        }
        {
        System.out.println("Invoking addOrder...");
        int _addOrder_userID = 0;
        int _addOrder_carID = 0;
        java.lang.String _addOrder_cityname = "";
        java.lang.String _addOrder_expectPrice = "";
        java.lang.String _addOrder_insurancePrice = "";
        java.lang.String _addOrder_licensePrice = "";
        java.lang.String _addOrder_description = "";
        java.lang.String _addOrder_carColor = "";
        java.lang.String _addOrder_carPlan = "";
        java.lang.String _addOrder_payMode = "";
        java.lang.String _addOrder_carAddress = "";
        java.lang.String _addOrder_zhuangHuang = "";
        java.lang.String _addOrder_kehuqw = "";
        chehui.maichetong.useroperationservice.ResultOfTOrder _addOrder__return = port.addOrder(_addOrder_userID, _addOrder_carID, _addOrder_cityname, _addOrder_expectPrice, _addOrder_insurancePrice, _addOrder_licensePrice, _addOrder_description, _addOrder_carColor, _addOrder_carPlan, _addOrder_payMode, _addOrder_carAddress, _addOrder_zhuangHuang, _addOrder_kehuqw);
        System.out.println("addOrder.result=" + _addOrder__return);


        }
        {
        System.out.println("Invoking getMyOrder...");
        java.lang.String _getMyOrder_userid = "";
        chehui.maichetong.useroperationservice.ResultOfListOfTOrder _getMyOrder__return = port.getMyOrder(_getMyOrder_userid);
        System.out.println("getMyOrder.result=" + _getMyOrder__return);


        }
        {
        System.out.println("Invoking getCarByBrandNameEn...");
        java.lang.String _getCarByBrandNameEn_brandNameEn = "";
        java.lang.String _getCarByBrandNameEn_seriesId = "";
        chehui.maichetong.useroperationservice.ResultOfListOfTSeries _getCarByBrandNameEn__return = port.getCarByBrandNameEn(_getCarByBrandNameEn_brandNameEn, _getCarByBrandNameEn_seriesId);
        System.out.println("getCarByBrandNameEn.result=" + _getCarByBrandNameEn__return);


        }
        {
        System.out.println("Invoking getBrandByid...");
        java.lang.String _getBrandByid_branid = "";
        chehui.maichetong.useroperationservice.ResultOfListOfTBrand _getBrandByid__return = port.getBrandByid(_getBrandByid_branid);
        System.out.println("getBrandByid.result=" + _getBrandByid__return);


        }
        {
        System.out.println("Invoking getGuidepriceByseriesId...");
        java.lang.String _getGuidepriceByseriesId_seriesid = "";
        chehui.maichetong.useroperationservice.ResultOfListOfTCar _getGuidepriceByseriesId__return = port.getGuidepriceByseriesId(_getGuidepriceByseriesId_seriesid);
        System.out.println("getGuidepriceByseriesId.result=" + _getGuidepriceByseriesId__return);


        }
        {
        System.out.println("Invoking getOrderByCarID...");
        java.lang.String _getOrderByCarID_carid = "";
        chehui.maichetong.useroperationservice.ResultOfListOfTOrder _getOrderByCarID__return = port.getOrderByCarID(_getOrderByCarID_carid);
        System.out.println("getOrderByCarID.result=" + _getOrderByCarID__return);


        }
        {
        System.out.println("Invoking getUserBusinessDDBH...");
        java.lang.String _getUserBusinessDDBH_userid = "";
        java.lang.String _getUserBusinessDDBH_businessid = "";
        chehui.maichetong.useroperationservice.ResultOfListOfTBusiness _getUserBusinessDDBH__return = port.getUserBusinessDDBH(_getUserBusinessDDBH_userid, _getUserBusinessDDBH_businessid);
        System.out.println("getUserBusinessDDBH.result=" + _getUserBusinessDDBH__return);


        }

        System.exit(0);
    }

}
