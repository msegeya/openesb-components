package it.imolinfo.jbi4corba.test.webservice.generator.echocomplex.typedefany;


/**
* it/imolinfo/jbi4corba/test/webservice/generator/echocomplex/typedefany/EchoComplexTypeDefAnyHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from EchoTypeDefAny.idl
* mercoledý 10 febbraio 2010 15.46.41 CET
*/


//==================================================
abstract public class EchoComplexTypeDefAnyHelper
{
  private static String  _id = "IDL:it/imolinfo/jbi4corba/test/webservice/generator/echocomplex/typedefany/EchoComplexTypeDefAny:1.0";

  public static void insert (org.omg.CORBA.Any a, it.imolinfo.jbi4corba.test.webservice.generator.echocomplex.typedefany.EchoComplexTypeDefAny that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static it.imolinfo.jbi4corba.test.webservice.generator.echocomplex.typedefany.EchoComplexTypeDefAny extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (it.imolinfo.jbi4corba.test.webservice.generator.echocomplex.typedefany.EchoComplexTypeDefAnyHelper.id (), "EchoComplexTypeDefAny");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static it.imolinfo.jbi4corba.test.webservice.generator.echocomplex.typedefany.EchoComplexTypeDefAny read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_EchoComplexTypeDefAnyStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, it.imolinfo.jbi4corba.test.webservice.generator.echocomplex.typedefany.EchoComplexTypeDefAny value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static it.imolinfo.jbi4corba.test.webservice.generator.echocomplex.typedefany.EchoComplexTypeDefAny narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof it.imolinfo.jbi4corba.test.webservice.generator.echocomplex.typedefany.EchoComplexTypeDefAny)
      return (it.imolinfo.jbi4corba.test.webservice.generator.echocomplex.typedefany.EchoComplexTypeDefAny)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      it.imolinfo.jbi4corba.test.webservice.generator.echocomplex.typedefany._EchoComplexTypeDefAnyStub stub = new it.imolinfo.jbi4corba.test.webservice.generator.echocomplex.typedefany._EchoComplexTypeDefAnyStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static it.imolinfo.jbi4corba.test.webservice.generator.echocomplex.typedefany.EchoComplexTypeDefAny unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof it.imolinfo.jbi4corba.test.webservice.generator.echocomplex.typedefany.EchoComplexTypeDefAny)
      return (it.imolinfo.jbi4corba.test.webservice.generator.echocomplex.typedefany.EchoComplexTypeDefAny)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      it.imolinfo.jbi4corba.test.webservice.generator.echocomplex.typedefany._EchoComplexTypeDefAnyStub stub = new it.imolinfo.jbi4corba.test.webservice.generator.echocomplex.typedefany._EchoComplexTypeDefAnyStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
