// Description: Java 11 XML SAX Request Message  for CFBam.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamXMsgRspn;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;

import org.xml.sax.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.xerces.xni.grammars.Grammar;

import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cflib.CFLib.Tip.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfbam.CFBam.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBamObj.*;

public class CFBamXMsgRspn
	extends CFLibXmlCoreSaxParser
	implements ContentHandler,
		ICFTipResponseHandler
{

	// The namespace URI of the supported schema
	public final static String	SCHEMA_XMLNS = "uri://xsd/cfbamrspn";

	// The source for loading the supported schema
	public final static String	SCHEMA_URI = "/opt/msscf/3.0.1/xsd/cfbam-rspn.xsd";
	public final static String	SCHEMA_ROOT_URI = "/xsd/cfbam-rqst.rspn";
	public final static String CFSEC_XMLNS = "uri://xsd/cfsecrspn";
	public final static String CFSEC_URI = "/opt/msscf/3.0.1/xsd/cfsec-rspn.xsd";
	public final static String CFSEC_ROOT_URI = "/xsd/cfsec-rspn.xsd";

	public final static String CFINT_XMLNS = "uri://xsd/cfintrspn";
	public final static String CFINT_URI = "/opt/msscf/3.0.1/xsd/cfint-rspn.xsd";
	public final static String CFINT_ROOT_URI = "/xsd/cfint-rspn.xsd";

	protected static Grammar myGrammar = null;

	// The schema instance to load in to

	private ICFBamSchemaObj schemaObj = null;
	private boolean deleted = false;
	private RuntimeException exceptionRaised = null;
	private Object lastObjectProcessed = null;
	private Object sortedListOfObjects = null;
	private String logContent = null;
	private boolean dataChanged = false;
	// Constructors

	public CFBamXMsgRspn() {
		super();
		setRootElementHandler( getSaxRspnRoot() );
		if( myGrammar == null ) {
			InputStream input;
			File file = new File( SCHEMA_URI );
			if( file.exists() ) {
				try {
					input = new FileInputStream( file );
				}
				catch( Exception e ) {
					input = null;
				}
				if( input != null ) {
					myGrammar = addToGrammarPool( SCHEMA_URI, input );
				}
			}
			else {
				input = getClass().getResourceAsStream( SCHEMA_ROOT_URI );
				if( input != null ) {
					myGrammar = addToGrammarPool( SCHEMA_ROOT_URI, input );
				}
			}
			file = new File( CFSEC_URI );
			if( file.exists() ) {
				try {
					input = new FileInputStream( file );
				}
				catch( Exception e ) {
					input = null;
				}
				if( input != null ) {
					addToGrammarPool( CFSEC_URI, input );
				}
			}
			else {
				input = getClass().getResourceAsStream( CFSEC_ROOT_URI );
				if( input != null ) {
					addToGrammarPool( CFSEC_ROOT_URI, input );
				}
			}
			file = new File( CFINT_URI );
			if( file.exists() ) {
				try {
					input = new FileInputStream( file );
				}
				catch( Exception e ) {
					input = null;
				}
				if( input != null ) {
					addToGrammarPool( CFINT_URI, input );
				}
			}
			else {
				input = getClass().getResourceAsStream( CFINT_ROOT_URI );
				if( input != null ) {
					addToGrammarPool( CFINT_ROOT_URI, input );
				}
			}
		}
		initParser();
		setSchemaObj( null );
	}

	public CFBamXMsgRspn( CFBamSchemaObj schemaObj ) {
		super();
		setRootElementHandler( getSaxRspnRoot() );
		if( myGrammar == null ) {
			InputStream input;
			File file = new File( SCHEMA_URI );
			if( file.exists() ) {
				try {
					input = new FileInputStream( file );
				}
				catch( Exception e ) {
					input = null;
				}
				if( input != null ) {
					myGrammar = addToGrammarPool( SCHEMA_URI, input );
				}
			}
			else {
				input = getClass().getResourceAsStream( SCHEMA_ROOT_URI );
				if( input != null ) {
					myGrammar = addToGrammarPool( SCHEMA_ROOT_URI, input );
				}
			}
			file = new File( CFSEC_URI );
			if( file.exists() ) {
				try {
					input = new FileInputStream( file );
				}
				catch( Exception e ) {
					input = null;
				}
				if( input != null ) {
					addToGrammarPool( CFSEC_URI, input );
				}
			}
			else {
				input = getClass().getResourceAsStream( CFSEC_ROOT_URI );
				if( input != null ) {
					addToGrammarPool( CFSEC_ROOT_URI, input );
				}
			}
			file = new File( CFINT_URI );
			if( file.exists() ) {
				try {
					input = new FileInputStream( file );
				}
				catch( Exception e ) {
					input = null;
				}
				if( input != null ) {
					addToGrammarPool( CFINT_URI, input );
				}
			}
			else {
				input = getClass().getResourceAsStream( CFINT_ROOT_URI );
				if( input != null ) {
					addToGrammarPool( CFINT_ROOT_URI, input );
				}
			}
		}
		initParser();
		setSchemaObj( schemaObj );
	}

	public CFBamXMsgRspn( ICFLibMessageLog logger ) {
		super( logger );
		setRootElementHandler( getSaxRspnRoot() );
		if( myGrammar == null ) {
			InputStream input;
			File file = new File( SCHEMA_URI );
			if( file.exists() ) {
				try {
					input = new FileInputStream( file );
				}
				catch( Exception e ) {
					input = null;
				}
				if( input != null ) {
					myGrammar = addToGrammarPool( SCHEMA_URI, input );
				}
			}
			else {
				input = getClass().getResourceAsStream( SCHEMA_ROOT_URI );
				if( input != null ) {
					myGrammar = addToGrammarPool( SCHEMA_ROOT_URI, input );
				}
			}
			file = new File( CFSEC_URI );
			if( file.exists() ) {
				try {
					input = new FileInputStream( file );
				}
				catch( Exception e ) {
					input = null;
				}
				if( input != null ) {
					addToGrammarPool( CFSEC_URI, input );
				}
			}
			else {
				input = getClass().getResourceAsStream( CFSEC_ROOT_URI );
				if( input != null ) {
					addToGrammarPool( CFSEC_ROOT_URI, input );
				}
			}
			file = new File( CFINT_URI );
			if( file.exists() ) {
				try {
					input = new FileInputStream( file );
				}
				catch( Exception e ) {
					input = null;
				}
				if( input != null ) {
					addToGrammarPool( CFINT_URI, input );
				}
			}
			else {
				input = getClass().getResourceAsStream( CFINT_ROOT_URI );
				if( input != null ) {
					addToGrammarPool( CFINT_ROOT_URI, input );
				}
			}
		}
		initParser();
		setSchemaObj( null );
	}

	public CFBamXMsgRspn( CFBamSchemaObj schemaObj, ICFLibMessageLog logger ) {
		super( logger );
		setRootElementHandler( getSaxRspnRoot() );
		if( myGrammar == null ) {
			InputStream input;
			File file = new File( SCHEMA_URI );
			if( file.exists() ) {
				try {
					input = new FileInputStream( file );
				}
				catch( Exception e ) {
					input = null;
				}
				if( input != null ) {
					myGrammar = addToGrammarPool( SCHEMA_URI, input );
				}
			}
			else {
				input = getClass().getResourceAsStream( SCHEMA_ROOT_URI );
				if( input != null ) {
					myGrammar = addToGrammarPool( SCHEMA_ROOT_URI, input );
				}
			}
			file = new File( CFSEC_URI );
			if( file.exists() ) {
				try {
					input = new FileInputStream( file );
				}
				catch( Exception e ) {
					input = null;
				}
				if( input != null ) {
					addToGrammarPool( CFSEC_URI, input );
				}
			}
			else {
				input = getClass().getResourceAsStream( CFSEC_ROOT_URI );
				if( input != null ) {
					addToGrammarPool( CFSEC_ROOT_URI, input );
				}
			}
			file = new File( CFINT_URI );
			if( file.exists() ) {
				try {
					input = new FileInputStream( file );
				}
				catch( Exception e ) {
					input = null;
				}
				if( input != null ) {
					addToGrammarPool( CFINT_URI, input );
				}
			}
			else {
				input = getClass().getResourceAsStream( CFINT_ROOT_URI );
				if( input != null ) {
					addToGrammarPool( CFINT_ROOT_URI, input );
				}
			}
		}
		initParser();
		setSchemaObj( schemaObj );
	}

	// Element  instances

	private CFBamXMsgRspnNoDataFound rspnNoDataFound = null;
	private CFBamXMsgRspnException rspnException = null;
	private CFBamXMsgRspnFileLoaded rspnFileLoaded = null;
	private CFBamXMsgRspnLoggedIn rspnLoggedIn = null;
	private CFBamXMsgRspnLoggedOut rspnLoggedOut = null;
	private CFBamXMsgRspnServerProcExecuted rspnServerProcExecuted = null;

	// Atom Response s
	private CFBamXMsgRspnAtomRec rspnAtomRec = null;
	private CFBamXMsgRspnAtomCreated rspnAtomCreated = null;
	private CFBamXMsgRspnAtomReadSingle rspnAtomReadSingle = null;
	private CFBamXMsgRspnAtomReadList rspnAtomReadList = null;
	private CFBamXMsgRspnAtomLocked rspnAtomLocked = null;
	private CFBamXMsgRspnAtomUpdated rspnAtomUpdated = null;
	private CFBamXMsgRspnAtomDeleted rspnAtomDeleted = null;

	// BlobCol Response s
	private CFBamXMsgRspnBlobColRec rspnBlobColRec = null;
	private CFBamXMsgRspnBlobColCreated rspnBlobColCreated = null;
	private CFBamXMsgRspnBlobColReadSingle rspnBlobColReadSingle = null;
	private CFBamXMsgRspnBlobColReadList rspnBlobColReadList = null;
	private CFBamXMsgRspnBlobColLocked rspnBlobColLocked = null;
	private CFBamXMsgRspnBlobColUpdated rspnBlobColUpdated = null;
	private CFBamXMsgRspnBlobColDeleted rspnBlobColDeleted = null;

	// BlobDef Response s
	private CFBamXMsgRspnBlobDefRec rspnBlobDefRec = null;
	private CFBamXMsgRspnBlobDefCreated rspnBlobDefCreated = null;
	private CFBamXMsgRspnBlobDefReadSingle rspnBlobDefReadSingle = null;
	private CFBamXMsgRspnBlobDefReadList rspnBlobDefReadList = null;
	private CFBamXMsgRspnBlobDefLocked rspnBlobDefLocked = null;
	private CFBamXMsgRspnBlobDefUpdated rspnBlobDefUpdated = null;
	private CFBamXMsgRspnBlobDefDeleted rspnBlobDefDeleted = null;

	// BlobType Response s
	private CFBamXMsgRspnBlobTypeRec rspnBlobTypeRec = null;
	private CFBamXMsgRspnBlobTypeCreated rspnBlobTypeCreated = null;
	private CFBamXMsgRspnBlobTypeReadSingle rspnBlobTypeReadSingle = null;
	private CFBamXMsgRspnBlobTypeReadList rspnBlobTypeReadList = null;
	private CFBamXMsgRspnBlobTypeLocked rspnBlobTypeLocked = null;
	private CFBamXMsgRspnBlobTypeUpdated rspnBlobTypeUpdated = null;
	private CFBamXMsgRspnBlobTypeDeleted rspnBlobTypeDeleted = null;

	// BoolCol Response s
	private CFBamXMsgRspnBoolColRec rspnBoolColRec = null;
	private CFBamXMsgRspnBoolColCreated rspnBoolColCreated = null;
	private CFBamXMsgRspnBoolColReadSingle rspnBoolColReadSingle = null;
	private CFBamXMsgRspnBoolColReadList rspnBoolColReadList = null;
	private CFBamXMsgRspnBoolColLocked rspnBoolColLocked = null;
	private CFBamXMsgRspnBoolColUpdated rspnBoolColUpdated = null;
	private CFBamXMsgRspnBoolColDeleted rspnBoolColDeleted = null;

	// BoolDef Response s
	private CFBamXMsgRspnBoolDefRec rspnBoolDefRec = null;
	private CFBamXMsgRspnBoolDefCreated rspnBoolDefCreated = null;
	private CFBamXMsgRspnBoolDefReadSingle rspnBoolDefReadSingle = null;
	private CFBamXMsgRspnBoolDefReadList rspnBoolDefReadList = null;
	private CFBamXMsgRspnBoolDefLocked rspnBoolDefLocked = null;
	private CFBamXMsgRspnBoolDefUpdated rspnBoolDefUpdated = null;
	private CFBamXMsgRspnBoolDefDeleted rspnBoolDefDeleted = null;

	// BoolType Response s
	private CFBamXMsgRspnBoolTypeRec rspnBoolTypeRec = null;
	private CFBamXMsgRspnBoolTypeCreated rspnBoolTypeCreated = null;
	private CFBamXMsgRspnBoolTypeReadSingle rspnBoolTypeReadSingle = null;
	private CFBamXMsgRspnBoolTypeReadList rspnBoolTypeReadList = null;
	private CFBamXMsgRspnBoolTypeLocked rspnBoolTypeLocked = null;
	private CFBamXMsgRspnBoolTypeUpdated rspnBoolTypeUpdated = null;
	private CFBamXMsgRspnBoolTypeDeleted rspnBoolTypeDeleted = null;

	// Chain Response s
	private CFBamXMsgRspnChainRec rspnChainRec = null;
	private CFBamXMsgRspnChainCreated rspnChainCreated = null;
	private CFBamXMsgRspnChainReadSingle rspnChainReadSingle = null;
	private CFBamXMsgRspnChainReadList rspnChainReadList = null;
	private CFBamXMsgRspnChainLocked rspnChainLocked = null;
	private CFBamXMsgRspnChainUpdated rspnChainUpdated = null;
	private CFBamXMsgRspnChainDeleted rspnChainDeleted = null;

	// ClearDep Response s
	private CFBamXMsgRspnClearDepRec rspnClearDepRec = null;
	private CFBamXMsgRspnClearDepCreated rspnClearDepCreated = null;
	private CFBamXMsgRspnClearDepReadSingle rspnClearDepReadSingle = null;
	private CFBamXMsgRspnClearDepReadList rspnClearDepReadList = null;
	private CFBamXMsgRspnClearDepLocked rspnClearDepLocked = null;
	private CFBamXMsgRspnClearDepUpdated rspnClearDepUpdated = null;
	private CFBamXMsgRspnClearDepDeleted rspnClearDepDeleted = null;

	// ClearSubDep1 Response s
	private CFBamXMsgRspnClearSubDep1Rec rspnClearSubDep1Rec = null;
	private CFBamXMsgRspnClearSubDep1Created rspnClearSubDep1Created = null;
	private CFBamXMsgRspnClearSubDep1ReadSingle rspnClearSubDep1ReadSingle = null;
	private CFBamXMsgRspnClearSubDep1ReadList rspnClearSubDep1ReadList = null;
	private CFBamXMsgRspnClearSubDep1Locked rspnClearSubDep1Locked = null;
	private CFBamXMsgRspnClearSubDep1Updated rspnClearSubDep1Updated = null;
	private CFBamXMsgRspnClearSubDep1Deleted rspnClearSubDep1Deleted = null;

	// ClearSubDep2 Response s
	private CFBamXMsgRspnClearSubDep2Rec rspnClearSubDep2Rec = null;
	private CFBamXMsgRspnClearSubDep2Created rspnClearSubDep2Created = null;
	private CFBamXMsgRspnClearSubDep2ReadSingle rspnClearSubDep2ReadSingle = null;
	private CFBamXMsgRspnClearSubDep2ReadList rspnClearSubDep2ReadList = null;
	private CFBamXMsgRspnClearSubDep2Locked rspnClearSubDep2Locked = null;
	private CFBamXMsgRspnClearSubDep2Updated rspnClearSubDep2Updated = null;
	private CFBamXMsgRspnClearSubDep2Deleted rspnClearSubDep2Deleted = null;

	// ClearSubDep3 Response s
	private CFBamXMsgRspnClearSubDep3Rec rspnClearSubDep3Rec = null;
	private CFBamXMsgRspnClearSubDep3Created rspnClearSubDep3Created = null;
	private CFBamXMsgRspnClearSubDep3ReadSingle rspnClearSubDep3ReadSingle = null;
	private CFBamXMsgRspnClearSubDep3ReadList rspnClearSubDep3ReadList = null;
	private CFBamXMsgRspnClearSubDep3Locked rspnClearSubDep3Locked = null;
	private CFBamXMsgRspnClearSubDep3Updated rspnClearSubDep3Updated = null;
	private CFBamXMsgRspnClearSubDep3Deleted rspnClearSubDep3Deleted = null;

	// ClearTopDep Response s
	private CFBamXMsgRspnClearTopDepRec rspnClearTopDepRec = null;
	private CFBamXMsgRspnClearTopDepCreated rspnClearTopDepCreated = null;
	private CFBamXMsgRspnClearTopDepReadSingle rspnClearTopDepReadSingle = null;
	private CFBamXMsgRspnClearTopDepReadList rspnClearTopDepReadList = null;
	private CFBamXMsgRspnClearTopDepLocked rspnClearTopDepLocked = null;
	private CFBamXMsgRspnClearTopDepUpdated rspnClearTopDepUpdated = null;
	private CFBamXMsgRspnClearTopDepDeleted rspnClearTopDepDeleted = null;

	// Cluster Response s
	private CFBamXMsgRspnClusterRec rspnClusterRec = null;
	private CFBamXMsgRspnClusterCreated rspnClusterCreated = null;
	private CFBamXMsgRspnClusterReadSingle rspnClusterReadSingle = null;
	private CFBamXMsgRspnClusterReadList rspnClusterReadList = null;
	private CFBamXMsgRspnClusterLocked rspnClusterLocked = null;
	private CFBamXMsgRspnClusterUpdated rspnClusterUpdated = null;
	private CFBamXMsgRspnClusterDeleted rspnClusterDeleted = null;

	// DateCol Response s
	private CFBamXMsgRspnDateColRec rspnDateColRec = null;
	private CFBamXMsgRspnDateColCreated rspnDateColCreated = null;
	private CFBamXMsgRspnDateColReadSingle rspnDateColReadSingle = null;
	private CFBamXMsgRspnDateColReadList rspnDateColReadList = null;
	private CFBamXMsgRspnDateColLocked rspnDateColLocked = null;
	private CFBamXMsgRspnDateColUpdated rspnDateColUpdated = null;
	private CFBamXMsgRspnDateColDeleted rspnDateColDeleted = null;

	// DateDef Response s
	private CFBamXMsgRspnDateDefRec rspnDateDefRec = null;
	private CFBamXMsgRspnDateDefCreated rspnDateDefCreated = null;
	private CFBamXMsgRspnDateDefReadSingle rspnDateDefReadSingle = null;
	private CFBamXMsgRspnDateDefReadList rspnDateDefReadList = null;
	private CFBamXMsgRspnDateDefLocked rspnDateDefLocked = null;
	private CFBamXMsgRspnDateDefUpdated rspnDateDefUpdated = null;
	private CFBamXMsgRspnDateDefDeleted rspnDateDefDeleted = null;

	// DateType Response s
	private CFBamXMsgRspnDateTypeRec rspnDateTypeRec = null;
	private CFBamXMsgRspnDateTypeCreated rspnDateTypeCreated = null;
	private CFBamXMsgRspnDateTypeReadSingle rspnDateTypeReadSingle = null;
	private CFBamXMsgRspnDateTypeReadList rspnDateTypeReadList = null;
	private CFBamXMsgRspnDateTypeLocked rspnDateTypeLocked = null;
	private CFBamXMsgRspnDateTypeUpdated rspnDateTypeUpdated = null;
	private CFBamXMsgRspnDateTypeDeleted rspnDateTypeDeleted = null;

	// DelDep Response s
	private CFBamXMsgRspnDelDepRec rspnDelDepRec = null;
	private CFBamXMsgRspnDelDepCreated rspnDelDepCreated = null;
	private CFBamXMsgRspnDelDepReadSingle rspnDelDepReadSingle = null;
	private CFBamXMsgRspnDelDepReadList rspnDelDepReadList = null;
	private CFBamXMsgRspnDelDepLocked rspnDelDepLocked = null;
	private CFBamXMsgRspnDelDepUpdated rspnDelDepUpdated = null;
	private CFBamXMsgRspnDelDepDeleted rspnDelDepDeleted = null;

	// DelSubDep1 Response s
	private CFBamXMsgRspnDelSubDep1Rec rspnDelSubDep1Rec = null;
	private CFBamXMsgRspnDelSubDep1Created rspnDelSubDep1Created = null;
	private CFBamXMsgRspnDelSubDep1ReadSingle rspnDelSubDep1ReadSingle = null;
	private CFBamXMsgRspnDelSubDep1ReadList rspnDelSubDep1ReadList = null;
	private CFBamXMsgRspnDelSubDep1Locked rspnDelSubDep1Locked = null;
	private CFBamXMsgRspnDelSubDep1Updated rspnDelSubDep1Updated = null;
	private CFBamXMsgRspnDelSubDep1Deleted rspnDelSubDep1Deleted = null;

	// DelSubDep2 Response s
	private CFBamXMsgRspnDelSubDep2Rec rspnDelSubDep2Rec = null;
	private CFBamXMsgRspnDelSubDep2Created rspnDelSubDep2Created = null;
	private CFBamXMsgRspnDelSubDep2ReadSingle rspnDelSubDep2ReadSingle = null;
	private CFBamXMsgRspnDelSubDep2ReadList rspnDelSubDep2ReadList = null;
	private CFBamXMsgRspnDelSubDep2Locked rspnDelSubDep2Locked = null;
	private CFBamXMsgRspnDelSubDep2Updated rspnDelSubDep2Updated = null;
	private CFBamXMsgRspnDelSubDep2Deleted rspnDelSubDep2Deleted = null;

	// DelSubDep3 Response s
	private CFBamXMsgRspnDelSubDep3Rec rspnDelSubDep3Rec = null;
	private CFBamXMsgRspnDelSubDep3Created rspnDelSubDep3Created = null;
	private CFBamXMsgRspnDelSubDep3ReadSingle rspnDelSubDep3ReadSingle = null;
	private CFBamXMsgRspnDelSubDep3ReadList rspnDelSubDep3ReadList = null;
	private CFBamXMsgRspnDelSubDep3Locked rspnDelSubDep3Locked = null;
	private CFBamXMsgRspnDelSubDep3Updated rspnDelSubDep3Updated = null;
	private CFBamXMsgRspnDelSubDep3Deleted rspnDelSubDep3Deleted = null;

	// DelTopDep Response s
	private CFBamXMsgRspnDelTopDepRec rspnDelTopDepRec = null;
	private CFBamXMsgRspnDelTopDepCreated rspnDelTopDepCreated = null;
	private CFBamXMsgRspnDelTopDepReadSingle rspnDelTopDepReadSingle = null;
	private CFBamXMsgRspnDelTopDepReadList rspnDelTopDepReadList = null;
	private CFBamXMsgRspnDelTopDepLocked rspnDelTopDepLocked = null;
	private CFBamXMsgRspnDelTopDepUpdated rspnDelTopDepUpdated = null;
	private CFBamXMsgRspnDelTopDepDeleted rspnDelTopDepDeleted = null;

	// DoubleCol Response s
	private CFBamXMsgRspnDoubleColRec rspnDoubleColRec = null;
	private CFBamXMsgRspnDoubleColCreated rspnDoubleColCreated = null;
	private CFBamXMsgRspnDoubleColReadSingle rspnDoubleColReadSingle = null;
	private CFBamXMsgRspnDoubleColReadList rspnDoubleColReadList = null;
	private CFBamXMsgRspnDoubleColLocked rspnDoubleColLocked = null;
	private CFBamXMsgRspnDoubleColUpdated rspnDoubleColUpdated = null;
	private CFBamXMsgRspnDoubleColDeleted rspnDoubleColDeleted = null;

	// DoubleDef Response s
	private CFBamXMsgRspnDoubleDefRec rspnDoubleDefRec = null;
	private CFBamXMsgRspnDoubleDefCreated rspnDoubleDefCreated = null;
	private CFBamXMsgRspnDoubleDefReadSingle rspnDoubleDefReadSingle = null;
	private CFBamXMsgRspnDoubleDefReadList rspnDoubleDefReadList = null;
	private CFBamXMsgRspnDoubleDefLocked rspnDoubleDefLocked = null;
	private CFBamXMsgRspnDoubleDefUpdated rspnDoubleDefUpdated = null;
	private CFBamXMsgRspnDoubleDefDeleted rspnDoubleDefDeleted = null;

	// DoubleType Response s
	private CFBamXMsgRspnDoubleTypeRec rspnDoubleTypeRec = null;
	private CFBamXMsgRspnDoubleTypeCreated rspnDoubleTypeCreated = null;
	private CFBamXMsgRspnDoubleTypeReadSingle rspnDoubleTypeReadSingle = null;
	private CFBamXMsgRspnDoubleTypeReadList rspnDoubleTypeReadList = null;
	private CFBamXMsgRspnDoubleTypeLocked rspnDoubleTypeLocked = null;
	private CFBamXMsgRspnDoubleTypeUpdated rspnDoubleTypeUpdated = null;
	private CFBamXMsgRspnDoubleTypeDeleted rspnDoubleTypeDeleted = null;

	// EnumDef Response s
	private CFBamXMsgRspnEnumDefRec rspnEnumDefRec = null;
	private CFBamXMsgRspnEnumDefCreated rspnEnumDefCreated = null;
	private CFBamXMsgRspnEnumDefReadSingle rspnEnumDefReadSingle = null;
	private CFBamXMsgRspnEnumDefReadList rspnEnumDefReadList = null;
	private CFBamXMsgRspnEnumDefLocked rspnEnumDefLocked = null;
	private CFBamXMsgRspnEnumDefUpdated rspnEnumDefUpdated = null;
	private CFBamXMsgRspnEnumDefDeleted rspnEnumDefDeleted = null;

	// EnumTag Response s
	private CFBamXMsgRspnEnumTagRec rspnEnumTagRec = null;
	private CFBamXMsgRspnEnumTagCreated rspnEnumTagCreated = null;
	private CFBamXMsgRspnEnumTagReadSingle rspnEnumTagReadSingle = null;
	private CFBamXMsgRspnEnumTagReadList rspnEnumTagReadList = null;
	private CFBamXMsgRspnEnumTagLocked rspnEnumTagLocked = null;
	private CFBamXMsgRspnEnumTagUpdated rspnEnumTagUpdated = null;
	private CFBamXMsgRspnEnumTagDeleted rspnEnumTagDeleted = null;

	// EnumType Response s
	private CFBamXMsgRspnEnumTypeRec rspnEnumTypeRec = null;
	private CFBamXMsgRspnEnumTypeCreated rspnEnumTypeCreated = null;
	private CFBamXMsgRspnEnumTypeReadSingle rspnEnumTypeReadSingle = null;
	private CFBamXMsgRspnEnumTypeReadList rspnEnumTypeReadList = null;
	private CFBamXMsgRspnEnumTypeLocked rspnEnumTypeLocked = null;
	private CFBamXMsgRspnEnumTypeUpdated rspnEnumTypeUpdated = null;
	private CFBamXMsgRspnEnumTypeDeleted rspnEnumTypeDeleted = null;

	// FloatCol Response s
	private CFBamXMsgRspnFloatColRec rspnFloatColRec = null;
	private CFBamXMsgRspnFloatColCreated rspnFloatColCreated = null;
	private CFBamXMsgRspnFloatColReadSingle rspnFloatColReadSingle = null;
	private CFBamXMsgRspnFloatColReadList rspnFloatColReadList = null;
	private CFBamXMsgRspnFloatColLocked rspnFloatColLocked = null;
	private CFBamXMsgRspnFloatColUpdated rspnFloatColUpdated = null;
	private CFBamXMsgRspnFloatColDeleted rspnFloatColDeleted = null;

	// FloatDef Response s
	private CFBamXMsgRspnFloatDefRec rspnFloatDefRec = null;
	private CFBamXMsgRspnFloatDefCreated rspnFloatDefCreated = null;
	private CFBamXMsgRspnFloatDefReadSingle rspnFloatDefReadSingle = null;
	private CFBamXMsgRspnFloatDefReadList rspnFloatDefReadList = null;
	private CFBamXMsgRspnFloatDefLocked rspnFloatDefLocked = null;
	private CFBamXMsgRspnFloatDefUpdated rspnFloatDefUpdated = null;
	private CFBamXMsgRspnFloatDefDeleted rspnFloatDefDeleted = null;

	// FloatType Response s
	private CFBamXMsgRspnFloatTypeRec rspnFloatTypeRec = null;
	private CFBamXMsgRspnFloatTypeCreated rspnFloatTypeCreated = null;
	private CFBamXMsgRspnFloatTypeReadSingle rspnFloatTypeReadSingle = null;
	private CFBamXMsgRspnFloatTypeReadList rspnFloatTypeReadList = null;
	private CFBamXMsgRspnFloatTypeLocked rspnFloatTypeLocked = null;
	private CFBamXMsgRspnFloatTypeUpdated rspnFloatTypeUpdated = null;
	private CFBamXMsgRspnFloatTypeDeleted rspnFloatTypeDeleted = null;

	// HostNode Response s
	private CFBamXMsgRspnHostNodeRec rspnHostNodeRec = null;
	private CFBamXMsgRspnHostNodeCreated rspnHostNodeCreated = null;
	private CFBamXMsgRspnHostNodeReadSingle rspnHostNodeReadSingle = null;
	private CFBamXMsgRspnHostNodeReadList rspnHostNodeReadList = null;
	private CFBamXMsgRspnHostNodeLocked rspnHostNodeLocked = null;
	private CFBamXMsgRspnHostNodeUpdated rspnHostNodeUpdated = null;
	private CFBamXMsgRspnHostNodeDeleted rspnHostNodeDeleted = null;

	// ISOCcy Response s
	private CFBamXMsgRspnISOCcyRec rspnISOCcyRec = null;
	private CFBamXMsgRspnISOCcyCreated rspnISOCcyCreated = null;
	private CFBamXMsgRspnISOCcyReadSingle rspnISOCcyReadSingle = null;
	private CFBamXMsgRspnISOCcyReadList rspnISOCcyReadList = null;
	private CFBamXMsgRspnISOCcyLocked rspnISOCcyLocked = null;
	private CFBamXMsgRspnISOCcyUpdated rspnISOCcyUpdated = null;
	private CFBamXMsgRspnISOCcyDeleted rspnISOCcyDeleted = null;

	// ISOCtry Response s
	private CFBamXMsgRspnISOCtryRec rspnISOCtryRec = null;
	private CFBamXMsgRspnISOCtryCreated rspnISOCtryCreated = null;
	private CFBamXMsgRspnISOCtryReadSingle rspnISOCtryReadSingle = null;
	private CFBamXMsgRspnISOCtryReadList rspnISOCtryReadList = null;
	private CFBamXMsgRspnISOCtryLocked rspnISOCtryLocked = null;
	private CFBamXMsgRspnISOCtryUpdated rspnISOCtryUpdated = null;
	private CFBamXMsgRspnISOCtryDeleted rspnISOCtryDeleted = null;

	// ISOCtryCcy Response s
	private CFBamXMsgRspnISOCtryCcyRec rspnISOCtryCcyRec = null;
	private CFBamXMsgRspnISOCtryCcyCreated rspnISOCtryCcyCreated = null;
	private CFBamXMsgRspnISOCtryCcyReadSingle rspnISOCtryCcyReadSingle = null;
	private CFBamXMsgRspnISOCtryCcyReadList rspnISOCtryCcyReadList = null;
	private CFBamXMsgRspnISOCtryCcyLocked rspnISOCtryCcyLocked = null;
	private CFBamXMsgRspnISOCtryCcyUpdated rspnISOCtryCcyUpdated = null;
	private CFBamXMsgRspnISOCtryCcyDeleted rspnISOCtryCcyDeleted = null;

	// ISOCtryLang Response s
	private CFBamXMsgRspnISOCtryLangRec rspnISOCtryLangRec = null;
	private CFBamXMsgRspnISOCtryLangCreated rspnISOCtryLangCreated = null;
	private CFBamXMsgRspnISOCtryLangReadSingle rspnISOCtryLangReadSingle = null;
	private CFBamXMsgRspnISOCtryLangReadList rspnISOCtryLangReadList = null;
	private CFBamXMsgRspnISOCtryLangLocked rspnISOCtryLangLocked = null;
	private CFBamXMsgRspnISOCtryLangUpdated rspnISOCtryLangUpdated = null;
	private CFBamXMsgRspnISOCtryLangDeleted rspnISOCtryLangDeleted = null;

	// ISOLang Response s
	private CFBamXMsgRspnISOLangRec rspnISOLangRec = null;
	private CFBamXMsgRspnISOLangCreated rspnISOLangCreated = null;
	private CFBamXMsgRspnISOLangReadSingle rspnISOLangReadSingle = null;
	private CFBamXMsgRspnISOLangReadList rspnISOLangReadList = null;
	private CFBamXMsgRspnISOLangLocked rspnISOLangLocked = null;
	private CFBamXMsgRspnISOLangUpdated rspnISOLangUpdated = null;
	private CFBamXMsgRspnISOLangDeleted rspnISOLangDeleted = null;

	// ISOTZone Response s
	private CFBamXMsgRspnISOTZoneRec rspnISOTZoneRec = null;
	private CFBamXMsgRspnISOTZoneCreated rspnISOTZoneCreated = null;
	private CFBamXMsgRspnISOTZoneReadSingle rspnISOTZoneReadSingle = null;
	private CFBamXMsgRspnISOTZoneReadList rspnISOTZoneReadList = null;
	private CFBamXMsgRspnISOTZoneLocked rspnISOTZoneLocked = null;
	private CFBamXMsgRspnISOTZoneUpdated rspnISOTZoneUpdated = null;
	private CFBamXMsgRspnISOTZoneDeleted rspnISOTZoneDeleted = null;

	// Id16Gen Response s
	private CFBamXMsgRspnId16GenRec rspnId16GenRec = null;
	private CFBamXMsgRspnId16GenCreated rspnId16GenCreated = null;
	private CFBamXMsgRspnId16GenReadSingle rspnId16GenReadSingle = null;
	private CFBamXMsgRspnId16GenReadList rspnId16GenReadList = null;
	private CFBamXMsgRspnId16GenLocked rspnId16GenLocked = null;
	private CFBamXMsgRspnId16GenUpdated rspnId16GenUpdated = null;
	private CFBamXMsgRspnId16GenDeleted rspnId16GenDeleted = null;

	// Id32Gen Response s
	private CFBamXMsgRspnId32GenRec rspnId32GenRec = null;
	private CFBamXMsgRspnId32GenCreated rspnId32GenCreated = null;
	private CFBamXMsgRspnId32GenReadSingle rspnId32GenReadSingle = null;
	private CFBamXMsgRspnId32GenReadList rspnId32GenReadList = null;
	private CFBamXMsgRspnId32GenLocked rspnId32GenLocked = null;
	private CFBamXMsgRspnId32GenUpdated rspnId32GenUpdated = null;
	private CFBamXMsgRspnId32GenDeleted rspnId32GenDeleted = null;

	// Id64Gen Response s
	private CFBamXMsgRspnId64GenRec rspnId64GenRec = null;
	private CFBamXMsgRspnId64GenCreated rspnId64GenCreated = null;
	private CFBamXMsgRspnId64GenReadSingle rspnId64GenReadSingle = null;
	private CFBamXMsgRspnId64GenReadList rspnId64GenReadList = null;
	private CFBamXMsgRspnId64GenLocked rspnId64GenLocked = null;
	private CFBamXMsgRspnId64GenUpdated rspnId64GenUpdated = null;
	private CFBamXMsgRspnId64GenDeleted rspnId64GenDeleted = null;

	// Index Response s
	private CFBamXMsgRspnIndexRec rspnIndexRec = null;
	private CFBamXMsgRspnIndexCreated rspnIndexCreated = null;
	private CFBamXMsgRspnIndexReadSingle rspnIndexReadSingle = null;
	private CFBamXMsgRspnIndexReadList rspnIndexReadList = null;
	private CFBamXMsgRspnIndexLocked rspnIndexLocked = null;
	private CFBamXMsgRspnIndexUpdated rspnIndexUpdated = null;
	private CFBamXMsgRspnIndexDeleted rspnIndexDeleted = null;

	// IndexCol Response s
	private CFBamXMsgRspnIndexColRec rspnIndexColRec = null;
	private CFBamXMsgRspnIndexColCreated rspnIndexColCreated = null;
	private CFBamXMsgRspnIndexColReadSingle rspnIndexColReadSingle = null;
	private CFBamXMsgRspnIndexColReadList rspnIndexColReadList = null;
	private CFBamXMsgRspnIndexColLocked rspnIndexColLocked = null;
	private CFBamXMsgRspnIndexColUpdated rspnIndexColUpdated = null;
	private CFBamXMsgRspnIndexColDeleted rspnIndexColDeleted = null;

	// Int16Col Response s
	private CFBamXMsgRspnInt16ColRec rspnInt16ColRec = null;
	private CFBamXMsgRspnInt16ColCreated rspnInt16ColCreated = null;
	private CFBamXMsgRspnInt16ColReadSingle rspnInt16ColReadSingle = null;
	private CFBamXMsgRspnInt16ColReadList rspnInt16ColReadList = null;
	private CFBamXMsgRspnInt16ColLocked rspnInt16ColLocked = null;
	private CFBamXMsgRspnInt16ColUpdated rspnInt16ColUpdated = null;
	private CFBamXMsgRspnInt16ColDeleted rspnInt16ColDeleted = null;

	// Int16Def Response s
	private CFBamXMsgRspnInt16DefRec rspnInt16DefRec = null;
	private CFBamXMsgRspnInt16DefCreated rspnInt16DefCreated = null;
	private CFBamXMsgRspnInt16DefReadSingle rspnInt16DefReadSingle = null;
	private CFBamXMsgRspnInt16DefReadList rspnInt16DefReadList = null;
	private CFBamXMsgRspnInt16DefLocked rspnInt16DefLocked = null;
	private CFBamXMsgRspnInt16DefUpdated rspnInt16DefUpdated = null;
	private CFBamXMsgRspnInt16DefDeleted rspnInt16DefDeleted = null;

	// Int16Type Response s
	private CFBamXMsgRspnInt16TypeRec rspnInt16TypeRec = null;
	private CFBamXMsgRspnInt16TypeCreated rspnInt16TypeCreated = null;
	private CFBamXMsgRspnInt16TypeReadSingle rspnInt16TypeReadSingle = null;
	private CFBamXMsgRspnInt16TypeReadList rspnInt16TypeReadList = null;
	private CFBamXMsgRspnInt16TypeLocked rspnInt16TypeLocked = null;
	private CFBamXMsgRspnInt16TypeUpdated rspnInt16TypeUpdated = null;
	private CFBamXMsgRspnInt16TypeDeleted rspnInt16TypeDeleted = null;

	// Int32Col Response s
	private CFBamXMsgRspnInt32ColRec rspnInt32ColRec = null;
	private CFBamXMsgRspnInt32ColCreated rspnInt32ColCreated = null;
	private CFBamXMsgRspnInt32ColReadSingle rspnInt32ColReadSingle = null;
	private CFBamXMsgRspnInt32ColReadList rspnInt32ColReadList = null;
	private CFBamXMsgRspnInt32ColLocked rspnInt32ColLocked = null;
	private CFBamXMsgRspnInt32ColUpdated rspnInt32ColUpdated = null;
	private CFBamXMsgRspnInt32ColDeleted rspnInt32ColDeleted = null;

	// Int32Def Response s
	private CFBamXMsgRspnInt32DefRec rspnInt32DefRec = null;
	private CFBamXMsgRspnInt32DefCreated rspnInt32DefCreated = null;
	private CFBamXMsgRspnInt32DefReadSingle rspnInt32DefReadSingle = null;
	private CFBamXMsgRspnInt32DefReadList rspnInt32DefReadList = null;
	private CFBamXMsgRspnInt32DefLocked rspnInt32DefLocked = null;
	private CFBamXMsgRspnInt32DefUpdated rspnInt32DefUpdated = null;
	private CFBamXMsgRspnInt32DefDeleted rspnInt32DefDeleted = null;

	// Int32Type Response s
	private CFBamXMsgRspnInt32TypeRec rspnInt32TypeRec = null;
	private CFBamXMsgRspnInt32TypeCreated rspnInt32TypeCreated = null;
	private CFBamXMsgRspnInt32TypeReadSingle rspnInt32TypeReadSingle = null;
	private CFBamXMsgRspnInt32TypeReadList rspnInt32TypeReadList = null;
	private CFBamXMsgRspnInt32TypeLocked rspnInt32TypeLocked = null;
	private CFBamXMsgRspnInt32TypeUpdated rspnInt32TypeUpdated = null;
	private CFBamXMsgRspnInt32TypeDeleted rspnInt32TypeDeleted = null;

	// Int64Col Response s
	private CFBamXMsgRspnInt64ColRec rspnInt64ColRec = null;
	private CFBamXMsgRspnInt64ColCreated rspnInt64ColCreated = null;
	private CFBamXMsgRspnInt64ColReadSingle rspnInt64ColReadSingle = null;
	private CFBamXMsgRspnInt64ColReadList rspnInt64ColReadList = null;
	private CFBamXMsgRspnInt64ColLocked rspnInt64ColLocked = null;
	private CFBamXMsgRspnInt64ColUpdated rspnInt64ColUpdated = null;
	private CFBamXMsgRspnInt64ColDeleted rspnInt64ColDeleted = null;

	// Int64Def Response s
	private CFBamXMsgRspnInt64DefRec rspnInt64DefRec = null;
	private CFBamXMsgRspnInt64DefCreated rspnInt64DefCreated = null;
	private CFBamXMsgRspnInt64DefReadSingle rspnInt64DefReadSingle = null;
	private CFBamXMsgRspnInt64DefReadList rspnInt64DefReadList = null;
	private CFBamXMsgRspnInt64DefLocked rspnInt64DefLocked = null;
	private CFBamXMsgRspnInt64DefUpdated rspnInt64DefUpdated = null;
	private CFBamXMsgRspnInt64DefDeleted rspnInt64DefDeleted = null;

	// Int64Type Response s
	private CFBamXMsgRspnInt64TypeRec rspnInt64TypeRec = null;
	private CFBamXMsgRspnInt64TypeCreated rspnInt64TypeCreated = null;
	private CFBamXMsgRspnInt64TypeReadSingle rspnInt64TypeReadSingle = null;
	private CFBamXMsgRspnInt64TypeReadList rspnInt64TypeReadList = null;
	private CFBamXMsgRspnInt64TypeLocked rspnInt64TypeLocked = null;
	private CFBamXMsgRspnInt64TypeUpdated rspnInt64TypeUpdated = null;
	private CFBamXMsgRspnInt64TypeDeleted rspnInt64TypeDeleted = null;

	// MajorVersion Response s
	private CFBamXMsgRspnMajorVersionRec rspnMajorVersionRec = null;
	private CFBamXMsgRspnMajorVersionCreated rspnMajorVersionCreated = null;
	private CFBamXMsgRspnMajorVersionReadSingle rspnMajorVersionReadSingle = null;
	private CFBamXMsgRspnMajorVersionReadList rspnMajorVersionReadList = null;
	private CFBamXMsgRspnMajorVersionLocked rspnMajorVersionLocked = null;
	private CFBamXMsgRspnMajorVersionUpdated rspnMajorVersionUpdated = null;
	private CFBamXMsgRspnMajorVersionDeleted rspnMajorVersionDeleted = null;

	// MimeType Response s
	private CFBamXMsgRspnMimeTypeRec rspnMimeTypeRec = null;
	private CFBamXMsgRspnMimeTypeCreated rspnMimeTypeCreated = null;
	private CFBamXMsgRspnMimeTypeReadSingle rspnMimeTypeReadSingle = null;
	private CFBamXMsgRspnMimeTypeReadList rspnMimeTypeReadList = null;
	private CFBamXMsgRspnMimeTypeLocked rspnMimeTypeLocked = null;
	private CFBamXMsgRspnMimeTypeUpdated rspnMimeTypeUpdated = null;
	private CFBamXMsgRspnMimeTypeDeleted rspnMimeTypeDeleted = null;

	// MinorVersion Response s
	private CFBamXMsgRspnMinorVersionRec rspnMinorVersionRec = null;
	private CFBamXMsgRspnMinorVersionCreated rspnMinorVersionCreated = null;
	private CFBamXMsgRspnMinorVersionReadSingle rspnMinorVersionReadSingle = null;
	private CFBamXMsgRspnMinorVersionReadList rspnMinorVersionReadList = null;
	private CFBamXMsgRspnMinorVersionLocked rspnMinorVersionLocked = null;
	private CFBamXMsgRspnMinorVersionUpdated rspnMinorVersionUpdated = null;
	private CFBamXMsgRspnMinorVersionDeleted rspnMinorVersionDeleted = null;

	// NmTokenCol Response s
	private CFBamXMsgRspnNmTokenColRec rspnNmTokenColRec = null;
	private CFBamXMsgRspnNmTokenColCreated rspnNmTokenColCreated = null;
	private CFBamXMsgRspnNmTokenColReadSingle rspnNmTokenColReadSingle = null;
	private CFBamXMsgRspnNmTokenColReadList rspnNmTokenColReadList = null;
	private CFBamXMsgRspnNmTokenColLocked rspnNmTokenColLocked = null;
	private CFBamXMsgRspnNmTokenColUpdated rspnNmTokenColUpdated = null;
	private CFBamXMsgRspnNmTokenColDeleted rspnNmTokenColDeleted = null;

	// NmTokenDef Response s
	private CFBamXMsgRspnNmTokenDefRec rspnNmTokenDefRec = null;
	private CFBamXMsgRspnNmTokenDefCreated rspnNmTokenDefCreated = null;
	private CFBamXMsgRspnNmTokenDefReadSingle rspnNmTokenDefReadSingle = null;
	private CFBamXMsgRspnNmTokenDefReadList rspnNmTokenDefReadList = null;
	private CFBamXMsgRspnNmTokenDefLocked rspnNmTokenDefLocked = null;
	private CFBamXMsgRspnNmTokenDefUpdated rspnNmTokenDefUpdated = null;
	private CFBamXMsgRspnNmTokenDefDeleted rspnNmTokenDefDeleted = null;

	// NmTokenType Response s
	private CFBamXMsgRspnNmTokenTypeRec rspnNmTokenTypeRec = null;
	private CFBamXMsgRspnNmTokenTypeCreated rspnNmTokenTypeCreated = null;
	private CFBamXMsgRspnNmTokenTypeReadSingle rspnNmTokenTypeReadSingle = null;
	private CFBamXMsgRspnNmTokenTypeReadList rspnNmTokenTypeReadList = null;
	private CFBamXMsgRspnNmTokenTypeLocked rspnNmTokenTypeLocked = null;
	private CFBamXMsgRspnNmTokenTypeUpdated rspnNmTokenTypeUpdated = null;
	private CFBamXMsgRspnNmTokenTypeDeleted rspnNmTokenTypeDeleted = null;

	// NmTokensCol Response s
	private CFBamXMsgRspnNmTokensColRec rspnNmTokensColRec = null;
	private CFBamXMsgRspnNmTokensColCreated rspnNmTokensColCreated = null;
	private CFBamXMsgRspnNmTokensColReadSingle rspnNmTokensColReadSingle = null;
	private CFBamXMsgRspnNmTokensColReadList rspnNmTokensColReadList = null;
	private CFBamXMsgRspnNmTokensColLocked rspnNmTokensColLocked = null;
	private CFBamXMsgRspnNmTokensColUpdated rspnNmTokensColUpdated = null;
	private CFBamXMsgRspnNmTokensColDeleted rspnNmTokensColDeleted = null;

	// NmTokensDef Response s
	private CFBamXMsgRspnNmTokensDefRec rspnNmTokensDefRec = null;
	private CFBamXMsgRspnNmTokensDefCreated rspnNmTokensDefCreated = null;
	private CFBamXMsgRspnNmTokensDefReadSingle rspnNmTokensDefReadSingle = null;
	private CFBamXMsgRspnNmTokensDefReadList rspnNmTokensDefReadList = null;
	private CFBamXMsgRspnNmTokensDefLocked rspnNmTokensDefLocked = null;
	private CFBamXMsgRspnNmTokensDefUpdated rspnNmTokensDefUpdated = null;
	private CFBamXMsgRspnNmTokensDefDeleted rspnNmTokensDefDeleted = null;

	// NmTokensType Response s
	private CFBamXMsgRspnNmTokensTypeRec rspnNmTokensTypeRec = null;
	private CFBamXMsgRspnNmTokensTypeCreated rspnNmTokensTypeCreated = null;
	private CFBamXMsgRspnNmTokensTypeReadSingle rspnNmTokensTypeReadSingle = null;
	private CFBamXMsgRspnNmTokensTypeReadList rspnNmTokensTypeReadList = null;
	private CFBamXMsgRspnNmTokensTypeLocked rspnNmTokensTypeLocked = null;
	private CFBamXMsgRspnNmTokensTypeUpdated rspnNmTokensTypeUpdated = null;
	private CFBamXMsgRspnNmTokensTypeDeleted rspnNmTokensTypeDeleted = null;

	// NumberCol Response s
	private CFBamXMsgRspnNumberColRec rspnNumberColRec = null;
	private CFBamXMsgRspnNumberColCreated rspnNumberColCreated = null;
	private CFBamXMsgRspnNumberColReadSingle rspnNumberColReadSingle = null;
	private CFBamXMsgRspnNumberColReadList rspnNumberColReadList = null;
	private CFBamXMsgRspnNumberColLocked rspnNumberColLocked = null;
	private CFBamXMsgRspnNumberColUpdated rspnNumberColUpdated = null;
	private CFBamXMsgRspnNumberColDeleted rspnNumberColDeleted = null;

	// NumberDef Response s
	private CFBamXMsgRspnNumberDefRec rspnNumberDefRec = null;
	private CFBamXMsgRspnNumberDefCreated rspnNumberDefCreated = null;
	private CFBamXMsgRspnNumberDefReadSingle rspnNumberDefReadSingle = null;
	private CFBamXMsgRspnNumberDefReadList rspnNumberDefReadList = null;
	private CFBamXMsgRspnNumberDefLocked rspnNumberDefLocked = null;
	private CFBamXMsgRspnNumberDefUpdated rspnNumberDefUpdated = null;
	private CFBamXMsgRspnNumberDefDeleted rspnNumberDefDeleted = null;

	// NumberType Response s
	private CFBamXMsgRspnNumberTypeRec rspnNumberTypeRec = null;
	private CFBamXMsgRspnNumberTypeCreated rspnNumberTypeCreated = null;
	private CFBamXMsgRspnNumberTypeReadSingle rspnNumberTypeReadSingle = null;
	private CFBamXMsgRspnNumberTypeReadList rspnNumberTypeReadList = null;
	private CFBamXMsgRspnNumberTypeLocked rspnNumberTypeLocked = null;
	private CFBamXMsgRspnNumberTypeUpdated rspnNumberTypeUpdated = null;
	private CFBamXMsgRspnNumberTypeDeleted rspnNumberTypeDeleted = null;

	// Param Response s
	private CFBamXMsgRspnParamRec rspnParamRec = null;
	private CFBamXMsgRspnParamCreated rspnParamCreated = null;
	private CFBamXMsgRspnParamReadSingle rspnParamReadSingle = null;
	private CFBamXMsgRspnParamReadList rspnParamReadList = null;
	private CFBamXMsgRspnParamLocked rspnParamLocked = null;
	private CFBamXMsgRspnParamUpdated rspnParamUpdated = null;
	private CFBamXMsgRspnParamDeleted rspnParamDeleted = null;

	// PopDep Response s
	private CFBamXMsgRspnPopDepRec rspnPopDepRec = null;
	private CFBamXMsgRspnPopDepCreated rspnPopDepCreated = null;
	private CFBamXMsgRspnPopDepReadSingle rspnPopDepReadSingle = null;
	private CFBamXMsgRspnPopDepReadList rspnPopDepReadList = null;
	private CFBamXMsgRspnPopDepLocked rspnPopDepLocked = null;
	private CFBamXMsgRspnPopDepUpdated rspnPopDepUpdated = null;
	private CFBamXMsgRspnPopDepDeleted rspnPopDepDeleted = null;

	// PopSubDep1 Response s
	private CFBamXMsgRspnPopSubDep1Rec rspnPopSubDep1Rec = null;
	private CFBamXMsgRspnPopSubDep1Created rspnPopSubDep1Created = null;
	private CFBamXMsgRspnPopSubDep1ReadSingle rspnPopSubDep1ReadSingle = null;
	private CFBamXMsgRspnPopSubDep1ReadList rspnPopSubDep1ReadList = null;
	private CFBamXMsgRspnPopSubDep1Locked rspnPopSubDep1Locked = null;
	private CFBamXMsgRspnPopSubDep1Updated rspnPopSubDep1Updated = null;
	private CFBamXMsgRspnPopSubDep1Deleted rspnPopSubDep1Deleted = null;

	// PopSubDep2 Response s
	private CFBamXMsgRspnPopSubDep2Rec rspnPopSubDep2Rec = null;
	private CFBamXMsgRspnPopSubDep2Created rspnPopSubDep2Created = null;
	private CFBamXMsgRspnPopSubDep2ReadSingle rspnPopSubDep2ReadSingle = null;
	private CFBamXMsgRspnPopSubDep2ReadList rspnPopSubDep2ReadList = null;
	private CFBamXMsgRspnPopSubDep2Locked rspnPopSubDep2Locked = null;
	private CFBamXMsgRspnPopSubDep2Updated rspnPopSubDep2Updated = null;
	private CFBamXMsgRspnPopSubDep2Deleted rspnPopSubDep2Deleted = null;

	// PopSubDep3 Response s
	private CFBamXMsgRspnPopSubDep3Rec rspnPopSubDep3Rec = null;
	private CFBamXMsgRspnPopSubDep3Created rspnPopSubDep3Created = null;
	private CFBamXMsgRspnPopSubDep3ReadSingle rspnPopSubDep3ReadSingle = null;
	private CFBamXMsgRspnPopSubDep3ReadList rspnPopSubDep3ReadList = null;
	private CFBamXMsgRspnPopSubDep3Locked rspnPopSubDep3Locked = null;
	private CFBamXMsgRspnPopSubDep3Updated rspnPopSubDep3Updated = null;
	private CFBamXMsgRspnPopSubDep3Deleted rspnPopSubDep3Deleted = null;

	// PopTopDep Response s
	private CFBamXMsgRspnPopTopDepRec rspnPopTopDepRec = null;
	private CFBamXMsgRspnPopTopDepCreated rspnPopTopDepCreated = null;
	private CFBamXMsgRspnPopTopDepReadSingle rspnPopTopDepReadSingle = null;
	private CFBamXMsgRspnPopTopDepReadList rspnPopTopDepReadList = null;
	private CFBamXMsgRspnPopTopDepLocked rspnPopTopDepLocked = null;
	private CFBamXMsgRspnPopTopDepUpdated rspnPopTopDepUpdated = null;
	private CFBamXMsgRspnPopTopDepDeleted rspnPopTopDepDeleted = null;

	// Relation Response s
	private CFBamXMsgRspnRelationRec rspnRelationRec = null;
	private CFBamXMsgRspnRelationCreated rspnRelationCreated = null;
	private CFBamXMsgRspnRelationReadSingle rspnRelationReadSingle = null;
	private CFBamXMsgRspnRelationReadList rspnRelationReadList = null;
	private CFBamXMsgRspnRelationLocked rspnRelationLocked = null;
	private CFBamXMsgRspnRelationUpdated rspnRelationUpdated = null;
	private CFBamXMsgRspnRelationDeleted rspnRelationDeleted = null;

	// RelationCol Response s
	private CFBamXMsgRspnRelationColRec rspnRelationColRec = null;
	private CFBamXMsgRspnRelationColCreated rspnRelationColCreated = null;
	private CFBamXMsgRspnRelationColReadSingle rspnRelationColReadSingle = null;
	private CFBamXMsgRspnRelationColReadList rspnRelationColReadList = null;
	private CFBamXMsgRspnRelationColLocked rspnRelationColLocked = null;
	private CFBamXMsgRspnRelationColUpdated rspnRelationColUpdated = null;
	private CFBamXMsgRspnRelationColDeleted rspnRelationColDeleted = null;

	// SchemaDef Response s
	private CFBamXMsgRspnSchemaDefRec rspnSchemaDefRec = null;
	private CFBamXMsgRspnSchemaDefCreated rspnSchemaDefCreated = null;
	private CFBamXMsgRspnSchemaDefReadSingle rspnSchemaDefReadSingle = null;
	private CFBamXMsgRspnSchemaDefReadList rspnSchemaDefReadList = null;
	private CFBamXMsgRspnSchemaDefLocked rspnSchemaDefLocked = null;
	private CFBamXMsgRspnSchemaDefUpdated rspnSchemaDefUpdated = null;
	private CFBamXMsgRspnSchemaDefDeleted rspnSchemaDefDeleted = null;

	// SchemaRef Response s
	private CFBamXMsgRspnSchemaRefRec rspnSchemaRefRec = null;
	private CFBamXMsgRspnSchemaRefCreated rspnSchemaRefCreated = null;
	private CFBamXMsgRspnSchemaRefReadSingle rspnSchemaRefReadSingle = null;
	private CFBamXMsgRspnSchemaRefReadList rspnSchemaRefReadList = null;
	private CFBamXMsgRspnSchemaRefLocked rspnSchemaRefLocked = null;
	private CFBamXMsgRspnSchemaRefUpdated rspnSchemaRefUpdated = null;
	private CFBamXMsgRspnSchemaRefDeleted rspnSchemaRefDeleted = null;

	// Scope Response s
	private CFBamXMsgRspnScopeRec rspnScopeRec = null;
	private CFBamXMsgRspnScopeCreated rspnScopeCreated = null;
	private CFBamXMsgRspnScopeReadSingle rspnScopeReadSingle = null;
	private CFBamXMsgRspnScopeReadList rspnScopeReadList = null;
	private CFBamXMsgRspnScopeLocked rspnScopeLocked = null;
	private CFBamXMsgRspnScopeUpdated rspnScopeUpdated = null;
	private CFBamXMsgRspnScopeDeleted rspnScopeDeleted = null;

	// SecApp Response s
	private CFBamXMsgRspnSecAppRec rspnSecAppRec = null;
	private CFBamXMsgRspnSecAppCreated rspnSecAppCreated = null;
	private CFBamXMsgRspnSecAppReadSingle rspnSecAppReadSingle = null;
	private CFBamXMsgRspnSecAppReadList rspnSecAppReadList = null;
	private CFBamXMsgRspnSecAppLocked rspnSecAppLocked = null;
	private CFBamXMsgRspnSecAppUpdated rspnSecAppUpdated = null;
	private CFBamXMsgRspnSecAppDeleted rspnSecAppDeleted = null;

	// SecDevice Response s
	private CFBamXMsgRspnSecDeviceRec rspnSecDeviceRec = null;
	private CFBamXMsgRspnSecDeviceCreated rspnSecDeviceCreated = null;
	private CFBamXMsgRspnSecDeviceReadSingle rspnSecDeviceReadSingle = null;
	private CFBamXMsgRspnSecDeviceReadList rspnSecDeviceReadList = null;
	private CFBamXMsgRspnSecDeviceLocked rspnSecDeviceLocked = null;
	private CFBamXMsgRspnSecDeviceUpdated rspnSecDeviceUpdated = null;
	private CFBamXMsgRspnSecDeviceDeleted rspnSecDeviceDeleted = null;

	// SecForm Response s
	private CFBamXMsgRspnSecFormRec rspnSecFormRec = null;
	private CFBamXMsgRspnSecFormCreated rspnSecFormCreated = null;
	private CFBamXMsgRspnSecFormReadSingle rspnSecFormReadSingle = null;
	private CFBamXMsgRspnSecFormReadList rspnSecFormReadList = null;
	private CFBamXMsgRspnSecFormLocked rspnSecFormLocked = null;
	private CFBamXMsgRspnSecFormUpdated rspnSecFormUpdated = null;
	private CFBamXMsgRspnSecFormDeleted rspnSecFormDeleted = null;

	// SecGroup Response s
	private CFBamXMsgRspnSecGroupRec rspnSecGroupRec = null;
	private CFBamXMsgRspnSecGroupCreated rspnSecGroupCreated = null;
	private CFBamXMsgRspnSecGroupReadSingle rspnSecGroupReadSingle = null;
	private CFBamXMsgRspnSecGroupReadList rspnSecGroupReadList = null;
	private CFBamXMsgRspnSecGroupLocked rspnSecGroupLocked = null;
	private CFBamXMsgRspnSecGroupUpdated rspnSecGroupUpdated = null;
	private CFBamXMsgRspnSecGroupDeleted rspnSecGroupDeleted = null;

	// SecGroupForm Response s
	private CFBamXMsgRspnSecGroupFormRec rspnSecGroupFormRec = null;
	private CFBamXMsgRspnSecGroupFormCreated rspnSecGroupFormCreated = null;
	private CFBamXMsgRspnSecGroupFormReadSingle rspnSecGroupFormReadSingle = null;
	private CFBamXMsgRspnSecGroupFormReadList rspnSecGroupFormReadList = null;
	private CFBamXMsgRspnSecGroupFormLocked rspnSecGroupFormLocked = null;
	private CFBamXMsgRspnSecGroupFormUpdated rspnSecGroupFormUpdated = null;
	private CFBamXMsgRspnSecGroupFormDeleted rspnSecGroupFormDeleted = null;

	// SecGrpInc Response s
	private CFBamXMsgRspnSecGrpIncRec rspnSecGrpIncRec = null;
	private CFBamXMsgRspnSecGrpIncCreated rspnSecGrpIncCreated = null;
	private CFBamXMsgRspnSecGrpIncReadSingle rspnSecGrpIncReadSingle = null;
	private CFBamXMsgRspnSecGrpIncReadList rspnSecGrpIncReadList = null;
	private CFBamXMsgRspnSecGrpIncLocked rspnSecGrpIncLocked = null;
	private CFBamXMsgRspnSecGrpIncUpdated rspnSecGrpIncUpdated = null;
	private CFBamXMsgRspnSecGrpIncDeleted rspnSecGrpIncDeleted = null;

	// SecGrpMemb Response s
	private CFBamXMsgRspnSecGrpMembRec rspnSecGrpMembRec = null;
	private CFBamXMsgRspnSecGrpMembCreated rspnSecGrpMembCreated = null;
	private CFBamXMsgRspnSecGrpMembReadSingle rspnSecGrpMembReadSingle = null;
	private CFBamXMsgRspnSecGrpMembReadList rspnSecGrpMembReadList = null;
	private CFBamXMsgRspnSecGrpMembLocked rspnSecGrpMembLocked = null;
	private CFBamXMsgRspnSecGrpMembUpdated rspnSecGrpMembUpdated = null;
	private CFBamXMsgRspnSecGrpMembDeleted rspnSecGrpMembDeleted = null;

	// SecSession Response s
	private CFBamXMsgRspnSecSessionRec rspnSecSessionRec = null;
	private CFBamXMsgRspnSecSessionCreated rspnSecSessionCreated = null;
	private CFBamXMsgRspnSecSessionReadSingle rspnSecSessionReadSingle = null;
	private CFBamXMsgRspnSecSessionReadList rspnSecSessionReadList = null;
	private CFBamXMsgRspnSecSessionLocked rspnSecSessionLocked = null;
	private CFBamXMsgRspnSecSessionUpdated rspnSecSessionUpdated = null;
	private CFBamXMsgRspnSecSessionDeleted rspnSecSessionDeleted = null;

	// SecUser Response s
	private CFBamXMsgRspnSecUserRec rspnSecUserRec = null;
	private CFBamXMsgRspnSecUserCreated rspnSecUserCreated = null;
	private CFBamXMsgRspnSecUserReadSingle rspnSecUserReadSingle = null;
	private CFBamXMsgRspnSecUserReadList rspnSecUserReadList = null;
	private CFBamXMsgRspnSecUserLocked rspnSecUserLocked = null;
	private CFBamXMsgRspnSecUserUpdated rspnSecUserUpdated = null;
	private CFBamXMsgRspnSecUserDeleted rspnSecUserDeleted = null;

	// ServerListFunc Response s
	private CFBamXMsgRspnServerListFuncRec rspnServerListFuncRec = null;
	private CFBamXMsgRspnServerListFuncCreated rspnServerListFuncCreated = null;
	private CFBamXMsgRspnServerListFuncReadSingle rspnServerListFuncReadSingle = null;
	private CFBamXMsgRspnServerListFuncReadList rspnServerListFuncReadList = null;
	private CFBamXMsgRspnServerListFuncLocked rspnServerListFuncLocked = null;
	private CFBamXMsgRspnServerListFuncUpdated rspnServerListFuncUpdated = null;
	private CFBamXMsgRspnServerListFuncDeleted rspnServerListFuncDeleted = null;

	// ServerMethod Response s
	private CFBamXMsgRspnServerMethodRec rspnServerMethodRec = null;
	private CFBamXMsgRspnServerMethodCreated rspnServerMethodCreated = null;
	private CFBamXMsgRspnServerMethodReadSingle rspnServerMethodReadSingle = null;
	private CFBamXMsgRspnServerMethodReadList rspnServerMethodReadList = null;
	private CFBamXMsgRspnServerMethodLocked rspnServerMethodLocked = null;
	private CFBamXMsgRspnServerMethodUpdated rspnServerMethodUpdated = null;
	private CFBamXMsgRspnServerMethodDeleted rspnServerMethodDeleted = null;

	// ServerObjFunc Response s
	private CFBamXMsgRspnServerObjFuncRec rspnServerObjFuncRec = null;
	private CFBamXMsgRspnServerObjFuncCreated rspnServerObjFuncCreated = null;
	private CFBamXMsgRspnServerObjFuncReadSingle rspnServerObjFuncReadSingle = null;
	private CFBamXMsgRspnServerObjFuncReadList rspnServerObjFuncReadList = null;
	private CFBamXMsgRspnServerObjFuncLocked rspnServerObjFuncLocked = null;
	private CFBamXMsgRspnServerObjFuncUpdated rspnServerObjFuncUpdated = null;
	private CFBamXMsgRspnServerObjFuncDeleted rspnServerObjFuncDeleted = null;

	// ServerProc Response s
	private CFBamXMsgRspnServerProcRec rspnServerProcRec = null;
	private CFBamXMsgRspnServerProcCreated rspnServerProcCreated = null;
	private CFBamXMsgRspnServerProcReadSingle rspnServerProcReadSingle = null;
	private CFBamXMsgRspnServerProcReadList rspnServerProcReadList = null;
	private CFBamXMsgRspnServerProcLocked rspnServerProcLocked = null;
	private CFBamXMsgRspnServerProcUpdated rspnServerProcUpdated = null;
	private CFBamXMsgRspnServerProcDeleted rspnServerProcDeleted = null;

	// Service Response s
	private CFBamXMsgRspnServiceRec rspnServiceRec = null;
	private CFBamXMsgRspnServiceCreated rspnServiceCreated = null;
	private CFBamXMsgRspnServiceReadSingle rspnServiceReadSingle = null;
	private CFBamXMsgRspnServiceReadList rspnServiceReadList = null;
	private CFBamXMsgRspnServiceLocked rspnServiceLocked = null;
	private CFBamXMsgRspnServiceUpdated rspnServiceUpdated = null;
	private CFBamXMsgRspnServiceDeleted rspnServiceDeleted = null;

	// ServiceType Response s
	private CFBamXMsgRspnServiceTypeRec rspnServiceTypeRec = null;
	private CFBamXMsgRspnServiceTypeCreated rspnServiceTypeCreated = null;
	private CFBamXMsgRspnServiceTypeReadSingle rspnServiceTypeReadSingle = null;
	private CFBamXMsgRspnServiceTypeReadList rspnServiceTypeReadList = null;
	private CFBamXMsgRspnServiceTypeLocked rspnServiceTypeLocked = null;
	private CFBamXMsgRspnServiceTypeUpdated rspnServiceTypeUpdated = null;
	private CFBamXMsgRspnServiceTypeDeleted rspnServiceTypeDeleted = null;

	// StringCol Response s
	private CFBamXMsgRspnStringColRec rspnStringColRec = null;
	private CFBamXMsgRspnStringColCreated rspnStringColCreated = null;
	private CFBamXMsgRspnStringColReadSingle rspnStringColReadSingle = null;
	private CFBamXMsgRspnStringColReadList rspnStringColReadList = null;
	private CFBamXMsgRspnStringColLocked rspnStringColLocked = null;
	private CFBamXMsgRspnStringColUpdated rspnStringColUpdated = null;
	private CFBamXMsgRspnStringColDeleted rspnStringColDeleted = null;

	// StringDef Response s
	private CFBamXMsgRspnStringDefRec rspnStringDefRec = null;
	private CFBamXMsgRspnStringDefCreated rspnStringDefCreated = null;
	private CFBamXMsgRspnStringDefReadSingle rspnStringDefReadSingle = null;
	private CFBamXMsgRspnStringDefReadList rspnStringDefReadList = null;
	private CFBamXMsgRspnStringDefLocked rspnStringDefLocked = null;
	private CFBamXMsgRspnStringDefUpdated rspnStringDefUpdated = null;
	private CFBamXMsgRspnStringDefDeleted rspnStringDefDeleted = null;

	// StringType Response s
	private CFBamXMsgRspnStringTypeRec rspnStringTypeRec = null;
	private CFBamXMsgRspnStringTypeCreated rspnStringTypeCreated = null;
	private CFBamXMsgRspnStringTypeReadSingle rspnStringTypeReadSingle = null;
	private CFBamXMsgRspnStringTypeReadList rspnStringTypeReadList = null;
	private CFBamXMsgRspnStringTypeLocked rspnStringTypeLocked = null;
	private CFBamXMsgRspnStringTypeUpdated rspnStringTypeUpdated = null;
	private CFBamXMsgRspnStringTypeDeleted rspnStringTypeDeleted = null;

	// SubProject Response s
	private CFBamXMsgRspnSubProjectRec rspnSubProjectRec = null;
	private CFBamXMsgRspnSubProjectCreated rspnSubProjectCreated = null;
	private CFBamXMsgRspnSubProjectReadSingle rspnSubProjectReadSingle = null;
	private CFBamXMsgRspnSubProjectReadList rspnSubProjectReadList = null;
	private CFBamXMsgRspnSubProjectLocked rspnSubProjectLocked = null;
	private CFBamXMsgRspnSubProjectUpdated rspnSubProjectUpdated = null;
	private CFBamXMsgRspnSubProjectDeleted rspnSubProjectDeleted = null;

	// SysCluster Response s
	private CFBamXMsgRspnSysClusterRec rspnSysClusterRec = null;
	private CFBamXMsgRspnSysClusterCreated rspnSysClusterCreated = null;
	private CFBamXMsgRspnSysClusterReadSingle rspnSysClusterReadSingle = null;
	private CFBamXMsgRspnSysClusterReadList rspnSysClusterReadList = null;
	private CFBamXMsgRspnSysClusterLocked rspnSysClusterLocked = null;
	private CFBamXMsgRspnSysClusterUpdated rspnSysClusterUpdated = null;
	private CFBamXMsgRspnSysClusterDeleted rspnSysClusterDeleted = null;

	// TSecGroup Response s
	private CFBamXMsgRspnTSecGroupRec rspnTSecGroupRec = null;
	private CFBamXMsgRspnTSecGroupCreated rspnTSecGroupCreated = null;
	private CFBamXMsgRspnTSecGroupReadSingle rspnTSecGroupReadSingle = null;
	private CFBamXMsgRspnTSecGroupReadList rspnTSecGroupReadList = null;
	private CFBamXMsgRspnTSecGroupLocked rspnTSecGroupLocked = null;
	private CFBamXMsgRspnTSecGroupUpdated rspnTSecGroupUpdated = null;
	private CFBamXMsgRspnTSecGroupDeleted rspnTSecGroupDeleted = null;

	// TSecGrpInc Response s
	private CFBamXMsgRspnTSecGrpIncRec rspnTSecGrpIncRec = null;
	private CFBamXMsgRspnTSecGrpIncCreated rspnTSecGrpIncCreated = null;
	private CFBamXMsgRspnTSecGrpIncReadSingle rspnTSecGrpIncReadSingle = null;
	private CFBamXMsgRspnTSecGrpIncReadList rspnTSecGrpIncReadList = null;
	private CFBamXMsgRspnTSecGrpIncLocked rspnTSecGrpIncLocked = null;
	private CFBamXMsgRspnTSecGrpIncUpdated rspnTSecGrpIncUpdated = null;
	private CFBamXMsgRspnTSecGrpIncDeleted rspnTSecGrpIncDeleted = null;

	// TSecGrpMemb Response s
	private CFBamXMsgRspnTSecGrpMembRec rspnTSecGrpMembRec = null;
	private CFBamXMsgRspnTSecGrpMembCreated rspnTSecGrpMembCreated = null;
	private CFBamXMsgRspnTSecGrpMembReadSingle rspnTSecGrpMembReadSingle = null;
	private CFBamXMsgRspnTSecGrpMembReadList rspnTSecGrpMembReadList = null;
	private CFBamXMsgRspnTSecGrpMembLocked rspnTSecGrpMembLocked = null;
	private CFBamXMsgRspnTSecGrpMembUpdated rspnTSecGrpMembUpdated = null;
	private CFBamXMsgRspnTSecGrpMembDeleted rspnTSecGrpMembDeleted = null;

	// TZDateCol Response s
	private CFBamXMsgRspnTZDateColRec rspnTZDateColRec = null;
	private CFBamXMsgRspnTZDateColCreated rspnTZDateColCreated = null;
	private CFBamXMsgRspnTZDateColReadSingle rspnTZDateColReadSingle = null;
	private CFBamXMsgRspnTZDateColReadList rspnTZDateColReadList = null;
	private CFBamXMsgRspnTZDateColLocked rspnTZDateColLocked = null;
	private CFBamXMsgRspnTZDateColUpdated rspnTZDateColUpdated = null;
	private CFBamXMsgRspnTZDateColDeleted rspnTZDateColDeleted = null;

	// TZDateDef Response s
	private CFBamXMsgRspnTZDateDefRec rspnTZDateDefRec = null;
	private CFBamXMsgRspnTZDateDefCreated rspnTZDateDefCreated = null;
	private CFBamXMsgRspnTZDateDefReadSingle rspnTZDateDefReadSingle = null;
	private CFBamXMsgRspnTZDateDefReadList rspnTZDateDefReadList = null;
	private CFBamXMsgRspnTZDateDefLocked rspnTZDateDefLocked = null;
	private CFBamXMsgRspnTZDateDefUpdated rspnTZDateDefUpdated = null;
	private CFBamXMsgRspnTZDateDefDeleted rspnTZDateDefDeleted = null;

	// TZDateType Response s
	private CFBamXMsgRspnTZDateTypeRec rspnTZDateTypeRec = null;
	private CFBamXMsgRspnTZDateTypeCreated rspnTZDateTypeCreated = null;
	private CFBamXMsgRspnTZDateTypeReadSingle rspnTZDateTypeReadSingle = null;
	private CFBamXMsgRspnTZDateTypeReadList rspnTZDateTypeReadList = null;
	private CFBamXMsgRspnTZDateTypeLocked rspnTZDateTypeLocked = null;
	private CFBamXMsgRspnTZDateTypeUpdated rspnTZDateTypeUpdated = null;
	private CFBamXMsgRspnTZDateTypeDeleted rspnTZDateTypeDeleted = null;

	// TZTimeCol Response s
	private CFBamXMsgRspnTZTimeColRec rspnTZTimeColRec = null;
	private CFBamXMsgRspnTZTimeColCreated rspnTZTimeColCreated = null;
	private CFBamXMsgRspnTZTimeColReadSingle rspnTZTimeColReadSingle = null;
	private CFBamXMsgRspnTZTimeColReadList rspnTZTimeColReadList = null;
	private CFBamXMsgRspnTZTimeColLocked rspnTZTimeColLocked = null;
	private CFBamXMsgRspnTZTimeColUpdated rspnTZTimeColUpdated = null;
	private CFBamXMsgRspnTZTimeColDeleted rspnTZTimeColDeleted = null;

	// TZTimeDef Response s
	private CFBamXMsgRspnTZTimeDefRec rspnTZTimeDefRec = null;
	private CFBamXMsgRspnTZTimeDefCreated rspnTZTimeDefCreated = null;
	private CFBamXMsgRspnTZTimeDefReadSingle rspnTZTimeDefReadSingle = null;
	private CFBamXMsgRspnTZTimeDefReadList rspnTZTimeDefReadList = null;
	private CFBamXMsgRspnTZTimeDefLocked rspnTZTimeDefLocked = null;
	private CFBamXMsgRspnTZTimeDefUpdated rspnTZTimeDefUpdated = null;
	private CFBamXMsgRspnTZTimeDefDeleted rspnTZTimeDefDeleted = null;

	// TZTimeType Response s
	private CFBamXMsgRspnTZTimeTypeRec rspnTZTimeTypeRec = null;
	private CFBamXMsgRspnTZTimeTypeCreated rspnTZTimeTypeCreated = null;
	private CFBamXMsgRspnTZTimeTypeReadSingle rspnTZTimeTypeReadSingle = null;
	private CFBamXMsgRspnTZTimeTypeReadList rspnTZTimeTypeReadList = null;
	private CFBamXMsgRspnTZTimeTypeLocked rspnTZTimeTypeLocked = null;
	private CFBamXMsgRspnTZTimeTypeUpdated rspnTZTimeTypeUpdated = null;
	private CFBamXMsgRspnTZTimeTypeDeleted rspnTZTimeTypeDeleted = null;

	// TZTimestampCol Response s
	private CFBamXMsgRspnTZTimestampColRec rspnTZTimestampColRec = null;
	private CFBamXMsgRspnTZTimestampColCreated rspnTZTimestampColCreated = null;
	private CFBamXMsgRspnTZTimestampColReadSingle rspnTZTimestampColReadSingle = null;
	private CFBamXMsgRspnTZTimestampColReadList rspnTZTimestampColReadList = null;
	private CFBamXMsgRspnTZTimestampColLocked rspnTZTimestampColLocked = null;
	private CFBamXMsgRspnTZTimestampColUpdated rspnTZTimestampColUpdated = null;
	private CFBamXMsgRspnTZTimestampColDeleted rspnTZTimestampColDeleted = null;

	// TZTimestampDef Response s
	private CFBamXMsgRspnTZTimestampDefRec rspnTZTimestampDefRec = null;
	private CFBamXMsgRspnTZTimestampDefCreated rspnTZTimestampDefCreated = null;
	private CFBamXMsgRspnTZTimestampDefReadSingle rspnTZTimestampDefReadSingle = null;
	private CFBamXMsgRspnTZTimestampDefReadList rspnTZTimestampDefReadList = null;
	private CFBamXMsgRspnTZTimestampDefLocked rspnTZTimestampDefLocked = null;
	private CFBamXMsgRspnTZTimestampDefUpdated rspnTZTimestampDefUpdated = null;
	private CFBamXMsgRspnTZTimestampDefDeleted rspnTZTimestampDefDeleted = null;

	// TZTimestampType Response s
	private CFBamXMsgRspnTZTimestampTypeRec rspnTZTimestampTypeRec = null;
	private CFBamXMsgRspnTZTimestampTypeCreated rspnTZTimestampTypeCreated = null;
	private CFBamXMsgRspnTZTimestampTypeReadSingle rspnTZTimestampTypeReadSingle = null;
	private CFBamXMsgRspnTZTimestampTypeReadList rspnTZTimestampTypeReadList = null;
	private CFBamXMsgRspnTZTimestampTypeLocked rspnTZTimestampTypeLocked = null;
	private CFBamXMsgRspnTZTimestampTypeUpdated rspnTZTimestampTypeUpdated = null;
	private CFBamXMsgRspnTZTimestampTypeDeleted rspnTZTimestampTypeDeleted = null;

	// Table Response s
	private CFBamXMsgRspnTableRec rspnTableRec = null;
	private CFBamXMsgRspnTableCreated rspnTableCreated = null;
	private CFBamXMsgRspnTableReadSingle rspnTableReadSingle = null;
	private CFBamXMsgRspnTableReadList rspnTableReadList = null;
	private CFBamXMsgRspnTableLocked rspnTableLocked = null;
	private CFBamXMsgRspnTableUpdated rspnTableUpdated = null;
	private CFBamXMsgRspnTableDeleted rspnTableDeleted = null;

	// TableCol Response s
	private CFBamXMsgRspnTableColRec rspnTableColRec = null;
	private CFBamXMsgRspnTableColCreated rspnTableColCreated = null;
	private CFBamXMsgRspnTableColReadSingle rspnTableColReadSingle = null;
	private CFBamXMsgRspnTableColReadList rspnTableColReadList = null;
	private CFBamXMsgRspnTableColLocked rspnTableColLocked = null;
	private CFBamXMsgRspnTableColUpdated rspnTableColUpdated = null;
	private CFBamXMsgRspnTableColDeleted rspnTableColDeleted = null;

	// Tenant Response s
	private CFBamXMsgRspnTenantRec rspnTenantRec = null;
	private CFBamXMsgRspnTenantCreated rspnTenantCreated = null;
	private CFBamXMsgRspnTenantReadSingle rspnTenantReadSingle = null;
	private CFBamXMsgRspnTenantReadList rspnTenantReadList = null;
	private CFBamXMsgRspnTenantLocked rspnTenantLocked = null;
	private CFBamXMsgRspnTenantUpdated rspnTenantUpdated = null;
	private CFBamXMsgRspnTenantDeleted rspnTenantDeleted = null;

	// TextCol Response s
	private CFBamXMsgRspnTextColRec rspnTextColRec = null;
	private CFBamXMsgRspnTextColCreated rspnTextColCreated = null;
	private CFBamXMsgRspnTextColReadSingle rspnTextColReadSingle = null;
	private CFBamXMsgRspnTextColReadList rspnTextColReadList = null;
	private CFBamXMsgRspnTextColLocked rspnTextColLocked = null;
	private CFBamXMsgRspnTextColUpdated rspnTextColUpdated = null;
	private CFBamXMsgRspnTextColDeleted rspnTextColDeleted = null;

	// TextDef Response s
	private CFBamXMsgRspnTextDefRec rspnTextDefRec = null;
	private CFBamXMsgRspnTextDefCreated rspnTextDefCreated = null;
	private CFBamXMsgRspnTextDefReadSingle rspnTextDefReadSingle = null;
	private CFBamXMsgRspnTextDefReadList rspnTextDefReadList = null;
	private CFBamXMsgRspnTextDefLocked rspnTextDefLocked = null;
	private CFBamXMsgRspnTextDefUpdated rspnTextDefUpdated = null;
	private CFBamXMsgRspnTextDefDeleted rspnTextDefDeleted = null;

	// TextType Response s
	private CFBamXMsgRspnTextTypeRec rspnTextTypeRec = null;
	private CFBamXMsgRspnTextTypeCreated rspnTextTypeCreated = null;
	private CFBamXMsgRspnTextTypeReadSingle rspnTextTypeReadSingle = null;
	private CFBamXMsgRspnTextTypeReadList rspnTextTypeReadList = null;
	private CFBamXMsgRspnTextTypeLocked rspnTextTypeLocked = null;
	private CFBamXMsgRspnTextTypeUpdated rspnTextTypeUpdated = null;
	private CFBamXMsgRspnTextTypeDeleted rspnTextTypeDeleted = null;

	// TimeCol Response s
	private CFBamXMsgRspnTimeColRec rspnTimeColRec = null;
	private CFBamXMsgRspnTimeColCreated rspnTimeColCreated = null;
	private CFBamXMsgRspnTimeColReadSingle rspnTimeColReadSingle = null;
	private CFBamXMsgRspnTimeColReadList rspnTimeColReadList = null;
	private CFBamXMsgRspnTimeColLocked rspnTimeColLocked = null;
	private CFBamXMsgRspnTimeColUpdated rspnTimeColUpdated = null;
	private CFBamXMsgRspnTimeColDeleted rspnTimeColDeleted = null;

	// TimeDef Response s
	private CFBamXMsgRspnTimeDefRec rspnTimeDefRec = null;
	private CFBamXMsgRspnTimeDefCreated rspnTimeDefCreated = null;
	private CFBamXMsgRspnTimeDefReadSingle rspnTimeDefReadSingle = null;
	private CFBamXMsgRspnTimeDefReadList rspnTimeDefReadList = null;
	private CFBamXMsgRspnTimeDefLocked rspnTimeDefLocked = null;
	private CFBamXMsgRspnTimeDefUpdated rspnTimeDefUpdated = null;
	private CFBamXMsgRspnTimeDefDeleted rspnTimeDefDeleted = null;

	// TimeType Response s
	private CFBamXMsgRspnTimeTypeRec rspnTimeTypeRec = null;
	private CFBamXMsgRspnTimeTypeCreated rspnTimeTypeCreated = null;
	private CFBamXMsgRspnTimeTypeReadSingle rspnTimeTypeReadSingle = null;
	private CFBamXMsgRspnTimeTypeReadList rspnTimeTypeReadList = null;
	private CFBamXMsgRspnTimeTypeLocked rspnTimeTypeLocked = null;
	private CFBamXMsgRspnTimeTypeUpdated rspnTimeTypeUpdated = null;
	private CFBamXMsgRspnTimeTypeDeleted rspnTimeTypeDeleted = null;

	// TimestampCol Response s
	private CFBamXMsgRspnTimestampColRec rspnTimestampColRec = null;
	private CFBamXMsgRspnTimestampColCreated rspnTimestampColCreated = null;
	private CFBamXMsgRspnTimestampColReadSingle rspnTimestampColReadSingle = null;
	private CFBamXMsgRspnTimestampColReadList rspnTimestampColReadList = null;
	private CFBamXMsgRspnTimestampColLocked rspnTimestampColLocked = null;
	private CFBamXMsgRspnTimestampColUpdated rspnTimestampColUpdated = null;
	private CFBamXMsgRspnTimestampColDeleted rspnTimestampColDeleted = null;

	// TimestampDef Response s
	private CFBamXMsgRspnTimestampDefRec rspnTimestampDefRec = null;
	private CFBamXMsgRspnTimestampDefCreated rspnTimestampDefCreated = null;
	private CFBamXMsgRspnTimestampDefReadSingle rspnTimestampDefReadSingle = null;
	private CFBamXMsgRspnTimestampDefReadList rspnTimestampDefReadList = null;
	private CFBamXMsgRspnTimestampDefLocked rspnTimestampDefLocked = null;
	private CFBamXMsgRspnTimestampDefUpdated rspnTimestampDefUpdated = null;
	private CFBamXMsgRspnTimestampDefDeleted rspnTimestampDefDeleted = null;

	// TimestampType Response s
	private CFBamXMsgRspnTimestampTypeRec rspnTimestampTypeRec = null;
	private CFBamXMsgRspnTimestampTypeCreated rspnTimestampTypeCreated = null;
	private CFBamXMsgRspnTimestampTypeReadSingle rspnTimestampTypeReadSingle = null;
	private CFBamXMsgRspnTimestampTypeReadList rspnTimestampTypeReadList = null;
	private CFBamXMsgRspnTimestampTypeLocked rspnTimestampTypeLocked = null;
	private CFBamXMsgRspnTimestampTypeUpdated rspnTimestampTypeUpdated = null;
	private CFBamXMsgRspnTimestampTypeDeleted rspnTimestampTypeDeleted = null;

	// Tld Response s
	private CFBamXMsgRspnTldRec rspnTldRec = null;
	private CFBamXMsgRspnTldCreated rspnTldCreated = null;
	private CFBamXMsgRspnTldReadSingle rspnTldReadSingle = null;
	private CFBamXMsgRspnTldReadList rspnTldReadList = null;
	private CFBamXMsgRspnTldLocked rspnTldLocked = null;
	private CFBamXMsgRspnTldUpdated rspnTldUpdated = null;
	private CFBamXMsgRspnTldDeleted rspnTldDeleted = null;

	// TokenCol Response s
	private CFBamXMsgRspnTokenColRec rspnTokenColRec = null;
	private CFBamXMsgRspnTokenColCreated rspnTokenColCreated = null;
	private CFBamXMsgRspnTokenColReadSingle rspnTokenColReadSingle = null;
	private CFBamXMsgRspnTokenColReadList rspnTokenColReadList = null;
	private CFBamXMsgRspnTokenColLocked rspnTokenColLocked = null;
	private CFBamXMsgRspnTokenColUpdated rspnTokenColUpdated = null;
	private CFBamXMsgRspnTokenColDeleted rspnTokenColDeleted = null;

	// TokenDef Response s
	private CFBamXMsgRspnTokenDefRec rspnTokenDefRec = null;
	private CFBamXMsgRspnTokenDefCreated rspnTokenDefCreated = null;
	private CFBamXMsgRspnTokenDefReadSingle rspnTokenDefReadSingle = null;
	private CFBamXMsgRspnTokenDefReadList rspnTokenDefReadList = null;
	private CFBamXMsgRspnTokenDefLocked rspnTokenDefLocked = null;
	private CFBamXMsgRspnTokenDefUpdated rspnTokenDefUpdated = null;
	private CFBamXMsgRspnTokenDefDeleted rspnTokenDefDeleted = null;

	// TokenType Response s
	private CFBamXMsgRspnTokenTypeRec rspnTokenTypeRec = null;
	private CFBamXMsgRspnTokenTypeCreated rspnTokenTypeCreated = null;
	private CFBamXMsgRspnTokenTypeReadSingle rspnTokenTypeReadSingle = null;
	private CFBamXMsgRspnTokenTypeReadList rspnTokenTypeReadList = null;
	private CFBamXMsgRspnTokenTypeLocked rspnTokenTypeLocked = null;
	private CFBamXMsgRspnTokenTypeUpdated rspnTokenTypeUpdated = null;
	private CFBamXMsgRspnTokenTypeDeleted rspnTokenTypeDeleted = null;

	// TopDomain Response s
	private CFBamXMsgRspnTopDomainRec rspnTopDomainRec = null;
	private CFBamXMsgRspnTopDomainCreated rspnTopDomainCreated = null;
	private CFBamXMsgRspnTopDomainReadSingle rspnTopDomainReadSingle = null;
	private CFBamXMsgRspnTopDomainReadList rspnTopDomainReadList = null;
	private CFBamXMsgRspnTopDomainLocked rspnTopDomainLocked = null;
	private CFBamXMsgRspnTopDomainUpdated rspnTopDomainUpdated = null;
	private CFBamXMsgRspnTopDomainDeleted rspnTopDomainDeleted = null;

	// TopProject Response s
	private CFBamXMsgRspnTopProjectRec rspnTopProjectRec = null;
	private CFBamXMsgRspnTopProjectCreated rspnTopProjectCreated = null;
	private CFBamXMsgRspnTopProjectReadSingle rspnTopProjectReadSingle = null;
	private CFBamXMsgRspnTopProjectReadList rspnTopProjectReadList = null;
	private CFBamXMsgRspnTopProjectLocked rspnTopProjectLocked = null;
	private CFBamXMsgRspnTopProjectUpdated rspnTopProjectUpdated = null;
	private CFBamXMsgRspnTopProjectDeleted rspnTopProjectDeleted = null;

	// UInt16Col Response s
	private CFBamXMsgRspnUInt16ColRec rspnUInt16ColRec = null;
	private CFBamXMsgRspnUInt16ColCreated rspnUInt16ColCreated = null;
	private CFBamXMsgRspnUInt16ColReadSingle rspnUInt16ColReadSingle = null;
	private CFBamXMsgRspnUInt16ColReadList rspnUInt16ColReadList = null;
	private CFBamXMsgRspnUInt16ColLocked rspnUInt16ColLocked = null;
	private CFBamXMsgRspnUInt16ColUpdated rspnUInt16ColUpdated = null;
	private CFBamXMsgRspnUInt16ColDeleted rspnUInt16ColDeleted = null;

	// UInt16Def Response s
	private CFBamXMsgRspnUInt16DefRec rspnUInt16DefRec = null;
	private CFBamXMsgRspnUInt16DefCreated rspnUInt16DefCreated = null;
	private CFBamXMsgRspnUInt16DefReadSingle rspnUInt16DefReadSingle = null;
	private CFBamXMsgRspnUInt16DefReadList rspnUInt16DefReadList = null;
	private CFBamXMsgRspnUInt16DefLocked rspnUInt16DefLocked = null;
	private CFBamXMsgRspnUInt16DefUpdated rspnUInt16DefUpdated = null;
	private CFBamXMsgRspnUInt16DefDeleted rspnUInt16DefDeleted = null;

	// UInt16Type Response s
	private CFBamXMsgRspnUInt16TypeRec rspnUInt16TypeRec = null;
	private CFBamXMsgRspnUInt16TypeCreated rspnUInt16TypeCreated = null;
	private CFBamXMsgRspnUInt16TypeReadSingle rspnUInt16TypeReadSingle = null;
	private CFBamXMsgRspnUInt16TypeReadList rspnUInt16TypeReadList = null;
	private CFBamXMsgRspnUInt16TypeLocked rspnUInt16TypeLocked = null;
	private CFBamXMsgRspnUInt16TypeUpdated rspnUInt16TypeUpdated = null;
	private CFBamXMsgRspnUInt16TypeDeleted rspnUInt16TypeDeleted = null;

	// UInt32Col Response s
	private CFBamXMsgRspnUInt32ColRec rspnUInt32ColRec = null;
	private CFBamXMsgRspnUInt32ColCreated rspnUInt32ColCreated = null;
	private CFBamXMsgRspnUInt32ColReadSingle rspnUInt32ColReadSingle = null;
	private CFBamXMsgRspnUInt32ColReadList rspnUInt32ColReadList = null;
	private CFBamXMsgRspnUInt32ColLocked rspnUInt32ColLocked = null;
	private CFBamXMsgRspnUInt32ColUpdated rspnUInt32ColUpdated = null;
	private CFBamXMsgRspnUInt32ColDeleted rspnUInt32ColDeleted = null;

	// UInt32Def Response s
	private CFBamXMsgRspnUInt32DefRec rspnUInt32DefRec = null;
	private CFBamXMsgRspnUInt32DefCreated rspnUInt32DefCreated = null;
	private CFBamXMsgRspnUInt32DefReadSingle rspnUInt32DefReadSingle = null;
	private CFBamXMsgRspnUInt32DefReadList rspnUInt32DefReadList = null;
	private CFBamXMsgRspnUInt32DefLocked rspnUInt32DefLocked = null;
	private CFBamXMsgRspnUInt32DefUpdated rspnUInt32DefUpdated = null;
	private CFBamXMsgRspnUInt32DefDeleted rspnUInt32DefDeleted = null;

	// UInt32Type Response s
	private CFBamXMsgRspnUInt32TypeRec rspnUInt32TypeRec = null;
	private CFBamXMsgRspnUInt32TypeCreated rspnUInt32TypeCreated = null;
	private CFBamXMsgRspnUInt32TypeReadSingle rspnUInt32TypeReadSingle = null;
	private CFBamXMsgRspnUInt32TypeReadList rspnUInt32TypeReadList = null;
	private CFBamXMsgRspnUInt32TypeLocked rspnUInt32TypeLocked = null;
	private CFBamXMsgRspnUInt32TypeUpdated rspnUInt32TypeUpdated = null;
	private CFBamXMsgRspnUInt32TypeDeleted rspnUInt32TypeDeleted = null;

	// UInt64Col Response s
	private CFBamXMsgRspnUInt64ColRec rspnUInt64ColRec = null;
	private CFBamXMsgRspnUInt64ColCreated rspnUInt64ColCreated = null;
	private CFBamXMsgRspnUInt64ColReadSingle rspnUInt64ColReadSingle = null;
	private CFBamXMsgRspnUInt64ColReadList rspnUInt64ColReadList = null;
	private CFBamXMsgRspnUInt64ColLocked rspnUInt64ColLocked = null;
	private CFBamXMsgRspnUInt64ColUpdated rspnUInt64ColUpdated = null;
	private CFBamXMsgRspnUInt64ColDeleted rspnUInt64ColDeleted = null;

	// UInt64Def Response s
	private CFBamXMsgRspnUInt64DefRec rspnUInt64DefRec = null;
	private CFBamXMsgRspnUInt64DefCreated rspnUInt64DefCreated = null;
	private CFBamXMsgRspnUInt64DefReadSingle rspnUInt64DefReadSingle = null;
	private CFBamXMsgRspnUInt64DefReadList rspnUInt64DefReadList = null;
	private CFBamXMsgRspnUInt64DefLocked rspnUInt64DefLocked = null;
	private CFBamXMsgRspnUInt64DefUpdated rspnUInt64DefUpdated = null;
	private CFBamXMsgRspnUInt64DefDeleted rspnUInt64DefDeleted = null;

	// UInt64Type Response s
	private CFBamXMsgRspnUInt64TypeRec rspnUInt64TypeRec = null;
	private CFBamXMsgRspnUInt64TypeCreated rspnUInt64TypeCreated = null;
	private CFBamXMsgRspnUInt64TypeReadSingle rspnUInt64TypeReadSingle = null;
	private CFBamXMsgRspnUInt64TypeReadList rspnUInt64TypeReadList = null;
	private CFBamXMsgRspnUInt64TypeLocked rspnUInt64TypeLocked = null;
	private CFBamXMsgRspnUInt64TypeUpdated rspnUInt64TypeUpdated = null;
	private CFBamXMsgRspnUInt64TypeDeleted rspnUInt64TypeDeleted = null;

	// URLProtocol Response s
	private CFBamXMsgRspnURLProtocolRec rspnURLProtocolRec = null;
	private CFBamXMsgRspnURLProtocolCreated rspnURLProtocolCreated = null;
	private CFBamXMsgRspnURLProtocolReadSingle rspnURLProtocolReadSingle = null;
	private CFBamXMsgRspnURLProtocolReadList rspnURLProtocolReadList = null;
	private CFBamXMsgRspnURLProtocolLocked rspnURLProtocolLocked = null;
	private CFBamXMsgRspnURLProtocolUpdated rspnURLProtocolUpdated = null;
	private CFBamXMsgRspnURLProtocolDeleted rspnURLProtocolDeleted = null;

	// UuidCol Response s
	private CFBamXMsgRspnUuidColRec rspnUuidColRec = null;
	private CFBamXMsgRspnUuidColCreated rspnUuidColCreated = null;
	private CFBamXMsgRspnUuidColReadSingle rspnUuidColReadSingle = null;
	private CFBamXMsgRspnUuidColReadList rspnUuidColReadList = null;
	private CFBamXMsgRspnUuidColLocked rspnUuidColLocked = null;
	private CFBamXMsgRspnUuidColUpdated rspnUuidColUpdated = null;
	private CFBamXMsgRspnUuidColDeleted rspnUuidColDeleted = null;

	// UuidDef Response s
	private CFBamXMsgRspnUuidDefRec rspnUuidDefRec = null;
	private CFBamXMsgRspnUuidDefCreated rspnUuidDefCreated = null;
	private CFBamXMsgRspnUuidDefReadSingle rspnUuidDefReadSingle = null;
	private CFBamXMsgRspnUuidDefReadList rspnUuidDefReadList = null;
	private CFBamXMsgRspnUuidDefLocked rspnUuidDefLocked = null;
	private CFBamXMsgRspnUuidDefUpdated rspnUuidDefUpdated = null;
	private CFBamXMsgRspnUuidDefDeleted rspnUuidDefDeleted = null;

	// UuidGen Response s
	private CFBamXMsgRspnUuidGenRec rspnUuidGenRec = null;
	private CFBamXMsgRspnUuidGenCreated rspnUuidGenCreated = null;
	private CFBamXMsgRspnUuidGenReadSingle rspnUuidGenReadSingle = null;
	private CFBamXMsgRspnUuidGenReadList rspnUuidGenReadList = null;
	private CFBamXMsgRspnUuidGenLocked rspnUuidGenLocked = null;
	private CFBamXMsgRspnUuidGenUpdated rspnUuidGenUpdated = null;
	private CFBamXMsgRspnUuidGenDeleted rspnUuidGenDeleted = null;

	// UuidType Response s
	private CFBamXMsgRspnUuidTypeRec rspnUuidTypeRec = null;
	private CFBamXMsgRspnUuidTypeCreated rspnUuidTypeCreated = null;
	private CFBamXMsgRspnUuidTypeReadSingle rspnUuidTypeReadSingle = null;
	private CFBamXMsgRspnUuidTypeReadList rspnUuidTypeReadList = null;
	private CFBamXMsgRspnUuidTypeLocked rspnUuidTypeLocked = null;
	private CFBamXMsgRspnUuidTypeUpdated rspnUuidTypeUpdated = null;
	private CFBamXMsgRspnUuidTypeDeleted rspnUuidTypeDeleted = null;

	// Value Response s
	private CFBamXMsgRspnValueRec rspnValueRec = null;
	private CFBamXMsgRspnValueCreated rspnValueCreated = null;
	private CFBamXMsgRspnValueReadSingle rspnValueReadSingle = null;
	private CFBamXMsgRspnValueReadList rspnValueReadList = null;
	private CFBamXMsgRspnValueLocked rspnValueLocked = null;
	private CFBamXMsgRspnValueUpdated rspnValueUpdated = null;
	private CFBamXMsgRspnValueDeleted rspnValueDeleted = null;
	private CFBamSaxRspnRoot saxRoot = null;

	private CFBamSaxRspnDoc saxDoc = null;

	// Schema object accessors

	// SchemaObj accessors

	public ICFBamSchemaObj getSchemaObj() {
		return( schemaObj );
	}

	public void setSchemaObj( ICFBamSchemaObj value ) {
		schemaObj = value;
	}

	// Result accessors

	public String getLogContent() {
		return( logContent);
	}

	public void setLogContent( String value ) {
		logContent = value;
	}

	public boolean getDataChanged() {
		return( dataChanged);
	}

	public void setDataChanged( boolean value ) {
		dataChanged = value;
	}

	public boolean getDeleted() {
		return( deleted );
	}

	public void setDeleted( boolean flag ) {
		deleted = flag;
	}

	public RuntimeException getExceptionRaised() {
		return( exceptionRaised );
	}

	public void setExceptionRaised( RuntimeException obj ) {
		exceptionRaised = obj;
	}

	public Object getLastObjectProcessed() {
		return( lastObjectProcessed );
	}

	public void setLastObjectProcessed( Object obj ) {
		lastObjectProcessed = obj;
	}

	public Object getListOfObjects() {
		return( sortedListOfObjects );
	}

	public void setListOfObjects( Object obj ) {
		sortedListOfObjects = obj;
	}

	// Element  Resolver Factories

	protected CFBamXMsgRspnNoDataFound getRspnNoDataFound() {
		if( rspnNoDataFound == null ) {
			rspnNoDataFound = new CFBamXMsgRspnNoDataFound( this );
		}
		return( rspnNoDataFound );
	}

	protected CFBamXMsgRspnException getRspnException() {
		if( rspnException == null ) {
			rspnException = new CFBamXMsgRspnException( this );
		}
		return( rspnException );
	}

	protected CFBamXMsgRspnFileLoaded getRspnFileLoaded() {
		if( rspnFileLoaded == null ) {
			rspnFileLoaded = new CFBamXMsgRspnFileLoaded( this );
		}
		return( rspnFileLoaded );
	}

	protected CFBamXMsgRspnLoggedIn getRspnLoggedIn() {
		if( rspnLoggedIn == null ) {
			rspnLoggedIn = new CFBamXMsgRspnLoggedIn( this );
		}
		return( rspnLoggedIn );
	}

	protected CFBamXMsgRspnLoggedOut getRspnLoggedOut() {
		if( rspnLoggedOut == null ) {
			rspnLoggedOut = new CFBamXMsgRspnLoggedOut( this );
		}
		return( rspnLoggedOut );
	}

	protected CFBamXMsgRspnServerProcExecuted getRspnServerProcExecuted() {
		if( rspnServerProcExecuted == null ) {
			rspnServerProcExecuted = new CFBamXMsgRspnServerProcExecuted( this );
		}
		return( rspnServerProcExecuted );
	}

	// Atom Response s

	protected CFBamXMsgRspnAtomRec getRspnAtomRec() {
		if( rspnAtomRec == null ) {
			rspnAtomRec = new CFBamXMsgRspnAtomRec( this );
		}
		return( rspnAtomRec );
	}

	protected CFBamXMsgRspnAtomCreated getRspnAtomCreated() {
		if( rspnAtomCreated == null ) {
			rspnAtomCreated = new CFBamXMsgRspnAtomCreated( this );
		}
		return( rspnAtomCreated );
	}

	protected CFBamXMsgRspnAtomReadSingle getRspnAtomReadSingle() {
		if( rspnAtomReadSingle == null ) {
			rspnAtomReadSingle = new CFBamXMsgRspnAtomReadSingle( this );
			rspnAtomReadSingle.addElementHandler( "Atom", getRspnAtomRec() );
			rspnAtomReadSingle.addElementHandler( "BlobDef", getRspnBlobDefRec() );
			rspnAtomReadSingle.addElementHandler( "BlobType", getRspnBlobTypeRec() );
			rspnAtomReadSingle.addElementHandler( "BlobCol", getRspnBlobColRec() );
			rspnAtomReadSingle.addElementHandler( "BoolDef", getRspnBoolDefRec() );
			rspnAtomReadSingle.addElementHandler( "BoolType", getRspnBoolTypeRec() );
			rspnAtomReadSingle.addElementHandler( "BoolCol", getRspnBoolColRec() );
			rspnAtomReadSingle.addElementHandler( "DateDef", getRspnDateDefRec() );
			rspnAtomReadSingle.addElementHandler( "DateType", getRspnDateTypeRec() );
			rspnAtomReadSingle.addElementHandler( "DateCol", getRspnDateColRec() );
			rspnAtomReadSingle.addElementHandler( "DoubleDef", getRspnDoubleDefRec() );
			rspnAtomReadSingle.addElementHandler( "DoubleType", getRspnDoubleTypeRec() );
			rspnAtomReadSingle.addElementHandler( "DoubleCol", getRspnDoubleColRec() );
			rspnAtomReadSingle.addElementHandler( "FloatDef", getRspnFloatDefRec() );
			rspnAtomReadSingle.addElementHandler( "FloatType", getRspnFloatTypeRec() );
			rspnAtomReadSingle.addElementHandler( "FloatCol", getRspnFloatColRec() );
			rspnAtomReadSingle.addElementHandler( "Int16Def", getRspnInt16DefRec() );
			rspnAtomReadSingle.addElementHandler( "Int16Type", getRspnInt16TypeRec() );
			rspnAtomReadSingle.addElementHandler( "Id16Gen", getRspnId16GenRec() );
			rspnAtomReadSingle.addElementHandler( "EnumDef", getRspnEnumDefRec() );
			rspnAtomReadSingle.addElementHandler( "EnumType", getRspnEnumTypeRec() );
			rspnAtomReadSingle.addElementHandler( "Int16Col", getRspnInt16ColRec() );
			rspnAtomReadSingle.addElementHandler( "Int32Def", getRspnInt32DefRec() );
			rspnAtomReadSingle.addElementHandler( "Int32Type", getRspnInt32TypeRec() );
			rspnAtomReadSingle.addElementHandler( "Id32Gen", getRspnId32GenRec() );
			rspnAtomReadSingle.addElementHandler( "Int32Col", getRspnInt32ColRec() );
			rspnAtomReadSingle.addElementHandler( "Int64Def", getRspnInt64DefRec() );
			rspnAtomReadSingle.addElementHandler( "Int64Type", getRspnInt64TypeRec() );
			rspnAtomReadSingle.addElementHandler( "Id64Gen", getRspnId64GenRec() );
			rspnAtomReadSingle.addElementHandler( "Int64Col", getRspnInt64ColRec() );
			rspnAtomReadSingle.addElementHandler( "NmTokenDef", getRspnNmTokenDefRec() );
			rspnAtomReadSingle.addElementHandler( "NmTokenType", getRspnNmTokenTypeRec() );
			rspnAtomReadSingle.addElementHandler( "NmTokenCol", getRspnNmTokenColRec() );
			rspnAtomReadSingle.addElementHandler( "NmTokensDef", getRspnNmTokensDefRec() );
			rspnAtomReadSingle.addElementHandler( "NmTokensType", getRspnNmTokensTypeRec() );
			rspnAtomReadSingle.addElementHandler( "NmTokensCol", getRspnNmTokensColRec() );
			rspnAtomReadSingle.addElementHandler( "NumberDef", getRspnNumberDefRec() );
			rspnAtomReadSingle.addElementHandler( "NumberType", getRspnNumberTypeRec() );
			rspnAtomReadSingle.addElementHandler( "NumberCol", getRspnNumberColRec() );
			rspnAtomReadSingle.addElementHandler( "StringDef", getRspnStringDefRec() );
			rspnAtomReadSingle.addElementHandler( "StringType", getRspnStringTypeRec() );
			rspnAtomReadSingle.addElementHandler( "StringCol", getRspnStringColRec() );
			rspnAtomReadSingle.addElementHandler( "TZDateDef", getRspnTZDateDefRec() );
			rspnAtomReadSingle.addElementHandler( "TZDateType", getRspnTZDateTypeRec() );
			rspnAtomReadSingle.addElementHandler( "TZDateCol", getRspnTZDateColRec() );
			rspnAtomReadSingle.addElementHandler( "TZTimeDef", getRspnTZTimeDefRec() );
			rspnAtomReadSingle.addElementHandler( "TZTimeType", getRspnTZTimeTypeRec() );
			rspnAtomReadSingle.addElementHandler( "TZTimeCol", getRspnTZTimeColRec() );
			rspnAtomReadSingle.addElementHandler( "TZTimestampDef", getRspnTZTimestampDefRec() );
			rspnAtomReadSingle.addElementHandler( "TZTimestampType", getRspnTZTimestampTypeRec() );
			rspnAtomReadSingle.addElementHandler( "TZTimestampCol", getRspnTZTimestampColRec() );
			rspnAtomReadSingle.addElementHandler( "TextDef", getRspnTextDefRec() );
			rspnAtomReadSingle.addElementHandler( "TextType", getRspnTextTypeRec() );
			rspnAtomReadSingle.addElementHandler( "TextCol", getRspnTextColRec() );
			rspnAtomReadSingle.addElementHandler( "TimeDef", getRspnTimeDefRec() );
			rspnAtomReadSingle.addElementHandler( "TimeType", getRspnTimeTypeRec() );
			rspnAtomReadSingle.addElementHandler( "TimeCol", getRspnTimeColRec() );
			rspnAtomReadSingle.addElementHandler( "TimestampDef", getRspnTimestampDefRec() );
			rspnAtomReadSingle.addElementHandler( "TimestampType", getRspnTimestampTypeRec() );
			rspnAtomReadSingle.addElementHandler( "TimestampCol", getRspnTimestampColRec() );
			rspnAtomReadSingle.addElementHandler( "TokenDef", getRspnTokenDefRec() );
			rspnAtomReadSingle.addElementHandler( "TokenType", getRspnTokenTypeRec() );
			rspnAtomReadSingle.addElementHandler( "TokenCol", getRspnTokenColRec() );
			rspnAtomReadSingle.addElementHandler( "UInt16Def", getRspnUInt16DefRec() );
			rspnAtomReadSingle.addElementHandler( "UInt16Type", getRspnUInt16TypeRec() );
			rspnAtomReadSingle.addElementHandler( "UInt16Col", getRspnUInt16ColRec() );
			rspnAtomReadSingle.addElementHandler( "UInt32Def", getRspnUInt32DefRec() );
			rspnAtomReadSingle.addElementHandler( "UInt32Type", getRspnUInt32TypeRec() );
			rspnAtomReadSingle.addElementHandler( "UInt32Col", getRspnUInt32ColRec() );
			rspnAtomReadSingle.addElementHandler( "UInt64Def", getRspnUInt64DefRec() );
			rspnAtomReadSingle.addElementHandler( "UInt64Type", getRspnUInt64TypeRec() );
			rspnAtomReadSingle.addElementHandler( "UInt64Col", getRspnUInt64ColRec() );
			rspnAtomReadSingle.addElementHandler( "UuidDef", getRspnUuidDefRec() );
			rspnAtomReadSingle.addElementHandler( "UuidType", getRspnUuidTypeRec() );
			rspnAtomReadSingle.addElementHandler( "UuidGen", getRspnUuidGenRec() );
			rspnAtomReadSingle.addElementHandler( "UuidCol", getRspnUuidColRec() );
		}
		return( rspnAtomReadSingle );
	}

	protected CFBamXMsgRspnAtomReadList getRspnAtomReadList() {
		if( rspnAtomReadList == null ) {
			rspnAtomReadList = new CFBamXMsgRspnAtomReadList( this );
			rspnAtomReadList.addElementHandler( "Atom", getRspnAtomRec() );
			rspnAtomReadList.addElementHandler( "BlobDef", getRspnBlobDefRec() );
			rspnAtomReadList.addElementHandler( "BlobType", getRspnBlobTypeRec() );
			rspnAtomReadList.addElementHandler( "BlobCol", getRspnBlobColRec() );
			rspnAtomReadList.addElementHandler( "BoolDef", getRspnBoolDefRec() );
			rspnAtomReadList.addElementHandler( "BoolType", getRspnBoolTypeRec() );
			rspnAtomReadList.addElementHandler( "BoolCol", getRspnBoolColRec() );
			rspnAtomReadList.addElementHandler( "DateDef", getRspnDateDefRec() );
			rspnAtomReadList.addElementHandler( "DateType", getRspnDateTypeRec() );
			rspnAtomReadList.addElementHandler( "DateCol", getRspnDateColRec() );
			rspnAtomReadList.addElementHandler( "DoubleDef", getRspnDoubleDefRec() );
			rspnAtomReadList.addElementHandler( "DoubleType", getRspnDoubleTypeRec() );
			rspnAtomReadList.addElementHandler( "DoubleCol", getRspnDoubleColRec() );
			rspnAtomReadList.addElementHandler( "FloatDef", getRspnFloatDefRec() );
			rspnAtomReadList.addElementHandler( "FloatType", getRspnFloatTypeRec() );
			rspnAtomReadList.addElementHandler( "FloatCol", getRspnFloatColRec() );
			rspnAtomReadList.addElementHandler( "Int16Def", getRspnInt16DefRec() );
			rspnAtomReadList.addElementHandler( "Int16Type", getRspnInt16TypeRec() );
			rspnAtomReadList.addElementHandler( "Id16Gen", getRspnId16GenRec() );
			rspnAtomReadList.addElementHandler( "EnumDef", getRspnEnumDefRec() );
			rspnAtomReadList.addElementHandler( "EnumType", getRspnEnumTypeRec() );
			rspnAtomReadList.addElementHandler( "Int16Col", getRspnInt16ColRec() );
			rspnAtomReadList.addElementHandler( "Int32Def", getRspnInt32DefRec() );
			rspnAtomReadList.addElementHandler( "Int32Type", getRspnInt32TypeRec() );
			rspnAtomReadList.addElementHandler( "Id32Gen", getRspnId32GenRec() );
			rspnAtomReadList.addElementHandler( "Int32Col", getRspnInt32ColRec() );
			rspnAtomReadList.addElementHandler( "Int64Def", getRspnInt64DefRec() );
			rspnAtomReadList.addElementHandler( "Int64Type", getRspnInt64TypeRec() );
			rspnAtomReadList.addElementHandler( "Id64Gen", getRspnId64GenRec() );
			rspnAtomReadList.addElementHandler( "Int64Col", getRspnInt64ColRec() );
			rspnAtomReadList.addElementHandler( "NmTokenDef", getRspnNmTokenDefRec() );
			rspnAtomReadList.addElementHandler( "NmTokenType", getRspnNmTokenTypeRec() );
			rspnAtomReadList.addElementHandler( "NmTokenCol", getRspnNmTokenColRec() );
			rspnAtomReadList.addElementHandler( "NmTokensDef", getRspnNmTokensDefRec() );
			rspnAtomReadList.addElementHandler( "NmTokensType", getRspnNmTokensTypeRec() );
			rspnAtomReadList.addElementHandler( "NmTokensCol", getRspnNmTokensColRec() );
			rspnAtomReadList.addElementHandler( "NumberDef", getRspnNumberDefRec() );
			rspnAtomReadList.addElementHandler( "NumberType", getRspnNumberTypeRec() );
			rspnAtomReadList.addElementHandler( "NumberCol", getRspnNumberColRec() );
			rspnAtomReadList.addElementHandler( "StringDef", getRspnStringDefRec() );
			rspnAtomReadList.addElementHandler( "StringType", getRspnStringTypeRec() );
			rspnAtomReadList.addElementHandler( "StringCol", getRspnStringColRec() );
			rspnAtomReadList.addElementHandler( "TZDateDef", getRspnTZDateDefRec() );
			rspnAtomReadList.addElementHandler( "TZDateType", getRspnTZDateTypeRec() );
			rspnAtomReadList.addElementHandler( "TZDateCol", getRspnTZDateColRec() );
			rspnAtomReadList.addElementHandler( "TZTimeDef", getRspnTZTimeDefRec() );
			rspnAtomReadList.addElementHandler( "TZTimeType", getRspnTZTimeTypeRec() );
			rspnAtomReadList.addElementHandler( "TZTimeCol", getRspnTZTimeColRec() );
			rspnAtomReadList.addElementHandler( "TZTimestampDef", getRspnTZTimestampDefRec() );
			rspnAtomReadList.addElementHandler( "TZTimestampType", getRspnTZTimestampTypeRec() );
			rspnAtomReadList.addElementHandler( "TZTimestampCol", getRspnTZTimestampColRec() );
			rspnAtomReadList.addElementHandler( "TextDef", getRspnTextDefRec() );
			rspnAtomReadList.addElementHandler( "TextType", getRspnTextTypeRec() );
			rspnAtomReadList.addElementHandler( "TextCol", getRspnTextColRec() );
			rspnAtomReadList.addElementHandler( "TimeDef", getRspnTimeDefRec() );
			rspnAtomReadList.addElementHandler( "TimeType", getRspnTimeTypeRec() );
			rspnAtomReadList.addElementHandler( "TimeCol", getRspnTimeColRec() );
			rspnAtomReadList.addElementHandler( "TimestampDef", getRspnTimestampDefRec() );
			rspnAtomReadList.addElementHandler( "TimestampType", getRspnTimestampTypeRec() );
			rspnAtomReadList.addElementHandler( "TimestampCol", getRspnTimestampColRec() );
			rspnAtomReadList.addElementHandler( "TokenDef", getRspnTokenDefRec() );
			rspnAtomReadList.addElementHandler( "TokenType", getRspnTokenTypeRec() );
			rspnAtomReadList.addElementHandler( "TokenCol", getRspnTokenColRec() );
			rspnAtomReadList.addElementHandler( "UInt16Def", getRspnUInt16DefRec() );
			rspnAtomReadList.addElementHandler( "UInt16Type", getRspnUInt16TypeRec() );
			rspnAtomReadList.addElementHandler( "UInt16Col", getRspnUInt16ColRec() );
			rspnAtomReadList.addElementHandler( "UInt32Def", getRspnUInt32DefRec() );
			rspnAtomReadList.addElementHandler( "UInt32Type", getRspnUInt32TypeRec() );
			rspnAtomReadList.addElementHandler( "UInt32Col", getRspnUInt32ColRec() );
			rspnAtomReadList.addElementHandler( "UInt64Def", getRspnUInt64DefRec() );
			rspnAtomReadList.addElementHandler( "UInt64Type", getRspnUInt64TypeRec() );
			rspnAtomReadList.addElementHandler( "UInt64Col", getRspnUInt64ColRec() );
			rspnAtomReadList.addElementHandler( "UuidDef", getRspnUuidDefRec() );
			rspnAtomReadList.addElementHandler( "UuidType", getRspnUuidTypeRec() );
			rspnAtomReadList.addElementHandler( "UuidGen", getRspnUuidGenRec() );
			rspnAtomReadList.addElementHandler( "UuidCol", getRspnUuidColRec() );
		}
		return( rspnAtomReadList );
	}

	protected CFBamXMsgRspnAtomLocked getRspnAtomLocked() {
		if( rspnAtomLocked == null ) {
			rspnAtomLocked = new CFBamXMsgRspnAtomLocked( this );
		}
		return( rspnAtomLocked );
	}

	protected CFBamXMsgRspnAtomUpdated getRspnAtomUpdated() {
		if( rspnAtomUpdated == null ) {
			rspnAtomUpdated = new CFBamXMsgRspnAtomUpdated( this );
		}
		return( rspnAtomUpdated );
	}

	protected CFBamXMsgRspnAtomDeleted getRspnAtomDeleted() {
		if( rspnAtomDeleted == null ) {
			rspnAtomDeleted = new CFBamXMsgRspnAtomDeleted( this );
		}
		return( rspnAtomDeleted );
	}

	// BlobCol Response s

	protected CFBamXMsgRspnBlobColRec getRspnBlobColRec() {
		if( rspnBlobColRec == null ) {
			rspnBlobColRec = new CFBamXMsgRspnBlobColRec( this );
		}
		return( rspnBlobColRec );
	}

	protected CFBamXMsgRspnBlobColCreated getRspnBlobColCreated() {
		if( rspnBlobColCreated == null ) {
			rspnBlobColCreated = new CFBamXMsgRspnBlobColCreated( this );
		}
		return( rspnBlobColCreated );
	}

	protected CFBamXMsgRspnBlobColReadSingle getRspnBlobColReadSingle() {
		if( rspnBlobColReadSingle == null ) {
			rspnBlobColReadSingle = new CFBamXMsgRspnBlobColReadSingle( this );
			rspnBlobColReadSingle.addElementHandler( "BlobCol", getRspnBlobColRec() );
		}
		return( rspnBlobColReadSingle );
	}

	protected CFBamXMsgRspnBlobColReadList getRspnBlobColReadList() {
		if( rspnBlobColReadList == null ) {
			rspnBlobColReadList = new CFBamXMsgRspnBlobColReadList( this );
			rspnBlobColReadList.addElementHandler( "BlobCol", getRspnBlobColRec() );
		}
		return( rspnBlobColReadList );
	}

	protected CFBamXMsgRspnBlobColLocked getRspnBlobColLocked() {
		if( rspnBlobColLocked == null ) {
			rspnBlobColLocked = new CFBamXMsgRspnBlobColLocked( this );
		}
		return( rspnBlobColLocked );
	}

	protected CFBamXMsgRspnBlobColUpdated getRspnBlobColUpdated() {
		if( rspnBlobColUpdated == null ) {
			rspnBlobColUpdated = new CFBamXMsgRspnBlobColUpdated( this );
		}
		return( rspnBlobColUpdated );
	}

	protected CFBamXMsgRspnBlobColDeleted getRspnBlobColDeleted() {
		if( rspnBlobColDeleted == null ) {
			rspnBlobColDeleted = new CFBamXMsgRspnBlobColDeleted( this );
		}
		return( rspnBlobColDeleted );
	}

	// BlobDef Response s

	protected CFBamXMsgRspnBlobDefRec getRspnBlobDefRec() {
		if( rspnBlobDefRec == null ) {
			rspnBlobDefRec = new CFBamXMsgRspnBlobDefRec( this );
		}
		return( rspnBlobDefRec );
	}

	protected CFBamXMsgRspnBlobDefCreated getRspnBlobDefCreated() {
		if( rspnBlobDefCreated == null ) {
			rspnBlobDefCreated = new CFBamXMsgRspnBlobDefCreated( this );
		}
		return( rspnBlobDefCreated );
	}

	protected CFBamXMsgRspnBlobDefReadSingle getRspnBlobDefReadSingle() {
		if( rspnBlobDefReadSingle == null ) {
			rspnBlobDefReadSingle = new CFBamXMsgRspnBlobDefReadSingle( this );
			rspnBlobDefReadSingle.addElementHandler( "BlobDef", getRspnBlobDefRec() );
			rspnBlobDefReadSingle.addElementHandler( "BlobType", getRspnBlobTypeRec() );
			rspnBlobDefReadSingle.addElementHandler( "BlobCol", getRspnBlobColRec() );
		}
		return( rspnBlobDefReadSingle );
	}

	protected CFBamXMsgRspnBlobDefReadList getRspnBlobDefReadList() {
		if( rspnBlobDefReadList == null ) {
			rspnBlobDefReadList = new CFBamXMsgRspnBlobDefReadList( this );
			rspnBlobDefReadList.addElementHandler( "BlobDef", getRspnBlobDefRec() );
			rspnBlobDefReadList.addElementHandler( "BlobType", getRspnBlobTypeRec() );
			rspnBlobDefReadList.addElementHandler( "BlobCol", getRspnBlobColRec() );
		}
		return( rspnBlobDefReadList );
	}

	protected CFBamXMsgRspnBlobDefLocked getRspnBlobDefLocked() {
		if( rspnBlobDefLocked == null ) {
			rspnBlobDefLocked = new CFBamXMsgRspnBlobDefLocked( this );
		}
		return( rspnBlobDefLocked );
	}

	protected CFBamXMsgRspnBlobDefUpdated getRspnBlobDefUpdated() {
		if( rspnBlobDefUpdated == null ) {
			rspnBlobDefUpdated = new CFBamXMsgRspnBlobDefUpdated( this );
		}
		return( rspnBlobDefUpdated );
	}

	protected CFBamXMsgRspnBlobDefDeleted getRspnBlobDefDeleted() {
		if( rspnBlobDefDeleted == null ) {
			rspnBlobDefDeleted = new CFBamXMsgRspnBlobDefDeleted( this );
		}
		return( rspnBlobDefDeleted );
	}

	// BlobType Response s

	protected CFBamXMsgRspnBlobTypeRec getRspnBlobTypeRec() {
		if( rspnBlobTypeRec == null ) {
			rspnBlobTypeRec = new CFBamXMsgRspnBlobTypeRec( this );
		}
		return( rspnBlobTypeRec );
	}

	protected CFBamXMsgRspnBlobTypeCreated getRspnBlobTypeCreated() {
		if( rspnBlobTypeCreated == null ) {
			rspnBlobTypeCreated = new CFBamXMsgRspnBlobTypeCreated( this );
		}
		return( rspnBlobTypeCreated );
	}

	protected CFBamXMsgRspnBlobTypeReadSingle getRspnBlobTypeReadSingle() {
		if( rspnBlobTypeReadSingle == null ) {
			rspnBlobTypeReadSingle = new CFBamXMsgRspnBlobTypeReadSingle( this );
			rspnBlobTypeReadSingle.addElementHandler( "BlobType", getRspnBlobTypeRec() );
		}
		return( rspnBlobTypeReadSingle );
	}

	protected CFBamXMsgRspnBlobTypeReadList getRspnBlobTypeReadList() {
		if( rspnBlobTypeReadList == null ) {
			rspnBlobTypeReadList = new CFBamXMsgRspnBlobTypeReadList( this );
			rspnBlobTypeReadList.addElementHandler( "BlobType", getRspnBlobTypeRec() );
		}
		return( rspnBlobTypeReadList );
	}

	protected CFBamXMsgRspnBlobTypeLocked getRspnBlobTypeLocked() {
		if( rspnBlobTypeLocked == null ) {
			rspnBlobTypeLocked = new CFBamXMsgRspnBlobTypeLocked( this );
		}
		return( rspnBlobTypeLocked );
	}

	protected CFBamXMsgRspnBlobTypeUpdated getRspnBlobTypeUpdated() {
		if( rspnBlobTypeUpdated == null ) {
			rspnBlobTypeUpdated = new CFBamXMsgRspnBlobTypeUpdated( this );
		}
		return( rspnBlobTypeUpdated );
	}

	protected CFBamXMsgRspnBlobTypeDeleted getRspnBlobTypeDeleted() {
		if( rspnBlobTypeDeleted == null ) {
			rspnBlobTypeDeleted = new CFBamXMsgRspnBlobTypeDeleted( this );
		}
		return( rspnBlobTypeDeleted );
	}

	// BoolCol Response s

	protected CFBamXMsgRspnBoolColRec getRspnBoolColRec() {
		if( rspnBoolColRec == null ) {
			rspnBoolColRec = new CFBamXMsgRspnBoolColRec( this );
		}
		return( rspnBoolColRec );
	}

	protected CFBamXMsgRspnBoolColCreated getRspnBoolColCreated() {
		if( rspnBoolColCreated == null ) {
			rspnBoolColCreated = new CFBamXMsgRspnBoolColCreated( this );
		}
		return( rspnBoolColCreated );
	}

	protected CFBamXMsgRspnBoolColReadSingle getRspnBoolColReadSingle() {
		if( rspnBoolColReadSingle == null ) {
			rspnBoolColReadSingle = new CFBamXMsgRspnBoolColReadSingle( this );
			rspnBoolColReadSingle.addElementHandler( "BoolCol", getRspnBoolColRec() );
		}
		return( rspnBoolColReadSingle );
	}

	protected CFBamXMsgRspnBoolColReadList getRspnBoolColReadList() {
		if( rspnBoolColReadList == null ) {
			rspnBoolColReadList = new CFBamXMsgRspnBoolColReadList( this );
			rspnBoolColReadList.addElementHandler( "BoolCol", getRspnBoolColRec() );
		}
		return( rspnBoolColReadList );
	}

	protected CFBamXMsgRspnBoolColLocked getRspnBoolColLocked() {
		if( rspnBoolColLocked == null ) {
			rspnBoolColLocked = new CFBamXMsgRspnBoolColLocked( this );
		}
		return( rspnBoolColLocked );
	}

	protected CFBamXMsgRspnBoolColUpdated getRspnBoolColUpdated() {
		if( rspnBoolColUpdated == null ) {
			rspnBoolColUpdated = new CFBamXMsgRspnBoolColUpdated( this );
		}
		return( rspnBoolColUpdated );
	}

	protected CFBamXMsgRspnBoolColDeleted getRspnBoolColDeleted() {
		if( rspnBoolColDeleted == null ) {
			rspnBoolColDeleted = new CFBamXMsgRspnBoolColDeleted( this );
		}
		return( rspnBoolColDeleted );
	}

	// BoolDef Response s

	protected CFBamXMsgRspnBoolDefRec getRspnBoolDefRec() {
		if( rspnBoolDefRec == null ) {
			rspnBoolDefRec = new CFBamXMsgRspnBoolDefRec( this );
		}
		return( rspnBoolDefRec );
	}

	protected CFBamXMsgRspnBoolDefCreated getRspnBoolDefCreated() {
		if( rspnBoolDefCreated == null ) {
			rspnBoolDefCreated = new CFBamXMsgRspnBoolDefCreated( this );
		}
		return( rspnBoolDefCreated );
	}

	protected CFBamXMsgRspnBoolDefReadSingle getRspnBoolDefReadSingle() {
		if( rspnBoolDefReadSingle == null ) {
			rspnBoolDefReadSingle = new CFBamXMsgRspnBoolDefReadSingle( this );
			rspnBoolDefReadSingle.addElementHandler( "BoolDef", getRspnBoolDefRec() );
			rspnBoolDefReadSingle.addElementHandler( "BoolType", getRspnBoolTypeRec() );
			rspnBoolDefReadSingle.addElementHandler( "BoolCol", getRspnBoolColRec() );
		}
		return( rspnBoolDefReadSingle );
	}

	protected CFBamXMsgRspnBoolDefReadList getRspnBoolDefReadList() {
		if( rspnBoolDefReadList == null ) {
			rspnBoolDefReadList = new CFBamXMsgRspnBoolDefReadList( this );
			rspnBoolDefReadList.addElementHandler( "BoolDef", getRspnBoolDefRec() );
			rspnBoolDefReadList.addElementHandler( "BoolType", getRspnBoolTypeRec() );
			rspnBoolDefReadList.addElementHandler( "BoolCol", getRspnBoolColRec() );
		}
		return( rspnBoolDefReadList );
	}

	protected CFBamXMsgRspnBoolDefLocked getRspnBoolDefLocked() {
		if( rspnBoolDefLocked == null ) {
			rspnBoolDefLocked = new CFBamXMsgRspnBoolDefLocked( this );
		}
		return( rspnBoolDefLocked );
	}

	protected CFBamXMsgRspnBoolDefUpdated getRspnBoolDefUpdated() {
		if( rspnBoolDefUpdated == null ) {
			rspnBoolDefUpdated = new CFBamXMsgRspnBoolDefUpdated( this );
		}
		return( rspnBoolDefUpdated );
	}

	protected CFBamXMsgRspnBoolDefDeleted getRspnBoolDefDeleted() {
		if( rspnBoolDefDeleted == null ) {
			rspnBoolDefDeleted = new CFBamXMsgRspnBoolDefDeleted( this );
		}
		return( rspnBoolDefDeleted );
	}

	// BoolType Response s

	protected CFBamXMsgRspnBoolTypeRec getRspnBoolTypeRec() {
		if( rspnBoolTypeRec == null ) {
			rspnBoolTypeRec = new CFBamXMsgRspnBoolTypeRec( this );
		}
		return( rspnBoolTypeRec );
	}

	protected CFBamXMsgRspnBoolTypeCreated getRspnBoolTypeCreated() {
		if( rspnBoolTypeCreated == null ) {
			rspnBoolTypeCreated = new CFBamXMsgRspnBoolTypeCreated( this );
		}
		return( rspnBoolTypeCreated );
	}

	protected CFBamXMsgRspnBoolTypeReadSingle getRspnBoolTypeReadSingle() {
		if( rspnBoolTypeReadSingle == null ) {
			rspnBoolTypeReadSingle = new CFBamXMsgRspnBoolTypeReadSingle( this );
			rspnBoolTypeReadSingle.addElementHandler( "BoolType", getRspnBoolTypeRec() );
		}
		return( rspnBoolTypeReadSingle );
	}

	protected CFBamXMsgRspnBoolTypeReadList getRspnBoolTypeReadList() {
		if( rspnBoolTypeReadList == null ) {
			rspnBoolTypeReadList = new CFBamXMsgRspnBoolTypeReadList( this );
			rspnBoolTypeReadList.addElementHandler( "BoolType", getRspnBoolTypeRec() );
		}
		return( rspnBoolTypeReadList );
	}

	protected CFBamXMsgRspnBoolTypeLocked getRspnBoolTypeLocked() {
		if( rspnBoolTypeLocked == null ) {
			rspnBoolTypeLocked = new CFBamXMsgRspnBoolTypeLocked( this );
		}
		return( rspnBoolTypeLocked );
	}

	protected CFBamXMsgRspnBoolTypeUpdated getRspnBoolTypeUpdated() {
		if( rspnBoolTypeUpdated == null ) {
			rspnBoolTypeUpdated = new CFBamXMsgRspnBoolTypeUpdated( this );
		}
		return( rspnBoolTypeUpdated );
	}

	protected CFBamXMsgRspnBoolTypeDeleted getRspnBoolTypeDeleted() {
		if( rspnBoolTypeDeleted == null ) {
			rspnBoolTypeDeleted = new CFBamXMsgRspnBoolTypeDeleted( this );
		}
		return( rspnBoolTypeDeleted );
	}

	// Chain Response s

	protected CFBamXMsgRspnChainRec getRspnChainRec() {
		if( rspnChainRec == null ) {
			rspnChainRec = new CFBamXMsgRspnChainRec( this );
		}
		return( rspnChainRec );
	}

	protected CFBamXMsgRspnChainCreated getRspnChainCreated() {
		if( rspnChainCreated == null ) {
			rspnChainCreated = new CFBamXMsgRspnChainCreated( this );
		}
		return( rspnChainCreated );
	}

	protected CFBamXMsgRspnChainReadSingle getRspnChainReadSingle() {
		if( rspnChainReadSingle == null ) {
			rspnChainReadSingle = new CFBamXMsgRspnChainReadSingle( this );
			rspnChainReadSingle.addElementHandler( "Chain", getRspnChainRec() );
		}
		return( rspnChainReadSingle );
	}

	protected CFBamXMsgRspnChainReadList getRspnChainReadList() {
		if( rspnChainReadList == null ) {
			rspnChainReadList = new CFBamXMsgRspnChainReadList( this );
			rspnChainReadList.addElementHandler( "Chain", getRspnChainRec() );
		}
		return( rspnChainReadList );
	}

	protected CFBamXMsgRspnChainLocked getRspnChainLocked() {
		if( rspnChainLocked == null ) {
			rspnChainLocked = new CFBamXMsgRspnChainLocked( this );
		}
		return( rspnChainLocked );
	}

	protected CFBamXMsgRspnChainUpdated getRspnChainUpdated() {
		if( rspnChainUpdated == null ) {
			rspnChainUpdated = new CFBamXMsgRspnChainUpdated( this );
		}
		return( rspnChainUpdated );
	}

	protected CFBamXMsgRspnChainDeleted getRspnChainDeleted() {
		if( rspnChainDeleted == null ) {
			rspnChainDeleted = new CFBamXMsgRspnChainDeleted( this );
		}
		return( rspnChainDeleted );
	}

	// ClearDep Response s

	protected CFBamXMsgRspnClearDepRec getRspnClearDepRec() {
		if( rspnClearDepRec == null ) {
			rspnClearDepRec = new CFBamXMsgRspnClearDepRec( this );
		}
		return( rspnClearDepRec );
	}

	protected CFBamXMsgRspnClearDepCreated getRspnClearDepCreated() {
		if( rspnClearDepCreated == null ) {
			rspnClearDepCreated = new CFBamXMsgRspnClearDepCreated( this );
		}
		return( rspnClearDepCreated );
	}

	protected CFBamXMsgRspnClearDepReadSingle getRspnClearDepReadSingle() {
		if( rspnClearDepReadSingle == null ) {
			rspnClearDepReadSingle = new CFBamXMsgRspnClearDepReadSingle( this );
			rspnClearDepReadSingle.addElementHandler( "ClearDep", getRspnClearDepRec() );
			rspnClearDepReadSingle.addElementHandler( "ClearSubDep1", getRspnClearSubDep1Rec() );
			rspnClearDepReadSingle.addElementHandler( "ClearSubDep2", getRspnClearSubDep2Rec() );
			rspnClearDepReadSingle.addElementHandler( "ClearSubDep3", getRspnClearSubDep3Rec() );
			rspnClearDepReadSingle.addElementHandler( "ClearTopDep", getRspnClearTopDepRec() );
		}
		return( rspnClearDepReadSingle );
	}

	protected CFBamXMsgRspnClearDepReadList getRspnClearDepReadList() {
		if( rspnClearDepReadList == null ) {
			rspnClearDepReadList = new CFBamXMsgRspnClearDepReadList( this );
			rspnClearDepReadList.addElementHandler( "ClearDep", getRspnClearDepRec() );
			rspnClearDepReadList.addElementHandler( "ClearSubDep1", getRspnClearSubDep1Rec() );
			rspnClearDepReadList.addElementHandler( "ClearSubDep2", getRspnClearSubDep2Rec() );
			rspnClearDepReadList.addElementHandler( "ClearSubDep3", getRspnClearSubDep3Rec() );
			rspnClearDepReadList.addElementHandler( "ClearTopDep", getRspnClearTopDepRec() );
		}
		return( rspnClearDepReadList );
	}

	protected CFBamXMsgRspnClearDepLocked getRspnClearDepLocked() {
		if( rspnClearDepLocked == null ) {
			rspnClearDepLocked = new CFBamXMsgRspnClearDepLocked( this );
		}
		return( rspnClearDepLocked );
	}

	protected CFBamXMsgRspnClearDepUpdated getRspnClearDepUpdated() {
		if( rspnClearDepUpdated == null ) {
			rspnClearDepUpdated = new CFBamXMsgRspnClearDepUpdated( this );
		}
		return( rspnClearDepUpdated );
	}

	protected CFBamXMsgRspnClearDepDeleted getRspnClearDepDeleted() {
		if( rspnClearDepDeleted == null ) {
			rspnClearDepDeleted = new CFBamXMsgRspnClearDepDeleted( this );
		}
		return( rspnClearDepDeleted );
	}

	// ClearSubDep1 Response s

	protected CFBamXMsgRspnClearSubDep1Rec getRspnClearSubDep1Rec() {
		if( rspnClearSubDep1Rec == null ) {
			rspnClearSubDep1Rec = new CFBamXMsgRspnClearSubDep1Rec( this );
		}
		return( rspnClearSubDep1Rec );
	}

	protected CFBamXMsgRspnClearSubDep1Created getRspnClearSubDep1Created() {
		if( rspnClearSubDep1Created == null ) {
			rspnClearSubDep1Created = new CFBamXMsgRspnClearSubDep1Created( this );
		}
		return( rspnClearSubDep1Created );
	}

	protected CFBamXMsgRspnClearSubDep1ReadSingle getRspnClearSubDep1ReadSingle() {
		if( rspnClearSubDep1ReadSingle == null ) {
			rspnClearSubDep1ReadSingle = new CFBamXMsgRspnClearSubDep1ReadSingle( this );
			rspnClearSubDep1ReadSingle.addElementHandler( "ClearSubDep1", getRspnClearSubDep1Rec() );
		}
		return( rspnClearSubDep1ReadSingle );
	}

	protected CFBamXMsgRspnClearSubDep1ReadList getRspnClearSubDep1ReadList() {
		if( rspnClearSubDep1ReadList == null ) {
			rspnClearSubDep1ReadList = new CFBamXMsgRspnClearSubDep1ReadList( this );
			rspnClearSubDep1ReadList.addElementHandler( "ClearSubDep1", getRspnClearSubDep1Rec() );
		}
		return( rspnClearSubDep1ReadList );
	}

	protected CFBamXMsgRspnClearSubDep1Locked getRspnClearSubDep1Locked() {
		if( rspnClearSubDep1Locked == null ) {
			rspnClearSubDep1Locked = new CFBamXMsgRspnClearSubDep1Locked( this );
		}
		return( rspnClearSubDep1Locked );
	}

	protected CFBamXMsgRspnClearSubDep1Updated getRspnClearSubDep1Updated() {
		if( rspnClearSubDep1Updated == null ) {
			rspnClearSubDep1Updated = new CFBamXMsgRspnClearSubDep1Updated( this );
		}
		return( rspnClearSubDep1Updated );
	}

	protected CFBamXMsgRspnClearSubDep1Deleted getRspnClearSubDep1Deleted() {
		if( rspnClearSubDep1Deleted == null ) {
			rspnClearSubDep1Deleted = new CFBamXMsgRspnClearSubDep1Deleted( this );
		}
		return( rspnClearSubDep1Deleted );
	}

	// ClearSubDep2 Response s

	protected CFBamXMsgRspnClearSubDep2Rec getRspnClearSubDep2Rec() {
		if( rspnClearSubDep2Rec == null ) {
			rspnClearSubDep2Rec = new CFBamXMsgRspnClearSubDep2Rec( this );
		}
		return( rspnClearSubDep2Rec );
	}

	protected CFBamXMsgRspnClearSubDep2Created getRspnClearSubDep2Created() {
		if( rspnClearSubDep2Created == null ) {
			rspnClearSubDep2Created = new CFBamXMsgRspnClearSubDep2Created( this );
		}
		return( rspnClearSubDep2Created );
	}

	protected CFBamXMsgRspnClearSubDep2ReadSingle getRspnClearSubDep2ReadSingle() {
		if( rspnClearSubDep2ReadSingle == null ) {
			rspnClearSubDep2ReadSingle = new CFBamXMsgRspnClearSubDep2ReadSingle( this );
			rspnClearSubDep2ReadSingle.addElementHandler( "ClearSubDep2", getRspnClearSubDep2Rec() );
		}
		return( rspnClearSubDep2ReadSingle );
	}

	protected CFBamXMsgRspnClearSubDep2ReadList getRspnClearSubDep2ReadList() {
		if( rspnClearSubDep2ReadList == null ) {
			rspnClearSubDep2ReadList = new CFBamXMsgRspnClearSubDep2ReadList( this );
			rspnClearSubDep2ReadList.addElementHandler( "ClearSubDep2", getRspnClearSubDep2Rec() );
		}
		return( rspnClearSubDep2ReadList );
	}

	protected CFBamXMsgRspnClearSubDep2Locked getRspnClearSubDep2Locked() {
		if( rspnClearSubDep2Locked == null ) {
			rspnClearSubDep2Locked = new CFBamXMsgRspnClearSubDep2Locked( this );
		}
		return( rspnClearSubDep2Locked );
	}

	protected CFBamXMsgRspnClearSubDep2Updated getRspnClearSubDep2Updated() {
		if( rspnClearSubDep2Updated == null ) {
			rspnClearSubDep2Updated = new CFBamXMsgRspnClearSubDep2Updated( this );
		}
		return( rspnClearSubDep2Updated );
	}

	protected CFBamXMsgRspnClearSubDep2Deleted getRspnClearSubDep2Deleted() {
		if( rspnClearSubDep2Deleted == null ) {
			rspnClearSubDep2Deleted = new CFBamXMsgRspnClearSubDep2Deleted( this );
		}
		return( rspnClearSubDep2Deleted );
	}

	// ClearSubDep3 Response s

	protected CFBamXMsgRspnClearSubDep3Rec getRspnClearSubDep3Rec() {
		if( rspnClearSubDep3Rec == null ) {
			rspnClearSubDep3Rec = new CFBamXMsgRspnClearSubDep3Rec( this );
		}
		return( rspnClearSubDep3Rec );
	}

	protected CFBamXMsgRspnClearSubDep3Created getRspnClearSubDep3Created() {
		if( rspnClearSubDep3Created == null ) {
			rspnClearSubDep3Created = new CFBamXMsgRspnClearSubDep3Created( this );
		}
		return( rspnClearSubDep3Created );
	}

	protected CFBamXMsgRspnClearSubDep3ReadSingle getRspnClearSubDep3ReadSingle() {
		if( rspnClearSubDep3ReadSingle == null ) {
			rspnClearSubDep3ReadSingle = new CFBamXMsgRspnClearSubDep3ReadSingle( this );
			rspnClearSubDep3ReadSingle.addElementHandler( "ClearSubDep3", getRspnClearSubDep3Rec() );
		}
		return( rspnClearSubDep3ReadSingle );
	}

	protected CFBamXMsgRspnClearSubDep3ReadList getRspnClearSubDep3ReadList() {
		if( rspnClearSubDep3ReadList == null ) {
			rspnClearSubDep3ReadList = new CFBamXMsgRspnClearSubDep3ReadList( this );
			rspnClearSubDep3ReadList.addElementHandler( "ClearSubDep3", getRspnClearSubDep3Rec() );
		}
		return( rspnClearSubDep3ReadList );
	}

	protected CFBamXMsgRspnClearSubDep3Locked getRspnClearSubDep3Locked() {
		if( rspnClearSubDep3Locked == null ) {
			rspnClearSubDep3Locked = new CFBamXMsgRspnClearSubDep3Locked( this );
		}
		return( rspnClearSubDep3Locked );
	}

	protected CFBamXMsgRspnClearSubDep3Updated getRspnClearSubDep3Updated() {
		if( rspnClearSubDep3Updated == null ) {
			rspnClearSubDep3Updated = new CFBamXMsgRspnClearSubDep3Updated( this );
		}
		return( rspnClearSubDep3Updated );
	}

	protected CFBamXMsgRspnClearSubDep3Deleted getRspnClearSubDep3Deleted() {
		if( rspnClearSubDep3Deleted == null ) {
			rspnClearSubDep3Deleted = new CFBamXMsgRspnClearSubDep3Deleted( this );
		}
		return( rspnClearSubDep3Deleted );
	}

	// ClearTopDep Response s

	protected CFBamXMsgRspnClearTopDepRec getRspnClearTopDepRec() {
		if( rspnClearTopDepRec == null ) {
			rspnClearTopDepRec = new CFBamXMsgRspnClearTopDepRec( this );
		}
		return( rspnClearTopDepRec );
	}

	protected CFBamXMsgRspnClearTopDepCreated getRspnClearTopDepCreated() {
		if( rspnClearTopDepCreated == null ) {
			rspnClearTopDepCreated = new CFBamXMsgRspnClearTopDepCreated( this );
		}
		return( rspnClearTopDepCreated );
	}

	protected CFBamXMsgRspnClearTopDepReadSingle getRspnClearTopDepReadSingle() {
		if( rspnClearTopDepReadSingle == null ) {
			rspnClearTopDepReadSingle = new CFBamXMsgRspnClearTopDepReadSingle( this );
			rspnClearTopDepReadSingle.addElementHandler( "ClearTopDep", getRspnClearTopDepRec() );
		}
		return( rspnClearTopDepReadSingle );
	}

	protected CFBamXMsgRspnClearTopDepReadList getRspnClearTopDepReadList() {
		if( rspnClearTopDepReadList == null ) {
			rspnClearTopDepReadList = new CFBamXMsgRspnClearTopDepReadList( this );
			rspnClearTopDepReadList.addElementHandler( "ClearTopDep", getRspnClearTopDepRec() );
		}
		return( rspnClearTopDepReadList );
	}

	protected CFBamXMsgRspnClearTopDepLocked getRspnClearTopDepLocked() {
		if( rspnClearTopDepLocked == null ) {
			rspnClearTopDepLocked = new CFBamXMsgRspnClearTopDepLocked( this );
		}
		return( rspnClearTopDepLocked );
	}

	protected CFBamXMsgRspnClearTopDepUpdated getRspnClearTopDepUpdated() {
		if( rspnClearTopDepUpdated == null ) {
			rspnClearTopDepUpdated = new CFBamXMsgRspnClearTopDepUpdated( this );
		}
		return( rspnClearTopDepUpdated );
	}

	protected CFBamXMsgRspnClearTopDepDeleted getRspnClearTopDepDeleted() {
		if( rspnClearTopDepDeleted == null ) {
			rspnClearTopDepDeleted = new CFBamXMsgRspnClearTopDepDeleted( this );
		}
		return( rspnClearTopDepDeleted );
	}

	// Cluster Response s

	protected CFBamXMsgRspnClusterRec getRspnClusterRec() {
		if( rspnClusterRec == null ) {
			rspnClusterRec = new CFBamXMsgRspnClusterRec( this );
		}
		return( rspnClusterRec );
	}

	protected CFBamXMsgRspnClusterCreated getRspnClusterCreated() {
		if( rspnClusterCreated == null ) {
			rspnClusterCreated = new CFBamXMsgRspnClusterCreated( this );
		}
		return( rspnClusterCreated );
	}

	protected CFBamXMsgRspnClusterReadSingle getRspnClusterReadSingle() {
		if( rspnClusterReadSingle == null ) {
			rspnClusterReadSingle = new CFBamXMsgRspnClusterReadSingle( this );
			rspnClusterReadSingle.addElementHandler( "Cluster", getRspnClusterRec() );
		}
		return( rspnClusterReadSingle );
	}

	protected CFBamXMsgRspnClusterReadList getRspnClusterReadList() {
		if( rspnClusterReadList == null ) {
			rspnClusterReadList = new CFBamXMsgRspnClusterReadList( this );
			rspnClusterReadList.addElementHandler( "Cluster", getRspnClusterRec() );
		}
		return( rspnClusterReadList );
	}

	protected CFBamXMsgRspnClusterLocked getRspnClusterLocked() {
		if( rspnClusterLocked == null ) {
			rspnClusterLocked = new CFBamXMsgRspnClusterLocked( this );
		}
		return( rspnClusterLocked );
	}

	protected CFBamXMsgRspnClusterUpdated getRspnClusterUpdated() {
		if( rspnClusterUpdated == null ) {
			rspnClusterUpdated = new CFBamXMsgRspnClusterUpdated( this );
		}
		return( rspnClusterUpdated );
	}

	protected CFBamXMsgRspnClusterDeleted getRspnClusterDeleted() {
		if( rspnClusterDeleted == null ) {
			rspnClusterDeleted = new CFBamXMsgRspnClusterDeleted( this );
		}
		return( rspnClusterDeleted );
	}

	// DateCol Response s

	protected CFBamXMsgRspnDateColRec getRspnDateColRec() {
		if( rspnDateColRec == null ) {
			rspnDateColRec = new CFBamXMsgRspnDateColRec( this );
		}
		return( rspnDateColRec );
	}

	protected CFBamXMsgRspnDateColCreated getRspnDateColCreated() {
		if( rspnDateColCreated == null ) {
			rspnDateColCreated = new CFBamXMsgRspnDateColCreated( this );
		}
		return( rspnDateColCreated );
	}

	protected CFBamXMsgRspnDateColReadSingle getRspnDateColReadSingle() {
		if( rspnDateColReadSingle == null ) {
			rspnDateColReadSingle = new CFBamXMsgRspnDateColReadSingle( this );
			rspnDateColReadSingle.addElementHandler( "DateCol", getRspnDateColRec() );
		}
		return( rspnDateColReadSingle );
	}

	protected CFBamXMsgRspnDateColReadList getRspnDateColReadList() {
		if( rspnDateColReadList == null ) {
			rspnDateColReadList = new CFBamXMsgRspnDateColReadList( this );
			rspnDateColReadList.addElementHandler( "DateCol", getRspnDateColRec() );
		}
		return( rspnDateColReadList );
	}

	protected CFBamXMsgRspnDateColLocked getRspnDateColLocked() {
		if( rspnDateColLocked == null ) {
			rspnDateColLocked = new CFBamXMsgRspnDateColLocked( this );
		}
		return( rspnDateColLocked );
	}

	protected CFBamXMsgRspnDateColUpdated getRspnDateColUpdated() {
		if( rspnDateColUpdated == null ) {
			rspnDateColUpdated = new CFBamXMsgRspnDateColUpdated( this );
		}
		return( rspnDateColUpdated );
	}

	protected CFBamXMsgRspnDateColDeleted getRspnDateColDeleted() {
		if( rspnDateColDeleted == null ) {
			rspnDateColDeleted = new CFBamXMsgRspnDateColDeleted( this );
		}
		return( rspnDateColDeleted );
	}

	// DateDef Response s

	protected CFBamXMsgRspnDateDefRec getRspnDateDefRec() {
		if( rspnDateDefRec == null ) {
			rspnDateDefRec = new CFBamXMsgRspnDateDefRec( this );
		}
		return( rspnDateDefRec );
	}

	protected CFBamXMsgRspnDateDefCreated getRspnDateDefCreated() {
		if( rspnDateDefCreated == null ) {
			rspnDateDefCreated = new CFBamXMsgRspnDateDefCreated( this );
		}
		return( rspnDateDefCreated );
	}

	protected CFBamXMsgRspnDateDefReadSingle getRspnDateDefReadSingle() {
		if( rspnDateDefReadSingle == null ) {
			rspnDateDefReadSingle = new CFBamXMsgRspnDateDefReadSingle( this );
			rspnDateDefReadSingle.addElementHandler( "DateDef", getRspnDateDefRec() );
			rspnDateDefReadSingle.addElementHandler( "DateType", getRspnDateTypeRec() );
			rspnDateDefReadSingle.addElementHandler( "DateCol", getRspnDateColRec() );
		}
		return( rspnDateDefReadSingle );
	}

	protected CFBamXMsgRspnDateDefReadList getRspnDateDefReadList() {
		if( rspnDateDefReadList == null ) {
			rspnDateDefReadList = new CFBamXMsgRspnDateDefReadList( this );
			rspnDateDefReadList.addElementHandler( "DateDef", getRspnDateDefRec() );
			rspnDateDefReadList.addElementHandler( "DateType", getRspnDateTypeRec() );
			rspnDateDefReadList.addElementHandler( "DateCol", getRspnDateColRec() );
		}
		return( rspnDateDefReadList );
	}

	protected CFBamXMsgRspnDateDefLocked getRspnDateDefLocked() {
		if( rspnDateDefLocked == null ) {
			rspnDateDefLocked = new CFBamXMsgRspnDateDefLocked( this );
		}
		return( rspnDateDefLocked );
	}

	protected CFBamXMsgRspnDateDefUpdated getRspnDateDefUpdated() {
		if( rspnDateDefUpdated == null ) {
			rspnDateDefUpdated = new CFBamXMsgRspnDateDefUpdated( this );
		}
		return( rspnDateDefUpdated );
	}

	protected CFBamXMsgRspnDateDefDeleted getRspnDateDefDeleted() {
		if( rspnDateDefDeleted == null ) {
			rspnDateDefDeleted = new CFBamXMsgRspnDateDefDeleted( this );
		}
		return( rspnDateDefDeleted );
	}

	// DateType Response s

	protected CFBamXMsgRspnDateTypeRec getRspnDateTypeRec() {
		if( rspnDateTypeRec == null ) {
			rspnDateTypeRec = new CFBamXMsgRspnDateTypeRec( this );
		}
		return( rspnDateTypeRec );
	}

	protected CFBamXMsgRspnDateTypeCreated getRspnDateTypeCreated() {
		if( rspnDateTypeCreated == null ) {
			rspnDateTypeCreated = new CFBamXMsgRspnDateTypeCreated( this );
		}
		return( rspnDateTypeCreated );
	}

	protected CFBamXMsgRspnDateTypeReadSingle getRspnDateTypeReadSingle() {
		if( rspnDateTypeReadSingle == null ) {
			rspnDateTypeReadSingle = new CFBamXMsgRspnDateTypeReadSingle( this );
			rspnDateTypeReadSingle.addElementHandler( "DateType", getRspnDateTypeRec() );
		}
		return( rspnDateTypeReadSingle );
	}

	protected CFBamXMsgRspnDateTypeReadList getRspnDateTypeReadList() {
		if( rspnDateTypeReadList == null ) {
			rspnDateTypeReadList = new CFBamXMsgRspnDateTypeReadList( this );
			rspnDateTypeReadList.addElementHandler( "DateType", getRspnDateTypeRec() );
		}
		return( rspnDateTypeReadList );
	}

	protected CFBamXMsgRspnDateTypeLocked getRspnDateTypeLocked() {
		if( rspnDateTypeLocked == null ) {
			rspnDateTypeLocked = new CFBamXMsgRspnDateTypeLocked( this );
		}
		return( rspnDateTypeLocked );
	}

	protected CFBamXMsgRspnDateTypeUpdated getRspnDateTypeUpdated() {
		if( rspnDateTypeUpdated == null ) {
			rspnDateTypeUpdated = new CFBamXMsgRspnDateTypeUpdated( this );
		}
		return( rspnDateTypeUpdated );
	}

	protected CFBamXMsgRspnDateTypeDeleted getRspnDateTypeDeleted() {
		if( rspnDateTypeDeleted == null ) {
			rspnDateTypeDeleted = new CFBamXMsgRspnDateTypeDeleted( this );
		}
		return( rspnDateTypeDeleted );
	}

	// DelDep Response s

	protected CFBamXMsgRspnDelDepRec getRspnDelDepRec() {
		if( rspnDelDepRec == null ) {
			rspnDelDepRec = new CFBamXMsgRspnDelDepRec( this );
		}
		return( rspnDelDepRec );
	}

	protected CFBamXMsgRspnDelDepCreated getRspnDelDepCreated() {
		if( rspnDelDepCreated == null ) {
			rspnDelDepCreated = new CFBamXMsgRspnDelDepCreated( this );
		}
		return( rspnDelDepCreated );
	}

	protected CFBamXMsgRspnDelDepReadSingle getRspnDelDepReadSingle() {
		if( rspnDelDepReadSingle == null ) {
			rspnDelDepReadSingle = new CFBamXMsgRspnDelDepReadSingle( this );
			rspnDelDepReadSingle.addElementHandler( "DelDep", getRspnDelDepRec() );
			rspnDelDepReadSingle.addElementHandler( "DelSubDep1", getRspnDelSubDep1Rec() );
			rspnDelDepReadSingle.addElementHandler( "DelSubDep2", getRspnDelSubDep2Rec() );
			rspnDelDepReadSingle.addElementHandler( "DelSubDep3", getRspnDelSubDep3Rec() );
			rspnDelDepReadSingle.addElementHandler( "DelTopDep", getRspnDelTopDepRec() );
		}
		return( rspnDelDepReadSingle );
	}

	protected CFBamXMsgRspnDelDepReadList getRspnDelDepReadList() {
		if( rspnDelDepReadList == null ) {
			rspnDelDepReadList = new CFBamXMsgRspnDelDepReadList( this );
			rspnDelDepReadList.addElementHandler( "DelDep", getRspnDelDepRec() );
			rspnDelDepReadList.addElementHandler( "DelSubDep1", getRspnDelSubDep1Rec() );
			rspnDelDepReadList.addElementHandler( "DelSubDep2", getRspnDelSubDep2Rec() );
			rspnDelDepReadList.addElementHandler( "DelSubDep3", getRspnDelSubDep3Rec() );
			rspnDelDepReadList.addElementHandler( "DelTopDep", getRspnDelTopDepRec() );
		}
		return( rspnDelDepReadList );
	}

	protected CFBamXMsgRspnDelDepLocked getRspnDelDepLocked() {
		if( rspnDelDepLocked == null ) {
			rspnDelDepLocked = new CFBamXMsgRspnDelDepLocked( this );
		}
		return( rspnDelDepLocked );
	}

	protected CFBamXMsgRspnDelDepUpdated getRspnDelDepUpdated() {
		if( rspnDelDepUpdated == null ) {
			rspnDelDepUpdated = new CFBamXMsgRspnDelDepUpdated( this );
		}
		return( rspnDelDepUpdated );
	}

	protected CFBamXMsgRspnDelDepDeleted getRspnDelDepDeleted() {
		if( rspnDelDepDeleted == null ) {
			rspnDelDepDeleted = new CFBamXMsgRspnDelDepDeleted( this );
		}
		return( rspnDelDepDeleted );
	}

	// DelSubDep1 Response s

	protected CFBamXMsgRspnDelSubDep1Rec getRspnDelSubDep1Rec() {
		if( rspnDelSubDep1Rec == null ) {
			rspnDelSubDep1Rec = new CFBamXMsgRspnDelSubDep1Rec( this );
		}
		return( rspnDelSubDep1Rec );
	}

	protected CFBamXMsgRspnDelSubDep1Created getRspnDelSubDep1Created() {
		if( rspnDelSubDep1Created == null ) {
			rspnDelSubDep1Created = new CFBamXMsgRspnDelSubDep1Created( this );
		}
		return( rspnDelSubDep1Created );
	}

	protected CFBamXMsgRspnDelSubDep1ReadSingle getRspnDelSubDep1ReadSingle() {
		if( rspnDelSubDep1ReadSingle == null ) {
			rspnDelSubDep1ReadSingle = new CFBamXMsgRspnDelSubDep1ReadSingle( this );
			rspnDelSubDep1ReadSingle.addElementHandler( "DelSubDep1", getRspnDelSubDep1Rec() );
		}
		return( rspnDelSubDep1ReadSingle );
	}

	protected CFBamXMsgRspnDelSubDep1ReadList getRspnDelSubDep1ReadList() {
		if( rspnDelSubDep1ReadList == null ) {
			rspnDelSubDep1ReadList = new CFBamXMsgRspnDelSubDep1ReadList( this );
			rspnDelSubDep1ReadList.addElementHandler( "DelSubDep1", getRspnDelSubDep1Rec() );
		}
		return( rspnDelSubDep1ReadList );
	}

	protected CFBamXMsgRspnDelSubDep1Locked getRspnDelSubDep1Locked() {
		if( rspnDelSubDep1Locked == null ) {
			rspnDelSubDep1Locked = new CFBamXMsgRspnDelSubDep1Locked( this );
		}
		return( rspnDelSubDep1Locked );
	}

	protected CFBamXMsgRspnDelSubDep1Updated getRspnDelSubDep1Updated() {
		if( rspnDelSubDep1Updated == null ) {
			rspnDelSubDep1Updated = new CFBamXMsgRspnDelSubDep1Updated( this );
		}
		return( rspnDelSubDep1Updated );
	}

	protected CFBamXMsgRspnDelSubDep1Deleted getRspnDelSubDep1Deleted() {
		if( rspnDelSubDep1Deleted == null ) {
			rspnDelSubDep1Deleted = new CFBamXMsgRspnDelSubDep1Deleted( this );
		}
		return( rspnDelSubDep1Deleted );
	}

	// DelSubDep2 Response s

	protected CFBamXMsgRspnDelSubDep2Rec getRspnDelSubDep2Rec() {
		if( rspnDelSubDep2Rec == null ) {
			rspnDelSubDep2Rec = new CFBamXMsgRspnDelSubDep2Rec( this );
		}
		return( rspnDelSubDep2Rec );
	}

	protected CFBamXMsgRspnDelSubDep2Created getRspnDelSubDep2Created() {
		if( rspnDelSubDep2Created == null ) {
			rspnDelSubDep2Created = new CFBamXMsgRspnDelSubDep2Created( this );
		}
		return( rspnDelSubDep2Created );
	}

	protected CFBamXMsgRspnDelSubDep2ReadSingle getRspnDelSubDep2ReadSingle() {
		if( rspnDelSubDep2ReadSingle == null ) {
			rspnDelSubDep2ReadSingle = new CFBamXMsgRspnDelSubDep2ReadSingle( this );
			rspnDelSubDep2ReadSingle.addElementHandler( "DelSubDep2", getRspnDelSubDep2Rec() );
		}
		return( rspnDelSubDep2ReadSingle );
	}

	protected CFBamXMsgRspnDelSubDep2ReadList getRspnDelSubDep2ReadList() {
		if( rspnDelSubDep2ReadList == null ) {
			rspnDelSubDep2ReadList = new CFBamXMsgRspnDelSubDep2ReadList( this );
			rspnDelSubDep2ReadList.addElementHandler( "DelSubDep2", getRspnDelSubDep2Rec() );
		}
		return( rspnDelSubDep2ReadList );
	}

	protected CFBamXMsgRspnDelSubDep2Locked getRspnDelSubDep2Locked() {
		if( rspnDelSubDep2Locked == null ) {
			rspnDelSubDep2Locked = new CFBamXMsgRspnDelSubDep2Locked( this );
		}
		return( rspnDelSubDep2Locked );
	}

	protected CFBamXMsgRspnDelSubDep2Updated getRspnDelSubDep2Updated() {
		if( rspnDelSubDep2Updated == null ) {
			rspnDelSubDep2Updated = new CFBamXMsgRspnDelSubDep2Updated( this );
		}
		return( rspnDelSubDep2Updated );
	}

	protected CFBamXMsgRspnDelSubDep2Deleted getRspnDelSubDep2Deleted() {
		if( rspnDelSubDep2Deleted == null ) {
			rspnDelSubDep2Deleted = new CFBamXMsgRspnDelSubDep2Deleted( this );
		}
		return( rspnDelSubDep2Deleted );
	}

	// DelSubDep3 Response s

	protected CFBamXMsgRspnDelSubDep3Rec getRspnDelSubDep3Rec() {
		if( rspnDelSubDep3Rec == null ) {
			rspnDelSubDep3Rec = new CFBamXMsgRspnDelSubDep3Rec( this );
		}
		return( rspnDelSubDep3Rec );
	}

	protected CFBamXMsgRspnDelSubDep3Created getRspnDelSubDep3Created() {
		if( rspnDelSubDep3Created == null ) {
			rspnDelSubDep3Created = new CFBamXMsgRspnDelSubDep3Created( this );
		}
		return( rspnDelSubDep3Created );
	}

	protected CFBamXMsgRspnDelSubDep3ReadSingle getRspnDelSubDep3ReadSingle() {
		if( rspnDelSubDep3ReadSingle == null ) {
			rspnDelSubDep3ReadSingle = new CFBamXMsgRspnDelSubDep3ReadSingle( this );
			rspnDelSubDep3ReadSingle.addElementHandler( "DelSubDep3", getRspnDelSubDep3Rec() );
		}
		return( rspnDelSubDep3ReadSingle );
	}

	protected CFBamXMsgRspnDelSubDep3ReadList getRspnDelSubDep3ReadList() {
		if( rspnDelSubDep3ReadList == null ) {
			rspnDelSubDep3ReadList = new CFBamXMsgRspnDelSubDep3ReadList( this );
			rspnDelSubDep3ReadList.addElementHandler( "DelSubDep3", getRspnDelSubDep3Rec() );
		}
		return( rspnDelSubDep3ReadList );
	}

	protected CFBamXMsgRspnDelSubDep3Locked getRspnDelSubDep3Locked() {
		if( rspnDelSubDep3Locked == null ) {
			rspnDelSubDep3Locked = new CFBamXMsgRspnDelSubDep3Locked( this );
		}
		return( rspnDelSubDep3Locked );
	}

	protected CFBamXMsgRspnDelSubDep3Updated getRspnDelSubDep3Updated() {
		if( rspnDelSubDep3Updated == null ) {
			rspnDelSubDep3Updated = new CFBamXMsgRspnDelSubDep3Updated( this );
		}
		return( rspnDelSubDep3Updated );
	}

	protected CFBamXMsgRspnDelSubDep3Deleted getRspnDelSubDep3Deleted() {
		if( rspnDelSubDep3Deleted == null ) {
			rspnDelSubDep3Deleted = new CFBamXMsgRspnDelSubDep3Deleted( this );
		}
		return( rspnDelSubDep3Deleted );
	}

	// DelTopDep Response s

	protected CFBamXMsgRspnDelTopDepRec getRspnDelTopDepRec() {
		if( rspnDelTopDepRec == null ) {
			rspnDelTopDepRec = new CFBamXMsgRspnDelTopDepRec( this );
		}
		return( rspnDelTopDepRec );
	}

	protected CFBamXMsgRspnDelTopDepCreated getRspnDelTopDepCreated() {
		if( rspnDelTopDepCreated == null ) {
			rspnDelTopDepCreated = new CFBamXMsgRspnDelTopDepCreated( this );
		}
		return( rspnDelTopDepCreated );
	}

	protected CFBamXMsgRspnDelTopDepReadSingle getRspnDelTopDepReadSingle() {
		if( rspnDelTopDepReadSingle == null ) {
			rspnDelTopDepReadSingle = new CFBamXMsgRspnDelTopDepReadSingle( this );
			rspnDelTopDepReadSingle.addElementHandler( "DelTopDep", getRspnDelTopDepRec() );
		}
		return( rspnDelTopDepReadSingle );
	}

	protected CFBamXMsgRspnDelTopDepReadList getRspnDelTopDepReadList() {
		if( rspnDelTopDepReadList == null ) {
			rspnDelTopDepReadList = new CFBamXMsgRspnDelTopDepReadList( this );
			rspnDelTopDepReadList.addElementHandler( "DelTopDep", getRspnDelTopDepRec() );
		}
		return( rspnDelTopDepReadList );
	}

	protected CFBamXMsgRspnDelTopDepLocked getRspnDelTopDepLocked() {
		if( rspnDelTopDepLocked == null ) {
			rspnDelTopDepLocked = new CFBamXMsgRspnDelTopDepLocked( this );
		}
		return( rspnDelTopDepLocked );
	}

	protected CFBamXMsgRspnDelTopDepUpdated getRspnDelTopDepUpdated() {
		if( rspnDelTopDepUpdated == null ) {
			rspnDelTopDepUpdated = new CFBamXMsgRspnDelTopDepUpdated( this );
		}
		return( rspnDelTopDepUpdated );
	}

	protected CFBamXMsgRspnDelTopDepDeleted getRspnDelTopDepDeleted() {
		if( rspnDelTopDepDeleted == null ) {
			rspnDelTopDepDeleted = new CFBamXMsgRspnDelTopDepDeleted( this );
		}
		return( rspnDelTopDepDeleted );
	}

	// DoubleCol Response s

	protected CFBamXMsgRspnDoubleColRec getRspnDoubleColRec() {
		if( rspnDoubleColRec == null ) {
			rspnDoubleColRec = new CFBamXMsgRspnDoubleColRec( this );
		}
		return( rspnDoubleColRec );
	}

	protected CFBamXMsgRspnDoubleColCreated getRspnDoubleColCreated() {
		if( rspnDoubleColCreated == null ) {
			rspnDoubleColCreated = new CFBamXMsgRspnDoubleColCreated( this );
		}
		return( rspnDoubleColCreated );
	}

	protected CFBamXMsgRspnDoubleColReadSingle getRspnDoubleColReadSingle() {
		if( rspnDoubleColReadSingle == null ) {
			rspnDoubleColReadSingle = new CFBamXMsgRspnDoubleColReadSingle( this );
			rspnDoubleColReadSingle.addElementHandler( "DoubleCol", getRspnDoubleColRec() );
		}
		return( rspnDoubleColReadSingle );
	}

	protected CFBamXMsgRspnDoubleColReadList getRspnDoubleColReadList() {
		if( rspnDoubleColReadList == null ) {
			rspnDoubleColReadList = new CFBamXMsgRspnDoubleColReadList( this );
			rspnDoubleColReadList.addElementHandler( "DoubleCol", getRspnDoubleColRec() );
		}
		return( rspnDoubleColReadList );
	}

	protected CFBamXMsgRspnDoubleColLocked getRspnDoubleColLocked() {
		if( rspnDoubleColLocked == null ) {
			rspnDoubleColLocked = new CFBamXMsgRspnDoubleColLocked( this );
		}
		return( rspnDoubleColLocked );
	}

	protected CFBamXMsgRspnDoubleColUpdated getRspnDoubleColUpdated() {
		if( rspnDoubleColUpdated == null ) {
			rspnDoubleColUpdated = new CFBamXMsgRspnDoubleColUpdated( this );
		}
		return( rspnDoubleColUpdated );
	}

	protected CFBamXMsgRspnDoubleColDeleted getRspnDoubleColDeleted() {
		if( rspnDoubleColDeleted == null ) {
			rspnDoubleColDeleted = new CFBamXMsgRspnDoubleColDeleted( this );
		}
		return( rspnDoubleColDeleted );
	}

	// DoubleDef Response s

	protected CFBamXMsgRspnDoubleDefRec getRspnDoubleDefRec() {
		if( rspnDoubleDefRec == null ) {
			rspnDoubleDefRec = new CFBamXMsgRspnDoubleDefRec( this );
		}
		return( rspnDoubleDefRec );
	}

	protected CFBamXMsgRspnDoubleDefCreated getRspnDoubleDefCreated() {
		if( rspnDoubleDefCreated == null ) {
			rspnDoubleDefCreated = new CFBamXMsgRspnDoubleDefCreated( this );
		}
		return( rspnDoubleDefCreated );
	}

	protected CFBamXMsgRspnDoubleDefReadSingle getRspnDoubleDefReadSingle() {
		if( rspnDoubleDefReadSingle == null ) {
			rspnDoubleDefReadSingle = new CFBamXMsgRspnDoubleDefReadSingle( this );
			rspnDoubleDefReadSingle.addElementHandler( "DoubleDef", getRspnDoubleDefRec() );
			rspnDoubleDefReadSingle.addElementHandler( "DoubleType", getRspnDoubleTypeRec() );
			rspnDoubleDefReadSingle.addElementHandler( "DoubleCol", getRspnDoubleColRec() );
		}
		return( rspnDoubleDefReadSingle );
	}

	protected CFBamXMsgRspnDoubleDefReadList getRspnDoubleDefReadList() {
		if( rspnDoubleDefReadList == null ) {
			rspnDoubleDefReadList = new CFBamXMsgRspnDoubleDefReadList( this );
			rspnDoubleDefReadList.addElementHandler( "DoubleDef", getRspnDoubleDefRec() );
			rspnDoubleDefReadList.addElementHandler( "DoubleType", getRspnDoubleTypeRec() );
			rspnDoubleDefReadList.addElementHandler( "DoubleCol", getRspnDoubleColRec() );
		}
		return( rspnDoubleDefReadList );
	}

	protected CFBamXMsgRspnDoubleDefLocked getRspnDoubleDefLocked() {
		if( rspnDoubleDefLocked == null ) {
			rspnDoubleDefLocked = new CFBamXMsgRspnDoubleDefLocked( this );
		}
		return( rspnDoubleDefLocked );
	}

	protected CFBamXMsgRspnDoubleDefUpdated getRspnDoubleDefUpdated() {
		if( rspnDoubleDefUpdated == null ) {
			rspnDoubleDefUpdated = new CFBamXMsgRspnDoubleDefUpdated( this );
		}
		return( rspnDoubleDefUpdated );
	}

	protected CFBamXMsgRspnDoubleDefDeleted getRspnDoubleDefDeleted() {
		if( rspnDoubleDefDeleted == null ) {
			rspnDoubleDefDeleted = new CFBamXMsgRspnDoubleDefDeleted( this );
		}
		return( rspnDoubleDefDeleted );
	}

	// DoubleType Response s

	protected CFBamXMsgRspnDoubleTypeRec getRspnDoubleTypeRec() {
		if( rspnDoubleTypeRec == null ) {
			rspnDoubleTypeRec = new CFBamXMsgRspnDoubleTypeRec( this );
		}
		return( rspnDoubleTypeRec );
	}

	protected CFBamXMsgRspnDoubleTypeCreated getRspnDoubleTypeCreated() {
		if( rspnDoubleTypeCreated == null ) {
			rspnDoubleTypeCreated = new CFBamXMsgRspnDoubleTypeCreated( this );
		}
		return( rspnDoubleTypeCreated );
	}

	protected CFBamXMsgRspnDoubleTypeReadSingle getRspnDoubleTypeReadSingle() {
		if( rspnDoubleTypeReadSingle == null ) {
			rspnDoubleTypeReadSingle = new CFBamXMsgRspnDoubleTypeReadSingle( this );
			rspnDoubleTypeReadSingle.addElementHandler( "DoubleType", getRspnDoubleTypeRec() );
		}
		return( rspnDoubleTypeReadSingle );
	}

	protected CFBamXMsgRspnDoubleTypeReadList getRspnDoubleTypeReadList() {
		if( rspnDoubleTypeReadList == null ) {
			rspnDoubleTypeReadList = new CFBamXMsgRspnDoubleTypeReadList( this );
			rspnDoubleTypeReadList.addElementHandler( "DoubleType", getRspnDoubleTypeRec() );
		}
		return( rspnDoubleTypeReadList );
	}

	protected CFBamXMsgRspnDoubleTypeLocked getRspnDoubleTypeLocked() {
		if( rspnDoubleTypeLocked == null ) {
			rspnDoubleTypeLocked = new CFBamXMsgRspnDoubleTypeLocked( this );
		}
		return( rspnDoubleTypeLocked );
	}

	protected CFBamXMsgRspnDoubleTypeUpdated getRspnDoubleTypeUpdated() {
		if( rspnDoubleTypeUpdated == null ) {
			rspnDoubleTypeUpdated = new CFBamXMsgRspnDoubleTypeUpdated( this );
		}
		return( rspnDoubleTypeUpdated );
	}

	protected CFBamXMsgRspnDoubleTypeDeleted getRspnDoubleTypeDeleted() {
		if( rspnDoubleTypeDeleted == null ) {
			rspnDoubleTypeDeleted = new CFBamXMsgRspnDoubleTypeDeleted( this );
		}
		return( rspnDoubleTypeDeleted );
	}

	// EnumDef Response s

	protected CFBamXMsgRspnEnumDefRec getRspnEnumDefRec() {
		if( rspnEnumDefRec == null ) {
			rspnEnumDefRec = new CFBamXMsgRspnEnumDefRec( this );
		}
		return( rspnEnumDefRec );
	}

	protected CFBamXMsgRspnEnumDefCreated getRspnEnumDefCreated() {
		if( rspnEnumDefCreated == null ) {
			rspnEnumDefCreated = new CFBamXMsgRspnEnumDefCreated( this );
		}
		return( rspnEnumDefCreated );
	}

	protected CFBamXMsgRspnEnumDefReadSingle getRspnEnumDefReadSingle() {
		if( rspnEnumDefReadSingle == null ) {
			rspnEnumDefReadSingle = new CFBamXMsgRspnEnumDefReadSingle( this );
			rspnEnumDefReadSingle.addElementHandler( "EnumDef", getRspnEnumDefRec() );
			rspnEnumDefReadSingle.addElementHandler( "EnumType", getRspnEnumTypeRec() );
		}
		return( rspnEnumDefReadSingle );
	}

	protected CFBamXMsgRspnEnumDefReadList getRspnEnumDefReadList() {
		if( rspnEnumDefReadList == null ) {
			rspnEnumDefReadList = new CFBamXMsgRspnEnumDefReadList( this );
			rspnEnumDefReadList.addElementHandler( "EnumDef", getRspnEnumDefRec() );
			rspnEnumDefReadList.addElementHandler( "EnumType", getRspnEnumTypeRec() );
		}
		return( rspnEnumDefReadList );
	}

	protected CFBamXMsgRspnEnumDefLocked getRspnEnumDefLocked() {
		if( rspnEnumDefLocked == null ) {
			rspnEnumDefLocked = new CFBamXMsgRspnEnumDefLocked( this );
		}
		return( rspnEnumDefLocked );
	}

	protected CFBamXMsgRspnEnumDefUpdated getRspnEnumDefUpdated() {
		if( rspnEnumDefUpdated == null ) {
			rspnEnumDefUpdated = new CFBamXMsgRspnEnumDefUpdated( this );
		}
		return( rspnEnumDefUpdated );
	}

	protected CFBamXMsgRspnEnumDefDeleted getRspnEnumDefDeleted() {
		if( rspnEnumDefDeleted == null ) {
			rspnEnumDefDeleted = new CFBamXMsgRspnEnumDefDeleted( this );
		}
		return( rspnEnumDefDeleted );
	}

	// EnumTag Response s

	protected CFBamXMsgRspnEnumTagRec getRspnEnumTagRec() {
		if( rspnEnumTagRec == null ) {
			rspnEnumTagRec = new CFBamXMsgRspnEnumTagRec( this );
		}
		return( rspnEnumTagRec );
	}

	protected CFBamXMsgRspnEnumTagCreated getRspnEnumTagCreated() {
		if( rspnEnumTagCreated == null ) {
			rspnEnumTagCreated = new CFBamXMsgRspnEnumTagCreated( this );
		}
		return( rspnEnumTagCreated );
	}

	protected CFBamXMsgRspnEnumTagReadSingle getRspnEnumTagReadSingle() {
		if( rspnEnumTagReadSingle == null ) {
			rspnEnumTagReadSingle = new CFBamXMsgRspnEnumTagReadSingle( this );
			rspnEnumTagReadSingle.addElementHandler( "EnumTag", getRspnEnumTagRec() );
		}
		return( rspnEnumTagReadSingle );
	}

	protected CFBamXMsgRspnEnumTagReadList getRspnEnumTagReadList() {
		if( rspnEnumTagReadList == null ) {
			rspnEnumTagReadList = new CFBamXMsgRspnEnumTagReadList( this );
			rspnEnumTagReadList.addElementHandler( "EnumTag", getRspnEnumTagRec() );
		}
		return( rspnEnumTagReadList );
	}

	protected CFBamXMsgRspnEnumTagLocked getRspnEnumTagLocked() {
		if( rspnEnumTagLocked == null ) {
			rspnEnumTagLocked = new CFBamXMsgRspnEnumTagLocked( this );
		}
		return( rspnEnumTagLocked );
	}

	protected CFBamXMsgRspnEnumTagUpdated getRspnEnumTagUpdated() {
		if( rspnEnumTagUpdated == null ) {
			rspnEnumTagUpdated = new CFBamXMsgRspnEnumTagUpdated( this );
		}
		return( rspnEnumTagUpdated );
	}

	protected CFBamXMsgRspnEnumTagDeleted getRspnEnumTagDeleted() {
		if( rspnEnumTagDeleted == null ) {
			rspnEnumTagDeleted = new CFBamXMsgRspnEnumTagDeleted( this );
		}
		return( rspnEnumTagDeleted );
	}

	// EnumType Response s

	protected CFBamXMsgRspnEnumTypeRec getRspnEnumTypeRec() {
		if( rspnEnumTypeRec == null ) {
			rspnEnumTypeRec = new CFBamXMsgRspnEnumTypeRec( this );
		}
		return( rspnEnumTypeRec );
	}

	protected CFBamXMsgRspnEnumTypeCreated getRspnEnumTypeCreated() {
		if( rspnEnumTypeCreated == null ) {
			rspnEnumTypeCreated = new CFBamXMsgRspnEnumTypeCreated( this );
		}
		return( rspnEnumTypeCreated );
	}

	protected CFBamXMsgRspnEnumTypeReadSingle getRspnEnumTypeReadSingle() {
		if( rspnEnumTypeReadSingle == null ) {
			rspnEnumTypeReadSingle = new CFBamXMsgRspnEnumTypeReadSingle( this );
			rspnEnumTypeReadSingle.addElementHandler( "EnumType", getRspnEnumTypeRec() );
		}
		return( rspnEnumTypeReadSingle );
	}

	protected CFBamXMsgRspnEnumTypeReadList getRspnEnumTypeReadList() {
		if( rspnEnumTypeReadList == null ) {
			rspnEnumTypeReadList = new CFBamXMsgRspnEnumTypeReadList( this );
			rspnEnumTypeReadList.addElementHandler( "EnumType", getRspnEnumTypeRec() );
		}
		return( rspnEnumTypeReadList );
	}

	protected CFBamXMsgRspnEnumTypeLocked getRspnEnumTypeLocked() {
		if( rspnEnumTypeLocked == null ) {
			rspnEnumTypeLocked = new CFBamXMsgRspnEnumTypeLocked( this );
		}
		return( rspnEnumTypeLocked );
	}

	protected CFBamXMsgRspnEnumTypeUpdated getRspnEnumTypeUpdated() {
		if( rspnEnumTypeUpdated == null ) {
			rspnEnumTypeUpdated = new CFBamXMsgRspnEnumTypeUpdated( this );
		}
		return( rspnEnumTypeUpdated );
	}

	protected CFBamXMsgRspnEnumTypeDeleted getRspnEnumTypeDeleted() {
		if( rspnEnumTypeDeleted == null ) {
			rspnEnumTypeDeleted = new CFBamXMsgRspnEnumTypeDeleted( this );
		}
		return( rspnEnumTypeDeleted );
	}

	// FloatCol Response s

	protected CFBamXMsgRspnFloatColRec getRspnFloatColRec() {
		if( rspnFloatColRec == null ) {
			rspnFloatColRec = new CFBamXMsgRspnFloatColRec( this );
		}
		return( rspnFloatColRec );
	}

	protected CFBamXMsgRspnFloatColCreated getRspnFloatColCreated() {
		if( rspnFloatColCreated == null ) {
			rspnFloatColCreated = new CFBamXMsgRspnFloatColCreated( this );
		}
		return( rspnFloatColCreated );
	}

	protected CFBamXMsgRspnFloatColReadSingle getRspnFloatColReadSingle() {
		if( rspnFloatColReadSingle == null ) {
			rspnFloatColReadSingle = new CFBamXMsgRspnFloatColReadSingle( this );
			rspnFloatColReadSingle.addElementHandler( "FloatCol", getRspnFloatColRec() );
		}
		return( rspnFloatColReadSingle );
	}

	protected CFBamXMsgRspnFloatColReadList getRspnFloatColReadList() {
		if( rspnFloatColReadList == null ) {
			rspnFloatColReadList = new CFBamXMsgRspnFloatColReadList( this );
			rspnFloatColReadList.addElementHandler( "FloatCol", getRspnFloatColRec() );
		}
		return( rspnFloatColReadList );
	}

	protected CFBamXMsgRspnFloatColLocked getRspnFloatColLocked() {
		if( rspnFloatColLocked == null ) {
			rspnFloatColLocked = new CFBamXMsgRspnFloatColLocked( this );
		}
		return( rspnFloatColLocked );
	}

	protected CFBamXMsgRspnFloatColUpdated getRspnFloatColUpdated() {
		if( rspnFloatColUpdated == null ) {
			rspnFloatColUpdated = new CFBamXMsgRspnFloatColUpdated( this );
		}
		return( rspnFloatColUpdated );
	}

	protected CFBamXMsgRspnFloatColDeleted getRspnFloatColDeleted() {
		if( rspnFloatColDeleted == null ) {
			rspnFloatColDeleted = new CFBamXMsgRspnFloatColDeleted( this );
		}
		return( rspnFloatColDeleted );
	}

	// FloatDef Response s

	protected CFBamXMsgRspnFloatDefRec getRspnFloatDefRec() {
		if( rspnFloatDefRec == null ) {
			rspnFloatDefRec = new CFBamXMsgRspnFloatDefRec( this );
		}
		return( rspnFloatDefRec );
	}

	protected CFBamXMsgRspnFloatDefCreated getRspnFloatDefCreated() {
		if( rspnFloatDefCreated == null ) {
			rspnFloatDefCreated = new CFBamXMsgRspnFloatDefCreated( this );
		}
		return( rspnFloatDefCreated );
	}

	protected CFBamXMsgRspnFloatDefReadSingle getRspnFloatDefReadSingle() {
		if( rspnFloatDefReadSingle == null ) {
			rspnFloatDefReadSingle = new CFBamXMsgRspnFloatDefReadSingle( this );
			rspnFloatDefReadSingle.addElementHandler( "FloatDef", getRspnFloatDefRec() );
			rspnFloatDefReadSingle.addElementHandler( "FloatType", getRspnFloatTypeRec() );
			rspnFloatDefReadSingle.addElementHandler( "FloatCol", getRspnFloatColRec() );
		}
		return( rspnFloatDefReadSingle );
	}

	protected CFBamXMsgRspnFloatDefReadList getRspnFloatDefReadList() {
		if( rspnFloatDefReadList == null ) {
			rspnFloatDefReadList = new CFBamXMsgRspnFloatDefReadList( this );
			rspnFloatDefReadList.addElementHandler( "FloatDef", getRspnFloatDefRec() );
			rspnFloatDefReadList.addElementHandler( "FloatType", getRspnFloatTypeRec() );
			rspnFloatDefReadList.addElementHandler( "FloatCol", getRspnFloatColRec() );
		}
		return( rspnFloatDefReadList );
	}

	protected CFBamXMsgRspnFloatDefLocked getRspnFloatDefLocked() {
		if( rspnFloatDefLocked == null ) {
			rspnFloatDefLocked = new CFBamXMsgRspnFloatDefLocked( this );
		}
		return( rspnFloatDefLocked );
	}

	protected CFBamXMsgRspnFloatDefUpdated getRspnFloatDefUpdated() {
		if( rspnFloatDefUpdated == null ) {
			rspnFloatDefUpdated = new CFBamXMsgRspnFloatDefUpdated( this );
		}
		return( rspnFloatDefUpdated );
	}

	protected CFBamXMsgRspnFloatDefDeleted getRspnFloatDefDeleted() {
		if( rspnFloatDefDeleted == null ) {
			rspnFloatDefDeleted = new CFBamXMsgRspnFloatDefDeleted( this );
		}
		return( rspnFloatDefDeleted );
	}

	// FloatType Response s

	protected CFBamXMsgRspnFloatTypeRec getRspnFloatTypeRec() {
		if( rspnFloatTypeRec == null ) {
			rspnFloatTypeRec = new CFBamXMsgRspnFloatTypeRec( this );
		}
		return( rspnFloatTypeRec );
	}

	protected CFBamXMsgRspnFloatTypeCreated getRspnFloatTypeCreated() {
		if( rspnFloatTypeCreated == null ) {
			rspnFloatTypeCreated = new CFBamXMsgRspnFloatTypeCreated( this );
		}
		return( rspnFloatTypeCreated );
	}

	protected CFBamXMsgRspnFloatTypeReadSingle getRspnFloatTypeReadSingle() {
		if( rspnFloatTypeReadSingle == null ) {
			rspnFloatTypeReadSingle = new CFBamXMsgRspnFloatTypeReadSingle( this );
			rspnFloatTypeReadSingle.addElementHandler( "FloatType", getRspnFloatTypeRec() );
		}
		return( rspnFloatTypeReadSingle );
	}

	protected CFBamXMsgRspnFloatTypeReadList getRspnFloatTypeReadList() {
		if( rspnFloatTypeReadList == null ) {
			rspnFloatTypeReadList = new CFBamXMsgRspnFloatTypeReadList( this );
			rspnFloatTypeReadList.addElementHandler( "FloatType", getRspnFloatTypeRec() );
		}
		return( rspnFloatTypeReadList );
	}

	protected CFBamXMsgRspnFloatTypeLocked getRspnFloatTypeLocked() {
		if( rspnFloatTypeLocked == null ) {
			rspnFloatTypeLocked = new CFBamXMsgRspnFloatTypeLocked( this );
		}
		return( rspnFloatTypeLocked );
	}

	protected CFBamXMsgRspnFloatTypeUpdated getRspnFloatTypeUpdated() {
		if( rspnFloatTypeUpdated == null ) {
			rspnFloatTypeUpdated = new CFBamXMsgRspnFloatTypeUpdated( this );
		}
		return( rspnFloatTypeUpdated );
	}

	protected CFBamXMsgRspnFloatTypeDeleted getRspnFloatTypeDeleted() {
		if( rspnFloatTypeDeleted == null ) {
			rspnFloatTypeDeleted = new CFBamXMsgRspnFloatTypeDeleted( this );
		}
		return( rspnFloatTypeDeleted );
	}

	// HostNode Response s

	protected CFBamXMsgRspnHostNodeRec getRspnHostNodeRec() {
		if( rspnHostNodeRec == null ) {
			rspnHostNodeRec = new CFBamXMsgRspnHostNodeRec( this );
		}
		return( rspnHostNodeRec );
	}

	protected CFBamXMsgRspnHostNodeCreated getRspnHostNodeCreated() {
		if( rspnHostNodeCreated == null ) {
			rspnHostNodeCreated = new CFBamXMsgRspnHostNodeCreated( this );
		}
		return( rspnHostNodeCreated );
	}

	protected CFBamXMsgRspnHostNodeReadSingle getRspnHostNodeReadSingle() {
		if( rspnHostNodeReadSingle == null ) {
			rspnHostNodeReadSingle = new CFBamXMsgRspnHostNodeReadSingle( this );
			rspnHostNodeReadSingle.addElementHandler( "HostNode", getRspnHostNodeRec() );
		}
		return( rspnHostNodeReadSingle );
	}

	protected CFBamXMsgRspnHostNodeReadList getRspnHostNodeReadList() {
		if( rspnHostNodeReadList == null ) {
			rspnHostNodeReadList = new CFBamXMsgRspnHostNodeReadList( this );
			rspnHostNodeReadList.addElementHandler( "HostNode", getRspnHostNodeRec() );
		}
		return( rspnHostNodeReadList );
	}

	protected CFBamXMsgRspnHostNodeLocked getRspnHostNodeLocked() {
		if( rspnHostNodeLocked == null ) {
			rspnHostNodeLocked = new CFBamXMsgRspnHostNodeLocked( this );
		}
		return( rspnHostNodeLocked );
	}

	protected CFBamXMsgRspnHostNodeUpdated getRspnHostNodeUpdated() {
		if( rspnHostNodeUpdated == null ) {
			rspnHostNodeUpdated = new CFBamXMsgRspnHostNodeUpdated( this );
		}
		return( rspnHostNodeUpdated );
	}

	protected CFBamXMsgRspnHostNodeDeleted getRspnHostNodeDeleted() {
		if( rspnHostNodeDeleted == null ) {
			rspnHostNodeDeleted = new CFBamXMsgRspnHostNodeDeleted( this );
		}
		return( rspnHostNodeDeleted );
	}

	// ISOCcy Response s

	protected CFBamXMsgRspnISOCcyRec getRspnISOCcyRec() {
		if( rspnISOCcyRec == null ) {
			rspnISOCcyRec = new CFBamXMsgRspnISOCcyRec( this );
		}
		return( rspnISOCcyRec );
	}

	protected CFBamXMsgRspnISOCcyCreated getRspnISOCcyCreated() {
		if( rspnISOCcyCreated == null ) {
			rspnISOCcyCreated = new CFBamXMsgRspnISOCcyCreated( this );
		}
		return( rspnISOCcyCreated );
	}

	protected CFBamXMsgRspnISOCcyReadSingle getRspnISOCcyReadSingle() {
		if( rspnISOCcyReadSingle == null ) {
			rspnISOCcyReadSingle = new CFBamXMsgRspnISOCcyReadSingle( this );
			rspnISOCcyReadSingle.addElementHandler( "ISOCcy", getRspnISOCcyRec() );
		}
		return( rspnISOCcyReadSingle );
	}

	protected CFBamXMsgRspnISOCcyReadList getRspnISOCcyReadList() {
		if( rspnISOCcyReadList == null ) {
			rspnISOCcyReadList = new CFBamXMsgRspnISOCcyReadList( this );
			rspnISOCcyReadList.addElementHandler( "ISOCcy", getRspnISOCcyRec() );
		}
		return( rspnISOCcyReadList );
	}

	protected CFBamXMsgRspnISOCcyLocked getRspnISOCcyLocked() {
		if( rspnISOCcyLocked == null ) {
			rspnISOCcyLocked = new CFBamXMsgRspnISOCcyLocked( this );
		}
		return( rspnISOCcyLocked );
	}

	protected CFBamXMsgRspnISOCcyUpdated getRspnISOCcyUpdated() {
		if( rspnISOCcyUpdated == null ) {
			rspnISOCcyUpdated = new CFBamXMsgRspnISOCcyUpdated( this );
		}
		return( rspnISOCcyUpdated );
	}

	protected CFBamXMsgRspnISOCcyDeleted getRspnISOCcyDeleted() {
		if( rspnISOCcyDeleted == null ) {
			rspnISOCcyDeleted = new CFBamXMsgRspnISOCcyDeleted( this );
		}
		return( rspnISOCcyDeleted );
	}

	// ISOCtry Response s

	protected CFBamXMsgRspnISOCtryRec getRspnISOCtryRec() {
		if( rspnISOCtryRec == null ) {
			rspnISOCtryRec = new CFBamXMsgRspnISOCtryRec( this );
		}
		return( rspnISOCtryRec );
	}

	protected CFBamXMsgRspnISOCtryCreated getRspnISOCtryCreated() {
		if( rspnISOCtryCreated == null ) {
			rspnISOCtryCreated = new CFBamXMsgRspnISOCtryCreated( this );
		}
		return( rspnISOCtryCreated );
	}

	protected CFBamXMsgRspnISOCtryReadSingle getRspnISOCtryReadSingle() {
		if( rspnISOCtryReadSingle == null ) {
			rspnISOCtryReadSingle = new CFBamXMsgRspnISOCtryReadSingle( this );
			rspnISOCtryReadSingle.addElementHandler( "ISOCtry", getRspnISOCtryRec() );
		}
		return( rspnISOCtryReadSingle );
	}

	protected CFBamXMsgRspnISOCtryReadList getRspnISOCtryReadList() {
		if( rspnISOCtryReadList == null ) {
			rspnISOCtryReadList = new CFBamXMsgRspnISOCtryReadList( this );
			rspnISOCtryReadList.addElementHandler( "ISOCtry", getRspnISOCtryRec() );
		}
		return( rspnISOCtryReadList );
	}

	protected CFBamXMsgRspnISOCtryLocked getRspnISOCtryLocked() {
		if( rspnISOCtryLocked == null ) {
			rspnISOCtryLocked = new CFBamXMsgRspnISOCtryLocked( this );
		}
		return( rspnISOCtryLocked );
	}

	protected CFBamXMsgRspnISOCtryUpdated getRspnISOCtryUpdated() {
		if( rspnISOCtryUpdated == null ) {
			rspnISOCtryUpdated = new CFBamXMsgRspnISOCtryUpdated( this );
		}
		return( rspnISOCtryUpdated );
	}

	protected CFBamXMsgRspnISOCtryDeleted getRspnISOCtryDeleted() {
		if( rspnISOCtryDeleted == null ) {
			rspnISOCtryDeleted = new CFBamXMsgRspnISOCtryDeleted( this );
		}
		return( rspnISOCtryDeleted );
	}

	// ISOCtryCcy Response s

	protected CFBamXMsgRspnISOCtryCcyRec getRspnISOCtryCcyRec() {
		if( rspnISOCtryCcyRec == null ) {
			rspnISOCtryCcyRec = new CFBamXMsgRspnISOCtryCcyRec( this );
		}
		return( rspnISOCtryCcyRec );
	}

	protected CFBamXMsgRspnISOCtryCcyCreated getRspnISOCtryCcyCreated() {
		if( rspnISOCtryCcyCreated == null ) {
			rspnISOCtryCcyCreated = new CFBamXMsgRspnISOCtryCcyCreated( this );
		}
		return( rspnISOCtryCcyCreated );
	}

	protected CFBamXMsgRspnISOCtryCcyReadSingle getRspnISOCtryCcyReadSingle() {
		if( rspnISOCtryCcyReadSingle == null ) {
			rspnISOCtryCcyReadSingle = new CFBamXMsgRspnISOCtryCcyReadSingle( this );
			rspnISOCtryCcyReadSingle.addElementHandler( "ISOCtryCcy", getRspnISOCtryCcyRec() );
		}
		return( rspnISOCtryCcyReadSingle );
	}

	protected CFBamXMsgRspnISOCtryCcyReadList getRspnISOCtryCcyReadList() {
		if( rspnISOCtryCcyReadList == null ) {
			rspnISOCtryCcyReadList = new CFBamXMsgRspnISOCtryCcyReadList( this );
			rspnISOCtryCcyReadList.addElementHandler( "ISOCtryCcy", getRspnISOCtryCcyRec() );
		}
		return( rspnISOCtryCcyReadList );
	}

	protected CFBamXMsgRspnISOCtryCcyLocked getRspnISOCtryCcyLocked() {
		if( rspnISOCtryCcyLocked == null ) {
			rspnISOCtryCcyLocked = new CFBamXMsgRspnISOCtryCcyLocked( this );
		}
		return( rspnISOCtryCcyLocked );
	}

	protected CFBamXMsgRspnISOCtryCcyUpdated getRspnISOCtryCcyUpdated() {
		if( rspnISOCtryCcyUpdated == null ) {
			rspnISOCtryCcyUpdated = new CFBamXMsgRspnISOCtryCcyUpdated( this );
		}
		return( rspnISOCtryCcyUpdated );
	}

	protected CFBamXMsgRspnISOCtryCcyDeleted getRspnISOCtryCcyDeleted() {
		if( rspnISOCtryCcyDeleted == null ) {
			rspnISOCtryCcyDeleted = new CFBamXMsgRspnISOCtryCcyDeleted( this );
		}
		return( rspnISOCtryCcyDeleted );
	}

	// ISOCtryLang Response s

	protected CFBamXMsgRspnISOCtryLangRec getRspnISOCtryLangRec() {
		if( rspnISOCtryLangRec == null ) {
			rspnISOCtryLangRec = new CFBamXMsgRspnISOCtryLangRec( this );
		}
		return( rspnISOCtryLangRec );
	}

	protected CFBamXMsgRspnISOCtryLangCreated getRspnISOCtryLangCreated() {
		if( rspnISOCtryLangCreated == null ) {
			rspnISOCtryLangCreated = new CFBamXMsgRspnISOCtryLangCreated( this );
		}
		return( rspnISOCtryLangCreated );
	}

	protected CFBamXMsgRspnISOCtryLangReadSingle getRspnISOCtryLangReadSingle() {
		if( rspnISOCtryLangReadSingle == null ) {
			rspnISOCtryLangReadSingle = new CFBamXMsgRspnISOCtryLangReadSingle( this );
			rspnISOCtryLangReadSingle.addElementHandler( "ISOCtryLang", getRspnISOCtryLangRec() );
		}
		return( rspnISOCtryLangReadSingle );
	}

	protected CFBamXMsgRspnISOCtryLangReadList getRspnISOCtryLangReadList() {
		if( rspnISOCtryLangReadList == null ) {
			rspnISOCtryLangReadList = new CFBamXMsgRspnISOCtryLangReadList( this );
			rspnISOCtryLangReadList.addElementHandler( "ISOCtryLang", getRspnISOCtryLangRec() );
		}
		return( rspnISOCtryLangReadList );
	}

	protected CFBamXMsgRspnISOCtryLangLocked getRspnISOCtryLangLocked() {
		if( rspnISOCtryLangLocked == null ) {
			rspnISOCtryLangLocked = new CFBamXMsgRspnISOCtryLangLocked( this );
		}
		return( rspnISOCtryLangLocked );
	}

	protected CFBamXMsgRspnISOCtryLangUpdated getRspnISOCtryLangUpdated() {
		if( rspnISOCtryLangUpdated == null ) {
			rspnISOCtryLangUpdated = new CFBamXMsgRspnISOCtryLangUpdated( this );
		}
		return( rspnISOCtryLangUpdated );
	}

	protected CFBamXMsgRspnISOCtryLangDeleted getRspnISOCtryLangDeleted() {
		if( rspnISOCtryLangDeleted == null ) {
			rspnISOCtryLangDeleted = new CFBamXMsgRspnISOCtryLangDeleted( this );
		}
		return( rspnISOCtryLangDeleted );
	}

	// ISOLang Response s

	protected CFBamXMsgRspnISOLangRec getRspnISOLangRec() {
		if( rspnISOLangRec == null ) {
			rspnISOLangRec = new CFBamXMsgRspnISOLangRec( this );
		}
		return( rspnISOLangRec );
	}

	protected CFBamXMsgRspnISOLangCreated getRspnISOLangCreated() {
		if( rspnISOLangCreated == null ) {
			rspnISOLangCreated = new CFBamXMsgRspnISOLangCreated( this );
		}
		return( rspnISOLangCreated );
	}

	protected CFBamXMsgRspnISOLangReadSingle getRspnISOLangReadSingle() {
		if( rspnISOLangReadSingle == null ) {
			rspnISOLangReadSingle = new CFBamXMsgRspnISOLangReadSingle( this );
			rspnISOLangReadSingle.addElementHandler( "ISOLang", getRspnISOLangRec() );
		}
		return( rspnISOLangReadSingle );
	}

	protected CFBamXMsgRspnISOLangReadList getRspnISOLangReadList() {
		if( rspnISOLangReadList == null ) {
			rspnISOLangReadList = new CFBamXMsgRspnISOLangReadList( this );
			rspnISOLangReadList.addElementHandler( "ISOLang", getRspnISOLangRec() );
		}
		return( rspnISOLangReadList );
	}

	protected CFBamXMsgRspnISOLangLocked getRspnISOLangLocked() {
		if( rspnISOLangLocked == null ) {
			rspnISOLangLocked = new CFBamXMsgRspnISOLangLocked( this );
		}
		return( rspnISOLangLocked );
	}

	protected CFBamXMsgRspnISOLangUpdated getRspnISOLangUpdated() {
		if( rspnISOLangUpdated == null ) {
			rspnISOLangUpdated = new CFBamXMsgRspnISOLangUpdated( this );
		}
		return( rspnISOLangUpdated );
	}

	protected CFBamXMsgRspnISOLangDeleted getRspnISOLangDeleted() {
		if( rspnISOLangDeleted == null ) {
			rspnISOLangDeleted = new CFBamXMsgRspnISOLangDeleted( this );
		}
		return( rspnISOLangDeleted );
	}

	// ISOTZone Response s

	protected CFBamXMsgRspnISOTZoneRec getRspnISOTZoneRec() {
		if( rspnISOTZoneRec == null ) {
			rspnISOTZoneRec = new CFBamXMsgRspnISOTZoneRec( this );
		}
		return( rspnISOTZoneRec );
	}

	protected CFBamXMsgRspnISOTZoneCreated getRspnISOTZoneCreated() {
		if( rspnISOTZoneCreated == null ) {
			rspnISOTZoneCreated = new CFBamXMsgRspnISOTZoneCreated( this );
		}
		return( rspnISOTZoneCreated );
	}

	protected CFBamXMsgRspnISOTZoneReadSingle getRspnISOTZoneReadSingle() {
		if( rspnISOTZoneReadSingle == null ) {
			rspnISOTZoneReadSingle = new CFBamXMsgRspnISOTZoneReadSingle( this );
			rspnISOTZoneReadSingle.addElementHandler( "ISOTZone", getRspnISOTZoneRec() );
		}
		return( rspnISOTZoneReadSingle );
	}

	protected CFBamXMsgRspnISOTZoneReadList getRspnISOTZoneReadList() {
		if( rspnISOTZoneReadList == null ) {
			rspnISOTZoneReadList = new CFBamXMsgRspnISOTZoneReadList( this );
			rspnISOTZoneReadList.addElementHandler( "ISOTZone", getRspnISOTZoneRec() );
		}
		return( rspnISOTZoneReadList );
	}

	protected CFBamXMsgRspnISOTZoneLocked getRspnISOTZoneLocked() {
		if( rspnISOTZoneLocked == null ) {
			rspnISOTZoneLocked = new CFBamXMsgRspnISOTZoneLocked( this );
		}
		return( rspnISOTZoneLocked );
	}

	protected CFBamXMsgRspnISOTZoneUpdated getRspnISOTZoneUpdated() {
		if( rspnISOTZoneUpdated == null ) {
			rspnISOTZoneUpdated = new CFBamXMsgRspnISOTZoneUpdated( this );
		}
		return( rspnISOTZoneUpdated );
	}

	protected CFBamXMsgRspnISOTZoneDeleted getRspnISOTZoneDeleted() {
		if( rspnISOTZoneDeleted == null ) {
			rspnISOTZoneDeleted = new CFBamXMsgRspnISOTZoneDeleted( this );
		}
		return( rspnISOTZoneDeleted );
	}

	// Id16Gen Response s

	protected CFBamXMsgRspnId16GenRec getRspnId16GenRec() {
		if( rspnId16GenRec == null ) {
			rspnId16GenRec = new CFBamXMsgRspnId16GenRec( this );
		}
		return( rspnId16GenRec );
	}

	protected CFBamXMsgRspnId16GenCreated getRspnId16GenCreated() {
		if( rspnId16GenCreated == null ) {
			rspnId16GenCreated = new CFBamXMsgRspnId16GenCreated( this );
		}
		return( rspnId16GenCreated );
	}

	protected CFBamXMsgRspnId16GenReadSingle getRspnId16GenReadSingle() {
		if( rspnId16GenReadSingle == null ) {
			rspnId16GenReadSingle = new CFBamXMsgRspnId16GenReadSingle( this );
			rspnId16GenReadSingle.addElementHandler( "Id16Gen", getRspnId16GenRec() );
		}
		return( rspnId16GenReadSingle );
	}

	protected CFBamXMsgRspnId16GenReadList getRspnId16GenReadList() {
		if( rspnId16GenReadList == null ) {
			rspnId16GenReadList = new CFBamXMsgRspnId16GenReadList( this );
			rspnId16GenReadList.addElementHandler( "Id16Gen", getRspnId16GenRec() );
		}
		return( rspnId16GenReadList );
	}

	protected CFBamXMsgRspnId16GenLocked getRspnId16GenLocked() {
		if( rspnId16GenLocked == null ) {
			rspnId16GenLocked = new CFBamXMsgRspnId16GenLocked( this );
		}
		return( rspnId16GenLocked );
	}

	protected CFBamXMsgRspnId16GenUpdated getRspnId16GenUpdated() {
		if( rspnId16GenUpdated == null ) {
			rspnId16GenUpdated = new CFBamXMsgRspnId16GenUpdated( this );
		}
		return( rspnId16GenUpdated );
	}

	protected CFBamXMsgRspnId16GenDeleted getRspnId16GenDeleted() {
		if( rspnId16GenDeleted == null ) {
			rspnId16GenDeleted = new CFBamXMsgRspnId16GenDeleted( this );
		}
		return( rspnId16GenDeleted );
	}

	// Id32Gen Response s

	protected CFBamXMsgRspnId32GenRec getRspnId32GenRec() {
		if( rspnId32GenRec == null ) {
			rspnId32GenRec = new CFBamXMsgRspnId32GenRec( this );
		}
		return( rspnId32GenRec );
	}

	protected CFBamXMsgRspnId32GenCreated getRspnId32GenCreated() {
		if( rspnId32GenCreated == null ) {
			rspnId32GenCreated = new CFBamXMsgRspnId32GenCreated( this );
		}
		return( rspnId32GenCreated );
	}

	protected CFBamXMsgRspnId32GenReadSingle getRspnId32GenReadSingle() {
		if( rspnId32GenReadSingle == null ) {
			rspnId32GenReadSingle = new CFBamXMsgRspnId32GenReadSingle( this );
			rspnId32GenReadSingle.addElementHandler( "Id32Gen", getRspnId32GenRec() );
		}
		return( rspnId32GenReadSingle );
	}

	protected CFBamXMsgRspnId32GenReadList getRspnId32GenReadList() {
		if( rspnId32GenReadList == null ) {
			rspnId32GenReadList = new CFBamXMsgRspnId32GenReadList( this );
			rspnId32GenReadList.addElementHandler( "Id32Gen", getRspnId32GenRec() );
		}
		return( rspnId32GenReadList );
	}

	protected CFBamXMsgRspnId32GenLocked getRspnId32GenLocked() {
		if( rspnId32GenLocked == null ) {
			rspnId32GenLocked = new CFBamXMsgRspnId32GenLocked( this );
		}
		return( rspnId32GenLocked );
	}

	protected CFBamXMsgRspnId32GenUpdated getRspnId32GenUpdated() {
		if( rspnId32GenUpdated == null ) {
			rspnId32GenUpdated = new CFBamXMsgRspnId32GenUpdated( this );
		}
		return( rspnId32GenUpdated );
	}

	protected CFBamXMsgRspnId32GenDeleted getRspnId32GenDeleted() {
		if( rspnId32GenDeleted == null ) {
			rspnId32GenDeleted = new CFBamXMsgRspnId32GenDeleted( this );
		}
		return( rspnId32GenDeleted );
	}

	// Id64Gen Response s

	protected CFBamXMsgRspnId64GenRec getRspnId64GenRec() {
		if( rspnId64GenRec == null ) {
			rspnId64GenRec = new CFBamXMsgRspnId64GenRec( this );
		}
		return( rspnId64GenRec );
	}

	protected CFBamXMsgRspnId64GenCreated getRspnId64GenCreated() {
		if( rspnId64GenCreated == null ) {
			rspnId64GenCreated = new CFBamXMsgRspnId64GenCreated( this );
		}
		return( rspnId64GenCreated );
	}

	protected CFBamXMsgRspnId64GenReadSingle getRspnId64GenReadSingle() {
		if( rspnId64GenReadSingle == null ) {
			rspnId64GenReadSingle = new CFBamXMsgRspnId64GenReadSingle( this );
			rspnId64GenReadSingle.addElementHandler( "Id64Gen", getRspnId64GenRec() );
		}
		return( rspnId64GenReadSingle );
	}

	protected CFBamXMsgRspnId64GenReadList getRspnId64GenReadList() {
		if( rspnId64GenReadList == null ) {
			rspnId64GenReadList = new CFBamXMsgRspnId64GenReadList( this );
			rspnId64GenReadList.addElementHandler( "Id64Gen", getRspnId64GenRec() );
		}
		return( rspnId64GenReadList );
	}

	protected CFBamXMsgRspnId64GenLocked getRspnId64GenLocked() {
		if( rspnId64GenLocked == null ) {
			rspnId64GenLocked = new CFBamXMsgRspnId64GenLocked( this );
		}
		return( rspnId64GenLocked );
	}

	protected CFBamXMsgRspnId64GenUpdated getRspnId64GenUpdated() {
		if( rspnId64GenUpdated == null ) {
			rspnId64GenUpdated = new CFBamXMsgRspnId64GenUpdated( this );
		}
		return( rspnId64GenUpdated );
	}

	protected CFBamXMsgRspnId64GenDeleted getRspnId64GenDeleted() {
		if( rspnId64GenDeleted == null ) {
			rspnId64GenDeleted = new CFBamXMsgRspnId64GenDeleted( this );
		}
		return( rspnId64GenDeleted );
	}

	// Index Response s

	protected CFBamXMsgRspnIndexRec getRspnIndexRec() {
		if( rspnIndexRec == null ) {
			rspnIndexRec = new CFBamXMsgRspnIndexRec( this );
		}
		return( rspnIndexRec );
	}

	protected CFBamXMsgRspnIndexCreated getRspnIndexCreated() {
		if( rspnIndexCreated == null ) {
			rspnIndexCreated = new CFBamXMsgRspnIndexCreated( this );
		}
		return( rspnIndexCreated );
	}

	protected CFBamXMsgRspnIndexReadSingle getRspnIndexReadSingle() {
		if( rspnIndexReadSingle == null ) {
			rspnIndexReadSingle = new CFBamXMsgRspnIndexReadSingle( this );
			rspnIndexReadSingle.addElementHandler( "Index", getRspnIndexRec() );
		}
		return( rspnIndexReadSingle );
	}

	protected CFBamXMsgRspnIndexReadList getRspnIndexReadList() {
		if( rspnIndexReadList == null ) {
			rspnIndexReadList = new CFBamXMsgRspnIndexReadList( this );
			rspnIndexReadList.addElementHandler( "Index", getRspnIndexRec() );
		}
		return( rspnIndexReadList );
	}

	protected CFBamXMsgRspnIndexLocked getRspnIndexLocked() {
		if( rspnIndexLocked == null ) {
			rspnIndexLocked = new CFBamXMsgRspnIndexLocked( this );
		}
		return( rspnIndexLocked );
	}

	protected CFBamXMsgRspnIndexUpdated getRspnIndexUpdated() {
		if( rspnIndexUpdated == null ) {
			rspnIndexUpdated = new CFBamXMsgRspnIndexUpdated( this );
		}
		return( rspnIndexUpdated );
	}

	protected CFBamXMsgRspnIndexDeleted getRspnIndexDeleted() {
		if( rspnIndexDeleted == null ) {
			rspnIndexDeleted = new CFBamXMsgRspnIndexDeleted( this );
		}
		return( rspnIndexDeleted );
	}

	// IndexCol Response s

	protected CFBamXMsgRspnIndexColRec getRspnIndexColRec() {
		if( rspnIndexColRec == null ) {
			rspnIndexColRec = new CFBamXMsgRspnIndexColRec( this );
		}
		return( rspnIndexColRec );
	}

	protected CFBamXMsgRspnIndexColCreated getRspnIndexColCreated() {
		if( rspnIndexColCreated == null ) {
			rspnIndexColCreated = new CFBamXMsgRspnIndexColCreated( this );
		}
		return( rspnIndexColCreated );
	}

	protected CFBamXMsgRspnIndexColReadSingle getRspnIndexColReadSingle() {
		if( rspnIndexColReadSingle == null ) {
			rspnIndexColReadSingle = new CFBamXMsgRspnIndexColReadSingle( this );
			rspnIndexColReadSingle.addElementHandler( "IndexCol", getRspnIndexColRec() );
		}
		return( rspnIndexColReadSingle );
	}

	protected CFBamXMsgRspnIndexColReadList getRspnIndexColReadList() {
		if( rspnIndexColReadList == null ) {
			rspnIndexColReadList = new CFBamXMsgRspnIndexColReadList( this );
			rspnIndexColReadList.addElementHandler( "IndexCol", getRspnIndexColRec() );
		}
		return( rspnIndexColReadList );
	}

	protected CFBamXMsgRspnIndexColLocked getRspnIndexColLocked() {
		if( rspnIndexColLocked == null ) {
			rspnIndexColLocked = new CFBamXMsgRspnIndexColLocked( this );
		}
		return( rspnIndexColLocked );
	}

	protected CFBamXMsgRspnIndexColUpdated getRspnIndexColUpdated() {
		if( rspnIndexColUpdated == null ) {
			rspnIndexColUpdated = new CFBamXMsgRspnIndexColUpdated( this );
		}
		return( rspnIndexColUpdated );
	}

	protected CFBamXMsgRspnIndexColDeleted getRspnIndexColDeleted() {
		if( rspnIndexColDeleted == null ) {
			rspnIndexColDeleted = new CFBamXMsgRspnIndexColDeleted( this );
		}
		return( rspnIndexColDeleted );
	}

	// Int16Col Response s

	protected CFBamXMsgRspnInt16ColRec getRspnInt16ColRec() {
		if( rspnInt16ColRec == null ) {
			rspnInt16ColRec = new CFBamXMsgRspnInt16ColRec( this );
		}
		return( rspnInt16ColRec );
	}

	protected CFBamXMsgRspnInt16ColCreated getRspnInt16ColCreated() {
		if( rspnInt16ColCreated == null ) {
			rspnInt16ColCreated = new CFBamXMsgRspnInt16ColCreated( this );
		}
		return( rspnInt16ColCreated );
	}

	protected CFBamXMsgRspnInt16ColReadSingle getRspnInt16ColReadSingle() {
		if( rspnInt16ColReadSingle == null ) {
			rspnInt16ColReadSingle = new CFBamXMsgRspnInt16ColReadSingle( this );
			rspnInt16ColReadSingle.addElementHandler( "Int16Col", getRspnInt16ColRec() );
		}
		return( rspnInt16ColReadSingle );
	}

	protected CFBamXMsgRspnInt16ColReadList getRspnInt16ColReadList() {
		if( rspnInt16ColReadList == null ) {
			rspnInt16ColReadList = new CFBamXMsgRspnInt16ColReadList( this );
			rspnInt16ColReadList.addElementHandler( "Int16Col", getRspnInt16ColRec() );
		}
		return( rspnInt16ColReadList );
	}

	protected CFBamXMsgRspnInt16ColLocked getRspnInt16ColLocked() {
		if( rspnInt16ColLocked == null ) {
			rspnInt16ColLocked = new CFBamXMsgRspnInt16ColLocked( this );
		}
		return( rspnInt16ColLocked );
	}

	protected CFBamXMsgRspnInt16ColUpdated getRspnInt16ColUpdated() {
		if( rspnInt16ColUpdated == null ) {
			rspnInt16ColUpdated = new CFBamXMsgRspnInt16ColUpdated( this );
		}
		return( rspnInt16ColUpdated );
	}

	protected CFBamXMsgRspnInt16ColDeleted getRspnInt16ColDeleted() {
		if( rspnInt16ColDeleted == null ) {
			rspnInt16ColDeleted = new CFBamXMsgRspnInt16ColDeleted( this );
		}
		return( rspnInt16ColDeleted );
	}

	// Int16Def Response s

	protected CFBamXMsgRspnInt16DefRec getRspnInt16DefRec() {
		if( rspnInt16DefRec == null ) {
			rspnInt16DefRec = new CFBamXMsgRspnInt16DefRec( this );
		}
		return( rspnInt16DefRec );
	}

	protected CFBamXMsgRspnInt16DefCreated getRspnInt16DefCreated() {
		if( rspnInt16DefCreated == null ) {
			rspnInt16DefCreated = new CFBamXMsgRspnInt16DefCreated( this );
		}
		return( rspnInt16DefCreated );
	}

	protected CFBamXMsgRspnInt16DefReadSingle getRspnInt16DefReadSingle() {
		if( rspnInt16DefReadSingle == null ) {
			rspnInt16DefReadSingle = new CFBamXMsgRspnInt16DefReadSingle( this );
			rspnInt16DefReadSingle.addElementHandler( "Int16Def", getRspnInt16DefRec() );
			rspnInt16DefReadSingle.addElementHandler( "Int16Type", getRspnInt16TypeRec() );
			rspnInt16DefReadSingle.addElementHandler( "Id16Gen", getRspnId16GenRec() );
			rspnInt16DefReadSingle.addElementHandler( "EnumDef", getRspnEnumDefRec() );
			rspnInt16DefReadSingle.addElementHandler( "EnumType", getRspnEnumTypeRec() );
			rspnInt16DefReadSingle.addElementHandler( "Int16Col", getRspnInt16ColRec() );
		}
		return( rspnInt16DefReadSingle );
	}

	protected CFBamXMsgRspnInt16DefReadList getRspnInt16DefReadList() {
		if( rspnInt16DefReadList == null ) {
			rspnInt16DefReadList = new CFBamXMsgRspnInt16DefReadList( this );
			rspnInt16DefReadList.addElementHandler( "Int16Def", getRspnInt16DefRec() );
			rspnInt16DefReadList.addElementHandler( "Int16Type", getRspnInt16TypeRec() );
			rspnInt16DefReadList.addElementHandler( "Id16Gen", getRspnId16GenRec() );
			rspnInt16DefReadList.addElementHandler( "EnumDef", getRspnEnumDefRec() );
			rspnInt16DefReadList.addElementHandler( "EnumType", getRspnEnumTypeRec() );
			rspnInt16DefReadList.addElementHandler( "Int16Col", getRspnInt16ColRec() );
		}
		return( rspnInt16DefReadList );
	}

	protected CFBamXMsgRspnInt16DefLocked getRspnInt16DefLocked() {
		if( rspnInt16DefLocked == null ) {
			rspnInt16DefLocked = new CFBamXMsgRspnInt16DefLocked( this );
		}
		return( rspnInt16DefLocked );
	}

	protected CFBamXMsgRspnInt16DefUpdated getRspnInt16DefUpdated() {
		if( rspnInt16DefUpdated == null ) {
			rspnInt16DefUpdated = new CFBamXMsgRspnInt16DefUpdated( this );
		}
		return( rspnInt16DefUpdated );
	}

	protected CFBamXMsgRspnInt16DefDeleted getRspnInt16DefDeleted() {
		if( rspnInt16DefDeleted == null ) {
			rspnInt16DefDeleted = new CFBamXMsgRspnInt16DefDeleted( this );
		}
		return( rspnInt16DefDeleted );
	}

	// Int16Type Response s

	protected CFBamXMsgRspnInt16TypeRec getRspnInt16TypeRec() {
		if( rspnInt16TypeRec == null ) {
			rspnInt16TypeRec = new CFBamXMsgRspnInt16TypeRec( this );
		}
		return( rspnInt16TypeRec );
	}

	protected CFBamXMsgRspnInt16TypeCreated getRspnInt16TypeCreated() {
		if( rspnInt16TypeCreated == null ) {
			rspnInt16TypeCreated = new CFBamXMsgRspnInt16TypeCreated( this );
		}
		return( rspnInt16TypeCreated );
	}

	protected CFBamXMsgRspnInt16TypeReadSingle getRspnInt16TypeReadSingle() {
		if( rspnInt16TypeReadSingle == null ) {
			rspnInt16TypeReadSingle = new CFBamXMsgRspnInt16TypeReadSingle( this );
			rspnInt16TypeReadSingle.addElementHandler( "Int16Type", getRspnInt16TypeRec() );
			rspnInt16TypeReadSingle.addElementHandler( "Id16Gen", getRspnId16GenRec() );
		}
		return( rspnInt16TypeReadSingle );
	}

	protected CFBamXMsgRspnInt16TypeReadList getRspnInt16TypeReadList() {
		if( rspnInt16TypeReadList == null ) {
			rspnInt16TypeReadList = new CFBamXMsgRspnInt16TypeReadList( this );
			rspnInt16TypeReadList.addElementHandler( "Int16Type", getRspnInt16TypeRec() );
			rspnInt16TypeReadList.addElementHandler( "Id16Gen", getRspnId16GenRec() );
		}
		return( rspnInt16TypeReadList );
	}

	protected CFBamXMsgRspnInt16TypeLocked getRspnInt16TypeLocked() {
		if( rspnInt16TypeLocked == null ) {
			rspnInt16TypeLocked = new CFBamXMsgRspnInt16TypeLocked( this );
		}
		return( rspnInt16TypeLocked );
	}

	protected CFBamXMsgRspnInt16TypeUpdated getRspnInt16TypeUpdated() {
		if( rspnInt16TypeUpdated == null ) {
			rspnInt16TypeUpdated = new CFBamXMsgRspnInt16TypeUpdated( this );
		}
		return( rspnInt16TypeUpdated );
	}

	protected CFBamXMsgRspnInt16TypeDeleted getRspnInt16TypeDeleted() {
		if( rspnInt16TypeDeleted == null ) {
			rspnInt16TypeDeleted = new CFBamXMsgRspnInt16TypeDeleted( this );
		}
		return( rspnInt16TypeDeleted );
	}

	// Int32Col Response s

	protected CFBamXMsgRspnInt32ColRec getRspnInt32ColRec() {
		if( rspnInt32ColRec == null ) {
			rspnInt32ColRec = new CFBamXMsgRspnInt32ColRec( this );
		}
		return( rspnInt32ColRec );
	}

	protected CFBamXMsgRspnInt32ColCreated getRspnInt32ColCreated() {
		if( rspnInt32ColCreated == null ) {
			rspnInt32ColCreated = new CFBamXMsgRspnInt32ColCreated( this );
		}
		return( rspnInt32ColCreated );
	}

	protected CFBamXMsgRspnInt32ColReadSingle getRspnInt32ColReadSingle() {
		if( rspnInt32ColReadSingle == null ) {
			rspnInt32ColReadSingle = new CFBamXMsgRspnInt32ColReadSingle( this );
			rspnInt32ColReadSingle.addElementHandler( "Int32Col", getRspnInt32ColRec() );
		}
		return( rspnInt32ColReadSingle );
	}

	protected CFBamXMsgRspnInt32ColReadList getRspnInt32ColReadList() {
		if( rspnInt32ColReadList == null ) {
			rspnInt32ColReadList = new CFBamXMsgRspnInt32ColReadList( this );
			rspnInt32ColReadList.addElementHandler( "Int32Col", getRspnInt32ColRec() );
		}
		return( rspnInt32ColReadList );
	}

	protected CFBamXMsgRspnInt32ColLocked getRspnInt32ColLocked() {
		if( rspnInt32ColLocked == null ) {
			rspnInt32ColLocked = new CFBamXMsgRspnInt32ColLocked( this );
		}
		return( rspnInt32ColLocked );
	}

	protected CFBamXMsgRspnInt32ColUpdated getRspnInt32ColUpdated() {
		if( rspnInt32ColUpdated == null ) {
			rspnInt32ColUpdated = new CFBamXMsgRspnInt32ColUpdated( this );
		}
		return( rspnInt32ColUpdated );
	}

	protected CFBamXMsgRspnInt32ColDeleted getRspnInt32ColDeleted() {
		if( rspnInt32ColDeleted == null ) {
			rspnInt32ColDeleted = new CFBamXMsgRspnInt32ColDeleted( this );
		}
		return( rspnInt32ColDeleted );
	}

	// Int32Def Response s

	protected CFBamXMsgRspnInt32DefRec getRspnInt32DefRec() {
		if( rspnInt32DefRec == null ) {
			rspnInt32DefRec = new CFBamXMsgRspnInt32DefRec( this );
		}
		return( rspnInt32DefRec );
	}

	protected CFBamXMsgRspnInt32DefCreated getRspnInt32DefCreated() {
		if( rspnInt32DefCreated == null ) {
			rspnInt32DefCreated = new CFBamXMsgRspnInt32DefCreated( this );
		}
		return( rspnInt32DefCreated );
	}

	protected CFBamXMsgRspnInt32DefReadSingle getRspnInt32DefReadSingle() {
		if( rspnInt32DefReadSingle == null ) {
			rspnInt32DefReadSingle = new CFBamXMsgRspnInt32DefReadSingle( this );
			rspnInt32DefReadSingle.addElementHandler( "Int32Def", getRspnInt32DefRec() );
			rspnInt32DefReadSingle.addElementHandler( "Int32Type", getRspnInt32TypeRec() );
			rspnInt32DefReadSingle.addElementHandler( "Id32Gen", getRspnId32GenRec() );
			rspnInt32DefReadSingle.addElementHandler( "Int32Col", getRspnInt32ColRec() );
		}
		return( rspnInt32DefReadSingle );
	}

	protected CFBamXMsgRspnInt32DefReadList getRspnInt32DefReadList() {
		if( rspnInt32DefReadList == null ) {
			rspnInt32DefReadList = new CFBamXMsgRspnInt32DefReadList( this );
			rspnInt32DefReadList.addElementHandler( "Int32Def", getRspnInt32DefRec() );
			rspnInt32DefReadList.addElementHandler( "Int32Type", getRspnInt32TypeRec() );
			rspnInt32DefReadList.addElementHandler( "Id32Gen", getRspnId32GenRec() );
			rspnInt32DefReadList.addElementHandler( "Int32Col", getRspnInt32ColRec() );
		}
		return( rspnInt32DefReadList );
	}

	protected CFBamXMsgRspnInt32DefLocked getRspnInt32DefLocked() {
		if( rspnInt32DefLocked == null ) {
			rspnInt32DefLocked = new CFBamXMsgRspnInt32DefLocked( this );
		}
		return( rspnInt32DefLocked );
	}

	protected CFBamXMsgRspnInt32DefUpdated getRspnInt32DefUpdated() {
		if( rspnInt32DefUpdated == null ) {
			rspnInt32DefUpdated = new CFBamXMsgRspnInt32DefUpdated( this );
		}
		return( rspnInt32DefUpdated );
	}

	protected CFBamXMsgRspnInt32DefDeleted getRspnInt32DefDeleted() {
		if( rspnInt32DefDeleted == null ) {
			rspnInt32DefDeleted = new CFBamXMsgRspnInt32DefDeleted( this );
		}
		return( rspnInt32DefDeleted );
	}

	// Int32Type Response s

	protected CFBamXMsgRspnInt32TypeRec getRspnInt32TypeRec() {
		if( rspnInt32TypeRec == null ) {
			rspnInt32TypeRec = new CFBamXMsgRspnInt32TypeRec( this );
		}
		return( rspnInt32TypeRec );
	}

	protected CFBamXMsgRspnInt32TypeCreated getRspnInt32TypeCreated() {
		if( rspnInt32TypeCreated == null ) {
			rspnInt32TypeCreated = new CFBamXMsgRspnInt32TypeCreated( this );
		}
		return( rspnInt32TypeCreated );
	}

	protected CFBamXMsgRspnInt32TypeReadSingle getRspnInt32TypeReadSingle() {
		if( rspnInt32TypeReadSingle == null ) {
			rspnInt32TypeReadSingle = new CFBamXMsgRspnInt32TypeReadSingle( this );
			rspnInt32TypeReadSingle.addElementHandler( "Int32Type", getRspnInt32TypeRec() );
			rspnInt32TypeReadSingle.addElementHandler( "Id32Gen", getRspnId32GenRec() );
		}
		return( rspnInt32TypeReadSingle );
	}

	protected CFBamXMsgRspnInt32TypeReadList getRspnInt32TypeReadList() {
		if( rspnInt32TypeReadList == null ) {
			rspnInt32TypeReadList = new CFBamXMsgRspnInt32TypeReadList( this );
			rspnInt32TypeReadList.addElementHandler( "Int32Type", getRspnInt32TypeRec() );
			rspnInt32TypeReadList.addElementHandler( "Id32Gen", getRspnId32GenRec() );
		}
		return( rspnInt32TypeReadList );
	}

	protected CFBamXMsgRspnInt32TypeLocked getRspnInt32TypeLocked() {
		if( rspnInt32TypeLocked == null ) {
			rspnInt32TypeLocked = new CFBamXMsgRspnInt32TypeLocked( this );
		}
		return( rspnInt32TypeLocked );
	}

	protected CFBamXMsgRspnInt32TypeUpdated getRspnInt32TypeUpdated() {
		if( rspnInt32TypeUpdated == null ) {
			rspnInt32TypeUpdated = new CFBamXMsgRspnInt32TypeUpdated( this );
		}
		return( rspnInt32TypeUpdated );
	}

	protected CFBamXMsgRspnInt32TypeDeleted getRspnInt32TypeDeleted() {
		if( rspnInt32TypeDeleted == null ) {
			rspnInt32TypeDeleted = new CFBamXMsgRspnInt32TypeDeleted( this );
		}
		return( rspnInt32TypeDeleted );
	}

	// Int64Col Response s

	protected CFBamXMsgRspnInt64ColRec getRspnInt64ColRec() {
		if( rspnInt64ColRec == null ) {
			rspnInt64ColRec = new CFBamXMsgRspnInt64ColRec( this );
		}
		return( rspnInt64ColRec );
	}

	protected CFBamXMsgRspnInt64ColCreated getRspnInt64ColCreated() {
		if( rspnInt64ColCreated == null ) {
			rspnInt64ColCreated = new CFBamXMsgRspnInt64ColCreated( this );
		}
		return( rspnInt64ColCreated );
	}

	protected CFBamXMsgRspnInt64ColReadSingle getRspnInt64ColReadSingle() {
		if( rspnInt64ColReadSingle == null ) {
			rspnInt64ColReadSingle = new CFBamXMsgRspnInt64ColReadSingle( this );
			rspnInt64ColReadSingle.addElementHandler( "Int64Col", getRspnInt64ColRec() );
		}
		return( rspnInt64ColReadSingle );
	}

	protected CFBamXMsgRspnInt64ColReadList getRspnInt64ColReadList() {
		if( rspnInt64ColReadList == null ) {
			rspnInt64ColReadList = new CFBamXMsgRspnInt64ColReadList( this );
			rspnInt64ColReadList.addElementHandler( "Int64Col", getRspnInt64ColRec() );
		}
		return( rspnInt64ColReadList );
	}

	protected CFBamXMsgRspnInt64ColLocked getRspnInt64ColLocked() {
		if( rspnInt64ColLocked == null ) {
			rspnInt64ColLocked = new CFBamXMsgRspnInt64ColLocked( this );
		}
		return( rspnInt64ColLocked );
	}

	protected CFBamXMsgRspnInt64ColUpdated getRspnInt64ColUpdated() {
		if( rspnInt64ColUpdated == null ) {
			rspnInt64ColUpdated = new CFBamXMsgRspnInt64ColUpdated( this );
		}
		return( rspnInt64ColUpdated );
	}

	protected CFBamXMsgRspnInt64ColDeleted getRspnInt64ColDeleted() {
		if( rspnInt64ColDeleted == null ) {
			rspnInt64ColDeleted = new CFBamXMsgRspnInt64ColDeleted( this );
		}
		return( rspnInt64ColDeleted );
	}

	// Int64Def Response s

	protected CFBamXMsgRspnInt64DefRec getRspnInt64DefRec() {
		if( rspnInt64DefRec == null ) {
			rspnInt64DefRec = new CFBamXMsgRspnInt64DefRec( this );
		}
		return( rspnInt64DefRec );
	}

	protected CFBamXMsgRspnInt64DefCreated getRspnInt64DefCreated() {
		if( rspnInt64DefCreated == null ) {
			rspnInt64DefCreated = new CFBamXMsgRspnInt64DefCreated( this );
		}
		return( rspnInt64DefCreated );
	}

	protected CFBamXMsgRspnInt64DefReadSingle getRspnInt64DefReadSingle() {
		if( rspnInt64DefReadSingle == null ) {
			rspnInt64DefReadSingle = new CFBamXMsgRspnInt64DefReadSingle( this );
			rspnInt64DefReadSingle.addElementHandler( "Int64Def", getRspnInt64DefRec() );
			rspnInt64DefReadSingle.addElementHandler( "Int64Type", getRspnInt64TypeRec() );
			rspnInt64DefReadSingle.addElementHandler( "Id64Gen", getRspnId64GenRec() );
			rspnInt64DefReadSingle.addElementHandler( "Int64Col", getRspnInt64ColRec() );
		}
		return( rspnInt64DefReadSingle );
	}

	protected CFBamXMsgRspnInt64DefReadList getRspnInt64DefReadList() {
		if( rspnInt64DefReadList == null ) {
			rspnInt64DefReadList = new CFBamXMsgRspnInt64DefReadList( this );
			rspnInt64DefReadList.addElementHandler( "Int64Def", getRspnInt64DefRec() );
			rspnInt64DefReadList.addElementHandler( "Int64Type", getRspnInt64TypeRec() );
			rspnInt64DefReadList.addElementHandler( "Id64Gen", getRspnId64GenRec() );
			rspnInt64DefReadList.addElementHandler( "Int64Col", getRspnInt64ColRec() );
		}
		return( rspnInt64DefReadList );
	}

	protected CFBamXMsgRspnInt64DefLocked getRspnInt64DefLocked() {
		if( rspnInt64DefLocked == null ) {
			rspnInt64DefLocked = new CFBamXMsgRspnInt64DefLocked( this );
		}
		return( rspnInt64DefLocked );
	}

	protected CFBamXMsgRspnInt64DefUpdated getRspnInt64DefUpdated() {
		if( rspnInt64DefUpdated == null ) {
			rspnInt64DefUpdated = new CFBamXMsgRspnInt64DefUpdated( this );
		}
		return( rspnInt64DefUpdated );
	}

	protected CFBamXMsgRspnInt64DefDeleted getRspnInt64DefDeleted() {
		if( rspnInt64DefDeleted == null ) {
			rspnInt64DefDeleted = new CFBamXMsgRspnInt64DefDeleted( this );
		}
		return( rspnInt64DefDeleted );
	}

	// Int64Type Response s

	protected CFBamXMsgRspnInt64TypeRec getRspnInt64TypeRec() {
		if( rspnInt64TypeRec == null ) {
			rspnInt64TypeRec = new CFBamXMsgRspnInt64TypeRec( this );
		}
		return( rspnInt64TypeRec );
	}

	protected CFBamXMsgRspnInt64TypeCreated getRspnInt64TypeCreated() {
		if( rspnInt64TypeCreated == null ) {
			rspnInt64TypeCreated = new CFBamXMsgRspnInt64TypeCreated( this );
		}
		return( rspnInt64TypeCreated );
	}

	protected CFBamXMsgRspnInt64TypeReadSingle getRspnInt64TypeReadSingle() {
		if( rspnInt64TypeReadSingle == null ) {
			rspnInt64TypeReadSingle = new CFBamXMsgRspnInt64TypeReadSingle( this );
			rspnInt64TypeReadSingle.addElementHandler( "Int64Type", getRspnInt64TypeRec() );
			rspnInt64TypeReadSingle.addElementHandler( "Id64Gen", getRspnId64GenRec() );
		}
		return( rspnInt64TypeReadSingle );
	}

	protected CFBamXMsgRspnInt64TypeReadList getRspnInt64TypeReadList() {
		if( rspnInt64TypeReadList == null ) {
			rspnInt64TypeReadList = new CFBamXMsgRspnInt64TypeReadList( this );
			rspnInt64TypeReadList.addElementHandler( "Int64Type", getRspnInt64TypeRec() );
			rspnInt64TypeReadList.addElementHandler( "Id64Gen", getRspnId64GenRec() );
		}
		return( rspnInt64TypeReadList );
	}

	protected CFBamXMsgRspnInt64TypeLocked getRspnInt64TypeLocked() {
		if( rspnInt64TypeLocked == null ) {
			rspnInt64TypeLocked = new CFBamXMsgRspnInt64TypeLocked( this );
		}
		return( rspnInt64TypeLocked );
	}

	protected CFBamXMsgRspnInt64TypeUpdated getRspnInt64TypeUpdated() {
		if( rspnInt64TypeUpdated == null ) {
			rspnInt64TypeUpdated = new CFBamXMsgRspnInt64TypeUpdated( this );
		}
		return( rspnInt64TypeUpdated );
	}

	protected CFBamXMsgRspnInt64TypeDeleted getRspnInt64TypeDeleted() {
		if( rspnInt64TypeDeleted == null ) {
			rspnInt64TypeDeleted = new CFBamXMsgRspnInt64TypeDeleted( this );
		}
		return( rspnInt64TypeDeleted );
	}

	// MajorVersion Response s

	protected CFBamXMsgRspnMajorVersionRec getRspnMajorVersionRec() {
		if( rspnMajorVersionRec == null ) {
			rspnMajorVersionRec = new CFBamXMsgRspnMajorVersionRec( this );
		}
		return( rspnMajorVersionRec );
	}

	protected CFBamXMsgRspnMajorVersionCreated getRspnMajorVersionCreated() {
		if( rspnMajorVersionCreated == null ) {
			rspnMajorVersionCreated = new CFBamXMsgRspnMajorVersionCreated( this );
		}
		return( rspnMajorVersionCreated );
	}

	protected CFBamXMsgRspnMajorVersionReadSingle getRspnMajorVersionReadSingle() {
		if( rspnMajorVersionReadSingle == null ) {
			rspnMajorVersionReadSingle = new CFBamXMsgRspnMajorVersionReadSingle( this );
			rspnMajorVersionReadSingle.addElementHandler( "MajorVersion", getRspnMajorVersionRec() );
		}
		return( rspnMajorVersionReadSingle );
	}

	protected CFBamXMsgRspnMajorVersionReadList getRspnMajorVersionReadList() {
		if( rspnMajorVersionReadList == null ) {
			rspnMajorVersionReadList = new CFBamXMsgRspnMajorVersionReadList( this );
			rspnMajorVersionReadList.addElementHandler( "MajorVersion", getRspnMajorVersionRec() );
		}
		return( rspnMajorVersionReadList );
	}

	protected CFBamXMsgRspnMajorVersionLocked getRspnMajorVersionLocked() {
		if( rspnMajorVersionLocked == null ) {
			rspnMajorVersionLocked = new CFBamXMsgRspnMajorVersionLocked( this );
		}
		return( rspnMajorVersionLocked );
	}

	protected CFBamXMsgRspnMajorVersionUpdated getRspnMajorVersionUpdated() {
		if( rspnMajorVersionUpdated == null ) {
			rspnMajorVersionUpdated = new CFBamXMsgRspnMajorVersionUpdated( this );
		}
		return( rspnMajorVersionUpdated );
	}

	protected CFBamXMsgRspnMajorVersionDeleted getRspnMajorVersionDeleted() {
		if( rspnMajorVersionDeleted == null ) {
			rspnMajorVersionDeleted = new CFBamXMsgRspnMajorVersionDeleted( this );
		}
		return( rspnMajorVersionDeleted );
	}

	// MimeType Response s

	protected CFBamXMsgRspnMimeTypeRec getRspnMimeTypeRec() {
		if( rspnMimeTypeRec == null ) {
			rspnMimeTypeRec = new CFBamXMsgRspnMimeTypeRec( this );
		}
		return( rspnMimeTypeRec );
	}

	protected CFBamXMsgRspnMimeTypeCreated getRspnMimeTypeCreated() {
		if( rspnMimeTypeCreated == null ) {
			rspnMimeTypeCreated = new CFBamXMsgRspnMimeTypeCreated( this );
		}
		return( rspnMimeTypeCreated );
	}

	protected CFBamXMsgRspnMimeTypeReadSingle getRspnMimeTypeReadSingle() {
		if( rspnMimeTypeReadSingle == null ) {
			rspnMimeTypeReadSingle = new CFBamXMsgRspnMimeTypeReadSingle( this );
			rspnMimeTypeReadSingle.addElementHandler( "MimeType", getRspnMimeTypeRec() );
		}
		return( rspnMimeTypeReadSingle );
	}

	protected CFBamXMsgRspnMimeTypeReadList getRspnMimeTypeReadList() {
		if( rspnMimeTypeReadList == null ) {
			rspnMimeTypeReadList = new CFBamXMsgRspnMimeTypeReadList( this );
			rspnMimeTypeReadList.addElementHandler( "MimeType", getRspnMimeTypeRec() );
		}
		return( rspnMimeTypeReadList );
	}

	protected CFBamXMsgRspnMimeTypeLocked getRspnMimeTypeLocked() {
		if( rspnMimeTypeLocked == null ) {
			rspnMimeTypeLocked = new CFBamXMsgRspnMimeTypeLocked( this );
		}
		return( rspnMimeTypeLocked );
	}

	protected CFBamXMsgRspnMimeTypeUpdated getRspnMimeTypeUpdated() {
		if( rspnMimeTypeUpdated == null ) {
			rspnMimeTypeUpdated = new CFBamXMsgRspnMimeTypeUpdated( this );
		}
		return( rspnMimeTypeUpdated );
	}

	protected CFBamXMsgRspnMimeTypeDeleted getRspnMimeTypeDeleted() {
		if( rspnMimeTypeDeleted == null ) {
			rspnMimeTypeDeleted = new CFBamXMsgRspnMimeTypeDeleted( this );
		}
		return( rspnMimeTypeDeleted );
	}

	// MinorVersion Response s

	protected CFBamXMsgRspnMinorVersionRec getRspnMinorVersionRec() {
		if( rspnMinorVersionRec == null ) {
			rspnMinorVersionRec = new CFBamXMsgRspnMinorVersionRec( this );
		}
		return( rspnMinorVersionRec );
	}

	protected CFBamXMsgRspnMinorVersionCreated getRspnMinorVersionCreated() {
		if( rspnMinorVersionCreated == null ) {
			rspnMinorVersionCreated = new CFBamXMsgRspnMinorVersionCreated( this );
		}
		return( rspnMinorVersionCreated );
	}

	protected CFBamXMsgRspnMinorVersionReadSingle getRspnMinorVersionReadSingle() {
		if( rspnMinorVersionReadSingle == null ) {
			rspnMinorVersionReadSingle = new CFBamXMsgRspnMinorVersionReadSingle( this );
			rspnMinorVersionReadSingle.addElementHandler( "MinorVersion", getRspnMinorVersionRec() );
		}
		return( rspnMinorVersionReadSingle );
	}

	protected CFBamXMsgRspnMinorVersionReadList getRspnMinorVersionReadList() {
		if( rspnMinorVersionReadList == null ) {
			rspnMinorVersionReadList = new CFBamXMsgRspnMinorVersionReadList( this );
			rspnMinorVersionReadList.addElementHandler( "MinorVersion", getRspnMinorVersionRec() );
		}
		return( rspnMinorVersionReadList );
	}

	protected CFBamXMsgRspnMinorVersionLocked getRspnMinorVersionLocked() {
		if( rspnMinorVersionLocked == null ) {
			rspnMinorVersionLocked = new CFBamXMsgRspnMinorVersionLocked( this );
		}
		return( rspnMinorVersionLocked );
	}

	protected CFBamXMsgRspnMinorVersionUpdated getRspnMinorVersionUpdated() {
		if( rspnMinorVersionUpdated == null ) {
			rspnMinorVersionUpdated = new CFBamXMsgRspnMinorVersionUpdated( this );
		}
		return( rspnMinorVersionUpdated );
	}

	protected CFBamXMsgRspnMinorVersionDeleted getRspnMinorVersionDeleted() {
		if( rspnMinorVersionDeleted == null ) {
			rspnMinorVersionDeleted = new CFBamXMsgRspnMinorVersionDeleted( this );
		}
		return( rspnMinorVersionDeleted );
	}

	// NmTokenCol Response s

	protected CFBamXMsgRspnNmTokenColRec getRspnNmTokenColRec() {
		if( rspnNmTokenColRec == null ) {
			rspnNmTokenColRec = new CFBamXMsgRspnNmTokenColRec( this );
		}
		return( rspnNmTokenColRec );
	}

	protected CFBamXMsgRspnNmTokenColCreated getRspnNmTokenColCreated() {
		if( rspnNmTokenColCreated == null ) {
			rspnNmTokenColCreated = new CFBamXMsgRspnNmTokenColCreated( this );
		}
		return( rspnNmTokenColCreated );
	}

	protected CFBamXMsgRspnNmTokenColReadSingle getRspnNmTokenColReadSingle() {
		if( rspnNmTokenColReadSingle == null ) {
			rspnNmTokenColReadSingle = new CFBamXMsgRspnNmTokenColReadSingle( this );
			rspnNmTokenColReadSingle.addElementHandler( "NmTokenCol", getRspnNmTokenColRec() );
		}
		return( rspnNmTokenColReadSingle );
	}

	protected CFBamXMsgRspnNmTokenColReadList getRspnNmTokenColReadList() {
		if( rspnNmTokenColReadList == null ) {
			rspnNmTokenColReadList = new CFBamXMsgRspnNmTokenColReadList( this );
			rspnNmTokenColReadList.addElementHandler( "NmTokenCol", getRspnNmTokenColRec() );
		}
		return( rspnNmTokenColReadList );
	}

	protected CFBamXMsgRspnNmTokenColLocked getRspnNmTokenColLocked() {
		if( rspnNmTokenColLocked == null ) {
			rspnNmTokenColLocked = new CFBamXMsgRspnNmTokenColLocked( this );
		}
		return( rspnNmTokenColLocked );
	}

	protected CFBamXMsgRspnNmTokenColUpdated getRspnNmTokenColUpdated() {
		if( rspnNmTokenColUpdated == null ) {
			rspnNmTokenColUpdated = new CFBamXMsgRspnNmTokenColUpdated( this );
		}
		return( rspnNmTokenColUpdated );
	}

	protected CFBamXMsgRspnNmTokenColDeleted getRspnNmTokenColDeleted() {
		if( rspnNmTokenColDeleted == null ) {
			rspnNmTokenColDeleted = new CFBamXMsgRspnNmTokenColDeleted( this );
		}
		return( rspnNmTokenColDeleted );
	}

	// NmTokenDef Response s

	protected CFBamXMsgRspnNmTokenDefRec getRspnNmTokenDefRec() {
		if( rspnNmTokenDefRec == null ) {
			rspnNmTokenDefRec = new CFBamXMsgRspnNmTokenDefRec( this );
		}
		return( rspnNmTokenDefRec );
	}

	protected CFBamXMsgRspnNmTokenDefCreated getRspnNmTokenDefCreated() {
		if( rspnNmTokenDefCreated == null ) {
			rspnNmTokenDefCreated = new CFBamXMsgRspnNmTokenDefCreated( this );
		}
		return( rspnNmTokenDefCreated );
	}

	protected CFBamXMsgRspnNmTokenDefReadSingle getRspnNmTokenDefReadSingle() {
		if( rspnNmTokenDefReadSingle == null ) {
			rspnNmTokenDefReadSingle = new CFBamXMsgRspnNmTokenDefReadSingle( this );
			rspnNmTokenDefReadSingle.addElementHandler( "NmTokenDef", getRspnNmTokenDefRec() );
			rspnNmTokenDefReadSingle.addElementHandler( "NmTokenType", getRspnNmTokenTypeRec() );
			rspnNmTokenDefReadSingle.addElementHandler( "NmTokenCol", getRspnNmTokenColRec() );
		}
		return( rspnNmTokenDefReadSingle );
	}

	protected CFBamXMsgRspnNmTokenDefReadList getRspnNmTokenDefReadList() {
		if( rspnNmTokenDefReadList == null ) {
			rspnNmTokenDefReadList = new CFBamXMsgRspnNmTokenDefReadList( this );
			rspnNmTokenDefReadList.addElementHandler( "NmTokenDef", getRspnNmTokenDefRec() );
			rspnNmTokenDefReadList.addElementHandler( "NmTokenType", getRspnNmTokenTypeRec() );
			rspnNmTokenDefReadList.addElementHandler( "NmTokenCol", getRspnNmTokenColRec() );
		}
		return( rspnNmTokenDefReadList );
	}

	protected CFBamXMsgRspnNmTokenDefLocked getRspnNmTokenDefLocked() {
		if( rspnNmTokenDefLocked == null ) {
			rspnNmTokenDefLocked = new CFBamXMsgRspnNmTokenDefLocked( this );
		}
		return( rspnNmTokenDefLocked );
	}

	protected CFBamXMsgRspnNmTokenDefUpdated getRspnNmTokenDefUpdated() {
		if( rspnNmTokenDefUpdated == null ) {
			rspnNmTokenDefUpdated = new CFBamXMsgRspnNmTokenDefUpdated( this );
		}
		return( rspnNmTokenDefUpdated );
	}

	protected CFBamXMsgRspnNmTokenDefDeleted getRspnNmTokenDefDeleted() {
		if( rspnNmTokenDefDeleted == null ) {
			rspnNmTokenDefDeleted = new CFBamXMsgRspnNmTokenDefDeleted( this );
		}
		return( rspnNmTokenDefDeleted );
	}

	// NmTokenType Response s

	protected CFBamXMsgRspnNmTokenTypeRec getRspnNmTokenTypeRec() {
		if( rspnNmTokenTypeRec == null ) {
			rspnNmTokenTypeRec = new CFBamXMsgRspnNmTokenTypeRec( this );
		}
		return( rspnNmTokenTypeRec );
	}

	protected CFBamXMsgRspnNmTokenTypeCreated getRspnNmTokenTypeCreated() {
		if( rspnNmTokenTypeCreated == null ) {
			rspnNmTokenTypeCreated = new CFBamXMsgRspnNmTokenTypeCreated( this );
		}
		return( rspnNmTokenTypeCreated );
	}

	protected CFBamXMsgRspnNmTokenTypeReadSingle getRspnNmTokenTypeReadSingle() {
		if( rspnNmTokenTypeReadSingle == null ) {
			rspnNmTokenTypeReadSingle = new CFBamXMsgRspnNmTokenTypeReadSingle( this );
			rspnNmTokenTypeReadSingle.addElementHandler( "NmTokenType", getRspnNmTokenTypeRec() );
		}
		return( rspnNmTokenTypeReadSingle );
	}

	protected CFBamXMsgRspnNmTokenTypeReadList getRspnNmTokenTypeReadList() {
		if( rspnNmTokenTypeReadList == null ) {
			rspnNmTokenTypeReadList = new CFBamXMsgRspnNmTokenTypeReadList( this );
			rspnNmTokenTypeReadList.addElementHandler( "NmTokenType", getRspnNmTokenTypeRec() );
		}
		return( rspnNmTokenTypeReadList );
	}

	protected CFBamXMsgRspnNmTokenTypeLocked getRspnNmTokenTypeLocked() {
		if( rspnNmTokenTypeLocked == null ) {
			rspnNmTokenTypeLocked = new CFBamXMsgRspnNmTokenTypeLocked( this );
		}
		return( rspnNmTokenTypeLocked );
	}

	protected CFBamXMsgRspnNmTokenTypeUpdated getRspnNmTokenTypeUpdated() {
		if( rspnNmTokenTypeUpdated == null ) {
			rspnNmTokenTypeUpdated = new CFBamXMsgRspnNmTokenTypeUpdated( this );
		}
		return( rspnNmTokenTypeUpdated );
	}

	protected CFBamXMsgRspnNmTokenTypeDeleted getRspnNmTokenTypeDeleted() {
		if( rspnNmTokenTypeDeleted == null ) {
			rspnNmTokenTypeDeleted = new CFBamXMsgRspnNmTokenTypeDeleted( this );
		}
		return( rspnNmTokenTypeDeleted );
	}

	// NmTokensCol Response s

	protected CFBamXMsgRspnNmTokensColRec getRspnNmTokensColRec() {
		if( rspnNmTokensColRec == null ) {
			rspnNmTokensColRec = new CFBamXMsgRspnNmTokensColRec( this );
		}
		return( rspnNmTokensColRec );
	}

	protected CFBamXMsgRspnNmTokensColCreated getRspnNmTokensColCreated() {
		if( rspnNmTokensColCreated == null ) {
			rspnNmTokensColCreated = new CFBamXMsgRspnNmTokensColCreated( this );
		}
		return( rspnNmTokensColCreated );
	}

	protected CFBamXMsgRspnNmTokensColReadSingle getRspnNmTokensColReadSingle() {
		if( rspnNmTokensColReadSingle == null ) {
			rspnNmTokensColReadSingle = new CFBamXMsgRspnNmTokensColReadSingle( this );
			rspnNmTokensColReadSingle.addElementHandler( "NmTokensCol", getRspnNmTokensColRec() );
		}
		return( rspnNmTokensColReadSingle );
	}

	protected CFBamXMsgRspnNmTokensColReadList getRspnNmTokensColReadList() {
		if( rspnNmTokensColReadList == null ) {
			rspnNmTokensColReadList = new CFBamXMsgRspnNmTokensColReadList( this );
			rspnNmTokensColReadList.addElementHandler( "NmTokensCol", getRspnNmTokensColRec() );
		}
		return( rspnNmTokensColReadList );
	}

	protected CFBamXMsgRspnNmTokensColLocked getRspnNmTokensColLocked() {
		if( rspnNmTokensColLocked == null ) {
			rspnNmTokensColLocked = new CFBamXMsgRspnNmTokensColLocked( this );
		}
		return( rspnNmTokensColLocked );
	}

	protected CFBamXMsgRspnNmTokensColUpdated getRspnNmTokensColUpdated() {
		if( rspnNmTokensColUpdated == null ) {
			rspnNmTokensColUpdated = new CFBamXMsgRspnNmTokensColUpdated( this );
		}
		return( rspnNmTokensColUpdated );
	}

	protected CFBamXMsgRspnNmTokensColDeleted getRspnNmTokensColDeleted() {
		if( rspnNmTokensColDeleted == null ) {
			rspnNmTokensColDeleted = new CFBamXMsgRspnNmTokensColDeleted( this );
		}
		return( rspnNmTokensColDeleted );
	}

	// NmTokensDef Response s

	protected CFBamXMsgRspnNmTokensDefRec getRspnNmTokensDefRec() {
		if( rspnNmTokensDefRec == null ) {
			rspnNmTokensDefRec = new CFBamXMsgRspnNmTokensDefRec( this );
		}
		return( rspnNmTokensDefRec );
	}

	protected CFBamXMsgRspnNmTokensDefCreated getRspnNmTokensDefCreated() {
		if( rspnNmTokensDefCreated == null ) {
			rspnNmTokensDefCreated = new CFBamXMsgRspnNmTokensDefCreated( this );
		}
		return( rspnNmTokensDefCreated );
	}

	protected CFBamXMsgRspnNmTokensDefReadSingle getRspnNmTokensDefReadSingle() {
		if( rspnNmTokensDefReadSingle == null ) {
			rspnNmTokensDefReadSingle = new CFBamXMsgRspnNmTokensDefReadSingle( this );
			rspnNmTokensDefReadSingle.addElementHandler( "NmTokensDef", getRspnNmTokensDefRec() );
			rspnNmTokensDefReadSingle.addElementHandler( "NmTokensType", getRspnNmTokensTypeRec() );
			rspnNmTokensDefReadSingle.addElementHandler( "NmTokensCol", getRspnNmTokensColRec() );
		}
		return( rspnNmTokensDefReadSingle );
	}

	protected CFBamXMsgRspnNmTokensDefReadList getRspnNmTokensDefReadList() {
		if( rspnNmTokensDefReadList == null ) {
			rspnNmTokensDefReadList = new CFBamXMsgRspnNmTokensDefReadList( this );
			rspnNmTokensDefReadList.addElementHandler( "NmTokensDef", getRspnNmTokensDefRec() );
			rspnNmTokensDefReadList.addElementHandler( "NmTokensType", getRspnNmTokensTypeRec() );
			rspnNmTokensDefReadList.addElementHandler( "NmTokensCol", getRspnNmTokensColRec() );
		}
		return( rspnNmTokensDefReadList );
	}

	protected CFBamXMsgRspnNmTokensDefLocked getRspnNmTokensDefLocked() {
		if( rspnNmTokensDefLocked == null ) {
			rspnNmTokensDefLocked = new CFBamXMsgRspnNmTokensDefLocked( this );
		}
		return( rspnNmTokensDefLocked );
	}

	protected CFBamXMsgRspnNmTokensDefUpdated getRspnNmTokensDefUpdated() {
		if( rspnNmTokensDefUpdated == null ) {
			rspnNmTokensDefUpdated = new CFBamXMsgRspnNmTokensDefUpdated( this );
		}
		return( rspnNmTokensDefUpdated );
	}

	protected CFBamXMsgRspnNmTokensDefDeleted getRspnNmTokensDefDeleted() {
		if( rspnNmTokensDefDeleted == null ) {
			rspnNmTokensDefDeleted = new CFBamXMsgRspnNmTokensDefDeleted( this );
		}
		return( rspnNmTokensDefDeleted );
	}

	// NmTokensType Response s

	protected CFBamXMsgRspnNmTokensTypeRec getRspnNmTokensTypeRec() {
		if( rspnNmTokensTypeRec == null ) {
			rspnNmTokensTypeRec = new CFBamXMsgRspnNmTokensTypeRec( this );
		}
		return( rspnNmTokensTypeRec );
	}

	protected CFBamXMsgRspnNmTokensTypeCreated getRspnNmTokensTypeCreated() {
		if( rspnNmTokensTypeCreated == null ) {
			rspnNmTokensTypeCreated = new CFBamXMsgRspnNmTokensTypeCreated( this );
		}
		return( rspnNmTokensTypeCreated );
	}

	protected CFBamXMsgRspnNmTokensTypeReadSingle getRspnNmTokensTypeReadSingle() {
		if( rspnNmTokensTypeReadSingle == null ) {
			rspnNmTokensTypeReadSingle = new CFBamXMsgRspnNmTokensTypeReadSingle( this );
			rspnNmTokensTypeReadSingle.addElementHandler( "NmTokensType", getRspnNmTokensTypeRec() );
		}
		return( rspnNmTokensTypeReadSingle );
	}

	protected CFBamXMsgRspnNmTokensTypeReadList getRspnNmTokensTypeReadList() {
		if( rspnNmTokensTypeReadList == null ) {
			rspnNmTokensTypeReadList = new CFBamXMsgRspnNmTokensTypeReadList( this );
			rspnNmTokensTypeReadList.addElementHandler( "NmTokensType", getRspnNmTokensTypeRec() );
		}
		return( rspnNmTokensTypeReadList );
	}

	protected CFBamXMsgRspnNmTokensTypeLocked getRspnNmTokensTypeLocked() {
		if( rspnNmTokensTypeLocked == null ) {
			rspnNmTokensTypeLocked = new CFBamXMsgRspnNmTokensTypeLocked( this );
		}
		return( rspnNmTokensTypeLocked );
	}

	protected CFBamXMsgRspnNmTokensTypeUpdated getRspnNmTokensTypeUpdated() {
		if( rspnNmTokensTypeUpdated == null ) {
			rspnNmTokensTypeUpdated = new CFBamXMsgRspnNmTokensTypeUpdated( this );
		}
		return( rspnNmTokensTypeUpdated );
	}

	protected CFBamXMsgRspnNmTokensTypeDeleted getRspnNmTokensTypeDeleted() {
		if( rspnNmTokensTypeDeleted == null ) {
			rspnNmTokensTypeDeleted = new CFBamXMsgRspnNmTokensTypeDeleted( this );
		}
		return( rspnNmTokensTypeDeleted );
	}

	// NumberCol Response s

	protected CFBamXMsgRspnNumberColRec getRspnNumberColRec() {
		if( rspnNumberColRec == null ) {
			rspnNumberColRec = new CFBamXMsgRspnNumberColRec( this );
		}
		return( rspnNumberColRec );
	}

	protected CFBamXMsgRspnNumberColCreated getRspnNumberColCreated() {
		if( rspnNumberColCreated == null ) {
			rspnNumberColCreated = new CFBamXMsgRspnNumberColCreated( this );
		}
		return( rspnNumberColCreated );
	}

	protected CFBamXMsgRspnNumberColReadSingle getRspnNumberColReadSingle() {
		if( rspnNumberColReadSingle == null ) {
			rspnNumberColReadSingle = new CFBamXMsgRspnNumberColReadSingle( this );
			rspnNumberColReadSingle.addElementHandler( "NumberCol", getRspnNumberColRec() );
		}
		return( rspnNumberColReadSingle );
	}

	protected CFBamXMsgRspnNumberColReadList getRspnNumberColReadList() {
		if( rspnNumberColReadList == null ) {
			rspnNumberColReadList = new CFBamXMsgRspnNumberColReadList( this );
			rspnNumberColReadList.addElementHandler( "NumberCol", getRspnNumberColRec() );
		}
		return( rspnNumberColReadList );
	}

	protected CFBamXMsgRspnNumberColLocked getRspnNumberColLocked() {
		if( rspnNumberColLocked == null ) {
			rspnNumberColLocked = new CFBamXMsgRspnNumberColLocked( this );
		}
		return( rspnNumberColLocked );
	}

	protected CFBamXMsgRspnNumberColUpdated getRspnNumberColUpdated() {
		if( rspnNumberColUpdated == null ) {
			rspnNumberColUpdated = new CFBamXMsgRspnNumberColUpdated( this );
		}
		return( rspnNumberColUpdated );
	}

	protected CFBamXMsgRspnNumberColDeleted getRspnNumberColDeleted() {
		if( rspnNumberColDeleted == null ) {
			rspnNumberColDeleted = new CFBamXMsgRspnNumberColDeleted( this );
		}
		return( rspnNumberColDeleted );
	}

	// NumberDef Response s

	protected CFBamXMsgRspnNumberDefRec getRspnNumberDefRec() {
		if( rspnNumberDefRec == null ) {
			rspnNumberDefRec = new CFBamXMsgRspnNumberDefRec( this );
		}
		return( rspnNumberDefRec );
	}

	protected CFBamXMsgRspnNumberDefCreated getRspnNumberDefCreated() {
		if( rspnNumberDefCreated == null ) {
			rspnNumberDefCreated = new CFBamXMsgRspnNumberDefCreated( this );
		}
		return( rspnNumberDefCreated );
	}

	protected CFBamXMsgRspnNumberDefReadSingle getRspnNumberDefReadSingle() {
		if( rspnNumberDefReadSingle == null ) {
			rspnNumberDefReadSingle = new CFBamXMsgRspnNumberDefReadSingle( this );
			rspnNumberDefReadSingle.addElementHandler( "NumberDef", getRspnNumberDefRec() );
			rspnNumberDefReadSingle.addElementHandler( "NumberType", getRspnNumberTypeRec() );
			rspnNumberDefReadSingle.addElementHandler( "NumberCol", getRspnNumberColRec() );
		}
		return( rspnNumberDefReadSingle );
	}

	protected CFBamXMsgRspnNumberDefReadList getRspnNumberDefReadList() {
		if( rspnNumberDefReadList == null ) {
			rspnNumberDefReadList = new CFBamXMsgRspnNumberDefReadList( this );
			rspnNumberDefReadList.addElementHandler( "NumberDef", getRspnNumberDefRec() );
			rspnNumberDefReadList.addElementHandler( "NumberType", getRspnNumberTypeRec() );
			rspnNumberDefReadList.addElementHandler( "NumberCol", getRspnNumberColRec() );
		}
		return( rspnNumberDefReadList );
	}

	protected CFBamXMsgRspnNumberDefLocked getRspnNumberDefLocked() {
		if( rspnNumberDefLocked == null ) {
			rspnNumberDefLocked = new CFBamXMsgRspnNumberDefLocked( this );
		}
		return( rspnNumberDefLocked );
	}

	protected CFBamXMsgRspnNumberDefUpdated getRspnNumberDefUpdated() {
		if( rspnNumberDefUpdated == null ) {
			rspnNumberDefUpdated = new CFBamXMsgRspnNumberDefUpdated( this );
		}
		return( rspnNumberDefUpdated );
	}

	protected CFBamXMsgRspnNumberDefDeleted getRspnNumberDefDeleted() {
		if( rspnNumberDefDeleted == null ) {
			rspnNumberDefDeleted = new CFBamXMsgRspnNumberDefDeleted( this );
		}
		return( rspnNumberDefDeleted );
	}

	// NumberType Response s

	protected CFBamXMsgRspnNumberTypeRec getRspnNumberTypeRec() {
		if( rspnNumberTypeRec == null ) {
			rspnNumberTypeRec = new CFBamXMsgRspnNumberTypeRec( this );
		}
		return( rspnNumberTypeRec );
	}

	protected CFBamXMsgRspnNumberTypeCreated getRspnNumberTypeCreated() {
		if( rspnNumberTypeCreated == null ) {
			rspnNumberTypeCreated = new CFBamXMsgRspnNumberTypeCreated( this );
		}
		return( rspnNumberTypeCreated );
	}

	protected CFBamXMsgRspnNumberTypeReadSingle getRspnNumberTypeReadSingle() {
		if( rspnNumberTypeReadSingle == null ) {
			rspnNumberTypeReadSingle = new CFBamXMsgRspnNumberTypeReadSingle( this );
			rspnNumberTypeReadSingle.addElementHandler( "NumberType", getRspnNumberTypeRec() );
		}
		return( rspnNumberTypeReadSingle );
	}

	protected CFBamXMsgRspnNumberTypeReadList getRspnNumberTypeReadList() {
		if( rspnNumberTypeReadList == null ) {
			rspnNumberTypeReadList = new CFBamXMsgRspnNumberTypeReadList( this );
			rspnNumberTypeReadList.addElementHandler( "NumberType", getRspnNumberTypeRec() );
		}
		return( rspnNumberTypeReadList );
	}

	protected CFBamXMsgRspnNumberTypeLocked getRspnNumberTypeLocked() {
		if( rspnNumberTypeLocked == null ) {
			rspnNumberTypeLocked = new CFBamXMsgRspnNumberTypeLocked( this );
		}
		return( rspnNumberTypeLocked );
	}

	protected CFBamXMsgRspnNumberTypeUpdated getRspnNumberTypeUpdated() {
		if( rspnNumberTypeUpdated == null ) {
			rspnNumberTypeUpdated = new CFBamXMsgRspnNumberTypeUpdated( this );
		}
		return( rspnNumberTypeUpdated );
	}

	protected CFBamXMsgRspnNumberTypeDeleted getRspnNumberTypeDeleted() {
		if( rspnNumberTypeDeleted == null ) {
			rspnNumberTypeDeleted = new CFBamXMsgRspnNumberTypeDeleted( this );
		}
		return( rspnNumberTypeDeleted );
	}

	// Param Response s

	protected CFBamXMsgRspnParamRec getRspnParamRec() {
		if( rspnParamRec == null ) {
			rspnParamRec = new CFBamXMsgRspnParamRec( this );
		}
		return( rspnParamRec );
	}

	protected CFBamXMsgRspnParamCreated getRspnParamCreated() {
		if( rspnParamCreated == null ) {
			rspnParamCreated = new CFBamXMsgRspnParamCreated( this );
		}
		return( rspnParamCreated );
	}

	protected CFBamXMsgRspnParamReadSingle getRspnParamReadSingle() {
		if( rspnParamReadSingle == null ) {
			rspnParamReadSingle = new CFBamXMsgRspnParamReadSingle( this );
			rspnParamReadSingle.addElementHandler( "Param", getRspnParamRec() );
		}
		return( rspnParamReadSingle );
	}

	protected CFBamXMsgRspnParamReadList getRspnParamReadList() {
		if( rspnParamReadList == null ) {
			rspnParamReadList = new CFBamXMsgRspnParamReadList( this );
			rspnParamReadList.addElementHandler( "Param", getRspnParamRec() );
		}
		return( rspnParamReadList );
	}

	protected CFBamXMsgRspnParamLocked getRspnParamLocked() {
		if( rspnParamLocked == null ) {
			rspnParamLocked = new CFBamXMsgRspnParamLocked( this );
		}
		return( rspnParamLocked );
	}

	protected CFBamXMsgRspnParamUpdated getRspnParamUpdated() {
		if( rspnParamUpdated == null ) {
			rspnParamUpdated = new CFBamXMsgRspnParamUpdated( this );
		}
		return( rspnParamUpdated );
	}

	protected CFBamXMsgRspnParamDeleted getRspnParamDeleted() {
		if( rspnParamDeleted == null ) {
			rspnParamDeleted = new CFBamXMsgRspnParamDeleted( this );
		}
		return( rspnParamDeleted );
	}

	// PopDep Response s

	protected CFBamXMsgRspnPopDepRec getRspnPopDepRec() {
		if( rspnPopDepRec == null ) {
			rspnPopDepRec = new CFBamXMsgRspnPopDepRec( this );
		}
		return( rspnPopDepRec );
	}

	protected CFBamXMsgRspnPopDepCreated getRspnPopDepCreated() {
		if( rspnPopDepCreated == null ) {
			rspnPopDepCreated = new CFBamXMsgRspnPopDepCreated( this );
		}
		return( rspnPopDepCreated );
	}

	protected CFBamXMsgRspnPopDepReadSingle getRspnPopDepReadSingle() {
		if( rspnPopDepReadSingle == null ) {
			rspnPopDepReadSingle = new CFBamXMsgRspnPopDepReadSingle( this );
			rspnPopDepReadSingle.addElementHandler( "PopDep", getRspnPopDepRec() );
			rspnPopDepReadSingle.addElementHandler( "PopSubDep1", getRspnPopSubDep1Rec() );
			rspnPopDepReadSingle.addElementHandler( "PopSubDep2", getRspnPopSubDep2Rec() );
			rspnPopDepReadSingle.addElementHandler( "PopSubDep3", getRspnPopSubDep3Rec() );
			rspnPopDepReadSingle.addElementHandler( "PopTopDep", getRspnPopTopDepRec() );
		}
		return( rspnPopDepReadSingle );
	}

	protected CFBamXMsgRspnPopDepReadList getRspnPopDepReadList() {
		if( rspnPopDepReadList == null ) {
			rspnPopDepReadList = new CFBamXMsgRspnPopDepReadList( this );
			rspnPopDepReadList.addElementHandler( "PopDep", getRspnPopDepRec() );
			rspnPopDepReadList.addElementHandler( "PopSubDep1", getRspnPopSubDep1Rec() );
			rspnPopDepReadList.addElementHandler( "PopSubDep2", getRspnPopSubDep2Rec() );
			rspnPopDepReadList.addElementHandler( "PopSubDep3", getRspnPopSubDep3Rec() );
			rspnPopDepReadList.addElementHandler( "PopTopDep", getRspnPopTopDepRec() );
		}
		return( rspnPopDepReadList );
	}

	protected CFBamXMsgRspnPopDepLocked getRspnPopDepLocked() {
		if( rspnPopDepLocked == null ) {
			rspnPopDepLocked = new CFBamXMsgRspnPopDepLocked( this );
		}
		return( rspnPopDepLocked );
	}

	protected CFBamXMsgRspnPopDepUpdated getRspnPopDepUpdated() {
		if( rspnPopDepUpdated == null ) {
			rspnPopDepUpdated = new CFBamXMsgRspnPopDepUpdated( this );
		}
		return( rspnPopDepUpdated );
	}

	protected CFBamXMsgRspnPopDepDeleted getRspnPopDepDeleted() {
		if( rspnPopDepDeleted == null ) {
			rspnPopDepDeleted = new CFBamXMsgRspnPopDepDeleted( this );
		}
		return( rspnPopDepDeleted );
	}

	// PopSubDep1 Response s

	protected CFBamXMsgRspnPopSubDep1Rec getRspnPopSubDep1Rec() {
		if( rspnPopSubDep1Rec == null ) {
			rspnPopSubDep1Rec = new CFBamXMsgRspnPopSubDep1Rec( this );
		}
		return( rspnPopSubDep1Rec );
	}

	protected CFBamXMsgRspnPopSubDep1Created getRspnPopSubDep1Created() {
		if( rspnPopSubDep1Created == null ) {
			rspnPopSubDep1Created = new CFBamXMsgRspnPopSubDep1Created( this );
		}
		return( rspnPopSubDep1Created );
	}

	protected CFBamXMsgRspnPopSubDep1ReadSingle getRspnPopSubDep1ReadSingle() {
		if( rspnPopSubDep1ReadSingle == null ) {
			rspnPopSubDep1ReadSingle = new CFBamXMsgRspnPopSubDep1ReadSingle( this );
			rspnPopSubDep1ReadSingle.addElementHandler( "PopSubDep1", getRspnPopSubDep1Rec() );
		}
		return( rspnPopSubDep1ReadSingle );
	}

	protected CFBamXMsgRspnPopSubDep1ReadList getRspnPopSubDep1ReadList() {
		if( rspnPopSubDep1ReadList == null ) {
			rspnPopSubDep1ReadList = new CFBamXMsgRspnPopSubDep1ReadList( this );
			rspnPopSubDep1ReadList.addElementHandler( "PopSubDep1", getRspnPopSubDep1Rec() );
		}
		return( rspnPopSubDep1ReadList );
	}

	protected CFBamXMsgRspnPopSubDep1Locked getRspnPopSubDep1Locked() {
		if( rspnPopSubDep1Locked == null ) {
			rspnPopSubDep1Locked = new CFBamXMsgRspnPopSubDep1Locked( this );
		}
		return( rspnPopSubDep1Locked );
	}

	protected CFBamXMsgRspnPopSubDep1Updated getRspnPopSubDep1Updated() {
		if( rspnPopSubDep1Updated == null ) {
			rspnPopSubDep1Updated = new CFBamXMsgRspnPopSubDep1Updated( this );
		}
		return( rspnPopSubDep1Updated );
	}

	protected CFBamXMsgRspnPopSubDep1Deleted getRspnPopSubDep1Deleted() {
		if( rspnPopSubDep1Deleted == null ) {
			rspnPopSubDep1Deleted = new CFBamXMsgRspnPopSubDep1Deleted( this );
		}
		return( rspnPopSubDep1Deleted );
	}

	// PopSubDep2 Response s

	protected CFBamXMsgRspnPopSubDep2Rec getRspnPopSubDep2Rec() {
		if( rspnPopSubDep2Rec == null ) {
			rspnPopSubDep2Rec = new CFBamXMsgRspnPopSubDep2Rec( this );
		}
		return( rspnPopSubDep2Rec );
	}

	protected CFBamXMsgRspnPopSubDep2Created getRspnPopSubDep2Created() {
		if( rspnPopSubDep2Created == null ) {
			rspnPopSubDep2Created = new CFBamXMsgRspnPopSubDep2Created( this );
		}
		return( rspnPopSubDep2Created );
	}

	protected CFBamXMsgRspnPopSubDep2ReadSingle getRspnPopSubDep2ReadSingle() {
		if( rspnPopSubDep2ReadSingle == null ) {
			rspnPopSubDep2ReadSingle = new CFBamXMsgRspnPopSubDep2ReadSingle( this );
			rspnPopSubDep2ReadSingle.addElementHandler( "PopSubDep2", getRspnPopSubDep2Rec() );
		}
		return( rspnPopSubDep2ReadSingle );
	}

	protected CFBamXMsgRspnPopSubDep2ReadList getRspnPopSubDep2ReadList() {
		if( rspnPopSubDep2ReadList == null ) {
			rspnPopSubDep2ReadList = new CFBamXMsgRspnPopSubDep2ReadList( this );
			rspnPopSubDep2ReadList.addElementHandler( "PopSubDep2", getRspnPopSubDep2Rec() );
		}
		return( rspnPopSubDep2ReadList );
	}

	protected CFBamXMsgRspnPopSubDep2Locked getRspnPopSubDep2Locked() {
		if( rspnPopSubDep2Locked == null ) {
			rspnPopSubDep2Locked = new CFBamXMsgRspnPopSubDep2Locked( this );
		}
		return( rspnPopSubDep2Locked );
	}

	protected CFBamXMsgRspnPopSubDep2Updated getRspnPopSubDep2Updated() {
		if( rspnPopSubDep2Updated == null ) {
			rspnPopSubDep2Updated = new CFBamXMsgRspnPopSubDep2Updated( this );
		}
		return( rspnPopSubDep2Updated );
	}

	protected CFBamXMsgRspnPopSubDep2Deleted getRspnPopSubDep2Deleted() {
		if( rspnPopSubDep2Deleted == null ) {
			rspnPopSubDep2Deleted = new CFBamXMsgRspnPopSubDep2Deleted( this );
		}
		return( rspnPopSubDep2Deleted );
	}

	// PopSubDep3 Response s

	protected CFBamXMsgRspnPopSubDep3Rec getRspnPopSubDep3Rec() {
		if( rspnPopSubDep3Rec == null ) {
			rspnPopSubDep3Rec = new CFBamXMsgRspnPopSubDep3Rec( this );
		}
		return( rspnPopSubDep3Rec );
	}

	protected CFBamXMsgRspnPopSubDep3Created getRspnPopSubDep3Created() {
		if( rspnPopSubDep3Created == null ) {
			rspnPopSubDep3Created = new CFBamXMsgRspnPopSubDep3Created( this );
		}
		return( rspnPopSubDep3Created );
	}

	protected CFBamXMsgRspnPopSubDep3ReadSingle getRspnPopSubDep3ReadSingle() {
		if( rspnPopSubDep3ReadSingle == null ) {
			rspnPopSubDep3ReadSingle = new CFBamXMsgRspnPopSubDep3ReadSingle( this );
			rspnPopSubDep3ReadSingle.addElementHandler( "PopSubDep3", getRspnPopSubDep3Rec() );
		}
		return( rspnPopSubDep3ReadSingle );
	}

	protected CFBamXMsgRspnPopSubDep3ReadList getRspnPopSubDep3ReadList() {
		if( rspnPopSubDep3ReadList == null ) {
			rspnPopSubDep3ReadList = new CFBamXMsgRspnPopSubDep3ReadList( this );
			rspnPopSubDep3ReadList.addElementHandler( "PopSubDep3", getRspnPopSubDep3Rec() );
		}
		return( rspnPopSubDep3ReadList );
	}

	protected CFBamXMsgRspnPopSubDep3Locked getRspnPopSubDep3Locked() {
		if( rspnPopSubDep3Locked == null ) {
			rspnPopSubDep3Locked = new CFBamXMsgRspnPopSubDep3Locked( this );
		}
		return( rspnPopSubDep3Locked );
	}

	protected CFBamXMsgRspnPopSubDep3Updated getRspnPopSubDep3Updated() {
		if( rspnPopSubDep3Updated == null ) {
			rspnPopSubDep3Updated = new CFBamXMsgRspnPopSubDep3Updated( this );
		}
		return( rspnPopSubDep3Updated );
	}

	protected CFBamXMsgRspnPopSubDep3Deleted getRspnPopSubDep3Deleted() {
		if( rspnPopSubDep3Deleted == null ) {
			rspnPopSubDep3Deleted = new CFBamXMsgRspnPopSubDep3Deleted( this );
		}
		return( rspnPopSubDep3Deleted );
	}

	// PopTopDep Response s

	protected CFBamXMsgRspnPopTopDepRec getRspnPopTopDepRec() {
		if( rspnPopTopDepRec == null ) {
			rspnPopTopDepRec = new CFBamXMsgRspnPopTopDepRec( this );
		}
		return( rspnPopTopDepRec );
	}

	protected CFBamXMsgRspnPopTopDepCreated getRspnPopTopDepCreated() {
		if( rspnPopTopDepCreated == null ) {
			rspnPopTopDepCreated = new CFBamXMsgRspnPopTopDepCreated( this );
		}
		return( rspnPopTopDepCreated );
	}

	protected CFBamXMsgRspnPopTopDepReadSingle getRspnPopTopDepReadSingle() {
		if( rspnPopTopDepReadSingle == null ) {
			rspnPopTopDepReadSingle = new CFBamXMsgRspnPopTopDepReadSingle( this );
			rspnPopTopDepReadSingle.addElementHandler( "PopTopDep", getRspnPopTopDepRec() );
		}
		return( rspnPopTopDepReadSingle );
	}

	protected CFBamXMsgRspnPopTopDepReadList getRspnPopTopDepReadList() {
		if( rspnPopTopDepReadList == null ) {
			rspnPopTopDepReadList = new CFBamXMsgRspnPopTopDepReadList( this );
			rspnPopTopDepReadList.addElementHandler( "PopTopDep", getRspnPopTopDepRec() );
		}
		return( rspnPopTopDepReadList );
	}

	protected CFBamXMsgRspnPopTopDepLocked getRspnPopTopDepLocked() {
		if( rspnPopTopDepLocked == null ) {
			rspnPopTopDepLocked = new CFBamXMsgRspnPopTopDepLocked( this );
		}
		return( rspnPopTopDepLocked );
	}

	protected CFBamXMsgRspnPopTopDepUpdated getRspnPopTopDepUpdated() {
		if( rspnPopTopDepUpdated == null ) {
			rspnPopTopDepUpdated = new CFBamXMsgRspnPopTopDepUpdated( this );
		}
		return( rspnPopTopDepUpdated );
	}

	protected CFBamXMsgRspnPopTopDepDeleted getRspnPopTopDepDeleted() {
		if( rspnPopTopDepDeleted == null ) {
			rspnPopTopDepDeleted = new CFBamXMsgRspnPopTopDepDeleted( this );
		}
		return( rspnPopTopDepDeleted );
	}

	// Relation Response s

	protected CFBamXMsgRspnRelationRec getRspnRelationRec() {
		if( rspnRelationRec == null ) {
			rspnRelationRec = new CFBamXMsgRspnRelationRec( this );
		}
		return( rspnRelationRec );
	}

	protected CFBamXMsgRspnRelationCreated getRspnRelationCreated() {
		if( rspnRelationCreated == null ) {
			rspnRelationCreated = new CFBamXMsgRspnRelationCreated( this );
		}
		return( rspnRelationCreated );
	}

	protected CFBamXMsgRspnRelationReadSingle getRspnRelationReadSingle() {
		if( rspnRelationReadSingle == null ) {
			rspnRelationReadSingle = new CFBamXMsgRspnRelationReadSingle( this );
			rspnRelationReadSingle.addElementHandler( "Relation", getRspnRelationRec() );
		}
		return( rspnRelationReadSingle );
	}

	protected CFBamXMsgRspnRelationReadList getRspnRelationReadList() {
		if( rspnRelationReadList == null ) {
			rspnRelationReadList = new CFBamXMsgRspnRelationReadList( this );
			rspnRelationReadList.addElementHandler( "Relation", getRspnRelationRec() );
		}
		return( rspnRelationReadList );
	}

	protected CFBamXMsgRspnRelationLocked getRspnRelationLocked() {
		if( rspnRelationLocked == null ) {
			rspnRelationLocked = new CFBamXMsgRspnRelationLocked( this );
		}
		return( rspnRelationLocked );
	}

	protected CFBamXMsgRspnRelationUpdated getRspnRelationUpdated() {
		if( rspnRelationUpdated == null ) {
			rspnRelationUpdated = new CFBamXMsgRspnRelationUpdated( this );
		}
		return( rspnRelationUpdated );
	}

	protected CFBamXMsgRspnRelationDeleted getRspnRelationDeleted() {
		if( rspnRelationDeleted == null ) {
			rspnRelationDeleted = new CFBamXMsgRspnRelationDeleted( this );
		}
		return( rspnRelationDeleted );
	}

	// RelationCol Response s

	protected CFBamXMsgRspnRelationColRec getRspnRelationColRec() {
		if( rspnRelationColRec == null ) {
			rspnRelationColRec = new CFBamXMsgRspnRelationColRec( this );
		}
		return( rspnRelationColRec );
	}

	protected CFBamXMsgRspnRelationColCreated getRspnRelationColCreated() {
		if( rspnRelationColCreated == null ) {
			rspnRelationColCreated = new CFBamXMsgRspnRelationColCreated( this );
		}
		return( rspnRelationColCreated );
	}

	protected CFBamXMsgRspnRelationColReadSingle getRspnRelationColReadSingle() {
		if( rspnRelationColReadSingle == null ) {
			rspnRelationColReadSingle = new CFBamXMsgRspnRelationColReadSingle( this );
			rspnRelationColReadSingle.addElementHandler( "RelationCol", getRspnRelationColRec() );
		}
		return( rspnRelationColReadSingle );
	}

	protected CFBamXMsgRspnRelationColReadList getRspnRelationColReadList() {
		if( rspnRelationColReadList == null ) {
			rspnRelationColReadList = new CFBamXMsgRspnRelationColReadList( this );
			rspnRelationColReadList.addElementHandler( "RelationCol", getRspnRelationColRec() );
		}
		return( rspnRelationColReadList );
	}

	protected CFBamXMsgRspnRelationColLocked getRspnRelationColLocked() {
		if( rspnRelationColLocked == null ) {
			rspnRelationColLocked = new CFBamXMsgRspnRelationColLocked( this );
		}
		return( rspnRelationColLocked );
	}

	protected CFBamXMsgRspnRelationColUpdated getRspnRelationColUpdated() {
		if( rspnRelationColUpdated == null ) {
			rspnRelationColUpdated = new CFBamXMsgRspnRelationColUpdated( this );
		}
		return( rspnRelationColUpdated );
	}

	protected CFBamXMsgRspnRelationColDeleted getRspnRelationColDeleted() {
		if( rspnRelationColDeleted == null ) {
			rspnRelationColDeleted = new CFBamXMsgRspnRelationColDeleted( this );
		}
		return( rspnRelationColDeleted );
	}

	// SchemaDef Response s

	protected CFBamXMsgRspnSchemaDefRec getRspnSchemaDefRec() {
		if( rspnSchemaDefRec == null ) {
			rspnSchemaDefRec = new CFBamXMsgRspnSchemaDefRec( this );
		}
		return( rspnSchemaDefRec );
	}

	protected CFBamXMsgRspnSchemaDefCreated getRspnSchemaDefCreated() {
		if( rspnSchemaDefCreated == null ) {
			rspnSchemaDefCreated = new CFBamXMsgRspnSchemaDefCreated( this );
		}
		return( rspnSchemaDefCreated );
	}

	protected CFBamXMsgRspnSchemaDefReadSingle getRspnSchemaDefReadSingle() {
		if( rspnSchemaDefReadSingle == null ) {
			rspnSchemaDefReadSingle = new CFBamXMsgRspnSchemaDefReadSingle( this );
			rspnSchemaDefReadSingle.addElementHandler( "SchemaDef", getRspnSchemaDefRec() );
		}
		return( rspnSchemaDefReadSingle );
	}

	protected CFBamXMsgRspnSchemaDefReadList getRspnSchemaDefReadList() {
		if( rspnSchemaDefReadList == null ) {
			rspnSchemaDefReadList = new CFBamXMsgRspnSchemaDefReadList( this );
			rspnSchemaDefReadList.addElementHandler( "SchemaDef", getRspnSchemaDefRec() );
		}
		return( rspnSchemaDefReadList );
	}

	protected CFBamXMsgRspnSchemaDefLocked getRspnSchemaDefLocked() {
		if( rspnSchemaDefLocked == null ) {
			rspnSchemaDefLocked = new CFBamXMsgRspnSchemaDefLocked( this );
		}
		return( rspnSchemaDefLocked );
	}

	protected CFBamXMsgRspnSchemaDefUpdated getRspnSchemaDefUpdated() {
		if( rspnSchemaDefUpdated == null ) {
			rspnSchemaDefUpdated = new CFBamXMsgRspnSchemaDefUpdated( this );
		}
		return( rspnSchemaDefUpdated );
	}

	protected CFBamXMsgRspnSchemaDefDeleted getRspnSchemaDefDeleted() {
		if( rspnSchemaDefDeleted == null ) {
			rspnSchemaDefDeleted = new CFBamXMsgRspnSchemaDefDeleted( this );
		}
		return( rspnSchemaDefDeleted );
	}

	// SchemaRef Response s

	protected CFBamXMsgRspnSchemaRefRec getRspnSchemaRefRec() {
		if( rspnSchemaRefRec == null ) {
			rspnSchemaRefRec = new CFBamXMsgRspnSchemaRefRec( this );
		}
		return( rspnSchemaRefRec );
	}

	protected CFBamXMsgRspnSchemaRefCreated getRspnSchemaRefCreated() {
		if( rspnSchemaRefCreated == null ) {
			rspnSchemaRefCreated = new CFBamXMsgRspnSchemaRefCreated( this );
		}
		return( rspnSchemaRefCreated );
	}

	protected CFBamXMsgRspnSchemaRefReadSingle getRspnSchemaRefReadSingle() {
		if( rspnSchemaRefReadSingle == null ) {
			rspnSchemaRefReadSingle = new CFBamXMsgRspnSchemaRefReadSingle( this );
			rspnSchemaRefReadSingle.addElementHandler( "SchemaRef", getRspnSchemaRefRec() );
		}
		return( rspnSchemaRefReadSingle );
	}

	protected CFBamXMsgRspnSchemaRefReadList getRspnSchemaRefReadList() {
		if( rspnSchemaRefReadList == null ) {
			rspnSchemaRefReadList = new CFBamXMsgRspnSchemaRefReadList( this );
			rspnSchemaRefReadList.addElementHandler( "SchemaRef", getRspnSchemaRefRec() );
		}
		return( rspnSchemaRefReadList );
	}

	protected CFBamXMsgRspnSchemaRefLocked getRspnSchemaRefLocked() {
		if( rspnSchemaRefLocked == null ) {
			rspnSchemaRefLocked = new CFBamXMsgRspnSchemaRefLocked( this );
		}
		return( rspnSchemaRefLocked );
	}

	protected CFBamXMsgRspnSchemaRefUpdated getRspnSchemaRefUpdated() {
		if( rspnSchemaRefUpdated == null ) {
			rspnSchemaRefUpdated = new CFBamXMsgRspnSchemaRefUpdated( this );
		}
		return( rspnSchemaRefUpdated );
	}

	protected CFBamXMsgRspnSchemaRefDeleted getRspnSchemaRefDeleted() {
		if( rspnSchemaRefDeleted == null ) {
			rspnSchemaRefDeleted = new CFBamXMsgRspnSchemaRefDeleted( this );
		}
		return( rspnSchemaRefDeleted );
	}

	// Scope Response s

	protected CFBamXMsgRspnScopeRec getRspnScopeRec() {
		if( rspnScopeRec == null ) {
			rspnScopeRec = new CFBamXMsgRspnScopeRec( this );
		}
		return( rspnScopeRec );
	}

	protected CFBamXMsgRspnScopeCreated getRspnScopeCreated() {
		if( rspnScopeCreated == null ) {
			rspnScopeCreated = new CFBamXMsgRspnScopeCreated( this );
		}
		return( rspnScopeCreated );
	}

	protected CFBamXMsgRspnScopeReadSingle getRspnScopeReadSingle() {
		if( rspnScopeReadSingle == null ) {
			rspnScopeReadSingle = new CFBamXMsgRspnScopeReadSingle( this );
			rspnScopeReadSingle.addElementHandler( "Scope", getRspnScopeRec() );
			rspnScopeReadSingle.addElementHandler( "SchemaDef", getRspnSchemaDefRec() );
			rspnScopeReadSingle.addElementHandler( "SchemaRef", getRspnSchemaRefRec() );
			rspnScopeReadSingle.addElementHandler( "ServerMethod", getRspnServerMethodRec() );
			rspnScopeReadSingle.addElementHandler( "ServerObjFunc", getRspnServerObjFuncRec() );
			rspnScopeReadSingle.addElementHandler( "ServerProc", getRspnServerProcRec() );
			rspnScopeReadSingle.addElementHandler( "ServerListFunc", getRspnServerListFuncRec() );
			rspnScopeReadSingle.addElementHandler( "Table", getRspnTableRec() );
			rspnScopeReadSingle.addElementHandler( "ClearDep", getRspnClearDepRec() );
			rspnScopeReadSingle.addElementHandler( "ClearSubDep1", getRspnClearSubDep1Rec() );
			rspnScopeReadSingle.addElementHandler( "ClearSubDep2", getRspnClearSubDep2Rec() );
			rspnScopeReadSingle.addElementHandler( "ClearSubDep3", getRspnClearSubDep3Rec() );
			rspnScopeReadSingle.addElementHandler( "ClearTopDep", getRspnClearTopDepRec() );
			rspnScopeReadSingle.addElementHandler( "DelDep", getRspnDelDepRec() );
			rspnScopeReadSingle.addElementHandler( "DelSubDep1", getRspnDelSubDep1Rec() );
			rspnScopeReadSingle.addElementHandler( "DelSubDep2", getRspnDelSubDep2Rec() );
			rspnScopeReadSingle.addElementHandler( "DelSubDep3", getRspnDelSubDep3Rec() );
			rspnScopeReadSingle.addElementHandler( "DelTopDep", getRspnDelTopDepRec() );
			rspnScopeReadSingle.addElementHandler( "Index", getRspnIndexRec() );
			rspnScopeReadSingle.addElementHandler( "PopDep", getRspnPopDepRec() );
			rspnScopeReadSingle.addElementHandler( "PopSubDep1", getRspnPopSubDep1Rec() );
			rspnScopeReadSingle.addElementHandler( "PopSubDep2", getRspnPopSubDep2Rec() );
			rspnScopeReadSingle.addElementHandler( "PopSubDep3", getRspnPopSubDep3Rec() );
			rspnScopeReadSingle.addElementHandler( "PopTopDep", getRspnPopTopDepRec() );
			rspnScopeReadSingle.addElementHandler( "Relation", getRspnRelationRec() );
		}
		return( rspnScopeReadSingle );
	}

	protected CFBamXMsgRspnScopeReadList getRspnScopeReadList() {
		if( rspnScopeReadList == null ) {
			rspnScopeReadList = new CFBamXMsgRspnScopeReadList( this );
			rspnScopeReadList.addElementHandler( "Scope", getRspnScopeRec() );
			rspnScopeReadList.addElementHandler( "SchemaDef", getRspnSchemaDefRec() );
			rspnScopeReadList.addElementHandler( "SchemaRef", getRspnSchemaRefRec() );
			rspnScopeReadList.addElementHandler( "ServerMethod", getRspnServerMethodRec() );
			rspnScopeReadList.addElementHandler( "ServerObjFunc", getRspnServerObjFuncRec() );
			rspnScopeReadList.addElementHandler( "ServerProc", getRspnServerProcRec() );
			rspnScopeReadList.addElementHandler( "ServerListFunc", getRspnServerListFuncRec() );
			rspnScopeReadList.addElementHandler( "Table", getRspnTableRec() );
			rspnScopeReadList.addElementHandler( "ClearDep", getRspnClearDepRec() );
			rspnScopeReadList.addElementHandler( "ClearSubDep1", getRspnClearSubDep1Rec() );
			rspnScopeReadList.addElementHandler( "ClearSubDep2", getRspnClearSubDep2Rec() );
			rspnScopeReadList.addElementHandler( "ClearSubDep3", getRspnClearSubDep3Rec() );
			rspnScopeReadList.addElementHandler( "ClearTopDep", getRspnClearTopDepRec() );
			rspnScopeReadList.addElementHandler( "DelDep", getRspnDelDepRec() );
			rspnScopeReadList.addElementHandler( "DelSubDep1", getRspnDelSubDep1Rec() );
			rspnScopeReadList.addElementHandler( "DelSubDep2", getRspnDelSubDep2Rec() );
			rspnScopeReadList.addElementHandler( "DelSubDep3", getRspnDelSubDep3Rec() );
			rspnScopeReadList.addElementHandler( "DelTopDep", getRspnDelTopDepRec() );
			rspnScopeReadList.addElementHandler( "Index", getRspnIndexRec() );
			rspnScopeReadList.addElementHandler( "PopDep", getRspnPopDepRec() );
			rspnScopeReadList.addElementHandler( "PopSubDep1", getRspnPopSubDep1Rec() );
			rspnScopeReadList.addElementHandler( "PopSubDep2", getRspnPopSubDep2Rec() );
			rspnScopeReadList.addElementHandler( "PopSubDep3", getRspnPopSubDep3Rec() );
			rspnScopeReadList.addElementHandler( "PopTopDep", getRspnPopTopDepRec() );
			rspnScopeReadList.addElementHandler( "Relation", getRspnRelationRec() );
		}
		return( rspnScopeReadList );
	}

	protected CFBamXMsgRspnScopeLocked getRspnScopeLocked() {
		if( rspnScopeLocked == null ) {
			rspnScopeLocked = new CFBamXMsgRspnScopeLocked( this );
		}
		return( rspnScopeLocked );
	}

	protected CFBamXMsgRspnScopeUpdated getRspnScopeUpdated() {
		if( rspnScopeUpdated == null ) {
			rspnScopeUpdated = new CFBamXMsgRspnScopeUpdated( this );
		}
		return( rspnScopeUpdated );
	}

	protected CFBamXMsgRspnScopeDeleted getRspnScopeDeleted() {
		if( rspnScopeDeleted == null ) {
			rspnScopeDeleted = new CFBamXMsgRspnScopeDeleted( this );
		}
		return( rspnScopeDeleted );
	}

	// SecApp Response s

	protected CFBamXMsgRspnSecAppRec getRspnSecAppRec() {
		if( rspnSecAppRec == null ) {
			rspnSecAppRec = new CFBamXMsgRspnSecAppRec( this );
		}
		return( rspnSecAppRec );
	}

	protected CFBamXMsgRspnSecAppCreated getRspnSecAppCreated() {
		if( rspnSecAppCreated == null ) {
			rspnSecAppCreated = new CFBamXMsgRspnSecAppCreated( this );
		}
		return( rspnSecAppCreated );
	}

	protected CFBamXMsgRspnSecAppReadSingle getRspnSecAppReadSingle() {
		if( rspnSecAppReadSingle == null ) {
			rspnSecAppReadSingle = new CFBamXMsgRspnSecAppReadSingle( this );
			rspnSecAppReadSingle.addElementHandler( "SecApp", getRspnSecAppRec() );
		}
		return( rspnSecAppReadSingle );
	}

	protected CFBamXMsgRspnSecAppReadList getRspnSecAppReadList() {
		if( rspnSecAppReadList == null ) {
			rspnSecAppReadList = new CFBamXMsgRspnSecAppReadList( this );
			rspnSecAppReadList.addElementHandler( "SecApp", getRspnSecAppRec() );
		}
		return( rspnSecAppReadList );
	}

	protected CFBamXMsgRspnSecAppLocked getRspnSecAppLocked() {
		if( rspnSecAppLocked == null ) {
			rspnSecAppLocked = new CFBamXMsgRspnSecAppLocked( this );
		}
		return( rspnSecAppLocked );
	}

	protected CFBamXMsgRspnSecAppUpdated getRspnSecAppUpdated() {
		if( rspnSecAppUpdated == null ) {
			rspnSecAppUpdated = new CFBamXMsgRspnSecAppUpdated( this );
		}
		return( rspnSecAppUpdated );
	}

	protected CFBamXMsgRspnSecAppDeleted getRspnSecAppDeleted() {
		if( rspnSecAppDeleted == null ) {
			rspnSecAppDeleted = new CFBamXMsgRspnSecAppDeleted( this );
		}
		return( rspnSecAppDeleted );
	}

	// SecDevice Response s

	protected CFBamXMsgRspnSecDeviceRec getRspnSecDeviceRec() {
		if( rspnSecDeviceRec == null ) {
			rspnSecDeviceRec = new CFBamXMsgRspnSecDeviceRec( this );
		}
		return( rspnSecDeviceRec );
	}

	protected CFBamXMsgRspnSecDeviceCreated getRspnSecDeviceCreated() {
		if( rspnSecDeviceCreated == null ) {
			rspnSecDeviceCreated = new CFBamXMsgRspnSecDeviceCreated( this );
		}
		return( rspnSecDeviceCreated );
	}

	protected CFBamXMsgRspnSecDeviceReadSingle getRspnSecDeviceReadSingle() {
		if( rspnSecDeviceReadSingle == null ) {
			rspnSecDeviceReadSingle = new CFBamXMsgRspnSecDeviceReadSingle( this );
			rspnSecDeviceReadSingle.addElementHandler( "SecDevice", getRspnSecDeviceRec() );
		}
		return( rspnSecDeviceReadSingle );
	}

	protected CFBamXMsgRspnSecDeviceReadList getRspnSecDeviceReadList() {
		if( rspnSecDeviceReadList == null ) {
			rspnSecDeviceReadList = new CFBamXMsgRspnSecDeviceReadList( this );
			rspnSecDeviceReadList.addElementHandler( "SecDevice", getRspnSecDeviceRec() );
		}
		return( rspnSecDeviceReadList );
	}

	protected CFBamXMsgRspnSecDeviceLocked getRspnSecDeviceLocked() {
		if( rspnSecDeviceLocked == null ) {
			rspnSecDeviceLocked = new CFBamXMsgRspnSecDeviceLocked( this );
		}
		return( rspnSecDeviceLocked );
	}

	protected CFBamXMsgRspnSecDeviceUpdated getRspnSecDeviceUpdated() {
		if( rspnSecDeviceUpdated == null ) {
			rspnSecDeviceUpdated = new CFBamXMsgRspnSecDeviceUpdated( this );
		}
		return( rspnSecDeviceUpdated );
	}

	protected CFBamXMsgRspnSecDeviceDeleted getRspnSecDeviceDeleted() {
		if( rspnSecDeviceDeleted == null ) {
			rspnSecDeviceDeleted = new CFBamXMsgRspnSecDeviceDeleted( this );
		}
		return( rspnSecDeviceDeleted );
	}

	// SecForm Response s

	protected CFBamXMsgRspnSecFormRec getRspnSecFormRec() {
		if( rspnSecFormRec == null ) {
			rspnSecFormRec = new CFBamXMsgRspnSecFormRec( this );
		}
		return( rspnSecFormRec );
	}

	protected CFBamXMsgRspnSecFormCreated getRspnSecFormCreated() {
		if( rspnSecFormCreated == null ) {
			rspnSecFormCreated = new CFBamXMsgRspnSecFormCreated( this );
		}
		return( rspnSecFormCreated );
	}

	protected CFBamXMsgRspnSecFormReadSingle getRspnSecFormReadSingle() {
		if( rspnSecFormReadSingle == null ) {
			rspnSecFormReadSingle = new CFBamXMsgRspnSecFormReadSingle( this );
			rspnSecFormReadSingle.addElementHandler( "SecForm", getRspnSecFormRec() );
		}
		return( rspnSecFormReadSingle );
	}

	protected CFBamXMsgRspnSecFormReadList getRspnSecFormReadList() {
		if( rspnSecFormReadList == null ) {
			rspnSecFormReadList = new CFBamXMsgRspnSecFormReadList( this );
			rspnSecFormReadList.addElementHandler( "SecForm", getRspnSecFormRec() );
		}
		return( rspnSecFormReadList );
	}

	protected CFBamXMsgRspnSecFormLocked getRspnSecFormLocked() {
		if( rspnSecFormLocked == null ) {
			rspnSecFormLocked = new CFBamXMsgRspnSecFormLocked( this );
		}
		return( rspnSecFormLocked );
	}

	protected CFBamXMsgRspnSecFormUpdated getRspnSecFormUpdated() {
		if( rspnSecFormUpdated == null ) {
			rspnSecFormUpdated = new CFBamXMsgRspnSecFormUpdated( this );
		}
		return( rspnSecFormUpdated );
	}

	protected CFBamXMsgRspnSecFormDeleted getRspnSecFormDeleted() {
		if( rspnSecFormDeleted == null ) {
			rspnSecFormDeleted = new CFBamXMsgRspnSecFormDeleted( this );
		}
		return( rspnSecFormDeleted );
	}

	// SecGroup Response s

	protected CFBamXMsgRspnSecGroupRec getRspnSecGroupRec() {
		if( rspnSecGroupRec == null ) {
			rspnSecGroupRec = new CFBamXMsgRspnSecGroupRec( this );
		}
		return( rspnSecGroupRec );
	}

	protected CFBamXMsgRspnSecGroupCreated getRspnSecGroupCreated() {
		if( rspnSecGroupCreated == null ) {
			rspnSecGroupCreated = new CFBamXMsgRspnSecGroupCreated( this );
		}
		return( rspnSecGroupCreated );
	}

	protected CFBamXMsgRspnSecGroupReadSingle getRspnSecGroupReadSingle() {
		if( rspnSecGroupReadSingle == null ) {
			rspnSecGroupReadSingle = new CFBamXMsgRspnSecGroupReadSingle( this );
			rspnSecGroupReadSingle.addElementHandler( "SecGroup", getRspnSecGroupRec() );
		}
		return( rspnSecGroupReadSingle );
	}

	protected CFBamXMsgRspnSecGroupReadList getRspnSecGroupReadList() {
		if( rspnSecGroupReadList == null ) {
			rspnSecGroupReadList = new CFBamXMsgRspnSecGroupReadList( this );
			rspnSecGroupReadList.addElementHandler( "SecGroup", getRspnSecGroupRec() );
		}
		return( rspnSecGroupReadList );
	}

	protected CFBamXMsgRspnSecGroupLocked getRspnSecGroupLocked() {
		if( rspnSecGroupLocked == null ) {
			rspnSecGroupLocked = new CFBamXMsgRspnSecGroupLocked( this );
		}
		return( rspnSecGroupLocked );
	}

	protected CFBamXMsgRspnSecGroupUpdated getRspnSecGroupUpdated() {
		if( rspnSecGroupUpdated == null ) {
			rspnSecGroupUpdated = new CFBamXMsgRspnSecGroupUpdated( this );
		}
		return( rspnSecGroupUpdated );
	}

	protected CFBamXMsgRspnSecGroupDeleted getRspnSecGroupDeleted() {
		if( rspnSecGroupDeleted == null ) {
			rspnSecGroupDeleted = new CFBamXMsgRspnSecGroupDeleted( this );
		}
		return( rspnSecGroupDeleted );
	}

	// SecGroupForm Response s

	protected CFBamXMsgRspnSecGroupFormRec getRspnSecGroupFormRec() {
		if( rspnSecGroupFormRec == null ) {
			rspnSecGroupFormRec = new CFBamXMsgRspnSecGroupFormRec( this );
		}
		return( rspnSecGroupFormRec );
	}

	protected CFBamXMsgRspnSecGroupFormCreated getRspnSecGroupFormCreated() {
		if( rspnSecGroupFormCreated == null ) {
			rspnSecGroupFormCreated = new CFBamXMsgRspnSecGroupFormCreated( this );
		}
		return( rspnSecGroupFormCreated );
	}

	protected CFBamXMsgRspnSecGroupFormReadSingle getRspnSecGroupFormReadSingle() {
		if( rspnSecGroupFormReadSingle == null ) {
			rspnSecGroupFormReadSingle = new CFBamXMsgRspnSecGroupFormReadSingle( this );
			rspnSecGroupFormReadSingle.addElementHandler( "SecGroupForm", getRspnSecGroupFormRec() );
		}
		return( rspnSecGroupFormReadSingle );
	}

	protected CFBamXMsgRspnSecGroupFormReadList getRspnSecGroupFormReadList() {
		if( rspnSecGroupFormReadList == null ) {
			rspnSecGroupFormReadList = new CFBamXMsgRspnSecGroupFormReadList( this );
			rspnSecGroupFormReadList.addElementHandler( "SecGroupForm", getRspnSecGroupFormRec() );
		}
		return( rspnSecGroupFormReadList );
	}

	protected CFBamXMsgRspnSecGroupFormLocked getRspnSecGroupFormLocked() {
		if( rspnSecGroupFormLocked == null ) {
			rspnSecGroupFormLocked = new CFBamXMsgRspnSecGroupFormLocked( this );
		}
		return( rspnSecGroupFormLocked );
	}

	protected CFBamXMsgRspnSecGroupFormUpdated getRspnSecGroupFormUpdated() {
		if( rspnSecGroupFormUpdated == null ) {
			rspnSecGroupFormUpdated = new CFBamXMsgRspnSecGroupFormUpdated( this );
		}
		return( rspnSecGroupFormUpdated );
	}

	protected CFBamXMsgRspnSecGroupFormDeleted getRspnSecGroupFormDeleted() {
		if( rspnSecGroupFormDeleted == null ) {
			rspnSecGroupFormDeleted = new CFBamXMsgRspnSecGroupFormDeleted( this );
		}
		return( rspnSecGroupFormDeleted );
	}

	// SecGrpInc Response s

	protected CFBamXMsgRspnSecGrpIncRec getRspnSecGrpIncRec() {
		if( rspnSecGrpIncRec == null ) {
			rspnSecGrpIncRec = new CFBamXMsgRspnSecGrpIncRec( this );
		}
		return( rspnSecGrpIncRec );
	}

	protected CFBamXMsgRspnSecGrpIncCreated getRspnSecGrpIncCreated() {
		if( rspnSecGrpIncCreated == null ) {
			rspnSecGrpIncCreated = new CFBamXMsgRspnSecGrpIncCreated( this );
		}
		return( rspnSecGrpIncCreated );
	}

	protected CFBamXMsgRspnSecGrpIncReadSingle getRspnSecGrpIncReadSingle() {
		if( rspnSecGrpIncReadSingle == null ) {
			rspnSecGrpIncReadSingle = new CFBamXMsgRspnSecGrpIncReadSingle( this );
			rspnSecGrpIncReadSingle.addElementHandler( "SecGrpInc", getRspnSecGrpIncRec() );
		}
		return( rspnSecGrpIncReadSingle );
	}

	protected CFBamXMsgRspnSecGrpIncReadList getRspnSecGrpIncReadList() {
		if( rspnSecGrpIncReadList == null ) {
			rspnSecGrpIncReadList = new CFBamXMsgRspnSecGrpIncReadList( this );
			rspnSecGrpIncReadList.addElementHandler( "SecGrpInc", getRspnSecGrpIncRec() );
		}
		return( rspnSecGrpIncReadList );
	}

	protected CFBamXMsgRspnSecGrpIncLocked getRspnSecGrpIncLocked() {
		if( rspnSecGrpIncLocked == null ) {
			rspnSecGrpIncLocked = new CFBamXMsgRspnSecGrpIncLocked( this );
		}
		return( rspnSecGrpIncLocked );
	}

	protected CFBamXMsgRspnSecGrpIncUpdated getRspnSecGrpIncUpdated() {
		if( rspnSecGrpIncUpdated == null ) {
			rspnSecGrpIncUpdated = new CFBamXMsgRspnSecGrpIncUpdated( this );
		}
		return( rspnSecGrpIncUpdated );
	}

	protected CFBamXMsgRspnSecGrpIncDeleted getRspnSecGrpIncDeleted() {
		if( rspnSecGrpIncDeleted == null ) {
			rspnSecGrpIncDeleted = new CFBamXMsgRspnSecGrpIncDeleted( this );
		}
		return( rspnSecGrpIncDeleted );
	}

	// SecGrpMemb Response s

	protected CFBamXMsgRspnSecGrpMembRec getRspnSecGrpMembRec() {
		if( rspnSecGrpMembRec == null ) {
			rspnSecGrpMembRec = new CFBamXMsgRspnSecGrpMembRec( this );
		}
		return( rspnSecGrpMembRec );
	}

	protected CFBamXMsgRspnSecGrpMembCreated getRspnSecGrpMembCreated() {
		if( rspnSecGrpMembCreated == null ) {
			rspnSecGrpMembCreated = new CFBamXMsgRspnSecGrpMembCreated( this );
		}
		return( rspnSecGrpMembCreated );
	}

	protected CFBamXMsgRspnSecGrpMembReadSingle getRspnSecGrpMembReadSingle() {
		if( rspnSecGrpMembReadSingle == null ) {
			rspnSecGrpMembReadSingle = new CFBamXMsgRspnSecGrpMembReadSingle( this );
			rspnSecGrpMembReadSingle.addElementHandler( "SecGrpMemb", getRspnSecGrpMembRec() );
		}
		return( rspnSecGrpMembReadSingle );
	}

	protected CFBamXMsgRspnSecGrpMembReadList getRspnSecGrpMembReadList() {
		if( rspnSecGrpMembReadList == null ) {
			rspnSecGrpMembReadList = new CFBamXMsgRspnSecGrpMembReadList( this );
			rspnSecGrpMembReadList.addElementHandler( "SecGrpMemb", getRspnSecGrpMembRec() );
		}
		return( rspnSecGrpMembReadList );
	}

	protected CFBamXMsgRspnSecGrpMembLocked getRspnSecGrpMembLocked() {
		if( rspnSecGrpMembLocked == null ) {
			rspnSecGrpMembLocked = new CFBamXMsgRspnSecGrpMembLocked( this );
		}
		return( rspnSecGrpMembLocked );
	}

	protected CFBamXMsgRspnSecGrpMembUpdated getRspnSecGrpMembUpdated() {
		if( rspnSecGrpMembUpdated == null ) {
			rspnSecGrpMembUpdated = new CFBamXMsgRspnSecGrpMembUpdated( this );
		}
		return( rspnSecGrpMembUpdated );
	}

	protected CFBamXMsgRspnSecGrpMembDeleted getRspnSecGrpMembDeleted() {
		if( rspnSecGrpMembDeleted == null ) {
			rspnSecGrpMembDeleted = new CFBamXMsgRspnSecGrpMembDeleted( this );
		}
		return( rspnSecGrpMembDeleted );
	}

	// SecSession Response s

	protected CFBamXMsgRspnSecSessionRec getRspnSecSessionRec() {
		if( rspnSecSessionRec == null ) {
			rspnSecSessionRec = new CFBamXMsgRspnSecSessionRec( this );
		}
		return( rspnSecSessionRec );
	}

	protected CFBamXMsgRspnSecSessionCreated getRspnSecSessionCreated() {
		if( rspnSecSessionCreated == null ) {
			rspnSecSessionCreated = new CFBamXMsgRspnSecSessionCreated( this );
		}
		return( rspnSecSessionCreated );
	}

	protected CFBamXMsgRspnSecSessionReadSingle getRspnSecSessionReadSingle() {
		if( rspnSecSessionReadSingle == null ) {
			rspnSecSessionReadSingle = new CFBamXMsgRspnSecSessionReadSingle( this );
			rspnSecSessionReadSingle.addElementHandler( "SecSession", getRspnSecSessionRec() );
		}
		return( rspnSecSessionReadSingle );
	}

	protected CFBamXMsgRspnSecSessionReadList getRspnSecSessionReadList() {
		if( rspnSecSessionReadList == null ) {
			rspnSecSessionReadList = new CFBamXMsgRspnSecSessionReadList( this );
			rspnSecSessionReadList.addElementHandler( "SecSession", getRspnSecSessionRec() );
		}
		return( rspnSecSessionReadList );
	}

	protected CFBamXMsgRspnSecSessionLocked getRspnSecSessionLocked() {
		if( rspnSecSessionLocked == null ) {
			rspnSecSessionLocked = new CFBamXMsgRspnSecSessionLocked( this );
		}
		return( rspnSecSessionLocked );
	}

	protected CFBamXMsgRspnSecSessionUpdated getRspnSecSessionUpdated() {
		if( rspnSecSessionUpdated == null ) {
			rspnSecSessionUpdated = new CFBamXMsgRspnSecSessionUpdated( this );
		}
		return( rspnSecSessionUpdated );
	}

	protected CFBamXMsgRspnSecSessionDeleted getRspnSecSessionDeleted() {
		if( rspnSecSessionDeleted == null ) {
			rspnSecSessionDeleted = new CFBamXMsgRspnSecSessionDeleted( this );
		}
		return( rspnSecSessionDeleted );
	}

	// SecUser Response s

	protected CFBamXMsgRspnSecUserRec getRspnSecUserRec() {
		if( rspnSecUserRec == null ) {
			rspnSecUserRec = new CFBamXMsgRspnSecUserRec( this );
		}
		return( rspnSecUserRec );
	}

	protected CFBamXMsgRspnSecUserCreated getRspnSecUserCreated() {
		if( rspnSecUserCreated == null ) {
			rspnSecUserCreated = new CFBamXMsgRspnSecUserCreated( this );
		}
		return( rspnSecUserCreated );
	}

	protected CFBamXMsgRspnSecUserReadSingle getRspnSecUserReadSingle() {
		if( rspnSecUserReadSingle == null ) {
			rspnSecUserReadSingle = new CFBamXMsgRspnSecUserReadSingle( this );
			rspnSecUserReadSingle.addElementHandler( "SecUser", getRspnSecUserRec() );
		}
		return( rspnSecUserReadSingle );
	}

	protected CFBamXMsgRspnSecUserReadList getRspnSecUserReadList() {
		if( rspnSecUserReadList == null ) {
			rspnSecUserReadList = new CFBamXMsgRspnSecUserReadList( this );
			rspnSecUserReadList.addElementHandler( "SecUser", getRspnSecUserRec() );
		}
		return( rspnSecUserReadList );
	}

	protected CFBamXMsgRspnSecUserLocked getRspnSecUserLocked() {
		if( rspnSecUserLocked == null ) {
			rspnSecUserLocked = new CFBamXMsgRspnSecUserLocked( this );
		}
		return( rspnSecUserLocked );
	}

	protected CFBamXMsgRspnSecUserUpdated getRspnSecUserUpdated() {
		if( rspnSecUserUpdated == null ) {
			rspnSecUserUpdated = new CFBamXMsgRspnSecUserUpdated( this );
		}
		return( rspnSecUserUpdated );
	}

	protected CFBamXMsgRspnSecUserDeleted getRspnSecUserDeleted() {
		if( rspnSecUserDeleted == null ) {
			rspnSecUserDeleted = new CFBamXMsgRspnSecUserDeleted( this );
		}
		return( rspnSecUserDeleted );
	}

	// ServerListFunc Response s

	protected CFBamXMsgRspnServerListFuncRec getRspnServerListFuncRec() {
		if( rspnServerListFuncRec == null ) {
			rspnServerListFuncRec = new CFBamXMsgRspnServerListFuncRec( this );
		}
		return( rspnServerListFuncRec );
	}

	protected CFBamXMsgRspnServerListFuncCreated getRspnServerListFuncCreated() {
		if( rspnServerListFuncCreated == null ) {
			rspnServerListFuncCreated = new CFBamXMsgRspnServerListFuncCreated( this );
		}
		return( rspnServerListFuncCreated );
	}

	protected CFBamXMsgRspnServerListFuncReadSingle getRspnServerListFuncReadSingle() {
		if( rspnServerListFuncReadSingle == null ) {
			rspnServerListFuncReadSingle = new CFBamXMsgRspnServerListFuncReadSingle( this );
			rspnServerListFuncReadSingle.addElementHandler( "ServerListFunc", getRspnServerListFuncRec() );
		}
		return( rspnServerListFuncReadSingle );
	}

	protected CFBamXMsgRspnServerListFuncReadList getRspnServerListFuncReadList() {
		if( rspnServerListFuncReadList == null ) {
			rspnServerListFuncReadList = new CFBamXMsgRspnServerListFuncReadList( this );
			rspnServerListFuncReadList.addElementHandler( "ServerListFunc", getRspnServerListFuncRec() );
		}
		return( rspnServerListFuncReadList );
	}

	protected CFBamXMsgRspnServerListFuncLocked getRspnServerListFuncLocked() {
		if( rspnServerListFuncLocked == null ) {
			rspnServerListFuncLocked = new CFBamXMsgRspnServerListFuncLocked( this );
		}
		return( rspnServerListFuncLocked );
	}

	protected CFBamXMsgRspnServerListFuncUpdated getRspnServerListFuncUpdated() {
		if( rspnServerListFuncUpdated == null ) {
			rspnServerListFuncUpdated = new CFBamXMsgRspnServerListFuncUpdated( this );
		}
		return( rspnServerListFuncUpdated );
	}

	protected CFBamXMsgRspnServerListFuncDeleted getRspnServerListFuncDeleted() {
		if( rspnServerListFuncDeleted == null ) {
			rspnServerListFuncDeleted = new CFBamXMsgRspnServerListFuncDeleted( this );
		}
		return( rspnServerListFuncDeleted );
	}

	// ServerMethod Response s

	protected CFBamXMsgRspnServerMethodRec getRspnServerMethodRec() {
		if( rspnServerMethodRec == null ) {
			rspnServerMethodRec = new CFBamXMsgRspnServerMethodRec( this );
		}
		return( rspnServerMethodRec );
	}

	protected CFBamXMsgRspnServerMethodCreated getRspnServerMethodCreated() {
		if( rspnServerMethodCreated == null ) {
			rspnServerMethodCreated = new CFBamXMsgRspnServerMethodCreated( this );
		}
		return( rspnServerMethodCreated );
	}

	protected CFBamXMsgRspnServerMethodReadSingle getRspnServerMethodReadSingle() {
		if( rspnServerMethodReadSingle == null ) {
			rspnServerMethodReadSingle = new CFBamXMsgRspnServerMethodReadSingle( this );
			rspnServerMethodReadSingle.addElementHandler( "ServerMethod", getRspnServerMethodRec() );
			rspnServerMethodReadSingle.addElementHandler( "ServerObjFunc", getRspnServerObjFuncRec() );
			rspnServerMethodReadSingle.addElementHandler( "ServerProc", getRspnServerProcRec() );
			rspnServerMethodReadSingle.addElementHandler( "ServerListFunc", getRspnServerListFuncRec() );
		}
		return( rspnServerMethodReadSingle );
	}

	protected CFBamXMsgRspnServerMethodReadList getRspnServerMethodReadList() {
		if( rspnServerMethodReadList == null ) {
			rspnServerMethodReadList = new CFBamXMsgRspnServerMethodReadList( this );
			rspnServerMethodReadList.addElementHandler( "ServerMethod", getRspnServerMethodRec() );
			rspnServerMethodReadList.addElementHandler( "ServerObjFunc", getRspnServerObjFuncRec() );
			rspnServerMethodReadList.addElementHandler( "ServerProc", getRspnServerProcRec() );
			rspnServerMethodReadList.addElementHandler( "ServerListFunc", getRspnServerListFuncRec() );
		}
		return( rspnServerMethodReadList );
	}

	protected CFBamXMsgRspnServerMethodLocked getRspnServerMethodLocked() {
		if( rspnServerMethodLocked == null ) {
			rspnServerMethodLocked = new CFBamXMsgRspnServerMethodLocked( this );
		}
		return( rspnServerMethodLocked );
	}

	protected CFBamXMsgRspnServerMethodUpdated getRspnServerMethodUpdated() {
		if( rspnServerMethodUpdated == null ) {
			rspnServerMethodUpdated = new CFBamXMsgRspnServerMethodUpdated( this );
		}
		return( rspnServerMethodUpdated );
	}

	protected CFBamXMsgRspnServerMethodDeleted getRspnServerMethodDeleted() {
		if( rspnServerMethodDeleted == null ) {
			rspnServerMethodDeleted = new CFBamXMsgRspnServerMethodDeleted( this );
		}
		return( rspnServerMethodDeleted );
	}

	// ServerObjFunc Response s

	protected CFBamXMsgRspnServerObjFuncRec getRspnServerObjFuncRec() {
		if( rspnServerObjFuncRec == null ) {
			rspnServerObjFuncRec = new CFBamXMsgRspnServerObjFuncRec( this );
		}
		return( rspnServerObjFuncRec );
	}

	protected CFBamXMsgRspnServerObjFuncCreated getRspnServerObjFuncCreated() {
		if( rspnServerObjFuncCreated == null ) {
			rspnServerObjFuncCreated = new CFBamXMsgRspnServerObjFuncCreated( this );
		}
		return( rspnServerObjFuncCreated );
	}

	protected CFBamXMsgRspnServerObjFuncReadSingle getRspnServerObjFuncReadSingle() {
		if( rspnServerObjFuncReadSingle == null ) {
			rspnServerObjFuncReadSingle = new CFBamXMsgRspnServerObjFuncReadSingle( this );
			rspnServerObjFuncReadSingle.addElementHandler( "ServerObjFunc", getRspnServerObjFuncRec() );
		}
		return( rspnServerObjFuncReadSingle );
	}

	protected CFBamXMsgRspnServerObjFuncReadList getRspnServerObjFuncReadList() {
		if( rspnServerObjFuncReadList == null ) {
			rspnServerObjFuncReadList = new CFBamXMsgRspnServerObjFuncReadList( this );
			rspnServerObjFuncReadList.addElementHandler( "ServerObjFunc", getRspnServerObjFuncRec() );
		}
		return( rspnServerObjFuncReadList );
	}

	protected CFBamXMsgRspnServerObjFuncLocked getRspnServerObjFuncLocked() {
		if( rspnServerObjFuncLocked == null ) {
			rspnServerObjFuncLocked = new CFBamXMsgRspnServerObjFuncLocked( this );
		}
		return( rspnServerObjFuncLocked );
	}

	protected CFBamXMsgRspnServerObjFuncUpdated getRspnServerObjFuncUpdated() {
		if( rspnServerObjFuncUpdated == null ) {
			rspnServerObjFuncUpdated = new CFBamXMsgRspnServerObjFuncUpdated( this );
		}
		return( rspnServerObjFuncUpdated );
	}

	protected CFBamXMsgRspnServerObjFuncDeleted getRspnServerObjFuncDeleted() {
		if( rspnServerObjFuncDeleted == null ) {
			rspnServerObjFuncDeleted = new CFBamXMsgRspnServerObjFuncDeleted( this );
		}
		return( rspnServerObjFuncDeleted );
	}

	// ServerProc Response s

	protected CFBamXMsgRspnServerProcRec getRspnServerProcRec() {
		if( rspnServerProcRec == null ) {
			rspnServerProcRec = new CFBamXMsgRspnServerProcRec( this );
		}
		return( rspnServerProcRec );
	}

	protected CFBamXMsgRspnServerProcCreated getRspnServerProcCreated() {
		if( rspnServerProcCreated == null ) {
			rspnServerProcCreated = new CFBamXMsgRspnServerProcCreated( this );
		}
		return( rspnServerProcCreated );
	}

	protected CFBamXMsgRspnServerProcReadSingle getRspnServerProcReadSingle() {
		if( rspnServerProcReadSingle == null ) {
			rspnServerProcReadSingle = new CFBamXMsgRspnServerProcReadSingle( this );
			rspnServerProcReadSingle.addElementHandler( "ServerProc", getRspnServerProcRec() );
		}
		return( rspnServerProcReadSingle );
	}

	protected CFBamXMsgRspnServerProcReadList getRspnServerProcReadList() {
		if( rspnServerProcReadList == null ) {
			rspnServerProcReadList = new CFBamXMsgRspnServerProcReadList( this );
			rspnServerProcReadList.addElementHandler( "ServerProc", getRspnServerProcRec() );
		}
		return( rspnServerProcReadList );
	}

	protected CFBamXMsgRspnServerProcLocked getRspnServerProcLocked() {
		if( rspnServerProcLocked == null ) {
			rspnServerProcLocked = new CFBamXMsgRspnServerProcLocked( this );
		}
		return( rspnServerProcLocked );
	}

	protected CFBamXMsgRspnServerProcUpdated getRspnServerProcUpdated() {
		if( rspnServerProcUpdated == null ) {
			rspnServerProcUpdated = new CFBamXMsgRspnServerProcUpdated( this );
		}
		return( rspnServerProcUpdated );
	}

	protected CFBamXMsgRspnServerProcDeleted getRspnServerProcDeleted() {
		if( rspnServerProcDeleted == null ) {
			rspnServerProcDeleted = new CFBamXMsgRspnServerProcDeleted( this );
		}
		return( rspnServerProcDeleted );
	}

	// Service Response s

	protected CFBamXMsgRspnServiceRec getRspnServiceRec() {
		if( rspnServiceRec == null ) {
			rspnServiceRec = new CFBamXMsgRspnServiceRec( this );
		}
		return( rspnServiceRec );
	}

	protected CFBamXMsgRspnServiceCreated getRspnServiceCreated() {
		if( rspnServiceCreated == null ) {
			rspnServiceCreated = new CFBamXMsgRspnServiceCreated( this );
		}
		return( rspnServiceCreated );
	}

	protected CFBamXMsgRspnServiceReadSingle getRspnServiceReadSingle() {
		if( rspnServiceReadSingle == null ) {
			rspnServiceReadSingle = new CFBamXMsgRspnServiceReadSingle( this );
			rspnServiceReadSingle.addElementHandler( "Service", getRspnServiceRec() );
		}
		return( rspnServiceReadSingle );
	}

	protected CFBamXMsgRspnServiceReadList getRspnServiceReadList() {
		if( rspnServiceReadList == null ) {
			rspnServiceReadList = new CFBamXMsgRspnServiceReadList( this );
			rspnServiceReadList.addElementHandler( "Service", getRspnServiceRec() );
		}
		return( rspnServiceReadList );
	}

	protected CFBamXMsgRspnServiceLocked getRspnServiceLocked() {
		if( rspnServiceLocked == null ) {
			rspnServiceLocked = new CFBamXMsgRspnServiceLocked( this );
		}
		return( rspnServiceLocked );
	}

	protected CFBamXMsgRspnServiceUpdated getRspnServiceUpdated() {
		if( rspnServiceUpdated == null ) {
			rspnServiceUpdated = new CFBamXMsgRspnServiceUpdated( this );
		}
		return( rspnServiceUpdated );
	}

	protected CFBamXMsgRspnServiceDeleted getRspnServiceDeleted() {
		if( rspnServiceDeleted == null ) {
			rspnServiceDeleted = new CFBamXMsgRspnServiceDeleted( this );
		}
		return( rspnServiceDeleted );
	}

	// ServiceType Response s

	protected CFBamXMsgRspnServiceTypeRec getRspnServiceTypeRec() {
		if( rspnServiceTypeRec == null ) {
			rspnServiceTypeRec = new CFBamXMsgRspnServiceTypeRec( this );
		}
		return( rspnServiceTypeRec );
	}

	protected CFBamXMsgRspnServiceTypeCreated getRspnServiceTypeCreated() {
		if( rspnServiceTypeCreated == null ) {
			rspnServiceTypeCreated = new CFBamXMsgRspnServiceTypeCreated( this );
		}
		return( rspnServiceTypeCreated );
	}

	protected CFBamXMsgRspnServiceTypeReadSingle getRspnServiceTypeReadSingle() {
		if( rspnServiceTypeReadSingle == null ) {
			rspnServiceTypeReadSingle = new CFBamXMsgRspnServiceTypeReadSingle( this );
			rspnServiceTypeReadSingle.addElementHandler( "ServiceType", getRspnServiceTypeRec() );
		}
		return( rspnServiceTypeReadSingle );
	}

	protected CFBamXMsgRspnServiceTypeReadList getRspnServiceTypeReadList() {
		if( rspnServiceTypeReadList == null ) {
			rspnServiceTypeReadList = new CFBamXMsgRspnServiceTypeReadList( this );
			rspnServiceTypeReadList.addElementHandler( "ServiceType", getRspnServiceTypeRec() );
		}
		return( rspnServiceTypeReadList );
	}

	protected CFBamXMsgRspnServiceTypeLocked getRspnServiceTypeLocked() {
		if( rspnServiceTypeLocked == null ) {
			rspnServiceTypeLocked = new CFBamXMsgRspnServiceTypeLocked( this );
		}
		return( rspnServiceTypeLocked );
	}

	protected CFBamXMsgRspnServiceTypeUpdated getRspnServiceTypeUpdated() {
		if( rspnServiceTypeUpdated == null ) {
			rspnServiceTypeUpdated = new CFBamXMsgRspnServiceTypeUpdated( this );
		}
		return( rspnServiceTypeUpdated );
	}

	protected CFBamXMsgRspnServiceTypeDeleted getRspnServiceTypeDeleted() {
		if( rspnServiceTypeDeleted == null ) {
			rspnServiceTypeDeleted = new CFBamXMsgRspnServiceTypeDeleted( this );
		}
		return( rspnServiceTypeDeleted );
	}

	// StringCol Response s

	protected CFBamXMsgRspnStringColRec getRspnStringColRec() {
		if( rspnStringColRec == null ) {
			rspnStringColRec = new CFBamXMsgRspnStringColRec( this );
		}
		return( rspnStringColRec );
	}

	protected CFBamXMsgRspnStringColCreated getRspnStringColCreated() {
		if( rspnStringColCreated == null ) {
			rspnStringColCreated = new CFBamXMsgRspnStringColCreated( this );
		}
		return( rspnStringColCreated );
	}

	protected CFBamXMsgRspnStringColReadSingle getRspnStringColReadSingle() {
		if( rspnStringColReadSingle == null ) {
			rspnStringColReadSingle = new CFBamXMsgRspnStringColReadSingle( this );
			rspnStringColReadSingle.addElementHandler( "StringCol", getRspnStringColRec() );
		}
		return( rspnStringColReadSingle );
	}

	protected CFBamXMsgRspnStringColReadList getRspnStringColReadList() {
		if( rspnStringColReadList == null ) {
			rspnStringColReadList = new CFBamXMsgRspnStringColReadList( this );
			rspnStringColReadList.addElementHandler( "StringCol", getRspnStringColRec() );
		}
		return( rspnStringColReadList );
	}

	protected CFBamXMsgRspnStringColLocked getRspnStringColLocked() {
		if( rspnStringColLocked == null ) {
			rspnStringColLocked = new CFBamXMsgRspnStringColLocked( this );
		}
		return( rspnStringColLocked );
	}

	protected CFBamXMsgRspnStringColUpdated getRspnStringColUpdated() {
		if( rspnStringColUpdated == null ) {
			rspnStringColUpdated = new CFBamXMsgRspnStringColUpdated( this );
		}
		return( rspnStringColUpdated );
	}

	protected CFBamXMsgRspnStringColDeleted getRspnStringColDeleted() {
		if( rspnStringColDeleted == null ) {
			rspnStringColDeleted = new CFBamXMsgRspnStringColDeleted( this );
		}
		return( rspnStringColDeleted );
	}

	// StringDef Response s

	protected CFBamXMsgRspnStringDefRec getRspnStringDefRec() {
		if( rspnStringDefRec == null ) {
			rspnStringDefRec = new CFBamXMsgRspnStringDefRec( this );
		}
		return( rspnStringDefRec );
	}

	protected CFBamXMsgRspnStringDefCreated getRspnStringDefCreated() {
		if( rspnStringDefCreated == null ) {
			rspnStringDefCreated = new CFBamXMsgRspnStringDefCreated( this );
		}
		return( rspnStringDefCreated );
	}

	protected CFBamXMsgRspnStringDefReadSingle getRspnStringDefReadSingle() {
		if( rspnStringDefReadSingle == null ) {
			rspnStringDefReadSingle = new CFBamXMsgRspnStringDefReadSingle( this );
			rspnStringDefReadSingle.addElementHandler( "StringDef", getRspnStringDefRec() );
			rspnStringDefReadSingle.addElementHandler( "StringType", getRspnStringTypeRec() );
			rspnStringDefReadSingle.addElementHandler( "StringCol", getRspnStringColRec() );
		}
		return( rspnStringDefReadSingle );
	}

	protected CFBamXMsgRspnStringDefReadList getRspnStringDefReadList() {
		if( rspnStringDefReadList == null ) {
			rspnStringDefReadList = new CFBamXMsgRspnStringDefReadList( this );
			rspnStringDefReadList.addElementHandler( "StringDef", getRspnStringDefRec() );
			rspnStringDefReadList.addElementHandler( "StringType", getRspnStringTypeRec() );
			rspnStringDefReadList.addElementHandler( "StringCol", getRspnStringColRec() );
		}
		return( rspnStringDefReadList );
	}

	protected CFBamXMsgRspnStringDefLocked getRspnStringDefLocked() {
		if( rspnStringDefLocked == null ) {
			rspnStringDefLocked = new CFBamXMsgRspnStringDefLocked( this );
		}
		return( rspnStringDefLocked );
	}

	protected CFBamXMsgRspnStringDefUpdated getRspnStringDefUpdated() {
		if( rspnStringDefUpdated == null ) {
			rspnStringDefUpdated = new CFBamXMsgRspnStringDefUpdated( this );
		}
		return( rspnStringDefUpdated );
	}

	protected CFBamXMsgRspnStringDefDeleted getRspnStringDefDeleted() {
		if( rspnStringDefDeleted == null ) {
			rspnStringDefDeleted = new CFBamXMsgRspnStringDefDeleted( this );
		}
		return( rspnStringDefDeleted );
	}

	// StringType Response s

	protected CFBamXMsgRspnStringTypeRec getRspnStringTypeRec() {
		if( rspnStringTypeRec == null ) {
			rspnStringTypeRec = new CFBamXMsgRspnStringTypeRec( this );
		}
		return( rspnStringTypeRec );
	}

	protected CFBamXMsgRspnStringTypeCreated getRspnStringTypeCreated() {
		if( rspnStringTypeCreated == null ) {
			rspnStringTypeCreated = new CFBamXMsgRspnStringTypeCreated( this );
		}
		return( rspnStringTypeCreated );
	}

	protected CFBamXMsgRspnStringTypeReadSingle getRspnStringTypeReadSingle() {
		if( rspnStringTypeReadSingle == null ) {
			rspnStringTypeReadSingle = new CFBamXMsgRspnStringTypeReadSingle( this );
			rspnStringTypeReadSingle.addElementHandler( "StringType", getRspnStringTypeRec() );
		}
		return( rspnStringTypeReadSingle );
	}

	protected CFBamXMsgRspnStringTypeReadList getRspnStringTypeReadList() {
		if( rspnStringTypeReadList == null ) {
			rspnStringTypeReadList = new CFBamXMsgRspnStringTypeReadList( this );
			rspnStringTypeReadList.addElementHandler( "StringType", getRspnStringTypeRec() );
		}
		return( rspnStringTypeReadList );
	}

	protected CFBamXMsgRspnStringTypeLocked getRspnStringTypeLocked() {
		if( rspnStringTypeLocked == null ) {
			rspnStringTypeLocked = new CFBamXMsgRspnStringTypeLocked( this );
		}
		return( rspnStringTypeLocked );
	}

	protected CFBamXMsgRspnStringTypeUpdated getRspnStringTypeUpdated() {
		if( rspnStringTypeUpdated == null ) {
			rspnStringTypeUpdated = new CFBamXMsgRspnStringTypeUpdated( this );
		}
		return( rspnStringTypeUpdated );
	}

	protected CFBamXMsgRspnStringTypeDeleted getRspnStringTypeDeleted() {
		if( rspnStringTypeDeleted == null ) {
			rspnStringTypeDeleted = new CFBamXMsgRspnStringTypeDeleted( this );
		}
		return( rspnStringTypeDeleted );
	}

	// SubProject Response s

	protected CFBamXMsgRspnSubProjectRec getRspnSubProjectRec() {
		if( rspnSubProjectRec == null ) {
			rspnSubProjectRec = new CFBamXMsgRspnSubProjectRec( this );
		}
		return( rspnSubProjectRec );
	}

	protected CFBamXMsgRspnSubProjectCreated getRspnSubProjectCreated() {
		if( rspnSubProjectCreated == null ) {
			rspnSubProjectCreated = new CFBamXMsgRspnSubProjectCreated( this );
		}
		return( rspnSubProjectCreated );
	}

	protected CFBamXMsgRspnSubProjectReadSingle getRspnSubProjectReadSingle() {
		if( rspnSubProjectReadSingle == null ) {
			rspnSubProjectReadSingle = new CFBamXMsgRspnSubProjectReadSingle( this );
			rspnSubProjectReadSingle.addElementHandler( "SubProject", getRspnSubProjectRec() );
		}
		return( rspnSubProjectReadSingle );
	}

	protected CFBamXMsgRspnSubProjectReadList getRspnSubProjectReadList() {
		if( rspnSubProjectReadList == null ) {
			rspnSubProjectReadList = new CFBamXMsgRspnSubProjectReadList( this );
			rspnSubProjectReadList.addElementHandler( "SubProject", getRspnSubProjectRec() );
		}
		return( rspnSubProjectReadList );
	}

	protected CFBamXMsgRspnSubProjectLocked getRspnSubProjectLocked() {
		if( rspnSubProjectLocked == null ) {
			rspnSubProjectLocked = new CFBamXMsgRspnSubProjectLocked( this );
		}
		return( rspnSubProjectLocked );
	}

	protected CFBamXMsgRspnSubProjectUpdated getRspnSubProjectUpdated() {
		if( rspnSubProjectUpdated == null ) {
			rspnSubProjectUpdated = new CFBamXMsgRspnSubProjectUpdated( this );
		}
		return( rspnSubProjectUpdated );
	}

	protected CFBamXMsgRspnSubProjectDeleted getRspnSubProjectDeleted() {
		if( rspnSubProjectDeleted == null ) {
			rspnSubProjectDeleted = new CFBamXMsgRspnSubProjectDeleted( this );
		}
		return( rspnSubProjectDeleted );
	}

	// SysCluster Response s

	protected CFBamXMsgRspnSysClusterRec getRspnSysClusterRec() {
		if( rspnSysClusterRec == null ) {
			rspnSysClusterRec = new CFBamXMsgRspnSysClusterRec( this );
		}
		return( rspnSysClusterRec );
	}

	protected CFBamXMsgRspnSysClusterCreated getRspnSysClusterCreated() {
		if( rspnSysClusterCreated == null ) {
			rspnSysClusterCreated = new CFBamXMsgRspnSysClusterCreated( this );
		}
		return( rspnSysClusterCreated );
	}

	protected CFBamXMsgRspnSysClusterReadSingle getRspnSysClusterReadSingle() {
		if( rspnSysClusterReadSingle == null ) {
			rspnSysClusterReadSingle = new CFBamXMsgRspnSysClusterReadSingle( this );
			rspnSysClusterReadSingle.addElementHandler( "SysCluster", getRspnSysClusterRec() );
		}
		return( rspnSysClusterReadSingle );
	}

	protected CFBamXMsgRspnSysClusterReadList getRspnSysClusterReadList() {
		if( rspnSysClusterReadList == null ) {
			rspnSysClusterReadList = new CFBamXMsgRspnSysClusterReadList( this );
			rspnSysClusterReadList.addElementHandler( "SysCluster", getRspnSysClusterRec() );
		}
		return( rspnSysClusterReadList );
	}

	protected CFBamXMsgRspnSysClusterLocked getRspnSysClusterLocked() {
		if( rspnSysClusterLocked == null ) {
			rspnSysClusterLocked = new CFBamXMsgRspnSysClusterLocked( this );
		}
		return( rspnSysClusterLocked );
	}

	protected CFBamXMsgRspnSysClusterUpdated getRspnSysClusterUpdated() {
		if( rspnSysClusterUpdated == null ) {
			rspnSysClusterUpdated = new CFBamXMsgRspnSysClusterUpdated( this );
		}
		return( rspnSysClusterUpdated );
	}

	protected CFBamXMsgRspnSysClusterDeleted getRspnSysClusterDeleted() {
		if( rspnSysClusterDeleted == null ) {
			rspnSysClusterDeleted = new CFBamXMsgRspnSysClusterDeleted( this );
		}
		return( rspnSysClusterDeleted );
	}

	// TSecGroup Response s

	protected CFBamXMsgRspnTSecGroupRec getRspnTSecGroupRec() {
		if( rspnTSecGroupRec == null ) {
			rspnTSecGroupRec = new CFBamXMsgRspnTSecGroupRec( this );
		}
		return( rspnTSecGroupRec );
	}

	protected CFBamXMsgRspnTSecGroupCreated getRspnTSecGroupCreated() {
		if( rspnTSecGroupCreated == null ) {
			rspnTSecGroupCreated = new CFBamXMsgRspnTSecGroupCreated( this );
		}
		return( rspnTSecGroupCreated );
	}

	protected CFBamXMsgRspnTSecGroupReadSingle getRspnTSecGroupReadSingle() {
		if( rspnTSecGroupReadSingle == null ) {
			rspnTSecGroupReadSingle = new CFBamXMsgRspnTSecGroupReadSingle( this );
			rspnTSecGroupReadSingle.addElementHandler( "TSecGroup", getRspnTSecGroupRec() );
		}
		return( rspnTSecGroupReadSingle );
	}

	protected CFBamXMsgRspnTSecGroupReadList getRspnTSecGroupReadList() {
		if( rspnTSecGroupReadList == null ) {
			rspnTSecGroupReadList = new CFBamXMsgRspnTSecGroupReadList( this );
			rspnTSecGroupReadList.addElementHandler( "TSecGroup", getRspnTSecGroupRec() );
		}
		return( rspnTSecGroupReadList );
	}

	protected CFBamXMsgRspnTSecGroupLocked getRspnTSecGroupLocked() {
		if( rspnTSecGroupLocked == null ) {
			rspnTSecGroupLocked = new CFBamXMsgRspnTSecGroupLocked( this );
		}
		return( rspnTSecGroupLocked );
	}

	protected CFBamXMsgRspnTSecGroupUpdated getRspnTSecGroupUpdated() {
		if( rspnTSecGroupUpdated == null ) {
			rspnTSecGroupUpdated = new CFBamXMsgRspnTSecGroupUpdated( this );
		}
		return( rspnTSecGroupUpdated );
	}

	protected CFBamXMsgRspnTSecGroupDeleted getRspnTSecGroupDeleted() {
		if( rspnTSecGroupDeleted == null ) {
			rspnTSecGroupDeleted = new CFBamXMsgRspnTSecGroupDeleted( this );
		}
		return( rspnTSecGroupDeleted );
	}

	// TSecGrpInc Response s

	protected CFBamXMsgRspnTSecGrpIncRec getRspnTSecGrpIncRec() {
		if( rspnTSecGrpIncRec == null ) {
			rspnTSecGrpIncRec = new CFBamXMsgRspnTSecGrpIncRec( this );
		}
		return( rspnTSecGrpIncRec );
	}

	protected CFBamXMsgRspnTSecGrpIncCreated getRspnTSecGrpIncCreated() {
		if( rspnTSecGrpIncCreated == null ) {
			rspnTSecGrpIncCreated = new CFBamXMsgRspnTSecGrpIncCreated( this );
		}
		return( rspnTSecGrpIncCreated );
	}

	protected CFBamXMsgRspnTSecGrpIncReadSingle getRspnTSecGrpIncReadSingle() {
		if( rspnTSecGrpIncReadSingle == null ) {
			rspnTSecGrpIncReadSingle = new CFBamXMsgRspnTSecGrpIncReadSingle( this );
			rspnTSecGrpIncReadSingle.addElementHandler( "TSecGrpInc", getRspnTSecGrpIncRec() );
		}
		return( rspnTSecGrpIncReadSingle );
	}

	protected CFBamXMsgRspnTSecGrpIncReadList getRspnTSecGrpIncReadList() {
		if( rspnTSecGrpIncReadList == null ) {
			rspnTSecGrpIncReadList = new CFBamXMsgRspnTSecGrpIncReadList( this );
			rspnTSecGrpIncReadList.addElementHandler( "TSecGrpInc", getRspnTSecGrpIncRec() );
		}
		return( rspnTSecGrpIncReadList );
	}

	protected CFBamXMsgRspnTSecGrpIncLocked getRspnTSecGrpIncLocked() {
		if( rspnTSecGrpIncLocked == null ) {
			rspnTSecGrpIncLocked = new CFBamXMsgRspnTSecGrpIncLocked( this );
		}
		return( rspnTSecGrpIncLocked );
	}

	protected CFBamXMsgRspnTSecGrpIncUpdated getRspnTSecGrpIncUpdated() {
		if( rspnTSecGrpIncUpdated == null ) {
			rspnTSecGrpIncUpdated = new CFBamXMsgRspnTSecGrpIncUpdated( this );
		}
		return( rspnTSecGrpIncUpdated );
	}

	protected CFBamXMsgRspnTSecGrpIncDeleted getRspnTSecGrpIncDeleted() {
		if( rspnTSecGrpIncDeleted == null ) {
			rspnTSecGrpIncDeleted = new CFBamXMsgRspnTSecGrpIncDeleted( this );
		}
		return( rspnTSecGrpIncDeleted );
	}

	// TSecGrpMemb Response s

	protected CFBamXMsgRspnTSecGrpMembRec getRspnTSecGrpMembRec() {
		if( rspnTSecGrpMembRec == null ) {
			rspnTSecGrpMembRec = new CFBamXMsgRspnTSecGrpMembRec( this );
		}
		return( rspnTSecGrpMembRec );
	}

	protected CFBamXMsgRspnTSecGrpMembCreated getRspnTSecGrpMembCreated() {
		if( rspnTSecGrpMembCreated == null ) {
			rspnTSecGrpMembCreated = new CFBamXMsgRspnTSecGrpMembCreated( this );
		}
		return( rspnTSecGrpMembCreated );
	}

	protected CFBamXMsgRspnTSecGrpMembReadSingle getRspnTSecGrpMembReadSingle() {
		if( rspnTSecGrpMembReadSingle == null ) {
			rspnTSecGrpMembReadSingle = new CFBamXMsgRspnTSecGrpMembReadSingle( this );
			rspnTSecGrpMembReadSingle.addElementHandler( "TSecGrpMemb", getRspnTSecGrpMembRec() );
		}
		return( rspnTSecGrpMembReadSingle );
	}

	protected CFBamXMsgRspnTSecGrpMembReadList getRspnTSecGrpMembReadList() {
		if( rspnTSecGrpMembReadList == null ) {
			rspnTSecGrpMembReadList = new CFBamXMsgRspnTSecGrpMembReadList( this );
			rspnTSecGrpMembReadList.addElementHandler( "TSecGrpMemb", getRspnTSecGrpMembRec() );
		}
		return( rspnTSecGrpMembReadList );
	}

	protected CFBamXMsgRspnTSecGrpMembLocked getRspnTSecGrpMembLocked() {
		if( rspnTSecGrpMembLocked == null ) {
			rspnTSecGrpMembLocked = new CFBamXMsgRspnTSecGrpMembLocked( this );
		}
		return( rspnTSecGrpMembLocked );
	}

	protected CFBamXMsgRspnTSecGrpMembUpdated getRspnTSecGrpMembUpdated() {
		if( rspnTSecGrpMembUpdated == null ) {
			rspnTSecGrpMembUpdated = new CFBamXMsgRspnTSecGrpMembUpdated( this );
		}
		return( rspnTSecGrpMembUpdated );
	}

	protected CFBamXMsgRspnTSecGrpMembDeleted getRspnTSecGrpMembDeleted() {
		if( rspnTSecGrpMembDeleted == null ) {
			rspnTSecGrpMembDeleted = new CFBamXMsgRspnTSecGrpMembDeleted( this );
		}
		return( rspnTSecGrpMembDeleted );
	}

	// TZDateCol Response s

	protected CFBamXMsgRspnTZDateColRec getRspnTZDateColRec() {
		if( rspnTZDateColRec == null ) {
			rspnTZDateColRec = new CFBamXMsgRspnTZDateColRec( this );
		}
		return( rspnTZDateColRec );
	}

	protected CFBamXMsgRspnTZDateColCreated getRspnTZDateColCreated() {
		if( rspnTZDateColCreated == null ) {
			rspnTZDateColCreated = new CFBamXMsgRspnTZDateColCreated( this );
		}
		return( rspnTZDateColCreated );
	}

	protected CFBamXMsgRspnTZDateColReadSingle getRspnTZDateColReadSingle() {
		if( rspnTZDateColReadSingle == null ) {
			rspnTZDateColReadSingle = new CFBamXMsgRspnTZDateColReadSingle( this );
			rspnTZDateColReadSingle.addElementHandler( "TZDateCol", getRspnTZDateColRec() );
		}
		return( rspnTZDateColReadSingle );
	}

	protected CFBamXMsgRspnTZDateColReadList getRspnTZDateColReadList() {
		if( rspnTZDateColReadList == null ) {
			rspnTZDateColReadList = new CFBamXMsgRspnTZDateColReadList( this );
			rspnTZDateColReadList.addElementHandler( "TZDateCol", getRspnTZDateColRec() );
		}
		return( rspnTZDateColReadList );
	}

	protected CFBamXMsgRspnTZDateColLocked getRspnTZDateColLocked() {
		if( rspnTZDateColLocked == null ) {
			rspnTZDateColLocked = new CFBamXMsgRspnTZDateColLocked( this );
		}
		return( rspnTZDateColLocked );
	}

	protected CFBamXMsgRspnTZDateColUpdated getRspnTZDateColUpdated() {
		if( rspnTZDateColUpdated == null ) {
			rspnTZDateColUpdated = new CFBamXMsgRspnTZDateColUpdated( this );
		}
		return( rspnTZDateColUpdated );
	}

	protected CFBamXMsgRspnTZDateColDeleted getRspnTZDateColDeleted() {
		if( rspnTZDateColDeleted == null ) {
			rspnTZDateColDeleted = new CFBamXMsgRspnTZDateColDeleted( this );
		}
		return( rspnTZDateColDeleted );
	}

	// TZDateDef Response s

	protected CFBamXMsgRspnTZDateDefRec getRspnTZDateDefRec() {
		if( rspnTZDateDefRec == null ) {
			rspnTZDateDefRec = new CFBamXMsgRspnTZDateDefRec( this );
		}
		return( rspnTZDateDefRec );
	}

	protected CFBamXMsgRspnTZDateDefCreated getRspnTZDateDefCreated() {
		if( rspnTZDateDefCreated == null ) {
			rspnTZDateDefCreated = new CFBamXMsgRspnTZDateDefCreated( this );
		}
		return( rspnTZDateDefCreated );
	}

	protected CFBamXMsgRspnTZDateDefReadSingle getRspnTZDateDefReadSingle() {
		if( rspnTZDateDefReadSingle == null ) {
			rspnTZDateDefReadSingle = new CFBamXMsgRspnTZDateDefReadSingle( this );
			rspnTZDateDefReadSingle.addElementHandler( "TZDateDef", getRspnTZDateDefRec() );
			rspnTZDateDefReadSingle.addElementHandler( "TZDateType", getRspnTZDateTypeRec() );
			rspnTZDateDefReadSingle.addElementHandler( "TZDateCol", getRspnTZDateColRec() );
		}
		return( rspnTZDateDefReadSingle );
	}

	protected CFBamXMsgRspnTZDateDefReadList getRspnTZDateDefReadList() {
		if( rspnTZDateDefReadList == null ) {
			rspnTZDateDefReadList = new CFBamXMsgRspnTZDateDefReadList( this );
			rspnTZDateDefReadList.addElementHandler( "TZDateDef", getRspnTZDateDefRec() );
			rspnTZDateDefReadList.addElementHandler( "TZDateType", getRspnTZDateTypeRec() );
			rspnTZDateDefReadList.addElementHandler( "TZDateCol", getRspnTZDateColRec() );
		}
		return( rspnTZDateDefReadList );
	}

	protected CFBamXMsgRspnTZDateDefLocked getRspnTZDateDefLocked() {
		if( rspnTZDateDefLocked == null ) {
			rspnTZDateDefLocked = new CFBamXMsgRspnTZDateDefLocked( this );
		}
		return( rspnTZDateDefLocked );
	}

	protected CFBamXMsgRspnTZDateDefUpdated getRspnTZDateDefUpdated() {
		if( rspnTZDateDefUpdated == null ) {
			rspnTZDateDefUpdated = new CFBamXMsgRspnTZDateDefUpdated( this );
		}
		return( rspnTZDateDefUpdated );
	}

	protected CFBamXMsgRspnTZDateDefDeleted getRspnTZDateDefDeleted() {
		if( rspnTZDateDefDeleted == null ) {
			rspnTZDateDefDeleted = new CFBamXMsgRspnTZDateDefDeleted( this );
		}
		return( rspnTZDateDefDeleted );
	}

	// TZDateType Response s

	protected CFBamXMsgRspnTZDateTypeRec getRspnTZDateTypeRec() {
		if( rspnTZDateTypeRec == null ) {
			rspnTZDateTypeRec = new CFBamXMsgRspnTZDateTypeRec( this );
		}
		return( rspnTZDateTypeRec );
	}

	protected CFBamXMsgRspnTZDateTypeCreated getRspnTZDateTypeCreated() {
		if( rspnTZDateTypeCreated == null ) {
			rspnTZDateTypeCreated = new CFBamXMsgRspnTZDateTypeCreated( this );
		}
		return( rspnTZDateTypeCreated );
	}

	protected CFBamXMsgRspnTZDateTypeReadSingle getRspnTZDateTypeReadSingle() {
		if( rspnTZDateTypeReadSingle == null ) {
			rspnTZDateTypeReadSingle = new CFBamXMsgRspnTZDateTypeReadSingle( this );
			rspnTZDateTypeReadSingle.addElementHandler( "TZDateType", getRspnTZDateTypeRec() );
		}
		return( rspnTZDateTypeReadSingle );
	}

	protected CFBamXMsgRspnTZDateTypeReadList getRspnTZDateTypeReadList() {
		if( rspnTZDateTypeReadList == null ) {
			rspnTZDateTypeReadList = new CFBamXMsgRspnTZDateTypeReadList( this );
			rspnTZDateTypeReadList.addElementHandler( "TZDateType", getRspnTZDateTypeRec() );
		}
		return( rspnTZDateTypeReadList );
	}

	protected CFBamXMsgRspnTZDateTypeLocked getRspnTZDateTypeLocked() {
		if( rspnTZDateTypeLocked == null ) {
			rspnTZDateTypeLocked = new CFBamXMsgRspnTZDateTypeLocked( this );
		}
		return( rspnTZDateTypeLocked );
	}

	protected CFBamXMsgRspnTZDateTypeUpdated getRspnTZDateTypeUpdated() {
		if( rspnTZDateTypeUpdated == null ) {
			rspnTZDateTypeUpdated = new CFBamXMsgRspnTZDateTypeUpdated( this );
		}
		return( rspnTZDateTypeUpdated );
	}

	protected CFBamXMsgRspnTZDateTypeDeleted getRspnTZDateTypeDeleted() {
		if( rspnTZDateTypeDeleted == null ) {
			rspnTZDateTypeDeleted = new CFBamXMsgRspnTZDateTypeDeleted( this );
		}
		return( rspnTZDateTypeDeleted );
	}

	// TZTimeCol Response s

	protected CFBamXMsgRspnTZTimeColRec getRspnTZTimeColRec() {
		if( rspnTZTimeColRec == null ) {
			rspnTZTimeColRec = new CFBamXMsgRspnTZTimeColRec( this );
		}
		return( rspnTZTimeColRec );
	}

	protected CFBamXMsgRspnTZTimeColCreated getRspnTZTimeColCreated() {
		if( rspnTZTimeColCreated == null ) {
			rspnTZTimeColCreated = new CFBamXMsgRspnTZTimeColCreated( this );
		}
		return( rspnTZTimeColCreated );
	}

	protected CFBamXMsgRspnTZTimeColReadSingle getRspnTZTimeColReadSingle() {
		if( rspnTZTimeColReadSingle == null ) {
			rspnTZTimeColReadSingle = new CFBamXMsgRspnTZTimeColReadSingle( this );
			rspnTZTimeColReadSingle.addElementHandler( "TZTimeCol", getRspnTZTimeColRec() );
		}
		return( rspnTZTimeColReadSingle );
	}

	protected CFBamXMsgRspnTZTimeColReadList getRspnTZTimeColReadList() {
		if( rspnTZTimeColReadList == null ) {
			rspnTZTimeColReadList = new CFBamXMsgRspnTZTimeColReadList( this );
			rspnTZTimeColReadList.addElementHandler( "TZTimeCol", getRspnTZTimeColRec() );
		}
		return( rspnTZTimeColReadList );
	}

	protected CFBamXMsgRspnTZTimeColLocked getRspnTZTimeColLocked() {
		if( rspnTZTimeColLocked == null ) {
			rspnTZTimeColLocked = new CFBamXMsgRspnTZTimeColLocked( this );
		}
		return( rspnTZTimeColLocked );
	}

	protected CFBamXMsgRspnTZTimeColUpdated getRspnTZTimeColUpdated() {
		if( rspnTZTimeColUpdated == null ) {
			rspnTZTimeColUpdated = new CFBamXMsgRspnTZTimeColUpdated( this );
		}
		return( rspnTZTimeColUpdated );
	}

	protected CFBamXMsgRspnTZTimeColDeleted getRspnTZTimeColDeleted() {
		if( rspnTZTimeColDeleted == null ) {
			rspnTZTimeColDeleted = new CFBamXMsgRspnTZTimeColDeleted( this );
		}
		return( rspnTZTimeColDeleted );
	}

	// TZTimeDef Response s

	protected CFBamXMsgRspnTZTimeDefRec getRspnTZTimeDefRec() {
		if( rspnTZTimeDefRec == null ) {
			rspnTZTimeDefRec = new CFBamXMsgRspnTZTimeDefRec( this );
		}
		return( rspnTZTimeDefRec );
	}

	protected CFBamXMsgRspnTZTimeDefCreated getRspnTZTimeDefCreated() {
		if( rspnTZTimeDefCreated == null ) {
			rspnTZTimeDefCreated = new CFBamXMsgRspnTZTimeDefCreated( this );
		}
		return( rspnTZTimeDefCreated );
	}

	protected CFBamXMsgRspnTZTimeDefReadSingle getRspnTZTimeDefReadSingle() {
		if( rspnTZTimeDefReadSingle == null ) {
			rspnTZTimeDefReadSingle = new CFBamXMsgRspnTZTimeDefReadSingle( this );
			rspnTZTimeDefReadSingle.addElementHandler( "TZTimeDef", getRspnTZTimeDefRec() );
			rspnTZTimeDefReadSingle.addElementHandler( "TZTimeType", getRspnTZTimeTypeRec() );
			rspnTZTimeDefReadSingle.addElementHandler( "TZTimeCol", getRspnTZTimeColRec() );
		}
		return( rspnTZTimeDefReadSingle );
	}

	protected CFBamXMsgRspnTZTimeDefReadList getRspnTZTimeDefReadList() {
		if( rspnTZTimeDefReadList == null ) {
			rspnTZTimeDefReadList = new CFBamXMsgRspnTZTimeDefReadList( this );
			rspnTZTimeDefReadList.addElementHandler( "TZTimeDef", getRspnTZTimeDefRec() );
			rspnTZTimeDefReadList.addElementHandler( "TZTimeType", getRspnTZTimeTypeRec() );
			rspnTZTimeDefReadList.addElementHandler( "TZTimeCol", getRspnTZTimeColRec() );
		}
		return( rspnTZTimeDefReadList );
	}

	protected CFBamXMsgRspnTZTimeDefLocked getRspnTZTimeDefLocked() {
		if( rspnTZTimeDefLocked == null ) {
			rspnTZTimeDefLocked = new CFBamXMsgRspnTZTimeDefLocked( this );
		}
		return( rspnTZTimeDefLocked );
	}

	protected CFBamXMsgRspnTZTimeDefUpdated getRspnTZTimeDefUpdated() {
		if( rspnTZTimeDefUpdated == null ) {
			rspnTZTimeDefUpdated = new CFBamXMsgRspnTZTimeDefUpdated( this );
		}
		return( rspnTZTimeDefUpdated );
	}

	protected CFBamXMsgRspnTZTimeDefDeleted getRspnTZTimeDefDeleted() {
		if( rspnTZTimeDefDeleted == null ) {
			rspnTZTimeDefDeleted = new CFBamXMsgRspnTZTimeDefDeleted( this );
		}
		return( rspnTZTimeDefDeleted );
	}

	// TZTimeType Response s

	protected CFBamXMsgRspnTZTimeTypeRec getRspnTZTimeTypeRec() {
		if( rspnTZTimeTypeRec == null ) {
			rspnTZTimeTypeRec = new CFBamXMsgRspnTZTimeTypeRec( this );
		}
		return( rspnTZTimeTypeRec );
	}

	protected CFBamXMsgRspnTZTimeTypeCreated getRspnTZTimeTypeCreated() {
		if( rspnTZTimeTypeCreated == null ) {
			rspnTZTimeTypeCreated = new CFBamXMsgRspnTZTimeTypeCreated( this );
		}
		return( rspnTZTimeTypeCreated );
	}

	protected CFBamXMsgRspnTZTimeTypeReadSingle getRspnTZTimeTypeReadSingle() {
		if( rspnTZTimeTypeReadSingle == null ) {
			rspnTZTimeTypeReadSingle = new CFBamXMsgRspnTZTimeTypeReadSingle( this );
			rspnTZTimeTypeReadSingle.addElementHandler( "TZTimeType", getRspnTZTimeTypeRec() );
		}
		return( rspnTZTimeTypeReadSingle );
	}

	protected CFBamXMsgRspnTZTimeTypeReadList getRspnTZTimeTypeReadList() {
		if( rspnTZTimeTypeReadList == null ) {
			rspnTZTimeTypeReadList = new CFBamXMsgRspnTZTimeTypeReadList( this );
			rspnTZTimeTypeReadList.addElementHandler( "TZTimeType", getRspnTZTimeTypeRec() );
		}
		return( rspnTZTimeTypeReadList );
	}

	protected CFBamXMsgRspnTZTimeTypeLocked getRspnTZTimeTypeLocked() {
		if( rspnTZTimeTypeLocked == null ) {
			rspnTZTimeTypeLocked = new CFBamXMsgRspnTZTimeTypeLocked( this );
		}
		return( rspnTZTimeTypeLocked );
	}

	protected CFBamXMsgRspnTZTimeTypeUpdated getRspnTZTimeTypeUpdated() {
		if( rspnTZTimeTypeUpdated == null ) {
			rspnTZTimeTypeUpdated = new CFBamXMsgRspnTZTimeTypeUpdated( this );
		}
		return( rspnTZTimeTypeUpdated );
	}

	protected CFBamXMsgRspnTZTimeTypeDeleted getRspnTZTimeTypeDeleted() {
		if( rspnTZTimeTypeDeleted == null ) {
			rspnTZTimeTypeDeleted = new CFBamXMsgRspnTZTimeTypeDeleted( this );
		}
		return( rspnTZTimeTypeDeleted );
	}

	// TZTimestampCol Response s

	protected CFBamXMsgRspnTZTimestampColRec getRspnTZTimestampColRec() {
		if( rspnTZTimestampColRec == null ) {
			rspnTZTimestampColRec = new CFBamXMsgRspnTZTimestampColRec( this );
		}
		return( rspnTZTimestampColRec );
	}

	protected CFBamXMsgRspnTZTimestampColCreated getRspnTZTimestampColCreated() {
		if( rspnTZTimestampColCreated == null ) {
			rspnTZTimestampColCreated = new CFBamXMsgRspnTZTimestampColCreated( this );
		}
		return( rspnTZTimestampColCreated );
	}

	protected CFBamXMsgRspnTZTimestampColReadSingle getRspnTZTimestampColReadSingle() {
		if( rspnTZTimestampColReadSingle == null ) {
			rspnTZTimestampColReadSingle = new CFBamXMsgRspnTZTimestampColReadSingle( this );
			rspnTZTimestampColReadSingle.addElementHandler( "TZTimestampCol", getRspnTZTimestampColRec() );
		}
		return( rspnTZTimestampColReadSingle );
	}

	protected CFBamXMsgRspnTZTimestampColReadList getRspnTZTimestampColReadList() {
		if( rspnTZTimestampColReadList == null ) {
			rspnTZTimestampColReadList = new CFBamXMsgRspnTZTimestampColReadList( this );
			rspnTZTimestampColReadList.addElementHandler( "TZTimestampCol", getRspnTZTimestampColRec() );
		}
		return( rspnTZTimestampColReadList );
	}

	protected CFBamXMsgRspnTZTimestampColLocked getRspnTZTimestampColLocked() {
		if( rspnTZTimestampColLocked == null ) {
			rspnTZTimestampColLocked = new CFBamXMsgRspnTZTimestampColLocked( this );
		}
		return( rspnTZTimestampColLocked );
	}

	protected CFBamXMsgRspnTZTimestampColUpdated getRspnTZTimestampColUpdated() {
		if( rspnTZTimestampColUpdated == null ) {
			rspnTZTimestampColUpdated = new CFBamXMsgRspnTZTimestampColUpdated( this );
		}
		return( rspnTZTimestampColUpdated );
	}

	protected CFBamXMsgRspnTZTimestampColDeleted getRspnTZTimestampColDeleted() {
		if( rspnTZTimestampColDeleted == null ) {
			rspnTZTimestampColDeleted = new CFBamXMsgRspnTZTimestampColDeleted( this );
		}
		return( rspnTZTimestampColDeleted );
	}

	// TZTimestampDef Response s

	protected CFBamXMsgRspnTZTimestampDefRec getRspnTZTimestampDefRec() {
		if( rspnTZTimestampDefRec == null ) {
			rspnTZTimestampDefRec = new CFBamXMsgRspnTZTimestampDefRec( this );
		}
		return( rspnTZTimestampDefRec );
	}

	protected CFBamXMsgRspnTZTimestampDefCreated getRspnTZTimestampDefCreated() {
		if( rspnTZTimestampDefCreated == null ) {
			rspnTZTimestampDefCreated = new CFBamXMsgRspnTZTimestampDefCreated( this );
		}
		return( rspnTZTimestampDefCreated );
	}

	protected CFBamXMsgRspnTZTimestampDefReadSingle getRspnTZTimestampDefReadSingle() {
		if( rspnTZTimestampDefReadSingle == null ) {
			rspnTZTimestampDefReadSingle = new CFBamXMsgRspnTZTimestampDefReadSingle( this );
			rspnTZTimestampDefReadSingle.addElementHandler( "TZTimestampDef", getRspnTZTimestampDefRec() );
			rspnTZTimestampDefReadSingle.addElementHandler( "TZTimestampType", getRspnTZTimestampTypeRec() );
			rspnTZTimestampDefReadSingle.addElementHandler( "TZTimestampCol", getRspnTZTimestampColRec() );
		}
		return( rspnTZTimestampDefReadSingle );
	}

	protected CFBamXMsgRspnTZTimestampDefReadList getRspnTZTimestampDefReadList() {
		if( rspnTZTimestampDefReadList == null ) {
			rspnTZTimestampDefReadList = new CFBamXMsgRspnTZTimestampDefReadList( this );
			rspnTZTimestampDefReadList.addElementHandler( "TZTimestampDef", getRspnTZTimestampDefRec() );
			rspnTZTimestampDefReadList.addElementHandler( "TZTimestampType", getRspnTZTimestampTypeRec() );
			rspnTZTimestampDefReadList.addElementHandler( "TZTimestampCol", getRspnTZTimestampColRec() );
		}
		return( rspnTZTimestampDefReadList );
	}

	protected CFBamXMsgRspnTZTimestampDefLocked getRspnTZTimestampDefLocked() {
		if( rspnTZTimestampDefLocked == null ) {
			rspnTZTimestampDefLocked = new CFBamXMsgRspnTZTimestampDefLocked( this );
		}
		return( rspnTZTimestampDefLocked );
	}

	protected CFBamXMsgRspnTZTimestampDefUpdated getRspnTZTimestampDefUpdated() {
		if( rspnTZTimestampDefUpdated == null ) {
			rspnTZTimestampDefUpdated = new CFBamXMsgRspnTZTimestampDefUpdated( this );
		}
		return( rspnTZTimestampDefUpdated );
	}

	protected CFBamXMsgRspnTZTimestampDefDeleted getRspnTZTimestampDefDeleted() {
		if( rspnTZTimestampDefDeleted == null ) {
			rspnTZTimestampDefDeleted = new CFBamXMsgRspnTZTimestampDefDeleted( this );
		}
		return( rspnTZTimestampDefDeleted );
	}

	// TZTimestampType Response s

	protected CFBamXMsgRspnTZTimestampTypeRec getRspnTZTimestampTypeRec() {
		if( rspnTZTimestampTypeRec == null ) {
			rspnTZTimestampTypeRec = new CFBamXMsgRspnTZTimestampTypeRec( this );
		}
		return( rspnTZTimestampTypeRec );
	}

	protected CFBamXMsgRspnTZTimestampTypeCreated getRspnTZTimestampTypeCreated() {
		if( rspnTZTimestampTypeCreated == null ) {
			rspnTZTimestampTypeCreated = new CFBamXMsgRspnTZTimestampTypeCreated( this );
		}
		return( rspnTZTimestampTypeCreated );
	}

	protected CFBamXMsgRspnTZTimestampTypeReadSingle getRspnTZTimestampTypeReadSingle() {
		if( rspnTZTimestampTypeReadSingle == null ) {
			rspnTZTimestampTypeReadSingle = new CFBamXMsgRspnTZTimestampTypeReadSingle( this );
			rspnTZTimestampTypeReadSingle.addElementHandler( "TZTimestampType", getRspnTZTimestampTypeRec() );
		}
		return( rspnTZTimestampTypeReadSingle );
	}

	protected CFBamXMsgRspnTZTimestampTypeReadList getRspnTZTimestampTypeReadList() {
		if( rspnTZTimestampTypeReadList == null ) {
			rspnTZTimestampTypeReadList = new CFBamXMsgRspnTZTimestampTypeReadList( this );
			rspnTZTimestampTypeReadList.addElementHandler( "TZTimestampType", getRspnTZTimestampTypeRec() );
		}
		return( rspnTZTimestampTypeReadList );
	}

	protected CFBamXMsgRspnTZTimestampTypeLocked getRspnTZTimestampTypeLocked() {
		if( rspnTZTimestampTypeLocked == null ) {
			rspnTZTimestampTypeLocked = new CFBamXMsgRspnTZTimestampTypeLocked( this );
		}
		return( rspnTZTimestampTypeLocked );
	}

	protected CFBamXMsgRspnTZTimestampTypeUpdated getRspnTZTimestampTypeUpdated() {
		if( rspnTZTimestampTypeUpdated == null ) {
			rspnTZTimestampTypeUpdated = new CFBamXMsgRspnTZTimestampTypeUpdated( this );
		}
		return( rspnTZTimestampTypeUpdated );
	}

	protected CFBamXMsgRspnTZTimestampTypeDeleted getRspnTZTimestampTypeDeleted() {
		if( rspnTZTimestampTypeDeleted == null ) {
			rspnTZTimestampTypeDeleted = new CFBamXMsgRspnTZTimestampTypeDeleted( this );
		}
		return( rspnTZTimestampTypeDeleted );
	}

	// Table Response s

	protected CFBamXMsgRspnTableRec getRspnTableRec() {
		if( rspnTableRec == null ) {
			rspnTableRec = new CFBamXMsgRspnTableRec( this );
		}
		return( rspnTableRec );
	}

	protected CFBamXMsgRspnTableCreated getRspnTableCreated() {
		if( rspnTableCreated == null ) {
			rspnTableCreated = new CFBamXMsgRspnTableCreated( this );
		}
		return( rspnTableCreated );
	}

	protected CFBamXMsgRspnTableReadSingle getRspnTableReadSingle() {
		if( rspnTableReadSingle == null ) {
			rspnTableReadSingle = new CFBamXMsgRspnTableReadSingle( this );
			rspnTableReadSingle.addElementHandler( "Table", getRspnTableRec() );
		}
		return( rspnTableReadSingle );
	}

	protected CFBamXMsgRspnTableReadList getRspnTableReadList() {
		if( rspnTableReadList == null ) {
			rspnTableReadList = new CFBamXMsgRspnTableReadList( this );
			rspnTableReadList.addElementHandler( "Table", getRspnTableRec() );
		}
		return( rspnTableReadList );
	}

	protected CFBamXMsgRspnTableLocked getRspnTableLocked() {
		if( rspnTableLocked == null ) {
			rspnTableLocked = new CFBamXMsgRspnTableLocked( this );
		}
		return( rspnTableLocked );
	}

	protected CFBamXMsgRspnTableUpdated getRspnTableUpdated() {
		if( rspnTableUpdated == null ) {
			rspnTableUpdated = new CFBamXMsgRspnTableUpdated( this );
		}
		return( rspnTableUpdated );
	}

	protected CFBamXMsgRspnTableDeleted getRspnTableDeleted() {
		if( rspnTableDeleted == null ) {
			rspnTableDeleted = new CFBamXMsgRspnTableDeleted( this );
		}
		return( rspnTableDeleted );
	}

	// TableCol Response s

	protected CFBamXMsgRspnTableColRec getRspnTableColRec() {
		if( rspnTableColRec == null ) {
			rspnTableColRec = new CFBamXMsgRspnTableColRec( this );
		}
		return( rspnTableColRec );
	}

	protected CFBamXMsgRspnTableColCreated getRspnTableColCreated() {
		if( rspnTableColCreated == null ) {
			rspnTableColCreated = new CFBamXMsgRspnTableColCreated( this );
		}
		return( rspnTableColCreated );
	}

	protected CFBamXMsgRspnTableColReadSingle getRspnTableColReadSingle() {
		if( rspnTableColReadSingle == null ) {
			rspnTableColReadSingle = new CFBamXMsgRspnTableColReadSingle( this );
			rspnTableColReadSingle.addElementHandler( "TableCol", getRspnTableColRec() );
		}
		return( rspnTableColReadSingle );
	}

	protected CFBamXMsgRspnTableColReadList getRspnTableColReadList() {
		if( rspnTableColReadList == null ) {
			rspnTableColReadList = new CFBamXMsgRspnTableColReadList( this );
			rspnTableColReadList.addElementHandler( "TableCol", getRspnTableColRec() );
		}
		return( rspnTableColReadList );
	}

	protected CFBamXMsgRspnTableColLocked getRspnTableColLocked() {
		if( rspnTableColLocked == null ) {
			rspnTableColLocked = new CFBamXMsgRspnTableColLocked( this );
		}
		return( rspnTableColLocked );
	}

	protected CFBamXMsgRspnTableColUpdated getRspnTableColUpdated() {
		if( rspnTableColUpdated == null ) {
			rspnTableColUpdated = new CFBamXMsgRspnTableColUpdated( this );
		}
		return( rspnTableColUpdated );
	}

	protected CFBamXMsgRspnTableColDeleted getRspnTableColDeleted() {
		if( rspnTableColDeleted == null ) {
			rspnTableColDeleted = new CFBamXMsgRspnTableColDeleted( this );
		}
		return( rspnTableColDeleted );
	}

	// Tenant Response s

	protected CFBamXMsgRspnTenantRec getRspnTenantRec() {
		if( rspnTenantRec == null ) {
			rspnTenantRec = new CFBamXMsgRspnTenantRec( this );
		}
		return( rspnTenantRec );
	}

	protected CFBamXMsgRspnTenantCreated getRspnTenantCreated() {
		if( rspnTenantCreated == null ) {
			rspnTenantCreated = new CFBamXMsgRspnTenantCreated( this );
		}
		return( rspnTenantCreated );
	}

	protected CFBamXMsgRspnTenantReadSingle getRspnTenantReadSingle() {
		if( rspnTenantReadSingle == null ) {
			rspnTenantReadSingle = new CFBamXMsgRspnTenantReadSingle( this );
			rspnTenantReadSingle.addElementHandler( "Tenant", getRspnTenantRec() );
		}
		return( rspnTenantReadSingle );
	}

	protected CFBamXMsgRspnTenantReadList getRspnTenantReadList() {
		if( rspnTenantReadList == null ) {
			rspnTenantReadList = new CFBamXMsgRspnTenantReadList( this );
			rspnTenantReadList.addElementHandler( "Tenant", getRspnTenantRec() );
		}
		return( rspnTenantReadList );
	}

	protected CFBamXMsgRspnTenantLocked getRspnTenantLocked() {
		if( rspnTenantLocked == null ) {
			rspnTenantLocked = new CFBamXMsgRspnTenantLocked( this );
		}
		return( rspnTenantLocked );
	}

	protected CFBamXMsgRspnTenantUpdated getRspnTenantUpdated() {
		if( rspnTenantUpdated == null ) {
			rspnTenantUpdated = new CFBamXMsgRspnTenantUpdated( this );
		}
		return( rspnTenantUpdated );
	}

	protected CFBamXMsgRspnTenantDeleted getRspnTenantDeleted() {
		if( rspnTenantDeleted == null ) {
			rspnTenantDeleted = new CFBamXMsgRspnTenantDeleted( this );
		}
		return( rspnTenantDeleted );
	}

	// TextCol Response s

	protected CFBamXMsgRspnTextColRec getRspnTextColRec() {
		if( rspnTextColRec == null ) {
			rspnTextColRec = new CFBamXMsgRspnTextColRec( this );
		}
		return( rspnTextColRec );
	}

	protected CFBamXMsgRspnTextColCreated getRspnTextColCreated() {
		if( rspnTextColCreated == null ) {
			rspnTextColCreated = new CFBamXMsgRspnTextColCreated( this );
		}
		return( rspnTextColCreated );
	}

	protected CFBamXMsgRspnTextColReadSingle getRspnTextColReadSingle() {
		if( rspnTextColReadSingle == null ) {
			rspnTextColReadSingle = new CFBamXMsgRspnTextColReadSingle( this );
			rspnTextColReadSingle.addElementHandler( "TextCol", getRspnTextColRec() );
		}
		return( rspnTextColReadSingle );
	}

	protected CFBamXMsgRspnTextColReadList getRspnTextColReadList() {
		if( rspnTextColReadList == null ) {
			rspnTextColReadList = new CFBamXMsgRspnTextColReadList( this );
			rspnTextColReadList.addElementHandler( "TextCol", getRspnTextColRec() );
		}
		return( rspnTextColReadList );
	}

	protected CFBamXMsgRspnTextColLocked getRspnTextColLocked() {
		if( rspnTextColLocked == null ) {
			rspnTextColLocked = new CFBamXMsgRspnTextColLocked( this );
		}
		return( rspnTextColLocked );
	}

	protected CFBamXMsgRspnTextColUpdated getRspnTextColUpdated() {
		if( rspnTextColUpdated == null ) {
			rspnTextColUpdated = new CFBamXMsgRspnTextColUpdated( this );
		}
		return( rspnTextColUpdated );
	}

	protected CFBamXMsgRspnTextColDeleted getRspnTextColDeleted() {
		if( rspnTextColDeleted == null ) {
			rspnTextColDeleted = new CFBamXMsgRspnTextColDeleted( this );
		}
		return( rspnTextColDeleted );
	}

	// TextDef Response s

	protected CFBamXMsgRspnTextDefRec getRspnTextDefRec() {
		if( rspnTextDefRec == null ) {
			rspnTextDefRec = new CFBamXMsgRspnTextDefRec( this );
		}
		return( rspnTextDefRec );
	}

	protected CFBamXMsgRspnTextDefCreated getRspnTextDefCreated() {
		if( rspnTextDefCreated == null ) {
			rspnTextDefCreated = new CFBamXMsgRspnTextDefCreated( this );
		}
		return( rspnTextDefCreated );
	}

	protected CFBamXMsgRspnTextDefReadSingle getRspnTextDefReadSingle() {
		if( rspnTextDefReadSingle == null ) {
			rspnTextDefReadSingle = new CFBamXMsgRspnTextDefReadSingle( this );
			rspnTextDefReadSingle.addElementHandler( "TextDef", getRspnTextDefRec() );
			rspnTextDefReadSingle.addElementHandler( "TextType", getRspnTextTypeRec() );
			rspnTextDefReadSingle.addElementHandler( "TextCol", getRspnTextColRec() );
		}
		return( rspnTextDefReadSingle );
	}

	protected CFBamXMsgRspnTextDefReadList getRspnTextDefReadList() {
		if( rspnTextDefReadList == null ) {
			rspnTextDefReadList = new CFBamXMsgRspnTextDefReadList( this );
			rspnTextDefReadList.addElementHandler( "TextDef", getRspnTextDefRec() );
			rspnTextDefReadList.addElementHandler( "TextType", getRspnTextTypeRec() );
			rspnTextDefReadList.addElementHandler( "TextCol", getRspnTextColRec() );
		}
		return( rspnTextDefReadList );
	}

	protected CFBamXMsgRspnTextDefLocked getRspnTextDefLocked() {
		if( rspnTextDefLocked == null ) {
			rspnTextDefLocked = new CFBamXMsgRspnTextDefLocked( this );
		}
		return( rspnTextDefLocked );
	}

	protected CFBamXMsgRspnTextDefUpdated getRspnTextDefUpdated() {
		if( rspnTextDefUpdated == null ) {
			rspnTextDefUpdated = new CFBamXMsgRspnTextDefUpdated( this );
		}
		return( rspnTextDefUpdated );
	}

	protected CFBamXMsgRspnTextDefDeleted getRspnTextDefDeleted() {
		if( rspnTextDefDeleted == null ) {
			rspnTextDefDeleted = new CFBamXMsgRspnTextDefDeleted( this );
		}
		return( rspnTextDefDeleted );
	}

	// TextType Response s

	protected CFBamXMsgRspnTextTypeRec getRspnTextTypeRec() {
		if( rspnTextTypeRec == null ) {
			rspnTextTypeRec = new CFBamXMsgRspnTextTypeRec( this );
		}
		return( rspnTextTypeRec );
	}

	protected CFBamXMsgRspnTextTypeCreated getRspnTextTypeCreated() {
		if( rspnTextTypeCreated == null ) {
			rspnTextTypeCreated = new CFBamXMsgRspnTextTypeCreated( this );
		}
		return( rspnTextTypeCreated );
	}

	protected CFBamXMsgRspnTextTypeReadSingle getRspnTextTypeReadSingle() {
		if( rspnTextTypeReadSingle == null ) {
			rspnTextTypeReadSingle = new CFBamXMsgRspnTextTypeReadSingle( this );
			rspnTextTypeReadSingle.addElementHandler( "TextType", getRspnTextTypeRec() );
		}
		return( rspnTextTypeReadSingle );
	}

	protected CFBamXMsgRspnTextTypeReadList getRspnTextTypeReadList() {
		if( rspnTextTypeReadList == null ) {
			rspnTextTypeReadList = new CFBamXMsgRspnTextTypeReadList( this );
			rspnTextTypeReadList.addElementHandler( "TextType", getRspnTextTypeRec() );
		}
		return( rspnTextTypeReadList );
	}

	protected CFBamXMsgRspnTextTypeLocked getRspnTextTypeLocked() {
		if( rspnTextTypeLocked == null ) {
			rspnTextTypeLocked = new CFBamXMsgRspnTextTypeLocked( this );
		}
		return( rspnTextTypeLocked );
	}

	protected CFBamXMsgRspnTextTypeUpdated getRspnTextTypeUpdated() {
		if( rspnTextTypeUpdated == null ) {
			rspnTextTypeUpdated = new CFBamXMsgRspnTextTypeUpdated( this );
		}
		return( rspnTextTypeUpdated );
	}

	protected CFBamXMsgRspnTextTypeDeleted getRspnTextTypeDeleted() {
		if( rspnTextTypeDeleted == null ) {
			rspnTextTypeDeleted = new CFBamXMsgRspnTextTypeDeleted( this );
		}
		return( rspnTextTypeDeleted );
	}

	// TimeCol Response s

	protected CFBamXMsgRspnTimeColRec getRspnTimeColRec() {
		if( rspnTimeColRec == null ) {
			rspnTimeColRec = new CFBamXMsgRspnTimeColRec( this );
		}
		return( rspnTimeColRec );
	}

	protected CFBamXMsgRspnTimeColCreated getRspnTimeColCreated() {
		if( rspnTimeColCreated == null ) {
			rspnTimeColCreated = new CFBamXMsgRspnTimeColCreated( this );
		}
		return( rspnTimeColCreated );
	}

	protected CFBamXMsgRspnTimeColReadSingle getRspnTimeColReadSingle() {
		if( rspnTimeColReadSingle == null ) {
			rspnTimeColReadSingle = new CFBamXMsgRspnTimeColReadSingle( this );
			rspnTimeColReadSingle.addElementHandler( "TimeCol", getRspnTimeColRec() );
		}
		return( rspnTimeColReadSingle );
	}

	protected CFBamXMsgRspnTimeColReadList getRspnTimeColReadList() {
		if( rspnTimeColReadList == null ) {
			rspnTimeColReadList = new CFBamXMsgRspnTimeColReadList( this );
			rspnTimeColReadList.addElementHandler( "TimeCol", getRspnTimeColRec() );
		}
		return( rspnTimeColReadList );
	}

	protected CFBamXMsgRspnTimeColLocked getRspnTimeColLocked() {
		if( rspnTimeColLocked == null ) {
			rspnTimeColLocked = new CFBamXMsgRspnTimeColLocked( this );
		}
		return( rspnTimeColLocked );
	}

	protected CFBamXMsgRspnTimeColUpdated getRspnTimeColUpdated() {
		if( rspnTimeColUpdated == null ) {
			rspnTimeColUpdated = new CFBamXMsgRspnTimeColUpdated( this );
		}
		return( rspnTimeColUpdated );
	}

	protected CFBamXMsgRspnTimeColDeleted getRspnTimeColDeleted() {
		if( rspnTimeColDeleted == null ) {
			rspnTimeColDeleted = new CFBamXMsgRspnTimeColDeleted( this );
		}
		return( rspnTimeColDeleted );
	}

	// TimeDef Response s

	protected CFBamXMsgRspnTimeDefRec getRspnTimeDefRec() {
		if( rspnTimeDefRec == null ) {
			rspnTimeDefRec = new CFBamXMsgRspnTimeDefRec( this );
		}
		return( rspnTimeDefRec );
	}

	protected CFBamXMsgRspnTimeDefCreated getRspnTimeDefCreated() {
		if( rspnTimeDefCreated == null ) {
			rspnTimeDefCreated = new CFBamXMsgRspnTimeDefCreated( this );
		}
		return( rspnTimeDefCreated );
	}

	protected CFBamXMsgRspnTimeDefReadSingle getRspnTimeDefReadSingle() {
		if( rspnTimeDefReadSingle == null ) {
			rspnTimeDefReadSingle = new CFBamXMsgRspnTimeDefReadSingle( this );
			rspnTimeDefReadSingle.addElementHandler( "TimeDef", getRspnTimeDefRec() );
			rspnTimeDefReadSingle.addElementHandler( "TimeType", getRspnTimeTypeRec() );
			rspnTimeDefReadSingle.addElementHandler( "TimeCol", getRspnTimeColRec() );
		}
		return( rspnTimeDefReadSingle );
	}

	protected CFBamXMsgRspnTimeDefReadList getRspnTimeDefReadList() {
		if( rspnTimeDefReadList == null ) {
			rspnTimeDefReadList = new CFBamXMsgRspnTimeDefReadList( this );
			rspnTimeDefReadList.addElementHandler( "TimeDef", getRspnTimeDefRec() );
			rspnTimeDefReadList.addElementHandler( "TimeType", getRspnTimeTypeRec() );
			rspnTimeDefReadList.addElementHandler( "TimeCol", getRspnTimeColRec() );
		}
		return( rspnTimeDefReadList );
	}

	protected CFBamXMsgRspnTimeDefLocked getRspnTimeDefLocked() {
		if( rspnTimeDefLocked == null ) {
			rspnTimeDefLocked = new CFBamXMsgRspnTimeDefLocked( this );
		}
		return( rspnTimeDefLocked );
	}

	protected CFBamXMsgRspnTimeDefUpdated getRspnTimeDefUpdated() {
		if( rspnTimeDefUpdated == null ) {
			rspnTimeDefUpdated = new CFBamXMsgRspnTimeDefUpdated( this );
		}
		return( rspnTimeDefUpdated );
	}

	protected CFBamXMsgRspnTimeDefDeleted getRspnTimeDefDeleted() {
		if( rspnTimeDefDeleted == null ) {
			rspnTimeDefDeleted = new CFBamXMsgRspnTimeDefDeleted( this );
		}
		return( rspnTimeDefDeleted );
	}

	// TimeType Response s

	protected CFBamXMsgRspnTimeTypeRec getRspnTimeTypeRec() {
		if( rspnTimeTypeRec == null ) {
			rspnTimeTypeRec = new CFBamXMsgRspnTimeTypeRec( this );
		}
		return( rspnTimeTypeRec );
	}

	protected CFBamXMsgRspnTimeTypeCreated getRspnTimeTypeCreated() {
		if( rspnTimeTypeCreated == null ) {
			rspnTimeTypeCreated = new CFBamXMsgRspnTimeTypeCreated( this );
		}
		return( rspnTimeTypeCreated );
	}

	protected CFBamXMsgRspnTimeTypeReadSingle getRspnTimeTypeReadSingle() {
		if( rspnTimeTypeReadSingle == null ) {
			rspnTimeTypeReadSingle = new CFBamXMsgRspnTimeTypeReadSingle( this );
			rspnTimeTypeReadSingle.addElementHandler( "TimeType", getRspnTimeTypeRec() );
		}
		return( rspnTimeTypeReadSingle );
	}

	protected CFBamXMsgRspnTimeTypeReadList getRspnTimeTypeReadList() {
		if( rspnTimeTypeReadList == null ) {
			rspnTimeTypeReadList = new CFBamXMsgRspnTimeTypeReadList( this );
			rspnTimeTypeReadList.addElementHandler( "TimeType", getRspnTimeTypeRec() );
		}
		return( rspnTimeTypeReadList );
	}

	protected CFBamXMsgRspnTimeTypeLocked getRspnTimeTypeLocked() {
		if( rspnTimeTypeLocked == null ) {
			rspnTimeTypeLocked = new CFBamXMsgRspnTimeTypeLocked( this );
		}
		return( rspnTimeTypeLocked );
	}

	protected CFBamXMsgRspnTimeTypeUpdated getRspnTimeTypeUpdated() {
		if( rspnTimeTypeUpdated == null ) {
			rspnTimeTypeUpdated = new CFBamXMsgRspnTimeTypeUpdated( this );
		}
		return( rspnTimeTypeUpdated );
	}

	protected CFBamXMsgRspnTimeTypeDeleted getRspnTimeTypeDeleted() {
		if( rspnTimeTypeDeleted == null ) {
			rspnTimeTypeDeleted = new CFBamXMsgRspnTimeTypeDeleted( this );
		}
		return( rspnTimeTypeDeleted );
	}

	// TimestampCol Response s

	protected CFBamXMsgRspnTimestampColRec getRspnTimestampColRec() {
		if( rspnTimestampColRec == null ) {
			rspnTimestampColRec = new CFBamXMsgRspnTimestampColRec( this );
		}
		return( rspnTimestampColRec );
	}

	protected CFBamXMsgRspnTimestampColCreated getRspnTimestampColCreated() {
		if( rspnTimestampColCreated == null ) {
			rspnTimestampColCreated = new CFBamXMsgRspnTimestampColCreated( this );
		}
		return( rspnTimestampColCreated );
	}

	protected CFBamXMsgRspnTimestampColReadSingle getRspnTimestampColReadSingle() {
		if( rspnTimestampColReadSingle == null ) {
			rspnTimestampColReadSingle = new CFBamXMsgRspnTimestampColReadSingle( this );
			rspnTimestampColReadSingle.addElementHandler( "TimestampCol", getRspnTimestampColRec() );
		}
		return( rspnTimestampColReadSingle );
	}

	protected CFBamXMsgRspnTimestampColReadList getRspnTimestampColReadList() {
		if( rspnTimestampColReadList == null ) {
			rspnTimestampColReadList = new CFBamXMsgRspnTimestampColReadList( this );
			rspnTimestampColReadList.addElementHandler( "TimestampCol", getRspnTimestampColRec() );
		}
		return( rspnTimestampColReadList );
	}

	protected CFBamXMsgRspnTimestampColLocked getRspnTimestampColLocked() {
		if( rspnTimestampColLocked == null ) {
			rspnTimestampColLocked = new CFBamXMsgRspnTimestampColLocked( this );
		}
		return( rspnTimestampColLocked );
	}

	protected CFBamXMsgRspnTimestampColUpdated getRspnTimestampColUpdated() {
		if( rspnTimestampColUpdated == null ) {
			rspnTimestampColUpdated = new CFBamXMsgRspnTimestampColUpdated( this );
		}
		return( rspnTimestampColUpdated );
	}

	protected CFBamXMsgRspnTimestampColDeleted getRspnTimestampColDeleted() {
		if( rspnTimestampColDeleted == null ) {
			rspnTimestampColDeleted = new CFBamXMsgRspnTimestampColDeleted( this );
		}
		return( rspnTimestampColDeleted );
	}

	// TimestampDef Response s

	protected CFBamXMsgRspnTimestampDefRec getRspnTimestampDefRec() {
		if( rspnTimestampDefRec == null ) {
			rspnTimestampDefRec = new CFBamXMsgRspnTimestampDefRec( this );
		}
		return( rspnTimestampDefRec );
	}

	protected CFBamXMsgRspnTimestampDefCreated getRspnTimestampDefCreated() {
		if( rspnTimestampDefCreated == null ) {
			rspnTimestampDefCreated = new CFBamXMsgRspnTimestampDefCreated( this );
		}
		return( rspnTimestampDefCreated );
	}

	protected CFBamXMsgRspnTimestampDefReadSingle getRspnTimestampDefReadSingle() {
		if( rspnTimestampDefReadSingle == null ) {
			rspnTimestampDefReadSingle = new CFBamXMsgRspnTimestampDefReadSingle( this );
			rspnTimestampDefReadSingle.addElementHandler( "TimestampDef", getRspnTimestampDefRec() );
			rspnTimestampDefReadSingle.addElementHandler( "TimestampType", getRspnTimestampTypeRec() );
			rspnTimestampDefReadSingle.addElementHandler( "TimestampCol", getRspnTimestampColRec() );
		}
		return( rspnTimestampDefReadSingle );
	}

	protected CFBamXMsgRspnTimestampDefReadList getRspnTimestampDefReadList() {
		if( rspnTimestampDefReadList == null ) {
			rspnTimestampDefReadList = new CFBamXMsgRspnTimestampDefReadList( this );
			rspnTimestampDefReadList.addElementHandler( "TimestampDef", getRspnTimestampDefRec() );
			rspnTimestampDefReadList.addElementHandler( "TimestampType", getRspnTimestampTypeRec() );
			rspnTimestampDefReadList.addElementHandler( "TimestampCol", getRspnTimestampColRec() );
		}
		return( rspnTimestampDefReadList );
	}

	protected CFBamXMsgRspnTimestampDefLocked getRspnTimestampDefLocked() {
		if( rspnTimestampDefLocked == null ) {
			rspnTimestampDefLocked = new CFBamXMsgRspnTimestampDefLocked( this );
		}
		return( rspnTimestampDefLocked );
	}

	protected CFBamXMsgRspnTimestampDefUpdated getRspnTimestampDefUpdated() {
		if( rspnTimestampDefUpdated == null ) {
			rspnTimestampDefUpdated = new CFBamXMsgRspnTimestampDefUpdated( this );
		}
		return( rspnTimestampDefUpdated );
	}

	protected CFBamXMsgRspnTimestampDefDeleted getRspnTimestampDefDeleted() {
		if( rspnTimestampDefDeleted == null ) {
			rspnTimestampDefDeleted = new CFBamXMsgRspnTimestampDefDeleted( this );
		}
		return( rspnTimestampDefDeleted );
	}

	// TimestampType Response s

	protected CFBamXMsgRspnTimestampTypeRec getRspnTimestampTypeRec() {
		if( rspnTimestampTypeRec == null ) {
			rspnTimestampTypeRec = new CFBamXMsgRspnTimestampTypeRec( this );
		}
		return( rspnTimestampTypeRec );
	}

	protected CFBamXMsgRspnTimestampTypeCreated getRspnTimestampTypeCreated() {
		if( rspnTimestampTypeCreated == null ) {
			rspnTimestampTypeCreated = new CFBamXMsgRspnTimestampTypeCreated( this );
		}
		return( rspnTimestampTypeCreated );
	}

	protected CFBamXMsgRspnTimestampTypeReadSingle getRspnTimestampTypeReadSingle() {
		if( rspnTimestampTypeReadSingle == null ) {
			rspnTimestampTypeReadSingle = new CFBamXMsgRspnTimestampTypeReadSingle( this );
			rspnTimestampTypeReadSingle.addElementHandler( "TimestampType", getRspnTimestampTypeRec() );
		}
		return( rspnTimestampTypeReadSingle );
	}

	protected CFBamXMsgRspnTimestampTypeReadList getRspnTimestampTypeReadList() {
		if( rspnTimestampTypeReadList == null ) {
			rspnTimestampTypeReadList = new CFBamXMsgRspnTimestampTypeReadList( this );
			rspnTimestampTypeReadList.addElementHandler( "TimestampType", getRspnTimestampTypeRec() );
		}
		return( rspnTimestampTypeReadList );
	}

	protected CFBamXMsgRspnTimestampTypeLocked getRspnTimestampTypeLocked() {
		if( rspnTimestampTypeLocked == null ) {
			rspnTimestampTypeLocked = new CFBamXMsgRspnTimestampTypeLocked( this );
		}
		return( rspnTimestampTypeLocked );
	}

	protected CFBamXMsgRspnTimestampTypeUpdated getRspnTimestampTypeUpdated() {
		if( rspnTimestampTypeUpdated == null ) {
			rspnTimestampTypeUpdated = new CFBamXMsgRspnTimestampTypeUpdated( this );
		}
		return( rspnTimestampTypeUpdated );
	}

	protected CFBamXMsgRspnTimestampTypeDeleted getRspnTimestampTypeDeleted() {
		if( rspnTimestampTypeDeleted == null ) {
			rspnTimestampTypeDeleted = new CFBamXMsgRspnTimestampTypeDeleted( this );
		}
		return( rspnTimestampTypeDeleted );
	}

	// Tld Response s

	protected CFBamXMsgRspnTldRec getRspnTldRec() {
		if( rspnTldRec == null ) {
			rspnTldRec = new CFBamXMsgRspnTldRec( this );
		}
		return( rspnTldRec );
	}

	protected CFBamXMsgRspnTldCreated getRspnTldCreated() {
		if( rspnTldCreated == null ) {
			rspnTldCreated = new CFBamXMsgRspnTldCreated( this );
		}
		return( rspnTldCreated );
	}

	protected CFBamXMsgRspnTldReadSingle getRspnTldReadSingle() {
		if( rspnTldReadSingle == null ) {
			rspnTldReadSingle = new CFBamXMsgRspnTldReadSingle( this );
			rspnTldReadSingle.addElementHandler( "Tld", getRspnTldRec() );
		}
		return( rspnTldReadSingle );
	}

	protected CFBamXMsgRspnTldReadList getRspnTldReadList() {
		if( rspnTldReadList == null ) {
			rspnTldReadList = new CFBamXMsgRspnTldReadList( this );
			rspnTldReadList.addElementHandler( "Tld", getRspnTldRec() );
		}
		return( rspnTldReadList );
	}

	protected CFBamXMsgRspnTldLocked getRspnTldLocked() {
		if( rspnTldLocked == null ) {
			rspnTldLocked = new CFBamXMsgRspnTldLocked( this );
		}
		return( rspnTldLocked );
	}

	protected CFBamXMsgRspnTldUpdated getRspnTldUpdated() {
		if( rspnTldUpdated == null ) {
			rspnTldUpdated = new CFBamXMsgRspnTldUpdated( this );
		}
		return( rspnTldUpdated );
	}

	protected CFBamXMsgRspnTldDeleted getRspnTldDeleted() {
		if( rspnTldDeleted == null ) {
			rspnTldDeleted = new CFBamXMsgRspnTldDeleted( this );
		}
		return( rspnTldDeleted );
	}

	// TokenCol Response s

	protected CFBamXMsgRspnTokenColRec getRspnTokenColRec() {
		if( rspnTokenColRec == null ) {
			rspnTokenColRec = new CFBamXMsgRspnTokenColRec( this );
		}
		return( rspnTokenColRec );
	}

	protected CFBamXMsgRspnTokenColCreated getRspnTokenColCreated() {
		if( rspnTokenColCreated == null ) {
			rspnTokenColCreated = new CFBamXMsgRspnTokenColCreated( this );
		}
		return( rspnTokenColCreated );
	}

	protected CFBamXMsgRspnTokenColReadSingle getRspnTokenColReadSingle() {
		if( rspnTokenColReadSingle == null ) {
			rspnTokenColReadSingle = new CFBamXMsgRspnTokenColReadSingle( this );
			rspnTokenColReadSingle.addElementHandler( "TokenCol", getRspnTokenColRec() );
		}
		return( rspnTokenColReadSingle );
	}

	protected CFBamXMsgRspnTokenColReadList getRspnTokenColReadList() {
		if( rspnTokenColReadList == null ) {
			rspnTokenColReadList = new CFBamXMsgRspnTokenColReadList( this );
			rspnTokenColReadList.addElementHandler( "TokenCol", getRspnTokenColRec() );
		}
		return( rspnTokenColReadList );
	}

	protected CFBamXMsgRspnTokenColLocked getRspnTokenColLocked() {
		if( rspnTokenColLocked == null ) {
			rspnTokenColLocked = new CFBamXMsgRspnTokenColLocked( this );
		}
		return( rspnTokenColLocked );
	}

	protected CFBamXMsgRspnTokenColUpdated getRspnTokenColUpdated() {
		if( rspnTokenColUpdated == null ) {
			rspnTokenColUpdated = new CFBamXMsgRspnTokenColUpdated( this );
		}
		return( rspnTokenColUpdated );
	}

	protected CFBamXMsgRspnTokenColDeleted getRspnTokenColDeleted() {
		if( rspnTokenColDeleted == null ) {
			rspnTokenColDeleted = new CFBamXMsgRspnTokenColDeleted( this );
		}
		return( rspnTokenColDeleted );
	}

	// TokenDef Response s

	protected CFBamXMsgRspnTokenDefRec getRspnTokenDefRec() {
		if( rspnTokenDefRec == null ) {
			rspnTokenDefRec = new CFBamXMsgRspnTokenDefRec( this );
		}
		return( rspnTokenDefRec );
	}

	protected CFBamXMsgRspnTokenDefCreated getRspnTokenDefCreated() {
		if( rspnTokenDefCreated == null ) {
			rspnTokenDefCreated = new CFBamXMsgRspnTokenDefCreated( this );
		}
		return( rspnTokenDefCreated );
	}

	protected CFBamXMsgRspnTokenDefReadSingle getRspnTokenDefReadSingle() {
		if( rspnTokenDefReadSingle == null ) {
			rspnTokenDefReadSingle = new CFBamXMsgRspnTokenDefReadSingle( this );
			rspnTokenDefReadSingle.addElementHandler( "TokenDef", getRspnTokenDefRec() );
			rspnTokenDefReadSingle.addElementHandler( "TokenType", getRspnTokenTypeRec() );
			rspnTokenDefReadSingle.addElementHandler( "TokenCol", getRspnTokenColRec() );
		}
		return( rspnTokenDefReadSingle );
	}

	protected CFBamXMsgRspnTokenDefReadList getRspnTokenDefReadList() {
		if( rspnTokenDefReadList == null ) {
			rspnTokenDefReadList = new CFBamXMsgRspnTokenDefReadList( this );
			rspnTokenDefReadList.addElementHandler( "TokenDef", getRspnTokenDefRec() );
			rspnTokenDefReadList.addElementHandler( "TokenType", getRspnTokenTypeRec() );
			rspnTokenDefReadList.addElementHandler( "TokenCol", getRspnTokenColRec() );
		}
		return( rspnTokenDefReadList );
	}

	protected CFBamXMsgRspnTokenDefLocked getRspnTokenDefLocked() {
		if( rspnTokenDefLocked == null ) {
			rspnTokenDefLocked = new CFBamXMsgRspnTokenDefLocked( this );
		}
		return( rspnTokenDefLocked );
	}

	protected CFBamXMsgRspnTokenDefUpdated getRspnTokenDefUpdated() {
		if( rspnTokenDefUpdated == null ) {
			rspnTokenDefUpdated = new CFBamXMsgRspnTokenDefUpdated( this );
		}
		return( rspnTokenDefUpdated );
	}

	protected CFBamXMsgRspnTokenDefDeleted getRspnTokenDefDeleted() {
		if( rspnTokenDefDeleted == null ) {
			rspnTokenDefDeleted = new CFBamXMsgRspnTokenDefDeleted( this );
		}
		return( rspnTokenDefDeleted );
	}

	// TokenType Response s

	protected CFBamXMsgRspnTokenTypeRec getRspnTokenTypeRec() {
		if( rspnTokenTypeRec == null ) {
			rspnTokenTypeRec = new CFBamXMsgRspnTokenTypeRec( this );
		}
		return( rspnTokenTypeRec );
	}

	protected CFBamXMsgRspnTokenTypeCreated getRspnTokenTypeCreated() {
		if( rspnTokenTypeCreated == null ) {
			rspnTokenTypeCreated = new CFBamXMsgRspnTokenTypeCreated( this );
		}
		return( rspnTokenTypeCreated );
	}

	protected CFBamXMsgRspnTokenTypeReadSingle getRspnTokenTypeReadSingle() {
		if( rspnTokenTypeReadSingle == null ) {
			rspnTokenTypeReadSingle = new CFBamXMsgRspnTokenTypeReadSingle( this );
			rspnTokenTypeReadSingle.addElementHandler( "TokenType", getRspnTokenTypeRec() );
		}
		return( rspnTokenTypeReadSingle );
	}

	protected CFBamXMsgRspnTokenTypeReadList getRspnTokenTypeReadList() {
		if( rspnTokenTypeReadList == null ) {
			rspnTokenTypeReadList = new CFBamXMsgRspnTokenTypeReadList( this );
			rspnTokenTypeReadList.addElementHandler( "TokenType", getRspnTokenTypeRec() );
		}
		return( rspnTokenTypeReadList );
	}

	protected CFBamXMsgRspnTokenTypeLocked getRspnTokenTypeLocked() {
		if( rspnTokenTypeLocked == null ) {
			rspnTokenTypeLocked = new CFBamXMsgRspnTokenTypeLocked( this );
		}
		return( rspnTokenTypeLocked );
	}

	protected CFBamXMsgRspnTokenTypeUpdated getRspnTokenTypeUpdated() {
		if( rspnTokenTypeUpdated == null ) {
			rspnTokenTypeUpdated = new CFBamXMsgRspnTokenTypeUpdated( this );
		}
		return( rspnTokenTypeUpdated );
	}

	protected CFBamXMsgRspnTokenTypeDeleted getRspnTokenTypeDeleted() {
		if( rspnTokenTypeDeleted == null ) {
			rspnTokenTypeDeleted = new CFBamXMsgRspnTokenTypeDeleted( this );
		}
		return( rspnTokenTypeDeleted );
	}

	// TopDomain Response s

	protected CFBamXMsgRspnTopDomainRec getRspnTopDomainRec() {
		if( rspnTopDomainRec == null ) {
			rspnTopDomainRec = new CFBamXMsgRspnTopDomainRec( this );
		}
		return( rspnTopDomainRec );
	}

	protected CFBamXMsgRspnTopDomainCreated getRspnTopDomainCreated() {
		if( rspnTopDomainCreated == null ) {
			rspnTopDomainCreated = new CFBamXMsgRspnTopDomainCreated( this );
		}
		return( rspnTopDomainCreated );
	}

	protected CFBamXMsgRspnTopDomainReadSingle getRspnTopDomainReadSingle() {
		if( rspnTopDomainReadSingle == null ) {
			rspnTopDomainReadSingle = new CFBamXMsgRspnTopDomainReadSingle( this );
			rspnTopDomainReadSingle.addElementHandler( "TopDomain", getRspnTopDomainRec() );
		}
		return( rspnTopDomainReadSingle );
	}

	protected CFBamXMsgRspnTopDomainReadList getRspnTopDomainReadList() {
		if( rspnTopDomainReadList == null ) {
			rspnTopDomainReadList = new CFBamXMsgRspnTopDomainReadList( this );
			rspnTopDomainReadList.addElementHandler( "TopDomain", getRspnTopDomainRec() );
		}
		return( rspnTopDomainReadList );
	}

	protected CFBamXMsgRspnTopDomainLocked getRspnTopDomainLocked() {
		if( rspnTopDomainLocked == null ) {
			rspnTopDomainLocked = new CFBamXMsgRspnTopDomainLocked( this );
		}
		return( rspnTopDomainLocked );
	}

	protected CFBamXMsgRspnTopDomainUpdated getRspnTopDomainUpdated() {
		if( rspnTopDomainUpdated == null ) {
			rspnTopDomainUpdated = new CFBamXMsgRspnTopDomainUpdated( this );
		}
		return( rspnTopDomainUpdated );
	}

	protected CFBamXMsgRspnTopDomainDeleted getRspnTopDomainDeleted() {
		if( rspnTopDomainDeleted == null ) {
			rspnTopDomainDeleted = new CFBamXMsgRspnTopDomainDeleted( this );
		}
		return( rspnTopDomainDeleted );
	}

	// TopProject Response s

	protected CFBamXMsgRspnTopProjectRec getRspnTopProjectRec() {
		if( rspnTopProjectRec == null ) {
			rspnTopProjectRec = new CFBamXMsgRspnTopProjectRec( this );
		}
		return( rspnTopProjectRec );
	}

	protected CFBamXMsgRspnTopProjectCreated getRspnTopProjectCreated() {
		if( rspnTopProjectCreated == null ) {
			rspnTopProjectCreated = new CFBamXMsgRspnTopProjectCreated( this );
		}
		return( rspnTopProjectCreated );
	}

	protected CFBamXMsgRspnTopProjectReadSingle getRspnTopProjectReadSingle() {
		if( rspnTopProjectReadSingle == null ) {
			rspnTopProjectReadSingle = new CFBamXMsgRspnTopProjectReadSingle( this );
			rspnTopProjectReadSingle.addElementHandler( "TopProject", getRspnTopProjectRec() );
		}
		return( rspnTopProjectReadSingle );
	}

	protected CFBamXMsgRspnTopProjectReadList getRspnTopProjectReadList() {
		if( rspnTopProjectReadList == null ) {
			rspnTopProjectReadList = new CFBamXMsgRspnTopProjectReadList( this );
			rspnTopProjectReadList.addElementHandler( "TopProject", getRspnTopProjectRec() );
		}
		return( rspnTopProjectReadList );
	}

	protected CFBamXMsgRspnTopProjectLocked getRspnTopProjectLocked() {
		if( rspnTopProjectLocked == null ) {
			rspnTopProjectLocked = new CFBamXMsgRspnTopProjectLocked( this );
		}
		return( rspnTopProjectLocked );
	}

	protected CFBamXMsgRspnTopProjectUpdated getRspnTopProjectUpdated() {
		if( rspnTopProjectUpdated == null ) {
			rspnTopProjectUpdated = new CFBamXMsgRspnTopProjectUpdated( this );
		}
		return( rspnTopProjectUpdated );
	}

	protected CFBamXMsgRspnTopProjectDeleted getRspnTopProjectDeleted() {
		if( rspnTopProjectDeleted == null ) {
			rspnTopProjectDeleted = new CFBamXMsgRspnTopProjectDeleted( this );
		}
		return( rspnTopProjectDeleted );
	}

	// UInt16Col Response s

	protected CFBamXMsgRspnUInt16ColRec getRspnUInt16ColRec() {
		if( rspnUInt16ColRec == null ) {
			rspnUInt16ColRec = new CFBamXMsgRspnUInt16ColRec( this );
		}
		return( rspnUInt16ColRec );
	}

	protected CFBamXMsgRspnUInt16ColCreated getRspnUInt16ColCreated() {
		if( rspnUInt16ColCreated == null ) {
			rspnUInt16ColCreated = new CFBamXMsgRspnUInt16ColCreated( this );
		}
		return( rspnUInt16ColCreated );
	}

	protected CFBamXMsgRspnUInt16ColReadSingle getRspnUInt16ColReadSingle() {
		if( rspnUInt16ColReadSingle == null ) {
			rspnUInt16ColReadSingle = new CFBamXMsgRspnUInt16ColReadSingle( this );
			rspnUInt16ColReadSingle.addElementHandler( "UInt16Col", getRspnUInt16ColRec() );
		}
		return( rspnUInt16ColReadSingle );
	}

	protected CFBamXMsgRspnUInt16ColReadList getRspnUInt16ColReadList() {
		if( rspnUInt16ColReadList == null ) {
			rspnUInt16ColReadList = new CFBamXMsgRspnUInt16ColReadList( this );
			rspnUInt16ColReadList.addElementHandler( "UInt16Col", getRspnUInt16ColRec() );
		}
		return( rspnUInt16ColReadList );
	}

	protected CFBamXMsgRspnUInt16ColLocked getRspnUInt16ColLocked() {
		if( rspnUInt16ColLocked == null ) {
			rspnUInt16ColLocked = new CFBamXMsgRspnUInt16ColLocked( this );
		}
		return( rspnUInt16ColLocked );
	}

	protected CFBamXMsgRspnUInt16ColUpdated getRspnUInt16ColUpdated() {
		if( rspnUInt16ColUpdated == null ) {
			rspnUInt16ColUpdated = new CFBamXMsgRspnUInt16ColUpdated( this );
		}
		return( rspnUInt16ColUpdated );
	}

	protected CFBamXMsgRspnUInt16ColDeleted getRspnUInt16ColDeleted() {
		if( rspnUInt16ColDeleted == null ) {
			rspnUInt16ColDeleted = new CFBamXMsgRspnUInt16ColDeleted( this );
		}
		return( rspnUInt16ColDeleted );
	}

	// UInt16Def Response s

	protected CFBamXMsgRspnUInt16DefRec getRspnUInt16DefRec() {
		if( rspnUInt16DefRec == null ) {
			rspnUInt16DefRec = new CFBamXMsgRspnUInt16DefRec( this );
		}
		return( rspnUInt16DefRec );
	}

	protected CFBamXMsgRspnUInt16DefCreated getRspnUInt16DefCreated() {
		if( rspnUInt16DefCreated == null ) {
			rspnUInt16DefCreated = new CFBamXMsgRspnUInt16DefCreated( this );
		}
		return( rspnUInt16DefCreated );
	}

	protected CFBamXMsgRspnUInt16DefReadSingle getRspnUInt16DefReadSingle() {
		if( rspnUInt16DefReadSingle == null ) {
			rspnUInt16DefReadSingle = new CFBamXMsgRspnUInt16DefReadSingle( this );
			rspnUInt16DefReadSingle.addElementHandler( "UInt16Def", getRspnUInt16DefRec() );
			rspnUInt16DefReadSingle.addElementHandler( "UInt16Type", getRspnUInt16TypeRec() );
			rspnUInt16DefReadSingle.addElementHandler( "UInt16Col", getRspnUInt16ColRec() );
		}
		return( rspnUInt16DefReadSingle );
	}

	protected CFBamXMsgRspnUInt16DefReadList getRspnUInt16DefReadList() {
		if( rspnUInt16DefReadList == null ) {
			rspnUInt16DefReadList = new CFBamXMsgRspnUInt16DefReadList( this );
			rspnUInt16DefReadList.addElementHandler( "UInt16Def", getRspnUInt16DefRec() );
			rspnUInt16DefReadList.addElementHandler( "UInt16Type", getRspnUInt16TypeRec() );
			rspnUInt16DefReadList.addElementHandler( "UInt16Col", getRspnUInt16ColRec() );
		}
		return( rspnUInt16DefReadList );
	}

	protected CFBamXMsgRspnUInt16DefLocked getRspnUInt16DefLocked() {
		if( rspnUInt16DefLocked == null ) {
			rspnUInt16DefLocked = new CFBamXMsgRspnUInt16DefLocked( this );
		}
		return( rspnUInt16DefLocked );
	}

	protected CFBamXMsgRspnUInt16DefUpdated getRspnUInt16DefUpdated() {
		if( rspnUInt16DefUpdated == null ) {
			rspnUInt16DefUpdated = new CFBamXMsgRspnUInt16DefUpdated( this );
		}
		return( rspnUInt16DefUpdated );
	}

	protected CFBamXMsgRspnUInt16DefDeleted getRspnUInt16DefDeleted() {
		if( rspnUInt16DefDeleted == null ) {
			rspnUInt16DefDeleted = new CFBamXMsgRspnUInt16DefDeleted( this );
		}
		return( rspnUInt16DefDeleted );
	}

	// UInt16Type Response s

	protected CFBamXMsgRspnUInt16TypeRec getRspnUInt16TypeRec() {
		if( rspnUInt16TypeRec == null ) {
			rspnUInt16TypeRec = new CFBamXMsgRspnUInt16TypeRec( this );
		}
		return( rspnUInt16TypeRec );
	}

	protected CFBamXMsgRspnUInt16TypeCreated getRspnUInt16TypeCreated() {
		if( rspnUInt16TypeCreated == null ) {
			rspnUInt16TypeCreated = new CFBamXMsgRspnUInt16TypeCreated( this );
		}
		return( rspnUInt16TypeCreated );
	}

	protected CFBamXMsgRspnUInt16TypeReadSingle getRspnUInt16TypeReadSingle() {
		if( rspnUInt16TypeReadSingle == null ) {
			rspnUInt16TypeReadSingle = new CFBamXMsgRspnUInt16TypeReadSingle( this );
			rspnUInt16TypeReadSingle.addElementHandler( "UInt16Type", getRspnUInt16TypeRec() );
		}
		return( rspnUInt16TypeReadSingle );
	}

	protected CFBamXMsgRspnUInt16TypeReadList getRspnUInt16TypeReadList() {
		if( rspnUInt16TypeReadList == null ) {
			rspnUInt16TypeReadList = new CFBamXMsgRspnUInt16TypeReadList( this );
			rspnUInt16TypeReadList.addElementHandler( "UInt16Type", getRspnUInt16TypeRec() );
		}
		return( rspnUInt16TypeReadList );
	}

	protected CFBamXMsgRspnUInt16TypeLocked getRspnUInt16TypeLocked() {
		if( rspnUInt16TypeLocked == null ) {
			rspnUInt16TypeLocked = new CFBamXMsgRspnUInt16TypeLocked( this );
		}
		return( rspnUInt16TypeLocked );
	}

	protected CFBamXMsgRspnUInt16TypeUpdated getRspnUInt16TypeUpdated() {
		if( rspnUInt16TypeUpdated == null ) {
			rspnUInt16TypeUpdated = new CFBamXMsgRspnUInt16TypeUpdated( this );
		}
		return( rspnUInt16TypeUpdated );
	}

	protected CFBamXMsgRspnUInt16TypeDeleted getRspnUInt16TypeDeleted() {
		if( rspnUInt16TypeDeleted == null ) {
			rspnUInt16TypeDeleted = new CFBamXMsgRspnUInt16TypeDeleted( this );
		}
		return( rspnUInt16TypeDeleted );
	}

	// UInt32Col Response s

	protected CFBamXMsgRspnUInt32ColRec getRspnUInt32ColRec() {
		if( rspnUInt32ColRec == null ) {
			rspnUInt32ColRec = new CFBamXMsgRspnUInt32ColRec( this );
		}
		return( rspnUInt32ColRec );
	}

	protected CFBamXMsgRspnUInt32ColCreated getRspnUInt32ColCreated() {
		if( rspnUInt32ColCreated == null ) {
			rspnUInt32ColCreated = new CFBamXMsgRspnUInt32ColCreated( this );
		}
		return( rspnUInt32ColCreated );
	}

	protected CFBamXMsgRspnUInt32ColReadSingle getRspnUInt32ColReadSingle() {
		if( rspnUInt32ColReadSingle == null ) {
			rspnUInt32ColReadSingle = new CFBamXMsgRspnUInt32ColReadSingle( this );
			rspnUInt32ColReadSingle.addElementHandler( "UInt32Col", getRspnUInt32ColRec() );
		}
		return( rspnUInt32ColReadSingle );
	}

	protected CFBamXMsgRspnUInt32ColReadList getRspnUInt32ColReadList() {
		if( rspnUInt32ColReadList == null ) {
			rspnUInt32ColReadList = new CFBamXMsgRspnUInt32ColReadList( this );
			rspnUInt32ColReadList.addElementHandler( "UInt32Col", getRspnUInt32ColRec() );
		}
		return( rspnUInt32ColReadList );
	}

	protected CFBamXMsgRspnUInt32ColLocked getRspnUInt32ColLocked() {
		if( rspnUInt32ColLocked == null ) {
			rspnUInt32ColLocked = new CFBamXMsgRspnUInt32ColLocked( this );
		}
		return( rspnUInt32ColLocked );
	}

	protected CFBamXMsgRspnUInt32ColUpdated getRspnUInt32ColUpdated() {
		if( rspnUInt32ColUpdated == null ) {
			rspnUInt32ColUpdated = new CFBamXMsgRspnUInt32ColUpdated( this );
		}
		return( rspnUInt32ColUpdated );
	}

	protected CFBamXMsgRspnUInt32ColDeleted getRspnUInt32ColDeleted() {
		if( rspnUInt32ColDeleted == null ) {
			rspnUInt32ColDeleted = new CFBamXMsgRspnUInt32ColDeleted( this );
		}
		return( rspnUInt32ColDeleted );
	}

	// UInt32Def Response s

	protected CFBamXMsgRspnUInt32DefRec getRspnUInt32DefRec() {
		if( rspnUInt32DefRec == null ) {
			rspnUInt32DefRec = new CFBamXMsgRspnUInt32DefRec( this );
		}
		return( rspnUInt32DefRec );
	}

	protected CFBamXMsgRspnUInt32DefCreated getRspnUInt32DefCreated() {
		if( rspnUInt32DefCreated == null ) {
			rspnUInt32DefCreated = new CFBamXMsgRspnUInt32DefCreated( this );
		}
		return( rspnUInt32DefCreated );
	}

	protected CFBamXMsgRspnUInt32DefReadSingle getRspnUInt32DefReadSingle() {
		if( rspnUInt32DefReadSingle == null ) {
			rspnUInt32DefReadSingle = new CFBamXMsgRspnUInt32DefReadSingle( this );
			rspnUInt32DefReadSingle.addElementHandler( "UInt32Def", getRspnUInt32DefRec() );
			rspnUInt32DefReadSingle.addElementHandler( "UInt32Type", getRspnUInt32TypeRec() );
			rspnUInt32DefReadSingle.addElementHandler( "UInt32Col", getRspnUInt32ColRec() );
		}
		return( rspnUInt32DefReadSingle );
	}

	protected CFBamXMsgRspnUInt32DefReadList getRspnUInt32DefReadList() {
		if( rspnUInt32DefReadList == null ) {
			rspnUInt32DefReadList = new CFBamXMsgRspnUInt32DefReadList( this );
			rspnUInt32DefReadList.addElementHandler( "UInt32Def", getRspnUInt32DefRec() );
			rspnUInt32DefReadList.addElementHandler( "UInt32Type", getRspnUInt32TypeRec() );
			rspnUInt32DefReadList.addElementHandler( "UInt32Col", getRspnUInt32ColRec() );
		}
		return( rspnUInt32DefReadList );
	}

	protected CFBamXMsgRspnUInt32DefLocked getRspnUInt32DefLocked() {
		if( rspnUInt32DefLocked == null ) {
			rspnUInt32DefLocked = new CFBamXMsgRspnUInt32DefLocked( this );
		}
		return( rspnUInt32DefLocked );
	}

	protected CFBamXMsgRspnUInt32DefUpdated getRspnUInt32DefUpdated() {
		if( rspnUInt32DefUpdated == null ) {
			rspnUInt32DefUpdated = new CFBamXMsgRspnUInt32DefUpdated( this );
		}
		return( rspnUInt32DefUpdated );
	}

	protected CFBamXMsgRspnUInt32DefDeleted getRspnUInt32DefDeleted() {
		if( rspnUInt32DefDeleted == null ) {
			rspnUInt32DefDeleted = new CFBamXMsgRspnUInt32DefDeleted( this );
		}
		return( rspnUInt32DefDeleted );
	}

	// UInt32Type Response s

	protected CFBamXMsgRspnUInt32TypeRec getRspnUInt32TypeRec() {
		if( rspnUInt32TypeRec == null ) {
			rspnUInt32TypeRec = new CFBamXMsgRspnUInt32TypeRec( this );
		}
		return( rspnUInt32TypeRec );
	}

	protected CFBamXMsgRspnUInt32TypeCreated getRspnUInt32TypeCreated() {
		if( rspnUInt32TypeCreated == null ) {
			rspnUInt32TypeCreated = new CFBamXMsgRspnUInt32TypeCreated( this );
		}
		return( rspnUInt32TypeCreated );
	}

	protected CFBamXMsgRspnUInt32TypeReadSingle getRspnUInt32TypeReadSingle() {
		if( rspnUInt32TypeReadSingle == null ) {
			rspnUInt32TypeReadSingle = new CFBamXMsgRspnUInt32TypeReadSingle( this );
			rspnUInt32TypeReadSingle.addElementHandler( "UInt32Type", getRspnUInt32TypeRec() );
		}
		return( rspnUInt32TypeReadSingle );
	}

	protected CFBamXMsgRspnUInt32TypeReadList getRspnUInt32TypeReadList() {
		if( rspnUInt32TypeReadList == null ) {
			rspnUInt32TypeReadList = new CFBamXMsgRspnUInt32TypeReadList( this );
			rspnUInt32TypeReadList.addElementHandler( "UInt32Type", getRspnUInt32TypeRec() );
		}
		return( rspnUInt32TypeReadList );
	}

	protected CFBamXMsgRspnUInt32TypeLocked getRspnUInt32TypeLocked() {
		if( rspnUInt32TypeLocked == null ) {
			rspnUInt32TypeLocked = new CFBamXMsgRspnUInt32TypeLocked( this );
		}
		return( rspnUInt32TypeLocked );
	}

	protected CFBamXMsgRspnUInt32TypeUpdated getRspnUInt32TypeUpdated() {
		if( rspnUInt32TypeUpdated == null ) {
			rspnUInt32TypeUpdated = new CFBamXMsgRspnUInt32TypeUpdated( this );
		}
		return( rspnUInt32TypeUpdated );
	}

	protected CFBamXMsgRspnUInt32TypeDeleted getRspnUInt32TypeDeleted() {
		if( rspnUInt32TypeDeleted == null ) {
			rspnUInt32TypeDeleted = new CFBamXMsgRspnUInt32TypeDeleted( this );
		}
		return( rspnUInt32TypeDeleted );
	}

	// UInt64Col Response s

	protected CFBamXMsgRspnUInt64ColRec getRspnUInt64ColRec() {
		if( rspnUInt64ColRec == null ) {
			rspnUInt64ColRec = new CFBamXMsgRspnUInt64ColRec( this );
		}
		return( rspnUInt64ColRec );
	}

	protected CFBamXMsgRspnUInt64ColCreated getRspnUInt64ColCreated() {
		if( rspnUInt64ColCreated == null ) {
			rspnUInt64ColCreated = new CFBamXMsgRspnUInt64ColCreated( this );
		}
		return( rspnUInt64ColCreated );
	}

	protected CFBamXMsgRspnUInt64ColReadSingle getRspnUInt64ColReadSingle() {
		if( rspnUInt64ColReadSingle == null ) {
			rspnUInt64ColReadSingle = new CFBamXMsgRspnUInt64ColReadSingle( this );
			rspnUInt64ColReadSingle.addElementHandler( "UInt64Col", getRspnUInt64ColRec() );
		}
		return( rspnUInt64ColReadSingle );
	}

	protected CFBamXMsgRspnUInt64ColReadList getRspnUInt64ColReadList() {
		if( rspnUInt64ColReadList == null ) {
			rspnUInt64ColReadList = new CFBamXMsgRspnUInt64ColReadList( this );
			rspnUInt64ColReadList.addElementHandler( "UInt64Col", getRspnUInt64ColRec() );
		}
		return( rspnUInt64ColReadList );
	}

	protected CFBamXMsgRspnUInt64ColLocked getRspnUInt64ColLocked() {
		if( rspnUInt64ColLocked == null ) {
			rspnUInt64ColLocked = new CFBamXMsgRspnUInt64ColLocked( this );
		}
		return( rspnUInt64ColLocked );
	}

	protected CFBamXMsgRspnUInt64ColUpdated getRspnUInt64ColUpdated() {
		if( rspnUInt64ColUpdated == null ) {
			rspnUInt64ColUpdated = new CFBamXMsgRspnUInt64ColUpdated( this );
		}
		return( rspnUInt64ColUpdated );
	}

	protected CFBamXMsgRspnUInt64ColDeleted getRspnUInt64ColDeleted() {
		if( rspnUInt64ColDeleted == null ) {
			rspnUInt64ColDeleted = new CFBamXMsgRspnUInt64ColDeleted( this );
		}
		return( rspnUInt64ColDeleted );
	}

	// UInt64Def Response s

	protected CFBamXMsgRspnUInt64DefRec getRspnUInt64DefRec() {
		if( rspnUInt64DefRec == null ) {
			rspnUInt64DefRec = new CFBamXMsgRspnUInt64DefRec( this );
		}
		return( rspnUInt64DefRec );
	}

	protected CFBamXMsgRspnUInt64DefCreated getRspnUInt64DefCreated() {
		if( rspnUInt64DefCreated == null ) {
			rspnUInt64DefCreated = new CFBamXMsgRspnUInt64DefCreated( this );
		}
		return( rspnUInt64DefCreated );
	}

	protected CFBamXMsgRspnUInt64DefReadSingle getRspnUInt64DefReadSingle() {
		if( rspnUInt64DefReadSingle == null ) {
			rspnUInt64DefReadSingle = new CFBamXMsgRspnUInt64DefReadSingle( this );
			rspnUInt64DefReadSingle.addElementHandler( "UInt64Def", getRspnUInt64DefRec() );
			rspnUInt64DefReadSingle.addElementHandler( "UInt64Type", getRspnUInt64TypeRec() );
			rspnUInt64DefReadSingle.addElementHandler( "UInt64Col", getRspnUInt64ColRec() );
		}
		return( rspnUInt64DefReadSingle );
	}

	protected CFBamXMsgRspnUInt64DefReadList getRspnUInt64DefReadList() {
		if( rspnUInt64DefReadList == null ) {
			rspnUInt64DefReadList = new CFBamXMsgRspnUInt64DefReadList( this );
			rspnUInt64DefReadList.addElementHandler( "UInt64Def", getRspnUInt64DefRec() );
			rspnUInt64DefReadList.addElementHandler( "UInt64Type", getRspnUInt64TypeRec() );
			rspnUInt64DefReadList.addElementHandler( "UInt64Col", getRspnUInt64ColRec() );
		}
		return( rspnUInt64DefReadList );
	}

	protected CFBamXMsgRspnUInt64DefLocked getRspnUInt64DefLocked() {
		if( rspnUInt64DefLocked == null ) {
			rspnUInt64DefLocked = new CFBamXMsgRspnUInt64DefLocked( this );
		}
		return( rspnUInt64DefLocked );
	}

	protected CFBamXMsgRspnUInt64DefUpdated getRspnUInt64DefUpdated() {
		if( rspnUInt64DefUpdated == null ) {
			rspnUInt64DefUpdated = new CFBamXMsgRspnUInt64DefUpdated( this );
		}
		return( rspnUInt64DefUpdated );
	}

	protected CFBamXMsgRspnUInt64DefDeleted getRspnUInt64DefDeleted() {
		if( rspnUInt64DefDeleted == null ) {
			rspnUInt64DefDeleted = new CFBamXMsgRspnUInt64DefDeleted( this );
		}
		return( rspnUInt64DefDeleted );
	}

	// UInt64Type Response s

	protected CFBamXMsgRspnUInt64TypeRec getRspnUInt64TypeRec() {
		if( rspnUInt64TypeRec == null ) {
			rspnUInt64TypeRec = new CFBamXMsgRspnUInt64TypeRec( this );
		}
		return( rspnUInt64TypeRec );
	}

	protected CFBamXMsgRspnUInt64TypeCreated getRspnUInt64TypeCreated() {
		if( rspnUInt64TypeCreated == null ) {
			rspnUInt64TypeCreated = new CFBamXMsgRspnUInt64TypeCreated( this );
		}
		return( rspnUInt64TypeCreated );
	}

	protected CFBamXMsgRspnUInt64TypeReadSingle getRspnUInt64TypeReadSingle() {
		if( rspnUInt64TypeReadSingle == null ) {
			rspnUInt64TypeReadSingle = new CFBamXMsgRspnUInt64TypeReadSingle( this );
			rspnUInt64TypeReadSingle.addElementHandler( "UInt64Type", getRspnUInt64TypeRec() );
		}
		return( rspnUInt64TypeReadSingle );
	}

	protected CFBamXMsgRspnUInt64TypeReadList getRspnUInt64TypeReadList() {
		if( rspnUInt64TypeReadList == null ) {
			rspnUInt64TypeReadList = new CFBamXMsgRspnUInt64TypeReadList( this );
			rspnUInt64TypeReadList.addElementHandler( "UInt64Type", getRspnUInt64TypeRec() );
		}
		return( rspnUInt64TypeReadList );
	}

	protected CFBamXMsgRspnUInt64TypeLocked getRspnUInt64TypeLocked() {
		if( rspnUInt64TypeLocked == null ) {
			rspnUInt64TypeLocked = new CFBamXMsgRspnUInt64TypeLocked( this );
		}
		return( rspnUInt64TypeLocked );
	}

	protected CFBamXMsgRspnUInt64TypeUpdated getRspnUInt64TypeUpdated() {
		if( rspnUInt64TypeUpdated == null ) {
			rspnUInt64TypeUpdated = new CFBamXMsgRspnUInt64TypeUpdated( this );
		}
		return( rspnUInt64TypeUpdated );
	}

	protected CFBamXMsgRspnUInt64TypeDeleted getRspnUInt64TypeDeleted() {
		if( rspnUInt64TypeDeleted == null ) {
			rspnUInt64TypeDeleted = new CFBamXMsgRspnUInt64TypeDeleted( this );
		}
		return( rspnUInt64TypeDeleted );
	}

	// URLProtocol Response s

	protected CFBamXMsgRspnURLProtocolRec getRspnURLProtocolRec() {
		if( rspnURLProtocolRec == null ) {
			rspnURLProtocolRec = new CFBamXMsgRspnURLProtocolRec( this );
		}
		return( rspnURLProtocolRec );
	}

	protected CFBamXMsgRspnURLProtocolCreated getRspnURLProtocolCreated() {
		if( rspnURLProtocolCreated == null ) {
			rspnURLProtocolCreated = new CFBamXMsgRspnURLProtocolCreated( this );
		}
		return( rspnURLProtocolCreated );
	}

	protected CFBamXMsgRspnURLProtocolReadSingle getRspnURLProtocolReadSingle() {
		if( rspnURLProtocolReadSingle == null ) {
			rspnURLProtocolReadSingle = new CFBamXMsgRspnURLProtocolReadSingle( this );
			rspnURLProtocolReadSingle.addElementHandler( "URLProtocol", getRspnURLProtocolRec() );
		}
		return( rspnURLProtocolReadSingle );
	}

	protected CFBamXMsgRspnURLProtocolReadList getRspnURLProtocolReadList() {
		if( rspnURLProtocolReadList == null ) {
			rspnURLProtocolReadList = new CFBamXMsgRspnURLProtocolReadList( this );
			rspnURLProtocolReadList.addElementHandler( "URLProtocol", getRspnURLProtocolRec() );
		}
		return( rspnURLProtocolReadList );
	}

	protected CFBamXMsgRspnURLProtocolLocked getRspnURLProtocolLocked() {
		if( rspnURLProtocolLocked == null ) {
			rspnURLProtocolLocked = new CFBamXMsgRspnURLProtocolLocked( this );
		}
		return( rspnURLProtocolLocked );
	}

	protected CFBamXMsgRspnURLProtocolUpdated getRspnURLProtocolUpdated() {
		if( rspnURLProtocolUpdated == null ) {
			rspnURLProtocolUpdated = new CFBamXMsgRspnURLProtocolUpdated( this );
		}
		return( rspnURLProtocolUpdated );
	}

	protected CFBamXMsgRspnURLProtocolDeleted getRspnURLProtocolDeleted() {
		if( rspnURLProtocolDeleted == null ) {
			rspnURLProtocolDeleted = new CFBamXMsgRspnURLProtocolDeleted( this );
		}
		return( rspnURLProtocolDeleted );
	}

	// UuidCol Response s

	protected CFBamXMsgRspnUuidColRec getRspnUuidColRec() {
		if( rspnUuidColRec == null ) {
			rspnUuidColRec = new CFBamXMsgRspnUuidColRec( this );
		}
		return( rspnUuidColRec );
	}

	protected CFBamXMsgRspnUuidColCreated getRspnUuidColCreated() {
		if( rspnUuidColCreated == null ) {
			rspnUuidColCreated = new CFBamXMsgRspnUuidColCreated( this );
		}
		return( rspnUuidColCreated );
	}

	protected CFBamXMsgRspnUuidColReadSingle getRspnUuidColReadSingle() {
		if( rspnUuidColReadSingle == null ) {
			rspnUuidColReadSingle = new CFBamXMsgRspnUuidColReadSingle( this );
			rspnUuidColReadSingle.addElementHandler( "UuidCol", getRspnUuidColRec() );
		}
		return( rspnUuidColReadSingle );
	}

	protected CFBamXMsgRspnUuidColReadList getRspnUuidColReadList() {
		if( rspnUuidColReadList == null ) {
			rspnUuidColReadList = new CFBamXMsgRspnUuidColReadList( this );
			rspnUuidColReadList.addElementHandler( "UuidCol", getRspnUuidColRec() );
		}
		return( rspnUuidColReadList );
	}

	protected CFBamXMsgRspnUuidColLocked getRspnUuidColLocked() {
		if( rspnUuidColLocked == null ) {
			rspnUuidColLocked = new CFBamXMsgRspnUuidColLocked( this );
		}
		return( rspnUuidColLocked );
	}

	protected CFBamXMsgRspnUuidColUpdated getRspnUuidColUpdated() {
		if( rspnUuidColUpdated == null ) {
			rspnUuidColUpdated = new CFBamXMsgRspnUuidColUpdated( this );
		}
		return( rspnUuidColUpdated );
	}

	protected CFBamXMsgRspnUuidColDeleted getRspnUuidColDeleted() {
		if( rspnUuidColDeleted == null ) {
			rspnUuidColDeleted = new CFBamXMsgRspnUuidColDeleted( this );
		}
		return( rspnUuidColDeleted );
	}

	// UuidDef Response s

	protected CFBamXMsgRspnUuidDefRec getRspnUuidDefRec() {
		if( rspnUuidDefRec == null ) {
			rspnUuidDefRec = new CFBamXMsgRspnUuidDefRec( this );
		}
		return( rspnUuidDefRec );
	}

	protected CFBamXMsgRspnUuidDefCreated getRspnUuidDefCreated() {
		if( rspnUuidDefCreated == null ) {
			rspnUuidDefCreated = new CFBamXMsgRspnUuidDefCreated( this );
		}
		return( rspnUuidDefCreated );
	}

	protected CFBamXMsgRspnUuidDefReadSingle getRspnUuidDefReadSingle() {
		if( rspnUuidDefReadSingle == null ) {
			rspnUuidDefReadSingle = new CFBamXMsgRspnUuidDefReadSingle( this );
			rspnUuidDefReadSingle.addElementHandler( "UuidDef", getRspnUuidDefRec() );
			rspnUuidDefReadSingle.addElementHandler( "UuidType", getRspnUuidTypeRec() );
			rspnUuidDefReadSingle.addElementHandler( "UuidGen", getRspnUuidGenRec() );
			rspnUuidDefReadSingle.addElementHandler( "UuidCol", getRspnUuidColRec() );
		}
		return( rspnUuidDefReadSingle );
	}

	protected CFBamXMsgRspnUuidDefReadList getRspnUuidDefReadList() {
		if( rspnUuidDefReadList == null ) {
			rspnUuidDefReadList = new CFBamXMsgRspnUuidDefReadList( this );
			rspnUuidDefReadList.addElementHandler( "UuidDef", getRspnUuidDefRec() );
			rspnUuidDefReadList.addElementHandler( "UuidType", getRspnUuidTypeRec() );
			rspnUuidDefReadList.addElementHandler( "UuidGen", getRspnUuidGenRec() );
			rspnUuidDefReadList.addElementHandler( "UuidCol", getRspnUuidColRec() );
		}
		return( rspnUuidDefReadList );
	}

	protected CFBamXMsgRspnUuidDefLocked getRspnUuidDefLocked() {
		if( rspnUuidDefLocked == null ) {
			rspnUuidDefLocked = new CFBamXMsgRspnUuidDefLocked( this );
		}
		return( rspnUuidDefLocked );
	}

	protected CFBamXMsgRspnUuidDefUpdated getRspnUuidDefUpdated() {
		if( rspnUuidDefUpdated == null ) {
			rspnUuidDefUpdated = new CFBamXMsgRspnUuidDefUpdated( this );
		}
		return( rspnUuidDefUpdated );
	}

	protected CFBamXMsgRspnUuidDefDeleted getRspnUuidDefDeleted() {
		if( rspnUuidDefDeleted == null ) {
			rspnUuidDefDeleted = new CFBamXMsgRspnUuidDefDeleted( this );
		}
		return( rspnUuidDefDeleted );
	}

	// UuidGen Response s

	protected CFBamXMsgRspnUuidGenRec getRspnUuidGenRec() {
		if( rspnUuidGenRec == null ) {
			rspnUuidGenRec = new CFBamXMsgRspnUuidGenRec( this );
		}
		return( rspnUuidGenRec );
	}

	protected CFBamXMsgRspnUuidGenCreated getRspnUuidGenCreated() {
		if( rspnUuidGenCreated == null ) {
			rspnUuidGenCreated = new CFBamXMsgRspnUuidGenCreated( this );
		}
		return( rspnUuidGenCreated );
	}

	protected CFBamXMsgRspnUuidGenReadSingle getRspnUuidGenReadSingle() {
		if( rspnUuidGenReadSingle == null ) {
			rspnUuidGenReadSingle = new CFBamXMsgRspnUuidGenReadSingle( this );
			rspnUuidGenReadSingle.addElementHandler( "UuidGen", getRspnUuidGenRec() );
		}
		return( rspnUuidGenReadSingle );
	}

	protected CFBamXMsgRspnUuidGenReadList getRspnUuidGenReadList() {
		if( rspnUuidGenReadList == null ) {
			rspnUuidGenReadList = new CFBamXMsgRspnUuidGenReadList( this );
			rspnUuidGenReadList.addElementHandler( "UuidGen", getRspnUuidGenRec() );
		}
		return( rspnUuidGenReadList );
	}

	protected CFBamXMsgRspnUuidGenLocked getRspnUuidGenLocked() {
		if( rspnUuidGenLocked == null ) {
			rspnUuidGenLocked = new CFBamXMsgRspnUuidGenLocked( this );
		}
		return( rspnUuidGenLocked );
	}

	protected CFBamXMsgRspnUuidGenUpdated getRspnUuidGenUpdated() {
		if( rspnUuidGenUpdated == null ) {
			rspnUuidGenUpdated = new CFBamXMsgRspnUuidGenUpdated( this );
		}
		return( rspnUuidGenUpdated );
	}

	protected CFBamXMsgRspnUuidGenDeleted getRspnUuidGenDeleted() {
		if( rspnUuidGenDeleted == null ) {
			rspnUuidGenDeleted = new CFBamXMsgRspnUuidGenDeleted( this );
		}
		return( rspnUuidGenDeleted );
	}

	// UuidType Response s

	protected CFBamXMsgRspnUuidTypeRec getRspnUuidTypeRec() {
		if( rspnUuidTypeRec == null ) {
			rspnUuidTypeRec = new CFBamXMsgRspnUuidTypeRec( this );
		}
		return( rspnUuidTypeRec );
	}

	protected CFBamXMsgRspnUuidTypeCreated getRspnUuidTypeCreated() {
		if( rspnUuidTypeCreated == null ) {
			rspnUuidTypeCreated = new CFBamXMsgRspnUuidTypeCreated( this );
		}
		return( rspnUuidTypeCreated );
	}

	protected CFBamXMsgRspnUuidTypeReadSingle getRspnUuidTypeReadSingle() {
		if( rspnUuidTypeReadSingle == null ) {
			rspnUuidTypeReadSingle = new CFBamXMsgRspnUuidTypeReadSingle( this );
			rspnUuidTypeReadSingle.addElementHandler( "UuidType", getRspnUuidTypeRec() );
			rspnUuidTypeReadSingle.addElementHandler( "UuidGen", getRspnUuidGenRec() );
		}
		return( rspnUuidTypeReadSingle );
	}

	protected CFBamXMsgRspnUuidTypeReadList getRspnUuidTypeReadList() {
		if( rspnUuidTypeReadList == null ) {
			rspnUuidTypeReadList = new CFBamXMsgRspnUuidTypeReadList( this );
			rspnUuidTypeReadList.addElementHandler( "UuidType", getRspnUuidTypeRec() );
			rspnUuidTypeReadList.addElementHandler( "UuidGen", getRspnUuidGenRec() );
		}
		return( rspnUuidTypeReadList );
	}

	protected CFBamXMsgRspnUuidTypeLocked getRspnUuidTypeLocked() {
		if( rspnUuidTypeLocked == null ) {
			rspnUuidTypeLocked = new CFBamXMsgRspnUuidTypeLocked( this );
		}
		return( rspnUuidTypeLocked );
	}

	protected CFBamXMsgRspnUuidTypeUpdated getRspnUuidTypeUpdated() {
		if( rspnUuidTypeUpdated == null ) {
			rspnUuidTypeUpdated = new CFBamXMsgRspnUuidTypeUpdated( this );
		}
		return( rspnUuidTypeUpdated );
	}

	protected CFBamXMsgRspnUuidTypeDeleted getRspnUuidTypeDeleted() {
		if( rspnUuidTypeDeleted == null ) {
			rspnUuidTypeDeleted = new CFBamXMsgRspnUuidTypeDeleted( this );
		}
		return( rspnUuidTypeDeleted );
	}

	// Value Response s

	protected CFBamXMsgRspnValueRec getRspnValueRec() {
		if( rspnValueRec == null ) {
			rspnValueRec = new CFBamXMsgRspnValueRec( this );
		}
		return( rspnValueRec );
	}

	protected CFBamXMsgRspnValueCreated getRspnValueCreated() {
		if( rspnValueCreated == null ) {
			rspnValueCreated = new CFBamXMsgRspnValueCreated( this );
		}
		return( rspnValueCreated );
	}

	protected CFBamXMsgRspnValueReadSingle getRspnValueReadSingle() {
		if( rspnValueReadSingle == null ) {
			rspnValueReadSingle = new CFBamXMsgRspnValueReadSingle( this );
			rspnValueReadSingle.addElementHandler( "Value", getRspnValueRec() );
			rspnValueReadSingle.addElementHandler( "Atom", getRspnAtomRec() );
			rspnValueReadSingle.addElementHandler( "BlobDef", getRspnBlobDefRec() );
			rspnValueReadSingle.addElementHandler( "BlobType", getRspnBlobTypeRec() );
			rspnValueReadSingle.addElementHandler( "BlobCol", getRspnBlobColRec() );
			rspnValueReadSingle.addElementHandler( "BoolDef", getRspnBoolDefRec() );
			rspnValueReadSingle.addElementHandler( "BoolType", getRspnBoolTypeRec() );
			rspnValueReadSingle.addElementHandler( "BoolCol", getRspnBoolColRec() );
			rspnValueReadSingle.addElementHandler( "DateDef", getRspnDateDefRec() );
			rspnValueReadSingle.addElementHandler( "DateType", getRspnDateTypeRec() );
			rspnValueReadSingle.addElementHandler( "DateCol", getRspnDateColRec() );
			rspnValueReadSingle.addElementHandler( "DoubleDef", getRspnDoubleDefRec() );
			rspnValueReadSingle.addElementHandler( "DoubleType", getRspnDoubleTypeRec() );
			rspnValueReadSingle.addElementHandler( "DoubleCol", getRspnDoubleColRec() );
			rspnValueReadSingle.addElementHandler( "FloatDef", getRspnFloatDefRec() );
			rspnValueReadSingle.addElementHandler( "FloatType", getRspnFloatTypeRec() );
			rspnValueReadSingle.addElementHandler( "FloatCol", getRspnFloatColRec() );
			rspnValueReadSingle.addElementHandler( "Int16Def", getRspnInt16DefRec() );
			rspnValueReadSingle.addElementHandler( "Int16Type", getRspnInt16TypeRec() );
			rspnValueReadSingle.addElementHandler( "Id16Gen", getRspnId16GenRec() );
			rspnValueReadSingle.addElementHandler( "EnumDef", getRspnEnumDefRec() );
			rspnValueReadSingle.addElementHandler( "EnumType", getRspnEnumTypeRec() );
			rspnValueReadSingle.addElementHandler( "Int16Col", getRspnInt16ColRec() );
			rspnValueReadSingle.addElementHandler( "Int32Def", getRspnInt32DefRec() );
			rspnValueReadSingle.addElementHandler( "Int32Type", getRspnInt32TypeRec() );
			rspnValueReadSingle.addElementHandler( "Id32Gen", getRspnId32GenRec() );
			rspnValueReadSingle.addElementHandler( "Int32Col", getRspnInt32ColRec() );
			rspnValueReadSingle.addElementHandler( "Int64Def", getRspnInt64DefRec() );
			rspnValueReadSingle.addElementHandler( "Int64Type", getRspnInt64TypeRec() );
			rspnValueReadSingle.addElementHandler( "Id64Gen", getRspnId64GenRec() );
			rspnValueReadSingle.addElementHandler( "Int64Col", getRspnInt64ColRec() );
			rspnValueReadSingle.addElementHandler( "NmTokenDef", getRspnNmTokenDefRec() );
			rspnValueReadSingle.addElementHandler( "NmTokenType", getRspnNmTokenTypeRec() );
			rspnValueReadSingle.addElementHandler( "NmTokenCol", getRspnNmTokenColRec() );
			rspnValueReadSingle.addElementHandler( "NmTokensDef", getRspnNmTokensDefRec() );
			rspnValueReadSingle.addElementHandler( "NmTokensType", getRspnNmTokensTypeRec() );
			rspnValueReadSingle.addElementHandler( "NmTokensCol", getRspnNmTokensColRec() );
			rspnValueReadSingle.addElementHandler( "NumberDef", getRspnNumberDefRec() );
			rspnValueReadSingle.addElementHandler( "NumberType", getRspnNumberTypeRec() );
			rspnValueReadSingle.addElementHandler( "NumberCol", getRspnNumberColRec() );
			rspnValueReadSingle.addElementHandler( "StringDef", getRspnStringDefRec() );
			rspnValueReadSingle.addElementHandler( "StringType", getRspnStringTypeRec() );
			rspnValueReadSingle.addElementHandler( "StringCol", getRspnStringColRec() );
			rspnValueReadSingle.addElementHandler( "TZDateDef", getRspnTZDateDefRec() );
			rspnValueReadSingle.addElementHandler( "TZDateType", getRspnTZDateTypeRec() );
			rspnValueReadSingle.addElementHandler( "TZDateCol", getRspnTZDateColRec() );
			rspnValueReadSingle.addElementHandler( "TZTimeDef", getRspnTZTimeDefRec() );
			rspnValueReadSingle.addElementHandler( "TZTimeType", getRspnTZTimeTypeRec() );
			rspnValueReadSingle.addElementHandler( "TZTimeCol", getRspnTZTimeColRec() );
			rspnValueReadSingle.addElementHandler( "TZTimestampDef", getRspnTZTimestampDefRec() );
			rspnValueReadSingle.addElementHandler( "TZTimestampType", getRspnTZTimestampTypeRec() );
			rspnValueReadSingle.addElementHandler( "TZTimestampCol", getRspnTZTimestampColRec() );
			rspnValueReadSingle.addElementHandler( "TextDef", getRspnTextDefRec() );
			rspnValueReadSingle.addElementHandler( "TextType", getRspnTextTypeRec() );
			rspnValueReadSingle.addElementHandler( "TextCol", getRspnTextColRec() );
			rspnValueReadSingle.addElementHandler( "TimeDef", getRspnTimeDefRec() );
			rspnValueReadSingle.addElementHandler( "TimeType", getRspnTimeTypeRec() );
			rspnValueReadSingle.addElementHandler( "TimeCol", getRspnTimeColRec() );
			rspnValueReadSingle.addElementHandler( "TimestampDef", getRspnTimestampDefRec() );
			rspnValueReadSingle.addElementHandler( "TimestampType", getRspnTimestampTypeRec() );
			rspnValueReadSingle.addElementHandler( "TimestampCol", getRspnTimestampColRec() );
			rspnValueReadSingle.addElementHandler( "TokenDef", getRspnTokenDefRec() );
			rspnValueReadSingle.addElementHandler( "TokenType", getRspnTokenTypeRec() );
			rspnValueReadSingle.addElementHandler( "TokenCol", getRspnTokenColRec() );
			rspnValueReadSingle.addElementHandler( "UInt16Def", getRspnUInt16DefRec() );
			rspnValueReadSingle.addElementHandler( "UInt16Type", getRspnUInt16TypeRec() );
			rspnValueReadSingle.addElementHandler( "UInt16Col", getRspnUInt16ColRec() );
			rspnValueReadSingle.addElementHandler( "UInt32Def", getRspnUInt32DefRec() );
			rspnValueReadSingle.addElementHandler( "UInt32Type", getRspnUInt32TypeRec() );
			rspnValueReadSingle.addElementHandler( "UInt32Col", getRspnUInt32ColRec() );
			rspnValueReadSingle.addElementHandler( "UInt64Def", getRspnUInt64DefRec() );
			rspnValueReadSingle.addElementHandler( "UInt64Type", getRspnUInt64TypeRec() );
			rspnValueReadSingle.addElementHandler( "UInt64Col", getRspnUInt64ColRec() );
			rspnValueReadSingle.addElementHandler( "UuidDef", getRspnUuidDefRec() );
			rspnValueReadSingle.addElementHandler( "UuidType", getRspnUuidTypeRec() );
			rspnValueReadSingle.addElementHandler( "UuidGen", getRspnUuidGenRec() );
			rspnValueReadSingle.addElementHandler( "UuidCol", getRspnUuidColRec() );
			rspnValueReadSingle.addElementHandler( "TableCol", getRspnTableColRec() );
		}
		return( rspnValueReadSingle );
	}

	protected CFBamXMsgRspnValueReadList getRspnValueReadList() {
		if( rspnValueReadList == null ) {
			rspnValueReadList = new CFBamXMsgRspnValueReadList( this );
			rspnValueReadList.addElementHandler( "Value", getRspnValueRec() );
			rspnValueReadList.addElementHandler( "Atom", getRspnAtomRec() );
			rspnValueReadList.addElementHandler( "BlobDef", getRspnBlobDefRec() );
			rspnValueReadList.addElementHandler( "BlobType", getRspnBlobTypeRec() );
			rspnValueReadList.addElementHandler( "BlobCol", getRspnBlobColRec() );
			rspnValueReadList.addElementHandler( "BoolDef", getRspnBoolDefRec() );
			rspnValueReadList.addElementHandler( "BoolType", getRspnBoolTypeRec() );
			rspnValueReadList.addElementHandler( "BoolCol", getRspnBoolColRec() );
			rspnValueReadList.addElementHandler( "DateDef", getRspnDateDefRec() );
			rspnValueReadList.addElementHandler( "DateType", getRspnDateTypeRec() );
			rspnValueReadList.addElementHandler( "DateCol", getRspnDateColRec() );
			rspnValueReadList.addElementHandler( "DoubleDef", getRspnDoubleDefRec() );
			rspnValueReadList.addElementHandler( "DoubleType", getRspnDoubleTypeRec() );
			rspnValueReadList.addElementHandler( "DoubleCol", getRspnDoubleColRec() );
			rspnValueReadList.addElementHandler( "FloatDef", getRspnFloatDefRec() );
			rspnValueReadList.addElementHandler( "FloatType", getRspnFloatTypeRec() );
			rspnValueReadList.addElementHandler( "FloatCol", getRspnFloatColRec() );
			rspnValueReadList.addElementHandler( "Int16Def", getRspnInt16DefRec() );
			rspnValueReadList.addElementHandler( "Int16Type", getRspnInt16TypeRec() );
			rspnValueReadList.addElementHandler( "Id16Gen", getRspnId16GenRec() );
			rspnValueReadList.addElementHandler( "EnumDef", getRspnEnumDefRec() );
			rspnValueReadList.addElementHandler( "EnumType", getRspnEnumTypeRec() );
			rspnValueReadList.addElementHandler( "Int16Col", getRspnInt16ColRec() );
			rspnValueReadList.addElementHandler( "Int32Def", getRspnInt32DefRec() );
			rspnValueReadList.addElementHandler( "Int32Type", getRspnInt32TypeRec() );
			rspnValueReadList.addElementHandler( "Id32Gen", getRspnId32GenRec() );
			rspnValueReadList.addElementHandler( "Int32Col", getRspnInt32ColRec() );
			rspnValueReadList.addElementHandler( "Int64Def", getRspnInt64DefRec() );
			rspnValueReadList.addElementHandler( "Int64Type", getRspnInt64TypeRec() );
			rspnValueReadList.addElementHandler( "Id64Gen", getRspnId64GenRec() );
			rspnValueReadList.addElementHandler( "Int64Col", getRspnInt64ColRec() );
			rspnValueReadList.addElementHandler( "NmTokenDef", getRspnNmTokenDefRec() );
			rspnValueReadList.addElementHandler( "NmTokenType", getRspnNmTokenTypeRec() );
			rspnValueReadList.addElementHandler( "NmTokenCol", getRspnNmTokenColRec() );
			rspnValueReadList.addElementHandler( "NmTokensDef", getRspnNmTokensDefRec() );
			rspnValueReadList.addElementHandler( "NmTokensType", getRspnNmTokensTypeRec() );
			rspnValueReadList.addElementHandler( "NmTokensCol", getRspnNmTokensColRec() );
			rspnValueReadList.addElementHandler( "NumberDef", getRspnNumberDefRec() );
			rspnValueReadList.addElementHandler( "NumberType", getRspnNumberTypeRec() );
			rspnValueReadList.addElementHandler( "NumberCol", getRspnNumberColRec() );
			rspnValueReadList.addElementHandler( "StringDef", getRspnStringDefRec() );
			rspnValueReadList.addElementHandler( "StringType", getRspnStringTypeRec() );
			rspnValueReadList.addElementHandler( "StringCol", getRspnStringColRec() );
			rspnValueReadList.addElementHandler( "TZDateDef", getRspnTZDateDefRec() );
			rspnValueReadList.addElementHandler( "TZDateType", getRspnTZDateTypeRec() );
			rspnValueReadList.addElementHandler( "TZDateCol", getRspnTZDateColRec() );
			rspnValueReadList.addElementHandler( "TZTimeDef", getRspnTZTimeDefRec() );
			rspnValueReadList.addElementHandler( "TZTimeType", getRspnTZTimeTypeRec() );
			rspnValueReadList.addElementHandler( "TZTimeCol", getRspnTZTimeColRec() );
			rspnValueReadList.addElementHandler( "TZTimestampDef", getRspnTZTimestampDefRec() );
			rspnValueReadList.addElementHandler( "TZTimestampType", getRspnTZTimestampTypeRec() );
			rspnValueReadList.addElementHandler( "TZTimestampCol", getRspnTZTimestampColRec() );
			rspnValueReadList.addElementHandler( "TextDef", getRspnTextDefRec() );
			rspnValueReadList.addElementHandler( "TextType", getRspnTextTypeRec() );
			rspnValueReadList.addElementHandler( "TextCol", getRspnTextColRec() );
			rspnValueReadList.addElementHandler( "TimeDef", getRspnTimeDefRec() );
			rspnValueReadList.addElementHandler( "TimeType", getRspnTimeTypeRec() );
			rspnValueReadList.addElementHandler( "TimeCol", getRspnTimeColRec() );
			rspnValueReadList.addElementHandler( "TimestampDef", getRspnTimestampDefRec() );
			rspnValueReadList.addElementHandler( "TimestampType", getRspnTimestampTypeRec() );
			rspnValueReadList.addElementHandler( "TimestampCol", getRspnTimestampColRec() );
			rspnValueReadList.addElementHandler( "TokenDef", getRspnTokenDefRec() );
			rspnValueReadList.addElementHandler( "TokenType", getRspnTokenTypeRec() );
			rspnValueReadList.addElementHandler( "TokenCol", getRspnTokenColRec() );
			rspnValueReadList.addElementHandler( "UInt16Def", getRspnUInt16DefRec() );
			rspnValueReadList.addElementHandler( "UInt16Type", getRspnUInt16TypeRec() );
			rspnValueReadList.addElementHandler( "UInt16Col", getRspnUInt16ColRec() );
			rspnValueReadList.addElementHandler( "UInt32Def", getRspnUInt32DefRec() );
			rspnValueReadList.addElementHandler( "UInt32Type", getRspnUInt32TypeRec() );
			rspnValueReadList.addElementHandler( "UInt32Col", getRspnUInt32ColRec() );
			rspnValueReadList.addElementHandler( "UInt64Def", getRspnUInt64DefRec() );
			rspnValueReadList.addElementHandler( "UInt64Type", getRspnUInt64TypeRec() );
			rspnValueReadList.addElementHandler( "UInt64Col", getRspnUInt64ColRec() );
			rspnValueReadList.addElementHandler( "UuidDef", getRspnUuidDefRec() );
			rspnValueReadList.addElementHandler( "UuidType", getRspnUuidTypeRec() );
			rspnValueReadList.addElementHandler( "UuidGen", getRspnUuidGenRec() );
			rspnValueReadList.addElementHandler( "UuidCol", getRspnUuidColRec() );
			rspnValueReadList.addElementHandler( "TableCol", getRspnTableColRec() );
		}
		return( rspnValueReadList );
	}

	protected CFBamXMsgRspnValueLocked getRspnValueLocked() {
		if( rspnValueLocked == null ) {
			rspnValueLocked = new CFBamXMsgRspnValueLocked( this );
		}
		return( rspnValueLocked );
	}

	protected CFBamXMsgRspnValueUpdated getRspnValueUpdated() {
		if( rspnValueUpdated == null ) {
			rspnValueUpdated = new CFBamXMsgRspnValueUpdated( this );
		}
		return( rspnValueUpdated );
	}

	protected CFBamXMsgRspnValueDeleted getRspnValueDeleted() {
		if( rspnValueDeleted == null ) {
			rspnValueDeleted = new CFBamXMsgRspnValueDeleted( this );
		}
		return( rspnValueDeleted );
	}

	// Root Element  Resolver Factory

	protected CFBamSaxRspnRoot getSaxRspnRoot() {
		if( saxRoot == null ) {
			saxRoot = new CFBamSaxRspnRoot( this );
			saxRoot.addElementHandler( "CFBamRspn", getSaxRspnDoc() );
			saxRoot.addElementHandler( "CFSecRspn", getSaxRspnDoc() );
			saxRoot.addElementHandler( "CFIntRspn", getSaxRspnDoc() );
		}
		return( saxRoot );
	}

	// Root Element 

	/*
	 *	CFBamSaxRspnRoot XML SAX Root Element  implementation
	 */
	public class CFBamSaxRspnRoot
		extends CFLibXmlCoreElementHandler
	{
		public CFBamSaxRspnRoot( CFBamXMsgRspn xmsgRspn ) {
			super( xmsgRspn );
		}

		public void startElement(
			String		uri,
			String		localName,
			String		qName,
			Attributes	attrs )
		throws SAXException
		{
		}

		public void endElement(
			String		uri,
			String		localName,
			String		qName )
		throws SAXException
		{
		}
	}

	// Document Element  Resolver Factory

	protected CFBamSaxRspnDoc getSaxRspnDoc() {
		if( saxDoc == null ) {
			saxDoc = new CFBamSaxRspnDoc( this );
			saxDoc.addElementHandler( "RspnNoDataFound", getRspnNoDataFound() );
			saxDoc.addElementHandler( "RspnException", getRspnException() );
			saxDoc.addElementHandler( "RspnFileLoaded", getRspnFileLoaded() );
			saxDoc.addElementHandler( "RspnLoggedIn", getRspnLoggedIn() );
			saxDoc.addElementHandler( "RspnLoggedOut", getRspnLoggedOut() );
			saxDoc.addElementHandler( "RspnServerProcExecuted", getRspnServerProcExecuted() );

			// Atom Response s

			saxDoc.addElementHandler( "RspnAtomCreated", getRspnAtomCreated() );
			saxDoc.addElementHandler( "RspnAtomReadSingle", getRspnAtomReadSingle() );
			saxDoc.addElementHandler( "RspnAtomReadList", getRspnAtomReadList() );
			saxDoc.addElementHandler( "RspnAtomLocked", getRspnAtomLocked() );
			saxDoc.addElementHandler( "RspnAtomUpdated", getRspnAtomUpdated() );
			saxDoc.addElementHandler( "RspnAtomDeleted", getRspnAtomDeleted() );

			// BlobCol Response s

			saxDoc.addElementHandler( "RspnBlobColCreated", getRspnBlobColCreated() );
			saxDoc.addElementHandler( "RspnBlobColReadSingle", getRspnBlobColReadSingle() );
			saxDoc.addElementHandler( "RspnBlobColReadList", getRspnBlobColReadList() );
			saxDoc.addElementHandler( "RspnBlobColLocked", getRspnBlobColLocked() );
			saxDoc.addElementHandler( "RspnBlobColUpdated", getRspnBlobColUpdated() );
			saxDoc.addElementHandler( "RspnBlobColDeleted", getRspnBlobColDeleted() );

			// BlobDef Response s

			saxDoc.addElementHandler( "RspnBlobDefCreated", getRspnBlobDefCreated() );
			saxDoc.addElementHandler( "RspnBlobDefReadSingle", getRspnBlobDefReadSingle() );
			saxDoc.addElementHandler( "RspnBlobDefReadList", getRspnBlobDefReadList() );
			saxDoc.addElementHandler( "RspnBlobDefLocked", getRspnBlobDefLocked() );
			saxDoc.addElementHandler( "RspnBlobDefUpdated", getRspnBlobDefUpdated() );
			saxDoc.addElementHandler( "RspnBlobDefDeleted", getRspnBlobDefDeleted() );

			// BlobType Response s

			saxDoc.addElementHandler( "RspnBlobTypeCreated", getRspnBlobTypeCreated() );
			saxDoc.addElementHandler( "RspnBlobTypeReadSingle", getRspnBlobTypeReadSingle() );
			saxDoc.addElementHandler( "RspnBlobTypeReadList", getRspnBlobTypeReadList() );
			saxDoc.addElementHandler( "RspnBlobTypeLocked", getRspnBlobTypeLocked() );
			saxDoc.addElementHandler( "RspnBlobTypeUpdated", getRspnBlobTypeUpdated() );
			saxDoc.addElementHandler( "RspnBlobTypeDeleted", getRspnBlobTypeDeleted() );

			// BoolCol Response s

			saxDoc.addElementHandler( "RspnBoolColCreated", getRspnBoolColCreated() );
			saxDoc.addElementHandler( "RspnBoolColReadSingle", getRspnBoolColReadSingle() );
			saxDoc.addElementHandler( "RspnBoolColReadList", getRspnBoolColReadList() );
			saxDoc.addElementHandler( "RspnBoolColLocked", getRspnBoolColLocked() );
			saxDoc.addElementHandler( "RspnBoolColUpdated", getRspnBoolColUpdated() );
			saxDoc.addElementHandler( "RspnBoolColDeleted", getRspnBoolColDeleted() );

			// BoolDef Response s

			saxDoc.addElementHandler( "RspnBoolDefCreated", getRspnBoolDefCreated() );
			saxDoc.addElementHandler( "RspnBoolDefReadSingle", getRspnBoolDefReadSingle() );
			saxDoc.addElementHandler( "RspnBoolDefReadList", getRspnBoolDefReadList() );
			saxDoc.addElementHandler( "RspnBoolDefLocked", getRspnBoolDefLocked() );
			saxDoc.addElementHandler( "RspnBoolDefUpdated", getRspnBoolDefUpdated() );
			saxDoc.addElementHandler( "RspnBoolDefDeleted", getRspnBoolDefDeleted() );

			// BoolType Response s

			saxDoc.addElementHandler( "RspnBoolTypeCreated", getRspnBoolTypeCreated() );
			saxDoc.addElementHandler( "RspnBoolTypeReadSingle", getRspnBoolTypeReadSingle() );
			saxDoc.addElementHandler( "RspnBoolTypeReadList", getRspnBoolTypeReadList() );
			saxDoc.addElementHandler( "RspnBoolTypeLocked", getRspnBoolTypeLocked() );
			saxDoc.addElementHandler( "RspnBoolTypeUpdated", getRspnBoolTypeUpdated() );
			saxDoc.addElementHandler( "RspnBoolTypeDeleted", getRspnBoolTypeDeleted() );

			// Chain Response s

			saxDoc.addElementHandler( "RspnChainCreated", getRspnChainCreated() );
			saxDoc.addElementHandler( "RspnChainReadSingle", getRspnChainReadSingle() );
			saxDoc.addElementHandler( "RspnChainReadList", getRspnChainReadList() );
			saxDoc.addElementHandler( "RspnChainLocked", getRspnChainLocked() );
			saxDoc.addElementHandler( "RspnChainUpdated", getRspnChainUpdated() );
			saxDoc.addElementHandler( "RspnChainDeleted", getRspnChainDeleted() );

			// ClearDep Response s

			saxDoc.addElementHandler( "RspnClearDepCreated", getRspnClearDepCreated() );
			saxDoc.addElementHandler( "RspnClearDepReadSingle", getRspnClearDepReadSingle() );
			saxDoc.addElementHandler( "RspnClearDepReadList", getRspnClearDepReadList() );
			saxDoc.addElementHandler( "RspnClearDepLocked", getRspnClearDepLocked() );
			saxDoc.addElementHandler( "RspnClearDepUpdated", getRspnClearDepUpdated() );
			saxDoc.addElementHandler( "RspnClearDepDeleted", getRspnClearDepDeleted() );

			// ClearSubDep1 Response s

			saxDoc.addElementHandler( "RspnClearSubDep1Created", getRspnClearSubDep1Created() );
			saxDoc.addElementHandler( "RspnClearSubDep1ReadSingle", getRspnClearSubDep1ReadSingle() );
			saxDoc.addElementHandler( "RspnClearSubDep1ReadList", getRspnClearSubDep1ReadList() );
			saxDoc.addElementHandler( "RspnClearSubDep1Locked", getRspnClearSubDep1Locked() );
			saxDoc.addElementHandler( "RspnClearSubDep1Updated", getRspnClearSubDep1Updated() );
			saxDoc.addElementHandler( "RspnClearSubDep1Deleted", getRspnClearSubDep1Deleted() );

			// ClearSubDep2 Response s

			saxDoc.addElementHandler( "RspnClearSubDep2Created", getRspnClearSubDep2Created() );
			saxDoc.addElementHandler( "RspnClearSubDep2ReadSingle", getRspnClearSubDep2ReadSingle() );
			saxDoc.addElementHandler( "RspnClearSubDep2ReadList", getRspnClearSubDep2ReadList() );
			saxDoc.addElementHandler( "RspnClearSubDep2Locked", getRspnClearSubDep2Locked() );
			saxDoc.addElementHandler( "RspnClearSubDep2Updated", getRspnClearSubDep2Updated() );
			saxDoc.addElementHandler( "RspnClearSubDep2Deleted", getRspnClearSubDep2Deleted() );

			// ClearSubDep3 Response s

			saxDoc.addElementHandler( "RspnClearSubDep3Created", getRspnClearSubDep3Created() );
			saxDoc.addElementHandler( "RspnClearSubDep3ReadSingle", getRspnClearSubDep3ReadSingle() );
			saxDoc.addElementHandler( "RspnClearSubDep3ReadList", getRspnClearSubDep3ReadList() );
			saxDoc.addElementHandler( "RspnClearSubDep3Locked", getRspnClearSubDep3Locked() );
			saxDoc.addElementHandler( "RspnClearSubDep3Updated", getRspnClearSubDep3Updated() );
			saxDoc.addElementHandler( "RspnClearSubDep3Deleted", getRspnClearSubDep3Deleted() );

			// ClearTopDep Response s

			saxDoc.addElementHandler( "RspnClearTopDepCreated", getRspnClearTopDepCreated() );
			saxDoc.addElementHandler( "RspnClearTopDepReadSingle", getRspnClearTopDepReadSingle() );
			saxDoc.addElementHandler( "RspnClearTopDepReadList", getRspnClearTopDepReadList() );
			saxDoc.addElementHandler( "RspnClearTopDepLocked", getRspnClearTopDepLocked() );
			saxDoc.addElementHandler( "RspnClearTopDepUpdated", getRspnClearTopDepUpdated() );
			saxDoc.addElementHandler( "RspnClearTopDepDeleted", getRspnClearTopDepDeleted() );

			// Cluster Response s

			saxDoc.addElementHandler( "RspnClusterCreated", getRspnClusterCreated() );
			saxDoc.addElementHandler( "RspnClusterReadSingle", getRspnClusterReadSingle() );
			saxDoc.addElementHandler( "RspnClusterReadList", getRspnClusterReadList() );
			saxDoc.addElementHandler( "RspnClusterLocked", getRspnClusterLocked() );
			saxDoc.addElementHandler( "RspnClusterUpdated", getRspnClusterUpdated() );
			saxDoc.addElementHandler( "RspnClusterDeleted", getRspnClusterDeleted() );

			// DateCol Response s

			saxDoc.addElementHandler( "RspnDateColCreated", getRspnDateColCreated() );
			saxDoc.addElementHandler( "RspnDateColReadSingle", getRspnDateColReadSingle() );
			saxDoc.addElementHandler( "RspnDateColReadList", getRspnDateColReadList() );
			saxDoc.addElementHandler( "RspnDateColLocked", getRspnDateColLocked() );
			saxDoc.addElementHandler( "RspnDateColUpdated", getRspnDateColUpdated() );
			saxDoc.addElementHandler( "RspnDateColDeleted", getRspnDateColDeleted() );

			// DateDef Response s

			saxDoc.addElementHandler( "RspnDateDefCreated", getRspnDateDefCreated() );
			saxDoc.addElementHandler( "RspnDateDefReadSingle", getRspnDateDefReadSingle() );
			saxDoc.addElementHandler( "RspnDateDefReadList", getRspnDateDefReadList() );
			saxDoc.addElementHandler( "RspnDateDefLocked", getRspnDateDefLocked() );
			saxDoc.addElementHandler( "RspnDateDefUpdated", getRspnDateDefUpdated() );
			saxDoc.addElementHandler( "RspnDateDefDeleted", getRspnDateDefDeleted() );

			// DateType Response s

			saxDoc.addElementHandler( "RspnDateTypeCreated", getRspnDateTypeCreated() );
			saxDoc.addElementHandler( "RspnDateTypeReadSingle", getRspnDateTypeReadSingle() );
			saxDoc.addElementHandler( "RspnDateTypeReadList", getRspnDateTypeReadList() );
			saxDoc.addElementHandler( "RspnDateTypeLocked", getRspnDateTypeLocked() );
			saxDoc.addElementHandler( "RspnDateTypeUpdated", getRspnDateTypeUpdated() );
			saxDoc.addElementHandler( "RspnDateTypeDeleted", getRspnDateTypeDeleted() );

			// DelDep Response s

			saxDoc.addElementHandler( "RspnDelDepCreated", getRspnDelDepCreated() );
			saxDoc.addElementHandler( "RspnDelDepReadSingle", getRspnDelDepReadSingle() );
			saxDoc.addElementHandler( "RspnDelDepReadList", getRspnDelDepReadList() );
			saxDoc.addElementHandler( "RspnDelDepLocked", getRspnDelDepLocked() );
			saxDoc.addElementHandler( "RspnDelDepUpdated", getRspnDelDepUpdated() );
			saxDoc.addElementHandler( "RspnDelDepDeleted", getRspnDelDepDeleted() );

			// DelSubDep1 Response s

			saxDoc.addElementHandler( "RspnDelSubDep1Created", getRspnDelSubDep1Created() );
			saxDoc.addElementHandler( "RspnDelSubDep1ReadSingle", getRspnDelSubDep1ReadSingle() );
			saxDoc.addElementHandler( "RspnDelSubDep1ReadList", getRspnDelSubDep1ReadList() );
			saxDoc.addElementHandler( "RspnDelSubDep1Locked", getRspnDelSubDep1Locked() );
			saxDoc.addElementHandler( "RspnDelSubDep1Updated", getRspnDelSubDep1Updated() );
			saxDoc.addElementHandler( "RspnDelSubDep1Deleted", getRspnDelSubDep1Deleted() );

			// DelSubDep2 Response s

			saxDoc.addElementHandler( "RspnDelSubDep2Created", getRspnDelSubDep2Created() );
			saxDoc.addElementHandler( "RspnDelSubDep2ReadSingle", getRspnDelSubDep2ReadSingle() );
			saxDoc.addElementHandler( "RspnDelSubDep2ReadList", getRspnDelSubDep2ReadList() );
			saxDoc.addElementHandler( "RspnDelSubDep2Locked", getRspnDelSubDep2Locked() );
			saxDoc.addElementHandler( "RspnDelSubDep2Updated", getRspnDelSubDep2Updated() );
			saxDoc.addElementHandler( "RspnDelSubDep2Deleted", getRspnDelSubDep2Deleted() );

			// DelSubDep3 Response s

			saxDoc.addElementHandler( "RspnDelSubDep3Created", getRspnDelSubDep3Created() );
			saxDoc.addElementHandler( "RspnDelSubDep3ReadSingle", getRspnDelSubDep3ReadSingle() );
			saxDoc.addElementHandler( "RspnDelSubDep3ReadList", getRspnDelSubDep3ReadList() );
			saxDoc.addElementHandler( "RspnDelSubDep3Locked", getRspnDelSubDep3Locked() );
			saxDoc.addElementHandler( "RspnDelSubDep3Updated", getRspnDelSubDep3Updated() );
			saxDoc.addElementHandler( "RspnDelSubDep3Deleted", getRspnDelSubDep3Deleted() );

			// DelTopDep Response s

			saxDoc.addElementHandler( "RspnDelTopDepCreated", getRspnDelTopDepCreated() );
			saxDoc.addElementHandler( "RspnDelTopDepReadSingle", getRspnDelTopDepReadSingle() );
			saxDoc.addElementHandler( "RspnDelTopDepReadList", getRspnDelTopDepReadList() );
			saxDoc.addElementHandler( "RspnDelTopDepLocked", getRspnDelTopDepLocked() );
			saxDoc.addElementHandler( "RspnDelTopDepUpdated", getRspnDelTopDepUpdated() );
			saxDoc.addElementHandler( "RspnDelTopDepDeleted", getRspnDelTopDepDeleted() );

			// DoubleCol Response s

			saxDoc.addElementHandler( "RspnDoubleColCreated", getRspnDoubleColCreated() );
			saxDoc.addElementHandler( "RspnDoubleColReadSingle", getRspnDoubleColReadSingle() );
			saxDoc.addElementHandler( "RspnDoubleColReadList", getRspnDoubleColReadList() );
			saxDoc.addElementHandler( "RspnDoubleColLocked", getRspnDoubleColLocked() );
			saxDoc.addElementHandler( "RspnDoubleColUpdated", getRspnDoubleColUpdated() );
			saxDoc.addElementHandler( "RspnDoubleColDeleted", getRspnDoubleColDeleted() );

			// DoubleDef Response s

			saxDoc.addElementHandler( "RspnDoubleDefCreated", getRspnDoubleDefCreated() );
			saxDoc.addElementHandler( "RspnDoubleDefReadSingle", getRspnDoubleDefReadSingle() );
			saxDoc.addElementHandler( "RspnDoubleDefReadList", getRspnDoubleDefReadList() );
			saxDoc.addElementHandler( "RspnDoubleDefLocked", getRspnDoubleDefLocked() );
			saxDoc.addElementHandler( "RspnDoubleDefUpdated", getRspnDoubleDefUpdated() );
			saxDoc.addElementHandler( "RspnDoubleDefDeleted", getRspnDoubleDefDeleted() );

			// DoubleType Response s

			saxDoc.addElementHandler( "RspnDoubleTypeCreated", getRspnDoubleTypeCreated() );
			saxDoc.addElementHandler( "RspnDoubleTypeReadSingle", getRspnDoubleTypeReadSingle() );
			saxDoc.addElementHandler( "RspnDoubleTypeReadList", getRspnDoubleTypeReadList() );
			saxDoc.addElementHandler( "RspnDoubleTypeLocked", getRspnDoubleTypeLocked() );
			saxDoc.addElementHandler( "RspnDoubleTypeUpdated", getRspnDoubleTypeUpdated() );
			saxDoc.addElementHandler( "RspnDoubleTypeDeleted", getRspnDoubleTypeDeleted() );

			// EnumDef Response s

			saxDoc.addElementHandler( "RspnEnumDefCreated", getRspnEnumDefCreated() );
			saxDoc.addElementHandler( "RspnEnumDefReadSingle", getRspnEnumDefReadSingle() );
			saxDoc.addElementHandler( "RspnEnumDefReadList", getRspnEnumDefReadList() );
			saxDoc.addElementHandler( "RspnEnumDefLocked", getRspnEnumDefLocked() );
			saxDoc.addElementHandler( "RspnEnumDefUpdated", getRspnEnumDefUpdated() );
			saxDoc.addElementHandler( "RspnEnumDefDeleted", getRspnEnumDefDeleted() );

			// EnumTag Response s

			saxDoc.addElementHandler( "RspnEnumTagCreated", getRspnEnumTagCreated() );
			saxDoc.addElementHandler( "RspnEnumTagReadSingle", getRspnEnumTagReadSingle() );
			saxDoc.addElementHandler( "RspnEnumTagReadList", getRspnEnumTagReadList() );
			saxDoc.addElementHandler( "RspnEnumTagLocked", getRspnEnumTagLocked() );
			saxDoc.addElementHandler( "RspnEnumTagUpdated", getRspnEnumTagUpdated() );
			saxDoc.addElementHandler( "RspnEnumTagDeleted", getRspnEnumTagDeleted() );

			// EnumType Response s

			saxDoc.addElementHandler( "RspnEnumTypeCreated", getRspnEnumTypeCreated() );
			saxDoc.addElementHandler( "RspnEnumTypeReadSingle", getRspnEnumTypeReadSingle() );
			saxDoc.addElementHandler( "RspnEnumTypeReadList", getRspnEnumTypeReadList() );
			saxDoc.addElementHandler( "RspnEnumTypeLocked", getRspnEnumTypeLocked() );
			saxDoc.addElementHandler( "RspnEnumTypeUpdated", getRspnEnumTypeUpdated() );
			saxDoc.addElementHandler( "RspnEnumTypeDeleted", getRspnEnumTypeDeleted() );

			// FloatCol Response s

			saxDoc.addElementHandler( "RspnFloatColCreated", getRspnFloatColCreated() );
			saxDoc.addElementHandler( "RspnFloatColReadSingle", getRspnFloatColReadSingle() );
			saxDoc.addElementHandler( "RspnFloatColReadList", getRspnFloatColReadList() );
			saxDoc.addElementHandler( "RspnFloatColLocked", getRspnFloatColLocked() );
			saxDoc.addElementHandler( "RspnFloatColUpdated", getRspnFloatColUpdated() );
			saxDoc.addElementHandler( "RspnFloatColDeleted", getRspnFloatColDeleted() );

			// FloatDef Response s

			saxDoc.addElementHandler( "RspnFloatDefCreated", getRspnFloatDefCreated() );
			saxDoc.addElementHandler( "RspnFloatDefReadSingle", getRspnFloatDefReadSingle() );
			saxDoc.addElementHandler( "RspnFloatDefReadList", getRspnFloatDefReadList() );
			saxDoc.addElementHandler( "RspnFloatDefLocked", getRspnFloatDefLocked() );
			saxDoc.addElementHandler( "RspnFloatDefUpdated", getRspnFloatDefUpdated() );
			saxDoc.addElementHandler( "RspnFloatDefDeleted", getRspnFloatDefDeleted() );

			// FloatType Response s

			saxDoc.addElementHandler( "RspnFloatTypeCreated", getRspnFloatTypeCreated() );
			saxDoc.addElementHandler( "RspnFloatTypeReadSingle", getRspnFloatTypeReadSingle() );
			saxDoc.addElementHandler( "RspnFloatTypeReadList", getRspnFloatTypeReadList() );
			saxDoc.addElementHandler( "RspnFloatTypeLocked", getRspnFloatTypeLocked() );
			saxDoc.addElementHandler( "RspnFloatTypeUpdated", getRspnFloatTypeUpdated() );
			saxDoc.addElementHandler( "RspnFloatTypeDeleted", getRspnFloatTypeDeleted() );

			// HostNode Response s

			saxDoc.addElementHandler( "RspnHostNodeCreated", getRspnHostNodeCreated() );
			saxDoc.addElementHandler( "RspnHostNodeReadSingle", getRspnHostNodeReadSingle() );
			saxDoc.addElementHandler( "RspnHostNodeReadList", getRspnHostNodeReadList() );
			saxDoc.addElementHandler( "RspnHostNodeLocked", getRspnHostNodeLocked() );
			saxDoc.addElementHandler( "RspnHostNodeUpdated", getRspnHostNodeUpdated() );
			saxDoc.addElementHandler( "RspnHostNodeDeleted", getRspnHostNodeDeleted() );

			// ISOCcy Response s

			saxDoc.addElementHandler( "RspnISOCcyCreated", getRspnISOCcyCreated() );
			saxDoc.addElementHandler( "RspnISOCcyReadSingle", getRspnISOCcyReadSingle() );
			saxDoc.addElementHandler( "RspnISOCcyReadList", getRspnISOCcyReadList() );
			saxDoc.addElementHandler( "RspnISOCcyLocked", getRspnISOCcyLocked() );
			saxDoc.addElementHandler( "RspnISOCcyUpdated", getRspnISOCcyUpdated() );
			saxDoc.addElementHandler( "RspnISOCcyDeleted", getRspnISOCcyDeleted() );

			// ISOCtry Response s

			saxDoc.addElementHandler( "RspnISOCtryCreated", getRspnISOCtryCreated() );
			saxDoc.addElementHandler( "RspnISOCtryReadSingle", getRspnISOCtryReadSingle() );
			saxDoc.addElementHandler( "RspnISOCtryReadList", getRspnISOCtryReadList() );
			saxDoc.addElementHandler( "RspnISOCtryLocked", getRspnISOCtryLocked() );
			saxDoc.addElementHandler( "RspnISOCtryUpdated", getRspnISOCtryUpdated() );
			saxDoc.addElementHandler( "RspnISOCtryDeleted", getRspnISOCtryDeleted() );

			// ISOCtryCcy Response s

			saxDoc.addElementHandler( "RspnISOCtryCcyCreated", getRspnISOCtryCcyCreated() );
			saxDoc.addElementHandler( "RspnISOCtryCcyReadSingle", getRspnISOCtryCcyReadSingle() );
			saxDoc.addElementHandler( "RspnISOCtryCcyReadList", getRspnISOCtryCcyReadList() );
			saxDoc.addElementHandler( "RspnISOCtryCcyLocked", getRspnISOCtryCcyLocked() );
			saxDoc.addElementHandler( "RspnISOCtryCcyUpdated", getRspnISOCtryCcyUpdated() );
			saxDoc.addElementHandler( "RspnISOCtryCcyDeleted", getRspnISOCtryCcyDeleted() );

			// ISOCtryLang Response s

			saxDoc.addElementHandler( "RspnISOCtryLangCreated", getRspnISOCtryLangCreated() );
			saxDoc.addElementHandler( "RspnISOCtryLangReadSingle", getRspnISOCtryLangReadSingle() );
			saxDoc.addElementHandler( "RspnISOCtryLangReadList", getRspnISOCtryLangReadList() );
			saxDoc.addElementHandler( "RspnISOCtryLangLocked", getRspnISOCtryLangLocked() );
			saxDoc.addElementHandler( "RspnISOCtryLangUpdated", getRspnISOCtryLangUpdated() );
			saxDoc.addElementHandler( "RspnISOCtryLangDeleted", getRspnISOCtryLangDeleted() );

			// ISOLang Response s

			saxDoc.addElementHandler( "RspnISOLangCreated", getRspnISOLangCreated() );
			saxDoc.addElementHandler( "RspnISOLangReadSingle", getRspnISOLangReadSingle() );
			saxDoc.addElementHandler( "RspnISOLangReadList", getRspnISOLangReadList() );
			saxDoc.addElementHandler( "RspnISOLangLocked", getRspnISOLangLocked() );
			saxDoc.addElementHandler( "RspnISOLangUpdated", getRspnISOLangUpdated() );
			saxDoc.addElementHandler( "RspnISOLangDeleted", getRspnISOLangDeleted() );

			// ISOTZone Response s

			saxDoc.addElementHandler( "RspnISOTZoneCreated", getRspnISOTZoneCreated() );
			saxDoc.addElementHandler( "RspnISOTZoneReadSingle", getRspnISOTZoneReadSingle() );
			saxDoc.addElementHandler( "RspnISOTZoneReadList", getRspnISOTZoneReadList() );
			saxDoc.addElementHandler( "RspnISOTZoneLocked", getRspnISOTZoneLocked() );
			saxDoc.addElementHandler( "RspnISOTZoneUpdated", getRspnISOTZoneUpdated() );
			saxDoc.addElementHandler( "RspnISOTZoneDeleted", getRspnISOTZoneDeleted() );

			// Id16Gen Response s

			saxDoc.addElementHandler( "RspnId16GenCreated", getRspnId16GenCreated() );
			saxDoc.addElementHandler( "RspnId16GenReadSingle", getRspnId16GenReadSingle() );
			saxDoc.addElementHandler( "RspnId16GenReadList", getRspnId16GenReadList() );
			saxDoc.addElementHandler( "RspnId16GenLocked", getRspnId16GenLocked() );
			saxDoc.addElementHandler( "RspnId16GenUpdated", getRspnId16GenUpdated() );
			saxDoc.addElementHandler( "RspnId16GenDeleted", getRspnId16GenDeleted() );

			// Id32Gen Response s

			saxDoc.addElementHandler( "RspnId32GenCreated", getRspnId32GenCreated() );
			saxDoc.addElementHandler( "RspnId32GenReadSingle", getRspnId32GenReadSingle() );
			saxDoc.addElementHandler( "RspnId32GenReadList", getRspnId32GenReadList() );
			saxDoc.addElementHandler( "RspnId32GenLocked", getRspnId32GenLocked() );
			saxDoc.addElementHandler( "RspnId32GenUpdated", getRspnId32GenUpdated() );
			saxDoc.addElementHandler( "RspnId32GenDeleted", getRspnId32GenDeleted() );

			// Id64Gen Response s

			saxDoc.addElementHandler( "RspnId64GenCreated", getRspnId64GenCreated() );
			saxDoc.addElementHandler( "RspnId64GenReadSingle", getRspnId64GenReadSingle() );
			saxDoc.addElementHandler( "RspnId64GenReadList", getRspnId64GenReadList() );
			saxDoc.addElementHandler( "RspnId64GenLocked", getRspnId64GenLocked() );
			saxDoc.addElementHandler( "RspnId64GenUpdated", getRspnId64GenUpdated() );
			saxDoc.addElementHandler( "RspnId64GenDeleted", getRspnId64GenDeleted() );

			// Index Response s

			saxDoc.addElementHandler( "RspnIndexCreated", getRspnIndexCreated() );
			saxDoc.addElementHandler( "RspnIndexReadSingle", getRspnIndexReadSingle() );
			saxDoc.addElementHandler( "RspnIndexReadList", getRspnIndexReadList() );
			saxDoc.addElementHandler( "RspnIndexLocked", getRspnIndexLocked() );
			saxDoc.addElementHandler( "RspnIndexUpdated", getRspnIndexUpdated() );
			saxDoc.addElementHandler( "RspnIndexDeleted", getRspnIndexDeleted() );

			// IndexCol Response s

			saxDoc.addElementHandler( "RspnIndexColCreated", getRspnIndexColCreated() );
			saxDoc.addElementHandler( "RspnIndexColReadSingle", getRspnIndexColReadSingle() );
			saxDoc.addElementHandler( "RspnIndexColReadList", getRspnIndexColReadList() );
			saxDoc.addElementHandler( "RspnIndexColLocked", getRspnIndexColLocked() );
			saxDoc.addElementHandler( "RspnIndexColUpdated", getRspnIndexColUpdated() );
			saxDoc.addElementHandler( "RspnIndexColDeleted", getRspnIndexColDeleted() );

			// Int16Col Response s

			saxDoc.addElementHandler( "RspnInt16ColCreated", getRspnInt16ColCreated() );
			saxDoc.addElementHandler( "RspnInt16ColReadSingle", getRspnInt16ColReadSingle() );
			saxDoc.addElementHandler( "RspnInt16ColReadList", getRspnInt16ColReadList() );
			saxDoc.addElementHandler( "RspnInt16ColLocked", getRspnInt16ColLocked() );
			saxDoc.addElementHandler( "RspnInt16ColUpdated", getRspnInt16ColUpdated() );
			saxDoc.addElementHandler( "RspnInt16ColDeleted", getRspnInt16ColDeleted() );

			// Int16Def Response s

			saxDoc.addElementHandler( "RspnInt16DefCreated", getRspnInt16DefCreated() );
			saxDoc.addElementHandler( "RspnInt16DefReadSingle", getRspnInt16DefReadSingle() );
			saxDoc.addElementHandler( "RspnInt16DefReadList", getRspnInt16DefReadList() );
			saxDoc.addElementHandler( "RspnInt16DefLocked", getRspnInt16DefLocked() );
			saxDoc.addElementHandler( "RspnInt16DefUpdated", getRspnInt16DefUpdated() );
			saxDoc.addElementHandler( "RspnInt16DefDeleted", getRspnInt16DefDeleted() );

			// Int16Type Response s

			saxDoc.addElementHandler( "RspnInt16TypeCreated", getRspnInt16TypeCreated() );
			saxDoc.addElementHandler( "RspnInt16TypeReadSingle", getRspnInt16TypeReadSingle() );
			saxDoc.addElementHandler( "RspnInt16TypeReadList", getRspnInt16TypeReadList() );
			saxDoc.addElementHandler( "RspnInt16TypeLocked", getRspnInt16TypeLocked() );
			saxDoc.addElementHandler( "RspnInt16TypeUpdated", getRspnInt16TypeUpdated() );
			saxDoc.addElementHandler( "RspnInt16TypeDeleted", getRspnInt16TypeDeleted() );

			// Int32Col Response s

			saxDoc.addElementHandler( "RspnInt32ColCreated", getRspnInt32ColCreated() );
			saxDoc.addElementHandler( "RspnInt32ColReadSingle", getRspnInt32ColReadSingle() );
			saxDoc.addElementHandler( "RspnInt32ColReadList", getRspnInt32ColReadList() );
			saxDoc.addElementHandler( "RspnInt32ColLocked", getRspnInt32ColLocked() );
			saxDoc.addElementHandler( "RspnInt32ColUpdated", getRspnInt32ColUpdated() );
			saxDoc.addElementHandler( "RspnInt32ColDeleted", getRspnInt32ColDeleted() );

			// Int32Def Response s

			saxDoc.addElementHandler( "RspnInt32DefCreated", getRspnInt32DefCreated() );
			saxDoc.addElementHandler( "RspnInt32DefReadSingle", getRspnInt32DefReadSingle() );
			saxDoc.addElementHandler( "RspnInt32DefReadList", getRspnInt32DefReadList() );
			saxDoc.addElementHandler( "RspnInt32DefLocked", getRspnInt32DefLocked() );
			saxDoc.addElementHandler( "RspnInt32DefUpdated", getRspnInt32DefUpdated() );
			saxDoc.addElementHandler( "RspnInt32DefDeleted", getRspnInt32DefDeleted() );

			// Int32Type Response s

			saxDoc.addElementHandler( "RspnInt32TypeCreated", getRspnInt32TypeCreated() );
			saxDoc.addElementHandler( "RspnInt32TypeReadSingle", getRspnInt32TypeReadSingle() );
			saxDoc.addElementHandler( "RspnInt32TypeReadList", getRspnInt32TypeReadList() );
			saxDoc.addElementHandler( "RspnInt32TypeLocked", getRspnInt32TypeLocked() );
			saxDoc.addElementHandler( "RspnInt32TypeUpdated", getRspnInt32TypeUpdated() );
			saxDoc.addElementHandler( "RspnInt32TypeDeleted", getRspnInt32TypeDeleted() );

			// Int64Col Response s

			saxDoc.addElementHandler( "RspnInt64ColCreated", getRspnInt64ColCreated() );
			saxDoc.addElementHandler( "RspnInt64ColReadSingle", getRspnInt64ColReadSingle() );
			saxDoc.addElementHandler( "RspnInt64ColReadList", getRspnInt64ColReadList() );
			saxDoc.addElementHandler( "RspnInt64ColLocked", getRspnInt64ColLocked() );
			saxDoc.addElementHandler( "RspnInt64ColUpdated", getRspnInt64ColUpdated() );
			saxDoc.addElementHandler( "RspnInt64ColDeleted", getRspnInt64ColDeleted() );

			// Int64Def Response s

			saxDoc.addElementHandler( "RspnInt64DefCreated", getRspnInt64DefCreated() );
			saxDoc.addElementHandler( "RspnInt64DefReadSingle", getRspnInt64DefReadSingle() );
			saxDoc.addElementHandler( "RspnInt64DefReadList", getRspnInt64DefReadList() );
			saxDoc.addElementHandler( "RspnInt64DefLocked", getRspnInt64DefLocked() );
			saxDoc.addElementHandler( "RspnInt64DefUpdated", getRspnInt64DefUpdated() );
			saxDoc.addElementHandler( "RspnInt64DefDeleted", getRspnInt64DefDeleted() );

			// Int64Type Response s

			saxDoc.addElementHandler( "RspnInt64TypeCreated", getRspnInt64TypeCreated() );
			saxDoc.addElementHandler( "RspnInt64TypeReadSingle", getRspnInt64TypeReadSingle() );
			saxDoc.addElementHandler( "RspnInt64TypeReadList", getRspnInt64TypeReadList() );
			saxDoc.addElementHandler( "RspnInt64TypeLocked", getRspnInt64TypeLocked() );
			saxDoc.addElementHandler( "RspnInt64TypeUpdated", getRspnInt64TypeUpdated() );
			saxDoc.addElementHandler( "RspnInt64TypeDeleted", getRspnInt64TypeDeleted() );

			// MajorVersion Response s

			saxDoc.addElementHandler( "RspnMajorVersionCreated", getRspnMajorVersionCreated() );
			saxDoc.addElementHandler( "RspnMajorVersionReadSingle", getRspnMajorVersionReadSingle() );
			saxDoc.addElementHandler( "RspnMajorVersionReadList", getRspnMajorVersionReadList() );
			saxDoc.addElementHandler( "RspnMajorVersionLocked", getRspnMajorVersionLocked() );
			saxDoc.addElementHandler( "RspnMajorVersionUpdated", getRspnMajorVersionUpdated() );
			saxDoc.addElementHandler( "RspnMajorVersionDeleted", getRspnMajorVersionDeleted() );

			// MimeType Response s

			saxDoc.addElementHandler( "RspnMimeTypeCreated", getRspnMimeTypeCreated() );
			saxDoc.addElementHandler( "RspnMimeTypeReadSingle", getRspnMimeTypeReadSingle() );
			saxDoc.addElementHandler( "RspnMimeTypeReadList", getRspnMimeTypeReadList() );
			saxDoc.addElementHandler( "RspnMimeTypeLocked", getRspnMimeTypeLocked() );
			saxDoc.addElementHandler( "RspnMimeTypeUpdated", getRspnMimeTypeUpdated() );
			saxDoc.addElementHandler( "RspnMimeTypeDeleted", getRspnMimeTypeDeleted() );

			// MinorVersion Response s

			saxDoc.addElementHandler( "RspnMinorVersionCreated", getRspnMinorVersionCreated() );
			saxDoc.addElementHandler( "RspnMinorVersionReadSingle", getRspnMinorVersionReadSingle() );
			saxDoc.addElementHandler( "RspnMinorVersionReadList", getRspnMinorVersionReadList() );
			saxDoc.addElementHandler( "RspnMinorVersionLocked", getRspnMinorVersionLocked() );
			saxDoc.addElementHandler( "RspnMinorVersionUpdated", getRspnMinorVersionUpdated() );
			saxDoc.addElementHandler( "RspnMinorVersionDeleted", getRspnMinorVersionDeleted() );

			// NmTokenCol Response s

			saxDoc.addElementHandler( "RspnNmTokenColCreated", getRspnNmTokenColCreated() );
			saxDoc.addElementHandler( "RspnNmTokenColReadSingle", getRspnNmTokenColReadSingle() );
			saxDoc.addElementHandler( "RspnNmTokenColReadList", getRspnNmTokenColReadList() );
			saxDoc.addElementHandler( "RspnNmTokenColLocked", getRspnNmTokenColLocked() );
			saxDoc.addElementHandler( "RspnNmTokenColUpdated", getRspnNmTokenColUpdated() );
			saxDoc.addElementHandler( "RspnNmTokenColDeleted", getRspnNmTokenColDeleted() );

			// NmTokenDef Response s

			saxDoc.addElementHandler( "RspnNmTokenDefCreated", getRspnNmTokenDefCreated() );
			saxDoc.addElementHandler( "RspnNmTokenDefReadSingle", getRspnNmTokenDefReadSingle() );
			saxDoc.addElementHandler( "RspnNmTokenDefReadList", getRspnNmTokenDefReadList() );
			saxDoc.addElementHandler( "RspnNmTokenDefLocked", getRspnNmTokenDefLocked() );
			saxDoc.addElementHandler( "RspnNmTokenDefUpdated", getRspnNmTokenDefUpdated() );
			saxDoc.addElementHandler( "RspnNmTokenDefDeleted", getRspnNmTokenDefDeleted() );

			// NmTokenType Response s

			saxDoc.addElementHandler( "RspnNmTokenTypeCreated", getRspnNmTokenTypeCreated() );
			saxDoc.addElementHandler( "RspnNmTokenTypeReadSingle", getRspnNmTokenTypeReadSingle() );
			saxDoc.addElementHandler( "RspnNmTokenTypeReadList", getRspnNmTokenTypeReadList() );
			saxDoc.addElementHandler( "RspnNmTokenTypeLocked", getRspnNmTokenTypeLocked() );
			saxDoc.addElementHandler( "RspnNmTokenTypeUpdated", getRspnNmTokenTypeUpdated() );
			saxDoc.addElementHandler( "RspnNmTokenTypeDeleted", getRspnNmTokenTypeDeleted() );

			// NmTokensCol Response s

			saxDoc.addElementHandler( "RspnNmTokensColCreated", getRspnNmTokensColCreated() );
			saxDoc.addElementHandler( "RspnNmTokensColReadSingle", getRspnNmTokensColReadSingle() );
			saxDoc.addElementHandler( "RspnNmTokensColReadList", getRspnNmTokensColReadList() );
			saxDoc.addElementHandler( "RspnNmTokensColLocked", getRspnNmTokensColLocked() );
			saxDoc.addElementHandler( "RspnNmTokensColUpdated", getRspnNmTokensColUpdated() );
			saxDoc.addElementHandler( "RspnNmTokensColDeleted", getRspnNmTokensColDeleted() );

			// NmTokensDef Response s

			saxDoc.addElementHandler( "RspnNmTokensDefCreated", getRspnNmTokensDefCreated() );
			saxDoc.addElementHandler( "RspnNmTokensDefReadSingle", getRspnNmTokensDefReadSingle() );
			saxDoc.addElementHandler( "RspnNmTokensDefReadList", getRspnNmTokensDefReadList() );
			saxDoc.addElementHandler( "RspnNmTokensDefLocked", getRspnNmTokensDefLocked() );
			saxDoc.addElementHandler( "RspnNmTokensDefUpdated", getRspnNmTokensDefUpdated() );
			saxDoc.addElementHandler( "RspnNmTokensDefDeleted", getRspnNmTokensDefDeleted() );

			// NmTokensType Response s

			saxDoc.addElementHandler( "RspnNmTokensTypeCreated", getRspnNmTokensTypeCreated() );
			saxDoc.addElementHandler( "RspnNmTokensTypeReadSingle", getRspnNmTokensTypeReadSingle() );
			saxDoc.addElementHandler( "RspnNmTokensTypeReadList", getRspnNmTokensTypeReadList() );
			saxDoc.addElementHandler( "RspnNmTokensTypeLocked", getRspnNmTokensTypeLocked() );
			saxDoc.addElementHandler( "RspnNmTokensTypeUpdated", getRspnNmTokensTypeUpdated() );
			saxDoc.addElementHandler( "RspnNmTokensTypeDeleted", getRspnNmTokensTypeDeleted() );

			// NumberCol Response s

			saxDoc.addElementHandler( "RspnNumberColCreated", getRspnNumberColCreated() );
			saxDoc.addElementHandler( "RspnNumberColReadSingle", getRspnNumberColReadSingle() );
			saxDoc.addElementHandler( "RspnNumberColReadList", getRspnNumberColReadList() );
			saxDoc.addElementHandler( "RspnNumberColLocked", getRspnNumberColLocked() );
			saxDoc.addElementHandler( "RspnNumberColUpdated", getRspnNumberColUpdated() );
			saxDoc.addElementHandler( "RspnNumberColDeleted", getRspnNumberColDeleted() );

			// NumberDef Response s

			saxDoc.addElementHandler( "RspnNumberDefCreated", getRspnNumberDefCreated() );
			saxDoc.addElementHandler( "RspnNumberDefReadSingle", getRspnNumberDefReadSingle() );
			saxDoc.addElementHandler( "RspnNumberDefReadList", getRspnNumberDefReadList() );
			saxDoc.addElementHandler( "RspnNumberDefLocked", getRspnNumberDefLocked() );
			saxDoc.addElementHandler( "RspnNumberDefUpdated", getRspnNumberDefUpdated() );
			saxDoc.addElementHandler( "RspnNumberDefDeleted", getRspnNumberDefDeleted() );

			// NumberType Response s

			saxDoc.addElementHandler( "RspnNumberTypeCreated", getRspnNumberTypeCreated() );
			saxDoc.addElementHandler( "RspnNumberTypeReadSingle", getRspnNumberTypeReadSingle() );
			saxDoc.addElementHandler( "RspnNumberTypeReadList", getRspnNumberTypeReadList() );
			saxDoc.addElementHandler( "RspnNumberTypeLocked", getRspnNumberTypeLocked() );
			saxDoc.addElementHandler( "RspnNumberTypeUpdated", getRspnNumberTypeUpdated() );
			saxDoc.addElementHandler( "RspnNumberTypeDeleted", getRspnNumberTypeDeleted() );

			// Param Response s

			saxDoc.addElementHandler( "RspnParamCreated", getRspnParamCreated() );
			saxDoc.addElementHandler( "RspnParamReadSingle", getRspnParamReadSingle() );
			saxDoc.addElementHandler( "RspnParamReadList", getRspnParamReadList() );
			saxDoc.addElementHandler( "RspnParamLocked", getRspnParamLocked() );
			saxDoc.addElementHandler( "RspnParamUpdated", getRspnParamUpdated() );
			saxDoc.addElementHandler( "RspnParamDeleted", getRspnParamDeleted() );

			// PopDep Response s

			saxDoc.addElementHandler( "RspnPopDepCreated", getRspnPopDepCreated() );
			saxDoc.addElementHandler( "RspnPopDepReadSingle", getRspnPopDepReadSingle() );
			saxDoc.addElementHandler( "RspnPopDepReadList", getRspnPopDepReadList() );
			saxDoc.addElementHandler( "RspnPopDepLocked", getRspnPopDepLocked() );
			saxDoc.addElementHandler( "RspnPopDepUpdated", getRspnPopDepUpdated() );
			saxDoc.addElementHandler( "RspnPopDepDeleted", getRspnPopDepDeleted() );

			// PopSubDep1 Response s

			saxDoc.addElementHandler( "RspnPopSubDep1Created", getRspnPopSubDep1Created() );
			saxDoc.addElementHandler( "RspnPopSubDep1ReadSingle", getRspnPopSubDep1ReadSingle() );
			saxDoc.addElementHandler( "RspnPopSubDep1ReadList", getRspnPopSubDep1ReadList() );
			saxDoc.addElementHandler( "RspnPopSubDep1Locked", getRspnPopSubDep1Locked() );
			saxDoc.addElementHandler( "RspnPopSubDep1Updated", getRspnPopSubDep1Updated() );
			saxDoc.addElementHandler( "RspnPopSubDep1Deleted", getRspnPopSubDep1Deleted() );

			// PopSubDep2 Response s

			saxDoc.addElementHandler( "RspnPopSubDep2Created", getRspnPopSubDep2Created() );
			saxDoc.addElementHandler( "RspnPopSubDep2ReadSingle", getRspnPopSubDep2ReadSingle() );
			saxDoc.addElementHandler( "RspnPopSubDep2ReadList", getRspnPopSubDep2ReadList() );
			saxDoc.addElementHandler( "RspnPopSubDep2Locked", getRspnPopSubDep2Locked() );
			saxDoc.addElementHandler( "RspnPopSubDep2Updated", getRspnPopSubDep2Updated() );
			saxDoc.addElementHandler( "RspnPopSubDep2Deleted", getRspnPopSubDep2Deleted() );

			// PopSubDep3 Response s

			saxDoc.addElementHandler( "RspnPopSubDep3Created", getRspnPopSubDep3Created() );
			saxDoc.addElementHandler( "RspnPopSubDep3ReadSingle", getRspnPopSubDep3ReadSingle() );
			saxDoc.addElementHandler( "RspnPopSubDep3ReadList", getRspnPopSubDep3ReadList() );
			saxDoc.addElementHandler( "RspnPopSubDep3Locked", getRspnPopSubDep3Locked() );
			saxDoc.addElementHandler( "RspnPopSubDep3Updated", getRspnPopSubDep3Updated() );
			saxDoc.addElementHandler( "RspnPopSubDep3Deleted", getRspnPopSubDep3Deleted() );

			// PopTopDep Response s

			saxDoc.addElementHandler( "RspnPopTopDepCreated", getRspnPopTopDepCreated() );
			saxDoc.addElementHandler( "RspnPopTopDepReadSingle", getRspnPopTopDepReadSingle() );
			saxDoc.addElementHandler( "RspnPopTopDepReadList", getRspnPopTopDepReadList() );
			saxDoc.addElementHandler( "RspnPopTopDepLocked", getRspnPopTopDepLocked() );
			saxDoc.addElementHandler( "RspnPopTopDepUpdated", getRspnPopTopDepUpdated() );
			saxDoc.addElementHandler( "RspnPopTopDepDeleted", getRspnPopTopDepDeleted() );

			// Relation Response s

			saxDoc.addElementHandler( "RspnRelationCreated", getRspnRelationCreated() );
			saxDoc.addElementHandler( "RspnRelationReadSingle", getRspnRelationReadSingle() );
			saxDoc.addElementHandler( "RspnRelationReadList", getRspnRelationReadList() );
			saxDoc.addElementHandler( "RspnRelationLocked", getRspnRelationLocked() );
			saxDoc.addElementHandler( "RspnRelationUpdated", getRspnRelationUpdated() );
			saxDoc.addElementHandler( "RspnRelationDeleted", getRspnRelationDeleted() );

			// RelationCol Response s

			saxDoc.addElementHandler( "RspnRelationColCreated", getRspnRelationColCreated() );
			saxDoc.addElementHandler( "RspnRelationColReadSingle", getRspnRelationColReadSingle() );
			saxDoc.addElementHandler( "RspnRelationColReadList", getRspnRelationColReadList() );
			saxDoc.addElementHandler( "RspnRelationColLocked", getRspnRelationColLocked() );
			saxDoc.addElementHandler( "RspnRelationColUpdated", getRspnRelationColUpdated() );
			saxDoc.addElementHandler( "RspnRelationColDeleted", getRspnRelationColDeleted() );

			// SchemaDef Response s

			saxDoc.addElementHandler( "RspnSchemaDefCreated", getRspnSchemaDefCreated() );
			saxDoc.addElementHandler( "RspnSchemaDefReadSingle", getRspnSchemaDefReadSingle() );
			saxDoc.addElementHandler( "RspnSchemaDefReadList", getRspnSchemaDefReadList() );
			saxDoc.addElementHandler( "RspnSchemaDefLocked", getRspnSchemaDefLocked() );
			saxDoc.addElementHandler( "RspnSchemaDefUpdated", getRspnSchemaDefUpdated() );
			saxDoc.addElementHandler( "RspnSchemaDefDeleted", getRspnSchemaDefDeleted() );

			// SchemaRef Response s

			saxDoc.addElementHandler( "RspnSchemaRefCreated", getRspnSchemaRefCreated() );
			saxDoc.addElementHandler( "RspnSchemaRefReadSingle", getRspnSchemaRefReadSingle() );
			saxDoc.addElementHandler( "RspnSchemaRefReadList", getRspnSchemaRefReadList() );
			saxDoc.addElementHandler( "RspnSchemaRefLocked", getRspnSchemaRefLocked() );
			saxDoc.addElementHandler( "RspnSchemaRefUpdated", getRspnSchemaRefUpdated() );
			saxDoc.addElementHandler( "RspnSchemaRefDeleted", getRspnSchemaRefDeleted() );

			// Scope Response s

			saxDoc.addElementHandler( "RspnScopeCreated", getRspnScopeCreated() );
			saxDoc.addElementHandler( "RspnScopeReadSingle", getRspnScopeReadSingle() );
			saxDoc.addElementHandler( "RspnScopeReadList", getRspnScopeReadList() );
			saxDoc.addElementHandler( "RspnScopeLocked", getRspnScopeLocked() );
			saxDoc.addElementHandler( "RspnScopeUpdated", getRspnScopeUpdated() );
			saxDoc.addElementHandler( "RspnScopeDeleted", getRspnScopeDeleted() );

			// SecApp Response s

			saxDoc.addElementHandler( "RspnSecAppCreated", getRspnSecAppCreated() );
			saxDoc.addElementHandler( "RspnSecAppReadSingle", getRspnSecAppReadSingle() );
			saxDoc.addElementHandler( "RspnSecAppReadList", getRspnSecAppReadList() );
			saxDoc.addElementHandler( "RspnSecAppLocked", getRspnSecAppLocked() );
			saxDoc.addElementHandler( "RspnSecAppUpdated", getRspnSecAppUpdated() );
			saxDoc.addElementHandler( "RspnSecAppDeleted", getRspnSecAppDeleted() );

			// SecDevice Response s

			saxDoc.addElementHandler( "RspnSecDeviceCreated", getRspnSecDeviceCreated() );
			saxDoc.addElementHandler( "RspnSecDeviceReadSingle", getRspnSecDeviceReadSingle() );
			saxDoc.addElementHandler( "RspnSecDeviceReadList", getRspnSecDeviceReadList() );
			saxDoc.addElementHandler( "RspnSecDeviceLocked", getRspnSecDeviceLocked() );
			saxDoc.addElementHandler( "RspnSecDeviceUpdated", getRspnSecDeviceUpdated() );
			saxDoc.addElementHandler( "RspnSecDeviceDeleted", getRspnSecDeviceDeleted() );

			// SecForm Response s

			saxDoc.addElementHandler( "RspnSecFormCreated", getRspnSecFormCreated() );
			saxDoc.addElementHandler( "RspnSecFormReadSingle", getRspnSecFormReadSingle() );
			saxDoc.addElementHandler( "RspnSecFormReadList", getRspnSecFormReadList() );
			saxDoc.addElementHandler( "RspnSecFormLocked", getRspnSecFormLocked() );
			saxDoc.addElementHandler( "RspnSecFormUpdated", getRspnSecFormUpdated() );
			saxDoc.addElementHandler( "RspnSecFormDeleted", getRspnSecFormDeleted() );

			// SecGroup Response s

			saxDoc.addElementHandler( "RspnSecGroupCreated", getRspnSecGroupCreated() );
			saxDoc.addElementHandler( "RspnSecGroupReadSingle", getRspnSecGroupReadSingle() );
			saxDoc.addElementHandler( "RspnSecGroupReadList", getRspnSecGroupReadList() );
			saxDoc.addElementHandler( "RspnSecGroupLocked", getRspnSecGroupLocked() );
			saxDoc.addElementHandler( "RspnSecGroupUpdated", getRspnSecGroupUpdated() );
			saxDoc.addElementHandler( "RspnSecGroupDeleted", getRspnSecGroupDeleted() );

			// SecGroupForm Response s

			saxDoc.addElementHandler( "RspnSecGroupFormCreated", getRspnSecGroupFormCreated() );
			saxDoc.addElementHandler( "RspnSecGroupFormReadSingle", getRspnSecGroupFormReadSingle() );
			saxDoc.addElementHandler( "RspnSecGroupFormReadList", getRspnSecGroupFormReadList() );
			saxDoc.addElementHandler( "RspnSecGroupFormLocked", getRspnSecGroupFormLocked() );
			saxDoc.addElementHandler( "RspnSecGroupFormUpdated", getRspnSecGroupFormUpdated() );
			saxDoc.addElementHandler( "RspnSecGroupFormDeleted", getRspnSecGroupFormDeleted() );

			// SecGrpInc Response s

			saxDoc.addElementHandler( "RspnSecGrpIncCreated", getRspnSecGrpIncCreated() );
			saxDoc.addElementHandler( "RspnSecGrpIncReadSingle", getRspnSecGrpIncReadSingle() );
			saxDoc.addElementHandler( "RspnSecGrpIncReadList", getRspnSecGrpIncReadList() );
			saxDoc.addElementHandler( "RspnSecGrpIncLocked", getRspnSecGrpIncLocked() );
			saxDoc.addElementHandler( "RspnSecGrpIncUpdated", getRspnSecGrpIncUpdated() );
			saxDoc.addElementHandler( "RspnSecGrpIncDeleted", getRspnSecGrpIncDeleted() );

			// SecGrpMemb Response s

			saxDoc.addElementHandler( "RspnSecGrpMembCreated", getRspnSecGrpMembCreated() );
			saxDoc.addElementHandler( "RspnSecGrpMembReadSingle", getRspnSecGrpMembReadSingle() );
			saxDoc.addElementHandler( "RspnSecGrpMembReadList", getRspnSecGrpMembReadList() );
			saxDoc.addElementHandler( "RspnSecGrpMembLocked", getRspnSecGrpMembLocked() );
			saxDoc.addElementHandler( "RspnSecGrpMembUpdated", getRspnSecGrpMembUpdated() );
			saxDoc.addElementHandler( "RspnSecGrpMembDeleted", getRspnSecGrpMembDeleted() );

			// SecSession Response s

			saxDoc.addElementHandler( "RspnSecSessionCreated", getRspnSecSessionCreated() );
			saxDoc.addElementHandler( "RspnSecSessionReadSingle", getRspnSecSessionReadSingle() );
			saxDoc.addElementHandler( "RspnSecSessionReadList", getRspnSecSessionReadList() );
			saxDoc.addElementHandler( "RspnSecSessionLocked", getRspnSecSessionLocked() );
			saxDoc.addElementHandler( "RspnSecSessionUpdated", getRspnSecSessionUpdated() );
			saxDoc.addElementHandler( "RspnSecSessionDeleted", getRspnSecSessionDeleted() );

			// SecUser Response s

			saxDoc.addElementHandler( "RspnSecUserCreated", getRspnSecUserCreated() );
			saxDoc.addElementHandler( "RspnSecUserReadSingle", getRspnSecUserReadSingle() );
			saxDoc.addElementHandler( "RspnSecUserReadList", getRspnSecUserReadList() );
			saxDoc.addElementHandler( "RspnSecUserLocked", getRspnSecUserLocked() );
			saxDoc.addElementHandler( "RspnSecUserUpdated", getRspnSecUserUpdated() );
			saxDoc.addElementHandler( "RspnSecUserDeleted", getRspnSecUserDeleted() );

			// ServerListFunc Response s

			saxDoc.addElementHandler( "RspnServerListFuncCreated", getRspnServerListFuncCreated() );
			saxDoc.addElementHandler( "RspnServerListFuncReadSingle", getRspnServerListFuncReadSingle() );
			saxDoc.addElementHandler( "RspnServerListFuncReadList", getRspnServerListFuncReadList() );
			saxDoc.addElementHandler( "RspnServerListFuncLocked", getRspnServerListFuncLocked() );
			saxDoc.addElementHandler( "RspnServerListFuncUpdated", getRspnServerListFuncUpdated() );
			saxDoc.addElementHandler( "RspnServerListFuncDeleted", getRspnServerListFuncDeleted() );

			// ServerMethod Response s

			saxDoc.addElementHandler( "RspnServerMethodCreated", getRspnServerMethodCreated() );
			saxDoc.addElementHandler( "RspnServerMethodReadSingle", getRspnServerMethodReadSingle() );
			saxDoc.addElementHandler( "RspnServerMethodReadList", getRspnServerMethodReadList() );
			saxDoc.addElementHandler( "RspnServerMethodLocked", getRspnServerMethodLocked() );
			saxDoc.addElementHandler( "RspnServerMethodUpdated", getRspnServerMethodUpdated() );
			saxDoc.addElementHandler( "RspnServerMethodDeleted", getRspnServerMethodDeleted() );

			// ServerObjFunc Response s

			saxDoc.addElementHandler( "RspnServerObjFuncCreated", getRspnServerObjFuncCreated() );
			saxDoc.addElementHandler( "RspnServerObjFuncReadSingle", getRspnServerObjFuncReadSingle() );
			saxDoc.addElementHandler( "RspnServerObjFuncReadList", getRspnServerObjFuncReadList() );
			saxDoc.addElementHandler( "RspnServerObjFuncLocked", getRspnServerObjFuncLocked() );
			saxDoc.addElementHandler( "RspnServerObjFuncUpdated", getRspnServerObjFuncUpdated() );
			saxDoc.addElementHandler( "RspnServerObjFuncDeleted", getRspnServerObjFuncDeleted() );

			// ServerProc Response s

			saxDoc.addElementHandler( "RspnServerProcCreated", getRspnServerProcCreated() );
			saxDoc.addElementHandler( "RspnServerProcReadSingle", getRspnServerProcReadSingle() );
			saxDoc.addElementHandler( "RspnServerProcReadList", getRspnServerProcReadList() );
			saxDoc.addElementHandler( "RspnServerProcLocked", getRspnServerProcLocked() );
			saxDoc.addElementHandler( "RspnServerProcUpdated", getRspnServerProcUpdated() );
			saxDoc.addElementHandler( "RspnServerProcDeleted", getRspnServerProcDeleted() );

			// Service Response s

			saxDoc.addElementHandler( "RspnServiceCreated", getRspnServiceCreated() );
			saxDoc.addElementHandler( "RspnServiceReadSingle", getRspnServiceReadSingle() );
			saxDoc.addElementHandler( "RspnServiceReadList", getRspnServiceReadList() );
			saxDoc.addElementHandler( "RspnServiceLocked", getRspnServiceLocked() );
			saxDoc.addElementHandler( "RspnServiceUpdated", getRspnServiceUpdated() );
			saxDoc.addElementHandler( "RspnServiceDeleted", getRspnServiceDeleted() );

			// ServiceType Response s

			saxDoc.addElementHandler( "RspnServiceTypeCreated", getRspnServiceTypeCreated() );
			saxDoc.addElementHandler( "RspnServiceTypeReadSingle", getRspnServiceTypeReadSingle() );
			saxDoc.addElementHandler( "RspnServiceTypeReadList", getRspnServiceTypeReadList() );
			saxDoc.addElementHandler( "RspnServiceTypeLocked", getRspnServiceTypeLocked() );
			saxDoc.addElementHandler( "RspnServiceTypeUpdated", getRspnServiceTypeUpdated() );
			saxDoc.addElementHandler( "RspnServiceTypeDeleted", getRspnServiceTypeDeleted() );

			// StringCol Response s

			saxDoc.addElementHandler( "RspnStringColCreated", getRspnStringColCreated() );
			saxDoc.addElementHandler( "RspnStringColReadSingle", getRspnStringColReadSingle() );
			saxDoc.addElementHandler( "RspnStringColReadList", getRspnStringColReadList() );
			saxDoc.addElementHandler( "RspnStringColLocked", getRspnStringColLocked() );
			saxDoc.addElementHandler( "RspnStringColUpdated", getRspnStringColUpdated() );
			saxDoc.addElementHandler( "RspnStringColDeleted", getRspnStringColDeleted() );

			// StringDef Response s

			saxDoc.addElementHandler( "RspnStringDefCreated", getRspnStringDefCreated() );
			saxDoc.addElementHandler( "RspnStringDefReadSingle", getRspnStringDefReadSingle() );
			saxDoc.addElementHandler( "RspnStringDefReadList", getRspnStringDefReadList() );
			saxDoc.addElementHandler( "RspnStringDefLocked", getRspnStringDefLocked() );
			saxDoc.addElementHandler( "RspnStringDefUpdated", getRspnStringDefUpdated() );
			saxDoc.addElementHandler( "RspnStringDefDeleted", getRspnStringDefDeleted() );

			// StringType Response s

			saxDoc.addElementHandler( "RspnStringTypeCreated", getRspnStringTypeCreated() );
			saxDoc.addElementHandler( "RspnStringTypeReadSingle", getRspnStringTypeReadSingle() );
			saxDoc.addElementHandler( "RspnStringTypeReadList", getRspnStringTypeReadList() );
			saxDoc.addElementHandler( "RspnStringTypeLocked", getRspnStringTypeLocked() );
			saxDoc.addElementHandler( "RspnStringTypeUpdated", getRspnStringTypeUpdated() );
			saxDoc.addElementHandler( "RspnStringTypeDeleted", getRspnStringTypeDeleted() );

			// SubProject Response s

			saxDoc.addElementHandler( "RspnSubProjectCreated", getRspnSubProjectCreated() );
			saxDoc.addElementHandler( "RspnSubProjectReadSingle", getRspnSubProjectReadSingle() );
			saxDoc.addElementHandler( "RspnSubProjectReadList", getRspnSubProjectReadList() );
			saxDoc.addElementHandler( "RspnSubProjectLocked", getRspnSubProjectLocked() );
			saxDoc.addElementHandler( "RspnSubProjectUpdated", getRspnSubProjectUpdated() );
			saxDoc.addElementHandler( "RspnSubProjectDeleted", getRspnSubProjectDeleted() );

			// SysCluster Response s

			saxDoc.addElementHandler( "RspnSysClusterCreated", getRspnSysClusterCreated() );
			saxDoc.addElementHandler( "RspnSysClusterReadSingle", getRspnSysClusterReadSingle() );
			saxDoc.addElementHandler( "RspnSysClusterReadList", getRspnSysClusterReadList() );
			saxDoc.addElementHandler( "RspnSysClusterLocked", getRspnSysClusterLocked() );
			saxDoc.addElementHandler( "RspnSysClusterUpdated", getRspnSysClusterUpdated() );
			saxDoc.addElementHandler( "RspnSysClusterDeleted", getRspnSysClusterDeleted() );

			// TSecGroup Response s

			saxDoc.addElementHandler( "RspnTSecGroupCreated", getRspnTSecGroupCreated() );
			saxDoc.addElementHandler( "RspnTSecGroupReadSingle", getRspnTSecGroupReadSingle() );
			saxDoc.addElementHandler( "RspnTSecGroupReadList", getRspnTSecGroupReadList() );
			saxDoc.addElementHandler( "RspnTSecGroupLocked", getRspnTSecGroupLocked() );
			saxDoc.addElementHandler( "RspnTSecGroupUpdated", getRspnTSecGroupUpdated() );
			saxDoc.addElementHandler( "RspnTSecGroupDeleted", getRspnTSecGroupDeleted() );

			// TSecGrpInc Response s

			saxDoc.addElementHandler( "RspnTSecGrpIncCreated", getRspnTSecGrpIncCreated() );
			saxDoc.addElementHandler( "RspnTSecGrpIncReadSingle", getRspnTSecGrpIncReadSingle() );
			saxDoc.addElementHandler( "RspnTSecGrpIncReadList", getRspnTSecGrpIncReadList() );
			saxDoc.addElementHandler( "RspnTSecGrpIncLocked", getRspnTSecGrpIncLocked() );
			saxDoc.addElementHandler( "RspnTSecGrpIncUpdated", getRspnTSecGrpIncUpdated() );
			saxDoc.addElementHandler( "RspnTSecGrpIncDeleted", getRspnTSecGrpIncDeleted() );

			// TSecGrpMemb Response s

			saxDoc.addElementHandler( "RspnTSecGrpMembCreated", getRspnTSecGrpMembCreated() );
			saxDoc.addElementHandler( "RspnTSecGrpMembReadSingle", getRspnTSecGrpMembReadSingle() );
			saxDoc.addElementHandler( "RspnTSecGrpMembReadList", getRspnTSecGrpMembReadList() );
			saxDoc.addElementHandler( "RspnTSecGrpMembLocked", getRspnTSecGrpMembLocked() );
			saxDoc.addElementHandler( "RspnTSecGrpMembUpdated", getRspnTSecGrpMembUpdated() );
			saxDoc.addElementHandler( "RspnTSecGrpMembDeleted", getRspnTSecGrpMembDeleted() );

			// TZDateCol Response s

			saxDoc.addElementHandler( "RspnTZDateColCreated", getRspnTZDateColCreated() );
			saxDoc.addElementHandler( "RspnTZDateColReadSingle", getRspnTZDateColReadSingle() );
			saxDoc.addElementHandler( "RspnTZDateColReadList", getRspnTZDateColReadList() );
			saxDoc.addElementHandler( "RspnTZDateColLocked", getRspnTZDateColLocked() );
			saxDoc.addElementHandler( "RspnTZDateColUpdated", getRspnTZDateColUpdated() );
			saxDoc.addElementHandler( "RspnTZDateColDeleted", getRspnTZDateColDeleted() );

			// TZDateDef Response s

			saxDoc.addElementHandler( "RspnTZDateDefCreated", getRspnTZDateDefCreated() );
			saxDoc.addElementHandler( "RspnTZDateDefReadSingle", getRspnTZDateDefReadSingle() );
			saxDoc.addElementHandler( "RspnTZDateDefReadList", getRspnTZDateDefReadList() );
			saxDoc.addElementHandler( "RspnTZDateDefLocked", getRspnTZDateDefLocked() );
			saxDoc.addElementHandler( "RspnTZDateDefUpdated", getRspnTZDateDefUpdated() );
			saxDoc.addElementHandler( "RspnTZDateDefDeleted", getRspnTZDateDefDeleted() );

			// TZDateType Response s

			saxDoc.addElementHandler( "RspnTZDateTypeCreated", getRspnTZDateTypeCreated() );
			saxDoc.addElementHandler( "RspnTZDateTypeReadSingle", getRspnTZDateTypeReadSingle() );
			saxDoc.addElementHandler( "RspnTZDateTypeReadList", getRspnTZDateTypeReadList() );
			saxDoc.addElementHandler( "RspnTZDateTypeLocked", getRspnTZDateTypeLocked() );
			saxDoc.addElementHandler( "RspnTZDateTypeUpdated", getRspnTZDateTypeUpdated() );
			saxDoc.addElementHandler( "RspnTZDateTypeDeleted", getRspnTZDateTypeDeleted() );

			// TZTimeCol Response s

			saxDoc.addElementHandler( "RspnTZTimeColCreated", getRspnTZTimeColCreated() );
			saxDoc.addElementHandler( "RspnTZTimeColReadSingle", getRspnTZTimeColReadSingle() );
			saxDoc.addElementHandler( "RspnTZTimeColReadList", getRspnTZTimeColReadList() );
			saxDoc.addElementHandler( "RspnTZTimeColLocked", getRspnTZTimeColLocked() );
			saxDoc.addElementHandler( "RspnTZTimeColUpdated", getRspnTZTimeColUpdated() );
			saxDoc.addElementHandler( "RspnTZTimeColDeleted", getRspnTZTimeColDeleted() );

			// TZTimeDef Response s

			saxDoc.addElementHandler( "RspnTZTimeDefCreated", getRspnTZTimeDefCreated() );
			saxDoc.addElementHandler( "RspnTZTimeDefReadSingle", getRspnTZTimeDefReadSingle() );
			saxDoc.addElementHandler( "RspnTZTimeDefReadList", getRspnTZTimeDefReadList() );
			saxDoc.addElementHandler( "RspnTZTimeDefLocked", getRspnTZTimeDefLocked() );
			saxDoc.addElementHandler( "RspnTZTimeDefUpdated", getRspnTZTimeDefUpdated() );
			saxDoc.addElementHandler( "RspnTZTimeDefDeleted", getRspnTZTimeDefDeleted() );

			// TZTimeType Response s

			saxDoc.addElementHandler( "RspnTZTimeTypeCreated", getRspnTZTimeTypeCreated() );
			saxDoc.addElementHandler( "RspnTZTimeTypeReadSingle", getRspnTZTimeTypeReadSingle() );
			saxDoc.addElementHandler( "RspnTZTimeTypeReadList", getRspnTZTimeTypeReadList() );
			saxDoc.addElementHandler( "RspnTZTimeTypeLocked", getRspnTZTimeTypeLocked() );
			saxDoc.addElementHandler( "RspnTZTimeTypeUpdated", getRspnTZTimeTypeUpdated() );
			saxDoc.addElementHandler( "RspnTZTimeTypeDeleted", getRspnTZTimeTypeDeleted() );

			// TZTimestampCol Response s

			saxDoc.addElementHandler( "RspnTZTimestampColCreated", getRspnTZTimestampColCreated() );
			saxDoc.addElementHandler( "RspnTZTimestampColReadSingle", getRspnTZTimestampColReadSingle() );
			saxDoc.addElementHandler( "RspnTZTimestampColReadList", getRspnTZTimestampColReadList() );
			saxDoc.addElementHandler( "RspnTZTimestampColLocked", getRspnTZTimestampColLocked() );
			saxDoc.addElementHandler( "RspnTZTimestampColUpdated", getRspnTZTimestampColUpdated() );
			saxDoc.addElementHandler( "RspnTZTimestampColDeleted", getRspnTZTimestampColDeleted() );

			// TZTimestampDef Response s

			saxDoc.addElementHandler( "RspnTZTimestampDefCreated", getRspnTZTimestampDefCreated() );
			saxDoc.addElementHandler( "RspnTZTimestampDefReadSingle", getRspnTZTimestampDefReadSingle() );
			saxDoc.addElementHandler( "RspnTZTimestampDefReadList", getRspnTZTimestampDefReadList() );
			saxDoc.addElementHandler( "RspnTZTimestampDefLocked", getRspnTZTimestampDefLocked() );
			saxDoc.addElementHandler( "RspnTZTimestampDefUpdated", getRspnTZTimestampDefUpdated() );
			saxDoc.addElementHandler( "RspnTZTimestampDefDeleted", getRspnTZTimestampDefDeleted() );

			// TZTimestampType Response s

			saxDoc.addElementHandler( "RspnTZTimestampTypeCreated", getRspnTZTimestampTypeCreated() );
			saxDoc.addElementHandler( "RspnTZTimestampTypeReadSingle", getRspnTZTimestampTypeReadSingle() );
			saxDoc.addElementHandler( "RspnTZTimestampTypeReadList", getRspnTZTimestampTypeReadList() );
			saxDoc.addElementHandler( "RspnTZTimestampTypeLocked", getRspnTZTimestampTypeLocked() );
			saxDoc.addElementHandler( "RspnTZTimestampTypeUpdated", getRspnTZTimestampTypeUpdated() );
			saxDoc.addElementHandler( "RspnTZTimestampTypeDeleted", getRspnTZTimestampTypeDeleted() );

			// Table Response s

			saxDoc.addElementHandler( "RspnTableCreated", getRspnTableCreated() );
			saxDoc.addElementHandler( "RspnTableReadSingle", getRspnTableReadSingle() );
			saxDoc.addElementHandler( "RspnTableReadList", getRspnTableReadList() );
			saxDoc.addElementHandler( "RspnTableLocked", getRspnTableLocked() );
			saxDoc.addElementHandler( "RspnTableUpdated", getRspnTableUpdated() );
			saxDoc.addElementHandler( "RspnTableDeleted", getRspnTableDeleted() );

			// TableCol Response s

			saxDoc.addElementHandler( "RspnTableColCreated", getRspnTableColCreated() );
			saxDoc.addElementHandler( "RspnTableColReadSingle", getRspnTableColReadSingle() );
			saxDoc.addElementHandler( "RspnTableColReadList", getRspnTableColReadList() );
			saxDoc.addElementHandler( "RspnTableColLocked", getRspnTableColLocked() );
			saxDoc.addElementHandler( "RspnTableColUpdated", getRspnTableColUpdated() );
			saxDoc.addElementHandler( "RspnTableColDeleted", getRspnTableColDeleted() );

			// Tenant Response s

			saxDoc.addElementHandler( "RspnTenantCreated", getRspnTenantCreated() );
			saxDoc.addElementHandler( "RspnTenantReadSingle", getRspnTenantReadSingle() );
			saxDoc.addElementHandler( "RspnTenantReadList", getRspnTenantReadList() );
			saxDoc.addElementHandler( "RspnTenantLocked", getRspnTenantLocked() );
			saxDoc.addElementHandler( "RspnTenantUpdated", getRspnTenantUpdated() );
			saxDoc.addElementHandler( "RspnTenantDeleted", getRspnTenantDeleted() );

			// TextCol Response s

			saxDoc.addElementHandler( "RspnTextColCreated", getRspnTextColCreated() );
			saxDoc.addElementHandler( "RspnTextColReadSingle", getRspnTextColReadSingle() );
			saxDoc.addElementHandler( "RspnTextColReadList", getRspnTextColReadList() );
			saxDoc.addElementHandler( "RspnTextColLocked", getRspnTextColLocked() );
			saxDoc.addElementHandler( "RspnTextColUpdated", getRspnTextColUpdated() );
			saxDoc.addElementHandler( "RspnTextColDeleted", getRspnTextColDeleted() );

			// TextDef Response s

			saxDoc.addElementHandler( "RspnTextDefCreated", getRspnTextDefCreated() );
			saxDoc.addElementHandler( "RspnTextDefReadSingle", getRspnTextDefReadSingle() );
			saxDoc.addElementHandler( "RspnTextDefReadList", getRspnTextDefReadList() );
			saxDoc.addElementHandler( "RspnTextDefLocked", getRspnTextDefLocked() );
			saxDoc.addElementHandler( "RspnTextDefUpdated", getRspnTextDefUpdated() );
			saxDoc.addElementHandler( "RspnTextDefDeleted", getRspnTextDefDeleted() );

			// TextType Response s

			saxDoc.addElementHandler( "RspnTextTypeCreated", getRspnTextTypeCreated() );
			saxDoc.addElementHandler( "RspnTextTypeReadSingle", getRspnTextTypeReadSingle() );
			saxDoc.addElementHandler( "RspnTextTypeReadList", getRspnTextTypeReadList() );
			saxDoc.addElementHandler( "RspnTextTypeLocked", getRspnTextTypeLocked() );
			saxDoc.addElementHandler( "RspnTextTypeUpdated", getRspnTextTypeUpdated() );
			saxDoc.addElementHandler( "RspnTextTypeDeleted", getRspnTextTypeDeleted() );

			// TimeCol Response s

			saxDoc.addElementHandler( "RspnTimeColCreated", getRspnTimeColCreated() );
			saxDoc.addElementHandler( "RspnTimeColReadSingle", getRspnTimeColReadSingle() );
			saxDoc.addElementHandler( "RspnTimeColReadList", getRspnTimeColReadList() );
			saxDoc.addElementHandler( "RspnTimeColLocked", getRspnTimeColLocked() );
			saxDoc.addElementHandler( "RspnTimeColUpdated", getRspnTimeColUpdated() );
			saxDoc.addElementHandler( "RspnTimeColDeleted", getRspnTimeColDeleted() );

			// TimeDef Response s

			saxDoc.addElementHandler( "RspnTimeDefCreated", getRspnTimeDefCreated() );
			saxDoc.addElementHandler( "RspnTimeDefReadSingle", getRspnTimeDefReadSingle() );
			saxDoc.addElementHandler( "RspnTimeDefReadList", getRspnTimeDefReadList() );
			saxDoc.addElementHandler( "RspnTimeDefLocked", getRspnTimeDefLocked() );
			saxDoc.addElementHandler( "RspnTimeDefUpdated", getRspnTimeDefUpdated() );
			saxDoc.addElementHandler( "RspnTimeDefDeleted", getRspnTimeDefDeleted() );

			// TimeType Response s

			saxDoc.addElementHandler( "RspnTimeTypeCreated", getRspnTimeTypeCreated() );
			saxDoc.addElementHandler( "RspnTimeTypeReadSingle", getRspnTimeTypeReadSingle() );
			saxDoc.addElementHandler( "RspnTimeTypeReadList", getRspnTimeTypeReadList() );
			saxDoc.addElementHandler( "RspnTimeTypeLocked", getRspnTimeTypeLocked() );
			saxDoc.addElementHandler( "RspnTimeTypeUpdated", getRspnTimeTypeUpdated() );
			saxDoc.addElementHandler( "RspnTimeTypeDeleted", getRspnTimeTypeDeleted() );

			// TimestampCol Response s

			saxDoc.addElementHandler( "RspnTimestampColCreated", getRspnTimestampColCreated() );
			saxDoc.addElementHandler( "RspnTimestampColReadSingle", getRspnTimestampColReadSingle() );
			saxDoc.addElementHandler( "RspnTimestampColReadList", getRspnTimestampColReadList() );
			saxDoc.addElementHandler( "RspnTimestampColLocked", getRspnTimestampColLocked() );
			saxDoc.addElementHandler( "RspnTimestampColUpdated", getRspnTimestampColUpdated() );
			saxDoc.addElementHandler( "RspnTimestampColDeleted", getRspnTimestampColDeleted() );

			// TimestampDef Response s

			saxDoc.addElementHandler( "RspnTimestampDefCreated", getRspnTimestampDefCreated() );
			saxDoc.addElementHandler( "RspnTimestampDefReadSingle", getRspnTimestampDefReadSingle() );
			saxDoc.addElementHandler( "RspnTimestampDefReadList", getRspnTimestampDefReadList() );
			saxDoc.addElementHandler( "RspnTimestampDefLocked", getRspnTimestampDefLocked() );
			saxDoc.addElementHandler( "RspnTimestampDefUpdated", getRspnTimestampDefUpdated() );
			saxDoc.addElementHandler( "RspnTimestampDefDeleted", getRspnTimestampDefDeleted() );

			// TimestampType Response s

			saxDoc.addElementHandler( "RspnTimestampTypeCreated", getRspnTimestampTypeCreated() );
			saxDoc.addElementHandler( "RspnTimestampTypeReadSingle", getRspnTimestampTypeReadSingle() );
			saxDoc.addElementHandler( "RspnTimestampTypeReadList", getRspnTimestampTypeReadList() );
			saxDoc.addElementHandler( "RspnTimestampTypeLocked", getRspnTimestampTypeLocked() );
			saxDoc.addElementHandler( "RspnTimestampTypeUpdated", getRspnTimestampTypeUpdated() );
			saxDoc.addElementHandler( "RspnTimestampTypeDeleted", getRspnTimestampTypeDeleted() );

			// Tld Response s

			saxDoc.addElementHandler( "RspnTldCreated", getRspnTldCreated() );
			saxDoc.addElementHandler( "RspnTldReadSingle", getRspnTldReadSingle() );
			saxDoc.addElementHandler( "RspnTldReadList", getRspnTldReadList() );
			saxDoc.addElementHandler( "RspnTldLocked", getRspnTldLocked() );
			saxDoc.addElementHandler( "RspnTldUpdated", getRspnTldUpdated() );
			saxDoc.addElementHandler( "RspnTldDeleted", getRspnTldDeleted() );

			// TokenCol Response s

			saxDoc.addElementHandler( "RspnTokenColCreated", getRspnTokenColCreated() );
			saxDoc.addElementHandler( "RspnTokenColReadSingle", getRspnTokenColReadSingle() );
			saxDoc.addElementHandler( "RspnTokenColReadList", getRspnTokenColReadList() );
			saxDoc.addElementHandler( "RspnTokenColLocked", getRspnTokenColLocked() );
			saxDoc.addElementHandler( "RspnTokenColUpdated", getRspnTokenColUpdated() );
			saxDoc.addElementHandler( "RspnTokenColDeleted", getRspnTokenColDeleted() );

			// TokenDef Response s

			saxDoc.addElementHandler( "RspnTokenDefCreated", getRspnTokenDefCreated() );
			saxDoc.addElementHandler( "RspnTokenDefReadSingle", getRspnTokenDefReadSingle() );
			saxDoc.addElementHandler( "RspnTokenDefReadList", getRspnTokenDefReadList() );
			saxDoc.addElementHandler( "RspnTokenDefLocked", getRspnTokenDefLocked() );
			saxDoc.addElementHandler( "RspnTokenDefUpdated", getRspnTokenDefUpdated() );
			saxDoc.addElementHandler( "RspnTokenDefDeleted", getRspnTokenDefDeleted() );

			// TokenType Response s

			saxDoc.addElementHandler( "RspnTokenTypeCreated", getRspnTokenTypeCreated() );
			saxDoc.addElementHandler( "RspnTokenTypeReadSingle", getRspnTokenTypeReadSingle() );
			saxDoc.addElementHandler( "RspnTokenTypeReadList", getRspnTokenTypeReadList() );
			saxDoc.addElementHandler( "RspnTokenTypeLocked", getRspnTokenTypeLocked() );
			saxDoc.addElementHandler( "RspnTokenTypeUpdated", getRspnTokenTypeUpdated() );
			saxDoc.addElementHandler( "RspnTokenTypeDeleted", getRspnTokenTypeDeleted() );

			// TopDomain Response s

			saxDoc.addElementHandler( "RspnTopDomainCreated", getRspnTopDomainCreated() );
			saxDoc.addElementHandler( "RspnTopDomainReadSingle", getRspnTopDomainReadSingle() );
			saxDoc.addElementHandler( "RspnTopDomainReadList", getRspnTopDomainReadList() );
			saxDoc.addElementHandler( "RspnTopDomainLocked", getRspnTopDomainLocked() );
			saxDoc.addElementHandler( "RspnTopDomainUpdated", getRspnTopDomainUpdated() );
			saxDoc.addElementHandler( "RspnTopDomainDeleted", getRspnTopDomainDeleted() );

			// TopProject Response s

			saxDoc.addElementHandler( "RspnTopProjectCreated", getRspnTopProjectCreated() );
			saxDoc.addElementHandler( "RspnTopProjectReadSingle", getRspnTopProjectReadSingle() );
			saxDoc.addElementHandler( "RspnTopProjectReadList", getRspnTopProjectReadList() );
			saxDoc.addElementHandler( "RspnTopProjectLocked", getRspnTopProjectLocked() );
			saxDoc.addElementHandler( "RspnTopProjectUpdated", getRspnTopProjectUpdated() );
			saxDoc.addElementHandler( "RspnTopProjectDeleted", getRspnTopProjectDeleted() );

			// UInt16Col Response s

			saxDoc.addElementHandler( "RspnUInt16ColCreated", getRspnUInt16ColCreated() );
			saxDoc.addElementHandler( "RspnUInt16ColReadSingle", getRspnUInt16ColReadSingle() );
			saxDoc.addElementHandler( "RspnUInt16ColReadList", getRspnUInt16ColReadList() );
			saxDoc.addElementHandler( "RspnUInt16ColLocked", getRspnUInt16ColLocked() );
			saxDoc.addElementHandler( "RspnUInt16ColUpdated", getRspnUInt16ColUpdated() );
			saxDoc.addElementHandler( "RspnUInt16ColDeleted", getRspnUInt16ColDeleted() );

			// UInt16Def Response s

			saxDoc.addElementHandler( "RspnUInt16DefCreated", getRspnUInt16DefCreated() );
			saxDoc.addElementHandler( "RspnUInt16DefReadSingle", getRspnUInt16DefReadSingle() );
			saxDoc.addElementHandler( "RspnUInt16DefReadList", getRspnUInt16DefReadList() );
			saxDoc.addElementHandler( "RspnUInt16DefLocked", getRspnUInt16DefLocked() );
			saxDoc.addElementHandler( "RspnUInt16DefUpdated", getRspnUInt16DefUpdated() );
			saxDoc.addElementHandler( "RspnUInt16DefDeleted", getRspnUInt16DefDeleted() );

			// UInt16Type Response s

			saxDoc.addElementHandler( "RspnUInt16TypeCreated", getRspnUInt16TypeCreated() );
			saxDoc.addElementHandler( "RspnUInt16TypeReadSingle", getRspnUInt16TypeReadSingle() );
			saxDoc.addElementHandler( "RspnUInt16TypeReadList", getRspnUInt16TypeReadList() );
			saxDoc.addElementHandler( "RspnUInt16TypeLocked", getRspnUInt16TypeLocked() );
			saxDoc.addElementHandler( "RspnUInt16TypeUpdated", getRspnUInt16TypeUpdated() );
			saxDoc.addElementHandler( "RspnUInt16TypeDeleted", getRspnUInt16TypeDeleted() );

			// UInt32Col Response s

			saxDoc.addElementHandler( "RspnUInt32ColCreated", getRspnUInt32ColCreated() );
			saxDoc.addElementHandler( "RspnUInt32ColReadSingle", getRspnUInt32ColReadSingle() );
			saxDoc.addElementHandler( "RspnUInt32ColReadList", getRspnUInt32ColReadList() );
			saxDoc.addElementHandler( "RspnUInt32ColLocked", getRspnUInt32ColLocked() );
			saxDoc.addElementHandler( "RspnUInt32ColUpdated", getRspnUInt32ColUpdated() );
			saxDoc.addElementHandler( "RspnUInt32ColDeleted", getRspnUInt32ColDeleted() );

			// UInt32Def Response s

			saxDoc.addElementHandler( "RspnUInt32DefCreated", getRspnUInt32DefCreated() );
			saxDoc.addElementHandler( "RspnUInt32DefReadSingle", getRspnUInt32DefReadSingle() );
			saxDoc.addElementHandler( "RspnUInt32DefReadList", getRspnUInt32DefReadList() );
			saxDoc.addElementHandler( "RspnUInt32DefLocked", getRspnUInt32DefLocked() );
			saxDoc.addElementHandler( "RspnUInt32DefUpdated", getRspnUInt32DefUpdated() );
			saxDoc.addElementHandler( "RspnUInt32DefDeleted", getRspnUInt32DefDeleted() );

			// UInt32Type Response s

			saxDoc.addElementHandler( "RspnUInt32TypeCreated", getRspnUInt32TypeCreated() );
			saxDoc.addElementHandler( "RspnUInt32TypeReadSingle", getRspnUInt32TypeReadSingle() );
			saxDoc.addElementHandler( "RspnUInt32TypeReadList", getRspnUInt32TypeReadList() );
			saxDoc.addElementHandler( "RspnUInt32TypeLocked", getRspnUInt32TypeLocked() );
			saxDoc.addElementHandler( "RspnUInt32TypeUpdated", getRspnUInt32TypeUpdated() );
			saxDoc.addElementHandler( "RspnUInt32TypeDeleted", getRspnUInt32TypeDeleted() );

			// UInt64Col Response s

			saxDoc.addElementHandler( "RspnUInt64ColCreated", getRspnUInt64ColCreated() );
			saxDoc.addElementHandler( "RspnUInt64ColReadSingle", getRspnUInt64ColReadSingle() );
			saxDoc.addElementHandler( "RspnUInt64ColReadList", getRspnUInt64ColReadList() );
			saxDoc.addElementHandler( "RspnUInt64ColLocked", getRspnUInt64ColLocked() );
			saxDoc.addElementHandler( "RspnUInt64ColUpdated", getRspnUInt64ColUpdated() );
			saxDoc.addElementHandler( "RspnUInt64ColDeleted", getRspnUInt64ColDeleted() );

			// UInt64Def Response s

			saxDoc.addElementHandler( "RspnUInt64DefCreated", getRspnUInt64DefCreated() );
			saxDoc.addElementHandler( "RspnUInt64DefReadSingle", getRspnUInt64DefReadSingle() );
			saxDoc.addElementHandler( "RspnUInt64DefReadList", getRspnUInt64DefReadList() );
			saxDoc.addElementHandler( "RspnUInt64DefLocked", getRspnUInt64DefLocked() );
			saxDoc.addElementHandler( "RspnUInt64DefUpdated", getRspnUInt64DefUpdated() );
			saxDoc.addElementHandler( "RspnUInt64DefDeleted", getRspnUInt64DefDeleted() );

			// UInt64Type Response s

			saxDoc.addElementHandler( "RspnUInt64TypeCreated", getRspnUInt64TypeCreated() );
			saxDoc.addElementHandler( "RspnUInt64TypeReadSingle", getRspnUInt64TypeReadSingle() );
			saxDoc.addElementHandler( "RspnUInt64TypeReadList", getRspnUInt64TypeReadList() );
			saxDoc.addElementHandler( "RspnUInt64TypeLocked", getRspnUInt64TypeLocked() );
			saxDoc.addElementHandler( "RspnUInt64TypeUpdated", getRspnUInt64TypeUpdated() );
			saxDoc.addElementHandler( "RspnUInt64TypeDeleted", getRspnUInt64TypeDeleted() );

			// URLProtocol Response s

			saxDoc.addElementHandler( "RspnURLProtocolCreated", getRspnURLProtocolCreated() );
			saxDoc.addElementHandler( "RspnURLProtocolReadSingle", getRspnURLProtocolReadSingle() );
			saxDoc.addElementHandler( "RspnURLProtocolReadList", getRspnURLProtocolReadList() );
			saxDoc.addElementHandler( "RspnURLProtocolLocked", getRspnURLProtocolLocked() );
			saxDoc.addElementHandler( "RspnURLProtocolUpdated", getRspnURLProtocolUpdated() );
			saxDoc.addElementHandler( "RspnURLProtocolDeleted", getRspnURLProtocolDeleted() );

			// UuidCol Response s

			saxDoc.addElementHandler( "RspnUuidColCreated", getRspnUuidColCreated() );
			saxDoc.addElementHandler( "RspnUuidColReadSingle", getRspnUuidColReadSingle() );
			saxDoc.addElementHandler( "RspnUuidColReadList", getRspnUuidColReadList() );
			saxDoc.addElementHandler( "RspnUuidColLocked", getRspnUuidColLocked() );
			saxDoc.addElementHandler( "RspnUuidColUpdated", getRspnUuidColUpdated() );
			saxDoc.addElementHandler( "RspnUuidColDeleted", getRspnUuidColDeleted() );

			// UuidDef Response s

			saxDoc.addElementHandler( "RspnUuidDefCreated", getRspnUuidDefCreated() );
			saxDoc.addElementHandler( "RspnUuidDefReadSingle", getRspnUuidDefReadSingle() );
			saxDoc.addElementHandler( "RspnUuidDefReadList", getRspnUuidDefReadList() );
			saxDoc.addElementHandler( "RspnUuidDefLocked", getRspnUuidDefLocked() );
			saxDoc.addElementHandler( "RspnUuidDefUpdated", getRspnUuidDefUpdated() );
			saxDoc.addElementHandler( "RspnUuidDefDeleted", getRspnUuidDefDeleted() );

			// UuidGen Response s

			saxDoc.addElementHandler( "RspnUuidGenCreated", getRspnUuidGenCreated() );
			saxDoc.addElementHandler( "RspnUuidGenReadSingle", getRspnUuidGenReadSingle() );
			saxDoc.addElementHandler( "RspnUuidGenReadList", getRspnUuidGenReadList() );
			saxDoc.addElementHandler( "RspnUuidGenLocked", getRspnUuidGenLocked() );
			saxDoc.addElementHandler( "RspnUuidGenUpdated", getRspnUuidGenUpdated() );
			saxDoc.addElementHandler( "RspnUuidGenDeleted", getRspnUuidGenDeleted() );

			// UuidType Response s

			saxDoc.addElementHandler( "RspnUuidTypeCreated", getRspnUuidTypeCreated() );
			saxDoc.addElementHandler( "RspnUuidTypeReadSingle", getRspnUuidTypeReadSingle() );
			saxDoc.addElementHandler( "RspnUuidTypeReadList", getRspnUuidTypeReadList() );
			saxDoc.addElementHandler( "RspnUuidTypeLocked", getRspnUuidTypeLocked() );
			saxDoc.addElementHandler( "RspnUuidTypeUpdated", getRspnUuidTypeUpdated() );
			saxDoc.addElementHandler( "RspnUuidTypeDeleted", getRspnUuidTypeDeleted() );

			// Value Response s

			saxDoc.addElementHandler( "RspnValueCreated", getRspnValueCreated() );
			saxDoc.addElementHandler( "RspnValueReadSingle", getRspnValueReadSingle() );
			saxDoc.addElementHandler( "RspnValueReadList", getRspnValueReadList() );
			saxDoc.addElementHandler( "RspnValueLocked", getRspnValueLocked() );
			saxDoc.addElementHandler( "RspnValueUpdated", getRspnValueUpdated() );
			saxDoc.addElementHandler( "RspnValueDeleted", getRspnValueDeleted() );

		}
		return( saxDoc );
	}

	// Document Element 

	/*
	 *	CFBamSaxRspnDoc XML SAX Doc Element  implementation
	 */
	public class CFBamSaxRspnDoc
		extends CFLibXmlCoreElementHandler
	{
		public CFBamSaxRspnDoc( CFBamXMsgRspn xmsgRspn ) {
			super( xmsgRspn );
		}

		public void startElement(
			String		uri,
			String		localName,
			String		qName,
			Attributes	attrs )
		throws SAXException
		{
		}

		public void endElement(
			String		uri,
			String		localName,
			String		qName )
		throws SAXException
		{
		}
	}

	// Parse an XML string's contents

	public void parseStringContents( String str ) {
		deleted = false;
		exceptionRaised = null;
		lastObjectProcessed = null;
		sortedListOfObjects = null;
		logContent = null;
		dataChanged = false;
		super.parseStringContents( str );
	}

	// Parse a file

	public void parse( String url ) {
		deleted = false;
		exceptionRaised = null;
		lastObjectProcessed = null;
		sortedListOfObjects = null;
		logContent = null;
		dataChanged = false;
		super.parse( url );
	}

	public void parseFile( String url ) {
		deleted = false;
		exceptionRaised = null;
		lastObjectProcessed = null;
		sortedListOfObjects = null;
		logContent = null;
		dataChanged = false;
		super.parse( url );
	}
}
