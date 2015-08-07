
package chehui.maichetong.useroperationservice;

import org.jinouts.xml.bind.JAXBElement;
import org.jinouts.xml.bind.annotation.XmlElementDecl;
import org.jinouts.xml.bind.annotation.XmlRegistry;
import org.jinouts.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the chehui.maichetong.useroperationservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ResultOfListOfTOrder_QNAME = new QName("http://UserOperationService.maichetong.chehui/", "ResultOfListOfTOrder");
    private final static QName _ResultOfTOrder_QNAME = new QName("http://UserOperationService.maichetong.chehui/", "ResultOfTOrder");
    private final static QName _ResultOfListOfTQuote_QNAME = new QName("http://UserOperationService.maichetong.chehui/", "ResultOfListOfTQuote");
    private final static QName _ResultOfListOfTBrand_QNAME = new QName("http://UserOperationService.maichetong.chehui/", "ResultOfListOfTBrand");
    private final static QName _ResultOfListOfTSeries_QNAME = new QName("http://UserOperationService.maichetong.chehui/", "ResultOfListOfTSeries");
    private final static QName _ResultOfListOfTCar_QNAME = new QName("http://UserOperationService.maichetong.chehui/", "ResultOfListOfTCar");
    private final static QName _ResultOfListOfTBusiness_QNAME = new QName("http://UserOperationService.maichetong.chehui/", "ResultOfListOfTBusiness");
    private final static QName _ResultOfListOfTUSER_QNAME = new QName("http://UserOperationService.maichetong.chehui/", "ResultOfListOfTUSER");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: chehui.maichetong.useroperationservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOrderByCarID }
     * 
     */
    public GetOrderByCarID createGetOrderByCarID() {
        return new GetOrderByCarID();
    }

    /**
     * Create an instance of {@link GetOrderByCarIDResponse }
     * 
     */
    public GetOrderByCarIDResponse createGetOrderByCarIDResponse() {
        return new GetOrderByCarIDResponse();
    }

    /**
     * Create an instance of {@link ResultOfListOfTOrder }
     * 
     */
    public ResultOfListOfTOrder createResultOfListOfTOrder() {
        return new ResultOfListOfTOrder();
    }

    /**
     * Create an instance of {@link GetMyOrder }
     * 
     */
    public GetMyOrder createGetMyOrder() {
        return new GetMyOrder();
    }

    /**
     * Create an instance of {@link GetMyOrderResponse }
     * 
     */
    public GetMyOrderResponse createGetMyOrderResponse() {
        return new GetMyOrderResponse();
    }

    /**
     * Create an instance of {@link GetMyOrderDetails }
     * 
     */
    public GetMyOrderDetails createGetMyOrderDetails() {
        return new GetMyOrderDetails();
    }

    /**
     * Create an instance of {@link GetMyOrderDetailsResponse }
     * 
     */
    public GetMyOrderDetailsResponse createGetMyOrderDetailsResponse() {
        return new GetMyOrderDetailsResponse();
    }

    /**
     * Create an instance of {@link AddOrder }
     * 
     */
    public AddOrder createAddOrder() {
        return new AddOrder();
    }

    /**
     * Create an instance of {@link AddOrderResponse }
     * 
     */
    public AddOrderResponse createAddOrderResponse() {
        return new AddOrderResponse();
    }

    /**
     * Create an instance of {@link ResultOfTOrder }
     * 
     */
    public ResultOfTOrder createResultOfTOrder() {
        return new ResultOfTOrder();
    }

    /**
     * Create an instance of {@link GetallQueteByUser }
     * 
     */
    public GetallQueteByUser createGetallQueteByUser() {
        return new GetallQueteByUser();
    }

    /**
     * Create an instance of {@link GetallQueteByUserResponse }
     * 
     */
    public GetallQueteByUserResponse createGetallQueteByUserResponse() {
        return new GetallQueteByUserResponse();
    }

    /**
     * Create an instance of {@link ResultOfListOfTQuote }
     * 
     */
    public ResultOfListOfTQuote createResultOfListOfTQuote() {
        return new ResultOfListOfTQuote();
    }

    /**
     * Create an instance of {@link OrderQueteBy }
     * 
     */
    public OrderQueteBy createOrderQueteBy() {
        return new OrderQueteBy();
    }

    /**
     * Create an instance of {@link OrderQueteByResponse }
     * 
     */
    public OrderQueteByResponse createOrderQueteByResponse() {
        return new OrderQueteByResponse();
    }

    /**
     * Create an instance of {@link GetQueteByCarID }
     * 
     */
    public GetQueteByCarID createGetQueteByCarID() {
        return new GetQueteByCarID();
    }

    /**
     * Create an instance of {@link GetQueteByCarIDResponse }
     * 
     */
    public GetQueteByCarIDResponse createGetQueteByCarIDResponse() {
        return new GetQueteByCarIDResponse();
    }

    /**
     * Create an instance of {@link GetALLBrandName }
     * 
     */
    public GetALLBrandName createGetALLBrandName() {
        return new GetALLBrandName();
    }

    /**
     * Create an instance of {@link GetALLBrandNameResponse }
     * 
     */
    public GetALLBrandNameResponse createGetALLBrandNameResponse() {
        return new GetALLBrandNameResponse();
    }

    /**
     * Create an instance of {@link ResultOfListOfTBrand }
     * 
     */
    public ResultOfListOfTBrand createResultOfListOfTBrand() {
        return new ResultOfListOfTBrand();
    }

    /**
     * Create an instance of {@link GetBrandName }
     * 
     */
    public GetBrandName createGetBrandName() {
        return new GetBrandName();
    }

    /**
     * Create an instance of {@link GetBrandNameResponse }
     * 
     */
    public GetBrandNameResponse createGetBrandNameResponse() {
        return new GetBrandNameResponse();
    }

    /**
     * Create an instance of {@link GetBrandNameByBrandNameEn }
     * 
     */
    public GetBrandNameByBrandNameEn createGetBrandNameByBrandNameEn() {
        return new GetBrandNameByBrandNameEn();
    }

    /**
     * Create an instance of {@link GetBrandNameByBrandNameEnResponse }
     * 
     */
    public GetBrandNameByBrandNameEnResponse createGetBrandNameByBrandNameEnResponse() {
        return new GetBrandNameByBrandNameEnResponse();
    }

    /**
     * Create an instance of {@link GetBrandABC }
     * 
     */
    public GetBrandABC createGetBrandABC() {
        return new GetBrandABC();
    }

    /**
     * Create an instance of {@link GetBrandABCResponse }
     * 
     */
    public GetBrandABCResponse createGetBrandABCResponse() {
        return new GetBrandABCResponse();
    }

    /**
     * Create an instance of {@link GetBrandByid }
     * 
     */
    public GetBrandByid createGetBrandByid() {
        return new GetBrandByid();
    }

    /**
     * Create an instance of {@link GetBrandByidResponse }
     * 
     */
    public GetBrandByidResponse createGetBrandByidResponse() {
        return new GetBrandByidResponse();
    }

    /**
     * Create an instance of {@link GetSeriesName }
     * 
     */
    public GetSeriesName createGetSeriesName() {
        return new GetSeriesName();
    }

    /**
     * Create an instance of {@link GetSeriesNameResponse }
     * 
     */
    public GetSeriesNameResponse createGetSeriesNameResponse() {
        return new GetSeriesNameResponse();
    }

    /**
     * Create an instance of {@link ResultOfListOfTSeries }
     * 
     */
    public ResultOfListOfTSeries createResultOfListOfTSeries() {
        return new ResultOfListOfTSeries();
    }

    /**
     * Create an instance of {@link GetSeriesById }
     * 
     */
    public GetSeriesById createGetSeriesById() {
        return new GetSeriesById();
    }

    /**
     * Create an instance of {@link GetSeriesByIdResponse }
     * 
     */
    public GetSeriesByIdResponse createGetSeriesByIdResponse() {
        return new GetSeriesByIdResponse();
    }

    /**
     * Create an instance of {@link GetSeriesByBrandid }
     * 
     */
    public GetSeriesByBrandid createGetSeriesByBrandid() {
        return new GetSeriesByBrandid();
    }

    /**
     * Create an instance of {@link GetSeriesByBrandidResponse }
     * 
     */
    public GetSeriesByBrandidResponse createGetSeriesByBrandidResponse() {
        return new GetSeriesByBrandidResponse();
    }

    /**
     * Create an instance of {@link GetSeriesByBrandidCar }
     * 
     */
    public GetSeriesByBrandidCar createGetSeriesByBrandidCar() {
        return new GetSeriesByBrandidCar();
    }

    /**
     * Create an instance of {@link GetSeriesByBrandidCarResponse }
     * 
     */
    public GetSeriesByBrandidCarResponse createGetSeriesByBrandidCarResponse() {
        return new GetSeriesByBrandidCarResponse();
    }

    /**
     * Create an instance of {@link ResultOfListOfTCar }
     * 
     */
    public ResultOfListOfTCar createResultOfListOfTCar() {
        return new ResultOfListOfTCar();
    }

    /**
     * Create an instance of {@link GetOrderCarName }
     * 
     */
    public GetOrderCarName createGetOrderCarName() {
        return new GetOrderCarName();
    }

    /**
     * Create an instance of {@link GetOrderCarNameResponse }
     * 
     */
    public GetOrderCarNameResponse createGetOrderCarNameResponse() {
        return new GetOrderCarNameResponse();
    }

    /**
     * Create an instance of {@link GetUserBusinessDDBH }
     * 
     */
    public GetUserBusinessDDBH createGetUserBusinessDDBH() {
        return new GetUserBusinessDDBH();
    }

    /**
     * Create an instance of {@link GetUserBusinessDDBHResponse }
     * 
     */
    public GetUserBusinessDDBHResponse createGetUserBusinessDDBHResponse() {
        return new GetUserBusinessDDBHResponse();
    }

    /**
     * Create an instance of {@link ResultOfListOfTBusiness }
     * 
     */
    public ResultOfListOfTBusiness createResultOfListOfTBusiness() {
        return new ResultOfListOfTBusiness();
    }

    /**
     * Create an instance of {@link GetUserTel }
     * 
     */
    public GetUserTel createGetUserTel() {
        return new GetUserTel();
    }

    /**
     * Create an instance of {@link GetUserTelResponse }
     * 
     */
    public GetUserTelResponse createGetUserTelResponse() {
        return new GetUserTelResponse();
    }

    /**
     * Create an instance of {@link ResultOfListOfTUSER }
     * 
     */
    public ResultOfListOfTUSER createResultOfListOfTUSER() {
        return new ResultOfListOfTUSER();
    }

    /**
     * Create an instance of {@link GetSeriesByMakeName }
     * 
     */
    public GetSeriesByMakeName createGetSeriesByMakeName() {
        return new GetSeriesByMakeName();
    }

    /**
     * Create an instance of {@link GetSeriesByMakeNameResponse }
     * 
     */
    public GetSeriesByMakeNameResponse createGetSeriesByMakeNameResponse() {
        return new GetSeriesByMakeNameResponse();
    }

    /**
     * Create an instance of {@link GetSeriesByCar }
     * 
     */
    public GetSeriesByCar createGetSeriesByCar() {
        return new GetSeriesByCar();
    }

    /**
     * Create an instance of {@link GetSeriesByCarResponse }
     * 
     */
    public GetSeriesByCarResponse createGetSeriesByCarResponse() {
        return new GetSeriesByCarResponse();
    }

    /**
     * Create an instance of {@link GetSeriesBybrandsCar }
     * 
     */
    public GetSeriesBybrandsCar createGetSeriesBybrandsCar() {
        return new GetSeriesBybrandsCar();
    }

    /**
     * Create an instance of {@link GetSeriesBybrandsCarResponse }
     * 
     */
    public GetSeriesBybrandsCarResponse createGetSeriesBybrandsCarResponse() {
        return new GetSeriesBybrandsCarResponse();
    }

    /**
     * Create an instance of {@link GetCarColorByCarID }
     * 
     */
    public GetCarColorByCarID createGetCarColorByCarID() {
        return new GetCarColorByCarID();
    }

    /**
     * Create an instance of {@link GetCarColorByCarIDResponse }
     * 
     */
    public GetCarColorByCarIDResponse createGetCarColorByCarIDResponse() {
        return new GetCarColorByCarIDResponse();
    }

    /**
     * Create an instance of {@link GetMakeNames }
     * 
     */
    public GetMakeNames createGetMakeNames() {
        return new GetMakeNames();
    }

    /**
     * Create an instance of {@link GetMakeNamesResponse }
     * 
     */
    public GetMakeNamesResponse createGetMakeNamesResponse() {
        return new GetMakeNamesResponse();
    }

    /**
     * Create an instance of {@link GetCarByBrandId }
     * 
     */
    public GetCarByBrandId createGetCarByBrandId() {
        return new GetCarByBrandId();
    }

    /**
     * Create an instance of {@link GetCarByBrandIdResponse }
     * 
     */
    public GetCarByBrandIdResponse createGetCarByBrandIdResponse() {
        return new GetCarByBrandIdResponse();
    }

    /**
     * Create an instance of {@link GetCarByBrandNameEn }
     * 
     */
    public GetCarByBrandNameEn createGetCarByBrandNameEn() {
        return new GetCarByBrandNameEn();
    }

    /**
     * Create an instance of {@link GetCarByBrandNameEnResponse }
     * 
     */
    public GetCarByBrandNameEnResponse createGetCarByBrandNameEnResponse() {
        return new GetCarByBrandNameEnResponse();
    }

    /**
     * Create an instance of {@link GetCarByseriesId }
     * 
     */
    public GetCarByseriesId createGetCarByseriesId() {
        return new GetCarByseriesId();
    }

    /**
     * Create an instance of {@link GetCarByseriesIdResponse }
     * 
     */
    public GetCarByseriesIdResponse createGetCarByseriesIdResponse() {
        return new GetCarByseriesIdResponse();
    }

    /**
     * Create an instance of {@link GetGuidepriceByseriesId }
     * 
     */
    public GetGuidepriceByseriesId createGetGuidepriceByseriesId() {
        return new GetGuidepriceByseriesId();
    }

    /**
     * Create an instance of {@link GetGuidepriceByseriesIdResponse }
     * 
     */
    public GetGuidepriceByseriesIdResponse createGetGuidepriceByseriesIdResponse() {
        return new GetGuidepriceByseriesIdResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTOrder }
     * 
     */
    public ArrayOfTOrder createArrayOfTOrder() {
        return new ArrayOfTOrder();
    }

    /**
     * Create an instance of {@link TOrder }
     * 
     */
    public TOrder createTOrder() {
        return new TOrder();
    }

    /**
     * Create an instance of {@link ArrayOfTQuote }
     * 
     */
    public ArrayOfTQuote createArrayOfTQuote() {
        return new ArrayOfTQuote();
    }

    /**
     * Create an instance of {@link TQuote }
     * 
     */
    public TQuote createTQuote() {
        return new TQuote();
    }

    /**
     * Create an instance of {@link ArrayOfTBrand }
     * 
     */
    public ArrayOfTBrand createArrayOfTBrand() {
        return new ArrayOfTBrand();
    }

    /**
     * Create an instance of {@link TBrand }
     * 
     */
    public TBrand createTBrand() {
        return new TBrand();
    }

    /**
     * Create an instance of {@link ArrayOfTSeries }
     * 
     */
    public ArrayOfTSeries createArrayOfTSeries() {
        return new ArrayOfTSeries();
    }

    /**
     * Create an instance of {@link TSeries }
     * 
     */
    public TSeries createTSeries() {
        return new TSeries();
    }

    /**
     * Create an instance of {@link ArrayOfTCar }
     * 
     */
    public ArrayOfTCar createArrayOfTCar() {
        return new ArrayOfTCar();
    }

    /**
     * Create an instance of {@link TCar }
     * 
     */
    public TCar createTCar() {
        return new TCar();
    }

    /**
     * Create an instance of {@link ArrayOfTBusiness }
     * 
     */
    public ArrayOfTBusiness createArrayOfTBusiness() {
        return new ArrayOfTBusiness();
    }

    /**
     * Create an instance of {@link TBusiness }
     * 
     */
    public TBusiness createTBusiness() {
        return new TBusiness();
    }

    /**
     * Create an instance of {@link ArrayOfTUSER }
     * 
     */
    public ArrayOfTUSER createArrayOfTUSER() {
        return new ArrayOfTUSER();
    }

    /**
     * Create an instance of {@link TUSER }
     * 
     */
    public TUSER createTUSER() {
        return new TUSER();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultOfListOfTOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserOperationService.maichetong.chehui/", name = "ResultOfListOfTOrder")
    public JAXBElement<ResultOfListOfTOrder> createResultOfListOfTOrder(ResultOfListOfTOrder value) {
        return new JAXBElement<ResultOfListOfTOrder>(_ResultOfListOfTOrder_QNAME, ResultOfListOfTOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultOfTOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserOperationService.maichetong.chehui/", name = "ResultOfTOrder")
    public JAXBElement<ResultOfTOrder> createResultOfTOrder(ResultOfTOrder value) {
        return new JAXBElement<ResultOfTOrder>(_ResultOfTOrder_QNAME, ResultOfTOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultOfListOfTQuote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserOperationService.maichetong.chehui/", name = "ResultOfListOfTQuote")
    public JAXBElement<ResultOfListOfTQuote> createResultOfListOfTQuote(ResultOfListOfTQuote value) {
        return new JAXBElement<ResultOfListOfTQuote>(_ResultOfListOfTQuote_QNAME, ResultOfListOfTQuote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultOfListOfTBrand }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserOperationService.maichetong.chehui/", name = "ResultOfListOfTBrand")
    public JAXBElement<ResultOfListOfTBrand> createResultOfListOfTBrand(ResultOfListOfTBrand value) {
        return new JAXBElement<ResultOfListOfTBrand>(_ResultOfListOfTBrand_QNAME, ResultOfListOfTBrand.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultOfListOfTSeries }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserOperationService.maichetong.chehui/", name = "ResultOfListOfTSeries")
    public JAXBElement<ResultOfListOfTSeries> createResultOfListOfTSeries(ResultOfListOfTSeries value) {
        return new JAXBElement<ResultOfListOfTSeries>(_ResultOfListOfTSeries_QNAME, ResultOfListOfTSeries.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultOfListOfTCar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserOperationService.maichetong.chehui/", name = "ResultOfListOfTCar")
    public JAXBElement<ResultOfListOfTCar> createResultOfListOfTCar(ResultOfListOfTCar value) {
        return new JAXBElement<ResultOfListOfTCar>(_ResultOfListOfTCar_QNAME, ResultOfListOfTCar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultOfListOfTBusiness }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserOperationService.maichetong.chehui/", name = "ResultOfListOfTBusiness")
    public JAXBElement<ResultOfListOfTBusiness> createResultOfListOfTBusiness(ResultOfListOfTBusiness value) {
        return new JAXBElement<ResultOfListOfTBusiness>(_ResultOfListOfTBusiness_QNAME, ResultOfListOfTBusiness.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultOfListOfTUSER }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserOperationService.maichetong.chehui/", name = "ResultOfListOfTUSER")
    public JAXBElement<ResultOfListOfTUSER> createResultOfListOfTUSER(ResultOfListOfTUSER value) {
        return new JAXBElement<ResultOfListOfTUSER>(_ResultOfListOfTUSER_QNAME, ResultOfListOfTUSER.class, null, value);
    }

}
