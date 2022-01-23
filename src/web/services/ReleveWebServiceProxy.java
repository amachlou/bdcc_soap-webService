package web.services;

public class ReleveWebServiceProxy implements web.services.ReleveWebService {
  private String _endpoint = null;
  private web.services.ReleveWebService releveWebService = null;
  
  public ReleveWebServiceProxy() {
    _initReleveWebServiceProxy();
  }
  
  public ReleveWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initReleveWebServiceProxy();
  }
  
  private void _initReleveWebServiceProxy() {
    try {
      releveWebService = (new web.services.ReleveWebServiceServiceLocator()).getReleveWebServicePort();
      if (releveWebService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)releveWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)releveWebService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (releveWebService != null)
      ((javax.xml.rpc.Stub)releveWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public web.services.ReleveWebService getReleveWebService() {
    if (releveWebService == null)
      _initReleveWebServiceProxy();
    return releveWebService;
  }
  
  public web.services.Releve releveDetails() throws java.rmi.RemoteException, web.services.JAXBException{
    if (releveWebService == null)
      _initReleveWebServiceProxy();
    return releveWebService.releveDetails();
  }
  
  
}