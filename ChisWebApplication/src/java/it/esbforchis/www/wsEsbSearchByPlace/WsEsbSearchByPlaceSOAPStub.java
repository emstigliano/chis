
package it.esbforchis.www.wsEsbSearchByPlace;
public class WsEsbSearchByPlaceSOAPStub extends org.apache.axis.client.Stub implements it.esbforchis.www.wsEsbSearchByPlace.WsEsbSearchByPlace_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();
    static org.apache.axis.description.OperationDesc [] _operations;
    static {
        _operations = new org.apache.axis.description.OperationDesc[4];
        _initOperationDesc1();
    }
    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDescriptions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchByPlace", "getDescriptionsInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchByPlace", "getDescriptionsInput"), it.esbforchis.www.wsEsbSearchByPlace.GetDescriptionsInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchByPlace", "getDescriptionsOutput"));
        oper.setReturnClass(it.esbforchis.www.wsEsbSearchByPlace.GetDescriptionsOutput.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchByPlace", "getDescriptionsOutput"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getImages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchByPlace", "getImagesInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchByPlace", "getImagesInput"), it.esbforchis.www.wsEsbSearchByPlace.GetImagesInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchByPlace", "getImagesOutput"));
        oper.setReturnClass(it.esbforchis.www.wsEsbSearchByPlace.GetImagesOutput.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchByPlace", "getImagesOutput"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTwitterResult");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchByPlace", "getTwitterResultInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchByPlace", "getTwitterResultInput"), it.esbforchis.www.wsEsbSearchByPlace.GetTwitterResultInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchByPlace", "getTwitterResultOutput"));
        oper.setReturnClass(it.esbforchis.www.wsEsbSearchByPlace.GetTwitterResultOutput.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchByPlace", "getTwitterResultOutput"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOtherInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchByPlace", "getOtherInfoInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchByPlace", "getOtherInfoInput"), it.esbforchis.www.wsEsbSearchByPlace.GetOtherInfoInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchByPlace", "getOtherInfoOutput"));
        oper.setReturnClass(it.esbforchis.www.wsEsbSearchByPlace.GetOtherInfoOutput.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchByPlace", "getOtherInfoOutput"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;
    }
    public WsEsbSearchByPlaceSOAPStub() throws org.apache.axis.AxisFault {
         this(null);
    }
    public WsEsbSearchByPlaceSOAPStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }
    public WsEsbSearchByPlaceSOAPStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchByPlace", "couple");
            cachedSerQNames.add(qName);
            cls = it.esbforchis.www.wsEsbSearchByPlace.Couple.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);
            qName = new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchByPlace", "getDescriptionsInput");
            cachedSerQNames.add(qName);
            cls = it.esbforchis.www.wsEsbSearchByPlace.GetDescriptionsInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);
            qName = new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchByPlace", "getDescriptionsOutput");
            cachedSerQNames.add(qName);
            cls = it.esbforchis.www.wsEsbSearchByPlace.GetDescriptionsOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);
            qName = new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchByPlace", "getImagesInput");
            cachedSerQNames.add(qName);
            cls = it.esbforchis.www.wsEsbSearchByPlace.GetImagesInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);
            qName = new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchByPlace", "getImagesOutput");
            cachedSerQNames.add(qName);
            cls = it.esbforchis.www.wsEsbSearchByPlace.GetImagesOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);
            qName = new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchByPlace", "getOtherInfoInput");
            cachedSerQNames.add(qName);
            cls = it.esbforchis.www.wsEsbSearchByPlace.GetOtherInfoInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);
            qName = new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchByPlace", "getOtherInfoOutput");
            cachedSerQNames.add(qName);
            cls = it.esbforchis.www.wsEsbSearchByPlace.GetOtherInfoOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);
            qName = new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchByPlace", "getTwitterResultInput");
            cachedSerQNames.add(qName);
            cls = it.esbforchis.www.wsEsbSearchByPlace.GetTwitterResultInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);
            qName = new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchByPlace", "getTwitterResultOutput");
            cachedSerQNames.add(qName);
            cls = it.esbforchis.www.wsEsbSearchByPlace.GetTwitterResultOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);
            qName = new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchByPlace", "image");
            cachedSerQNames.add(qName);
            cls = it.esbforchis.www.wsEsbSearchByPlace.Image.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);
    }
    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            
            
            
            
            
            synchronized (this) {
                if (firstCall()) {
                    
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }
    public it.esbforchis.www.wsEsbSearchByPlace.GetDescriptionsOutput getDescriptions(it.esbforchis.www.wsEsbSearchByPlace.GetDescriptionsInput getDescriptionsInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.esbforchis.it/wsEsbSearchByPlace/getDescriptions");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getDescriptions"));
        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getDescriptionsInput});
        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.esbforchis.www.wsEsbSearchByPlace.GetDescriptionsOutput) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.esbforchis.www.wsEsbSearchByPlace.GetDescriptionsOutput) org.apache.axis.utils.JavaUtils.convert(_resp, it.esbforchis.www.wsEsbSearchByPlace.GetDescriptionsOutput.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }
    public it.esbforchis.www.wsEsbSearchByPlace.GetImagesOutput getImages(it.esbforchis.www.wsEsbSearchByPlace.GetImagesInput getImagesInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.esbforchis.it/wsEsbSearchByPlace/getImages");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getImages"));
        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getImagesInput});
        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.esbforchis.www.wsEsbSearchByPlace.GetImagesOutput) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.esbforchis.www.wsEsbSearchByPlace.GetImagesOutput) org.apache.axis.utils.JavaUtils.convert(_resp, it.esbforchis.www.wsEsbSearchByPlace.GetImagesOutput.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }
    public it.esbforchis.www.wsEsbSearchByPlace.GetTwitterResultOutput getTwitterResult(it.esbforchis.www.wsEsbSearchByPlace.GetTwitterResultInput getTwitterResultInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.esbforchis.it/wsEsbSearchByPlace/getTwitterResult");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTwitterResult"));
        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getTwitterResultInput});
        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.esbforchis.www.wsEsbSearchByPlace.GetTwitterResultOutput) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.esbforchis.www.wsEsbSearchByPlace.GetTwitterResultOutput) org.apache.axis.utils.JavaUtils.convert(_resp, it.esbforchis.www.wsEsbSearchByPlace.GetTwitterResultOutput.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }
    public it.esbforchis.www.wsEsbSearchByPlace.GetOtherInfoOutput getOtherInfo(it.esbforchis.www.wsEsbSearchByPlace.GetOtherInfoInput getOtherInfoInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.esbforchis.it/wsEsbSearchByPlace/getOtherInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getOtherInfo"));
        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getOtherInfoInput});
        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.esbforchis.www.wsEsbSearchByPlace.GetOtherInfoOutput) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.esbforchis.www.wsEsbSearchByPlace.GetOtherInfoOutput) org.apache.axis.utils.JavaUtils.convert(_resp, it.esbforchis.www.wsEsbSearchByPlace.GetOtherInfoOutput.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }
}
