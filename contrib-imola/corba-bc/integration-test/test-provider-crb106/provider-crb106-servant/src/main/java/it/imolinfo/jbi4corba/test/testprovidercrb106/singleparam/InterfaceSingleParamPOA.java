package it.imolinfo.jbi4corba.test.testprovidercrb106.singleparam;


/**
* it/imolinfo/jbi4corba/test/testprovidercrb106/singleparam/InterfaceSingleParamPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from src/main/resources/EchoCrb106Single.idl
* gioved� 22 novembre 2007 16.36.59 CET
*/


//==================================================
public abstract class InterfaceSingleParamPOA extends org.omg.PortableServer.Servant
 implements it.imolinfo.jbi4corba.test.testprovidercrb106.singleparam.InterfaceSingleParamOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("methodA", new java.lang.Integer (0));
    _methods.put ("methodB", new java.lang.Integer (1));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // it/imolinfo/jbi4corba/test/testprovidercrb106/singleparam/InterfaceSingleParam/methodA
       {
         it.imolinfo.jbi4corba.test.testprovidercrb106.ValueTypeA a = it.imolinfo.jbi4corba.test.testprovidercrb106.ValueTypeAHelper.read (in);
         it.imolinfo.jbi4corba.test.testprovidercrb106.StructAB $result = null;
         $result = this.methodA (a);
         out = $rh.createReply();
         it.imolinfo.jbi4corba.test.testprovidercrb106.StructABHelper.write (out, $result);
         break;
       }

       case 1:  // it/imolinfo/jbi4corba/test/testprovidercrb106/singleparam/InterfaceSingleParam/methodB
       {
         it.imolinfo.jbi4corba.test.testprovidercrb106.ValueTypeA a = it.imolinfo.jbi4corba.test.testprovidercrb106.ValueTypeAHelper.read (in);
         it.imolinfo.jbi4corba.test.testprovidercrb106.StructAB $result = null;
         $result = this.methodB (a);
         out = $rh.createReply();
         it.imolinfo.jbi4corba.test.testprovidercrb106.StructABHelper.write (out, $result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:it/imolinfo/jbi4corba/test/testprovidercrb106/singleparam/InterfaceSingleParam:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public InterfaceSingleParam _this() 
  {
    return InterfaceSingleParamHelper.narrow(
    super._this_object());
  }

  public InterfaceSingleParam _this(org.omg.CORBA.ORB orb) 
  {
    return InterfaceSingleParamHelper.narrow(
    super._this_object(orb));
  }


} // class InterfaceSingleParamPOA
