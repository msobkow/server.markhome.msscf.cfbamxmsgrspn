
// Description: Java 11 XML Message SAX Response Record Element  for SchemaDef

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamXMsgRspn;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.xml.sax.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfbam.CFBam.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBamObj.*;

/*
 *	CFBamXMsgRspnSchemaDefCreated XML SAX Element  implementation
 *	for SchemaDef.
 */
public class CFBamXMsgRspnSchemaDefCreated
	extends CFLibXmlCoreElementHandler
{
	public CFBamXMsgRspnSchemaDefCreated( CFBamXMsgRspn xmsgRspn ) {
		super( xmsgRspn );
	}

	public void startElement(
		String		uri,
		String		localName,
		String		qName,
		Attributes	attrs )
	throws SAXException
	{
		try {
			// Common XML Attributes
			String	attrId = null;
			String	attrRevision = null;
			// Scope Attributes
			String	attrTenantId = null;
			String attrCreatedAt = null;
			String attrCreatedBy = null;
			String attrUpdatedAt = null;
			String attrUpdatedBy = null;
			// SchemaDef Attributes
			String	attrMinorVersionId = null;
			String	attrName = null;
			String	attrDbName = null;
			String	attrShortName = null;
			String	attrLabel = null;
			String	attrShortDescription = null;
			String	attrDescription = null;
			String	attrPublicLicenseName = null;
			String	attrPublicLicenseText = null;
			String	attrImplementationLicenseName = null;
			String	attrImplementationLicenseText = null;
			String	attrCopyrightPeriod = null;
			String	attrCopyrightHolder = null;
			String	attrAuthorEMail = null;
			String	attrProjectURL = null;
			String	attrPublishURI = null;
			String	attrJSchemaObjImport = null;
			String	attrJSchemaObjInterface = null;
			String	attrJSchemaObjMembers = null;
			String	attrJSchemaObjImplementation = null;
			String	attrJDb2LUWSchemaObjMembers = null;
			String	attrJDb2LUWSchemaObjImpl = null;
			String	attrJDb2LUWSchemaObjImport = null;
			String	attrJMSSqlSchemaObjMembers = null;
			String	attrJMSSqlSchemaObjImpl = null;
			String	attrJMSSqlSchemaObjImport = null;
			String	attrJMySqlSchemaObjMembers = null;
			String	attrJMySqlSchemaObjImpl = null;
			String	attrJMySqlSchemaObjImport = null;
			String	attrJOracleSchemaObjMembers = null;
			String	attrJOracleSchemaObjImpl = null;
			String	attrJOracleSchemaObjImport = null;
			String	attrJPgSqlSchemaObjMembers = null;
			String	attrJPgSqlSchemaObjImpl = null;
			String	attrJPgSqlSchemaObjImport = null;
			String	attrJRamSchemaObjMembers = null;
			String	attrJRamSchemaObjImpl = null;
			String	attrJRamSchemaObjImport = null;
			String	attrJXMsgSchemaImport = null;
			String	attrJXMsgSchemaFormatters = null;
			String	attrJXMsgClientSchemaImport = null;
			String	attrJXMsgClientSchemaBody = null;
			String	attrJXMsgRqstSchemaBody = null;
			String	attrJXMsgRqstSchemaImport = null;
			String	attrJXMsgRqstSchemaWireParsers = null;
			String	attrJXMsgRqstSchemaXsdSpec = null;
			String	attrJXMsgRqstSchemaXsdElementList = null;
			String	attrJXMsgRspnSchemaBody = null;
			String	attrJXMsgRspnSchemaImport = null;
			String	attrJXMsgRspnSchemaWireParsers = null;
			String	attrJXMsgRspnSchemaXsdElementList = null;
			String	attrJXMsgRspnSchemaXsdSpec = null;
			String	attrCppSchemaObjInclude = null;
			String	attrCppSchemaObjInterface = null;
			String	attrCppSchemaObjMembers = null;
			String	attrCppSchemaObjImplementation = null;
			String	attrCppDb2LUWSchemaObjMembers = null;
			String	attrCppDb2LUWSchemaObjImpl = null;
			String	attrCppDb2LUWSchemaObjInclude = null;
			String	attrCppMSSqlSchemaObjMembers = null;
			String	attrCppMSSqlSchemaObjImpl = null;
			String	attrCppMSSqlSchemaObjInclude = null;
			String	attrCppMySqlSchemaObjMembers = null;
			String	attrCppMySqlSchemaObjImpl = null;
			String	attrCppMySqlSchemaObjInclude = null;
			String	attrCppOracleSchemaObjMembers = null;
			String	attrCppOracleSchemaObjImpl = null;
			String	attrCppOracleSchemaObjInclude = null;
			String	attrCppPgSqlSchemaObjMembers = null;
			String	attrCppPgSqlSchemaObjImpl = null;
			String	attrCppPgSqlSchemaObjInclude = null;
			String	attrCppRamSchemaObjMembers = null;
			String	attrCppRamSchemaObjImpl = null;
			String	attrCppRamSchemaObjInclude = null;
			String	attrCppXMsgSchemaInclude = null;
			String	attrCppXMsgSchemaFormatters = null;
			String	attrCppXMsgClientSchemaInclude = null;
			String	attrCppXMsgClientSchemaBody = null;
			String	attrCppXMsgRqstSchemaBody = null;
			String	attrCppXMsgRqstSchemaInclude = null;
			String	attrCppXMsgRqstSchemaWireParsers = null;
			String	attrCppXMsgRqstSchemaXsdSpec = null;
			String	attrCppXMsgRqstSchemaXsdElementList = null;
			String	attrCppXMsgRspnSchemaBody = null;
			String	attrCppXMsgRspnSchemaInclude = null;
			String	attrCppXMsgRspnSchemaWireParsers = null;
			String	attrCppXMsgRspnSchemaXsdElementList = null;
			String	attrCppXMsgRspnSchemaXsdSpec = null;
			String	attrHppSchemaObjInclude = null;
			String	attrHppSchemaObjInterface = null;
			String	attrHppSchemaObjMembers = null;
			String	attrHppSchemaObjImplementation = null;
			String	attrHppDb2LUWSchemaObjMembers = null;
			String	attrHppDb2LUWSchemaObjImpl = null;
			String	attrHppDb2LUWSchemaObjInclude = null;
			String	attrHppMSSqlSchemaObjMembers = null;
			String	attrHppMSSqlSchemaObjImpl = null;
			String	attrHppMSSqlSchemaObjInclude = null;
			String	attrHppMySqlSchemaObjMembers = null;
			String	attrHppMySqlSchemaObjImpl = null;
			String	attrHppMySqlSchemaObjInclude = null;
			String	attrHppOracleSchemaObjMembers = null;
			String	attrHppOracleSchemaObjImpl = null;
			String	attrHppOracleSchemaObjInclude = null;
			String	attrHppPgSqlSchemaObjMembers = null;
			String	attrHppPgSqlSchemaObjImpl = null;
			String	attrHppPgSqlSchemaObjInclude = null;
			String	attrHppRamSchemaObjMembers = null;
			String	attrHppRamSchemaObjImpl = null;
			String	attrHppRamSchemaObjInclude = null;
			String	attrHppXMsgSchemaInclude = null;
			String	attrHppXMsgSchemaFormatters = null;
			String	attrHppXMsgClientSchemaInclude = null;
			String	attrHppXMsgClientSchemaBody = null;
			String	attrHppXMsgRqstSchemaBody = null;
			String	attrHppXMsgRqstSchemaInclude = null;
			String	attrHppXMsgRqstSchemaWireParsers = null;
			String	attrHppXMsgRqstSchemaXsdSpec = null;
			String	attrHppXMsgRqstSchemaXsdElementList = null;
			String	attrHppXMsgRspnSchemaBody = null;
			String	attrHppXMsgRspnSchemaInclude = null;
			String	attrHppXMsgRspnSchemaWireParsers = null;
			String	attrHppXMsgRspnSchemaXsdElementList = null;
			String	attrHppXMsgRspnSchemaXsdSpec = null;
			String	attrCsSchemaObjUsing = null;
			String	attrCsSchemaObjInterface = null;
			String	attrCsSchemaObjMembers = null;
			String	attrCsSchemaObjImplementation = null;
			String	attrCsDb2LUWSchemaObjMembers = null;
			String	attrCsDb2LUWSchemaObjImpl = null;
			String	attrCsDb2LUWSchemaObjUsing = null;
			String	attrCsMSSqlSchemaObjMembers = null;
			String	attrCsMSSqlSchemaObjImpl = null;
			String	attrCsMSSqlSchemaObjUsing = null;
			String	attrCsMySqlSchemaObjMembers = null;
			String	attrCsMySqlSchemaObjImpl = null;
			String	attrCsMySqlSchemaObjUsing = null;
			String	attrCsOracleSchemaObjMembers = null;
			String	attrCsOracleSchemaObjImpl = null;
			String	attrCsOracleSchemaObjUsing = null;
			String	attrCsPgSqlSchemaObjMembers = null;
			String	attrCsPgSqlSchemaObjImpl = null;
			String	attrCsPgSqlSchemaObjUsing = null;
			String	attrCsRamSchemaObjMembers = null;
			String	attrCsRamSchemaObjImpl = null;
			String	attrCsRamSchemaObjUsing = null;
			String	attrCsXMsgSchemaUsing = null;
			String	attrCsXMsgSchemaFormatters = null;
			String	attrCsXMsgClientSchemaUsing = null;
			String	attrCsXMsgClientSchemaBody = null;
			String	attrCsXMsgRqstSchemaBody = null;
			String	attrCsXMsgRqstSchemaUsing = null;
			String	attrCsXMsgRqstSchemaWireParsers = null;
			String	attrCsXMsgRqstSchemaXsdSpec = null;
			String	attrCsXMsgRqstSchemaXsdElementList = null;
			String	attrCsXMsgRspnSchemaBody = null;
			String	attrCsXMsgRspnSchemaUsing = null;
			String	attrCsXMsgRspnSchemaWireParsers = null;
			String	attrCsXMsgRspnSchemaXsdElementList = null;
			String	attrCsXMsgRspnSchemaXsdSpec = null;
			// Attribute Extraction
			String	attrLocalName;
			int		numAttrs;
			int		idxAttr;
			final String S_ProcName = "startElement";
			final String S_LocalName = "LocalName";

			assert qName.equals( "RspnSchemaDefCreated" );

			CFBamXMsgRspn xmsgRspn = (CFBamXMsgRspn)getParser();
			if( xmsgRspn == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"getParser()" );
			}

			ICFBamSchemaObj schemaObj = xmsgRspn.getSchemaObj();
			if( schemaObj == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"getParser().getSchemaObj()" );
			}

			// Extract Attributes
			numAttrs = attrs.getLength();
			for( idxAttr = 0; idxAttr < numAttrs; idxAttr++ ) {
				attrLocalName = attrs.getLocalName( idxAttr );
				if( attrLocalName.equals( "Id" ) ) {
					if( attrId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "Revision" ) ) {
					if( attrRevision != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrRevision = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CreatedAt" ) ) {
					if( attrCreatedAt != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCreatedAt = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CreatedBy" ) ) {
					if( attrCreatedBy != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCreatedBy = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "UpdatedAt" ) ) {
					if( attrUpdatedAt != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrUpdatedAt = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "UpdatedBy" ) ) {
					if( attrUpdatedBy != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrUpdatedBy = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "TenantId" ) ) {
					if( attrTenantId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrTenantId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "MinorVersionId" ) ) {
					if( attrMinorVersionId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrMinorVersionId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "Name" ) ) {
					if( attrName != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrName = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "DbName" ) ) {
					if( attrDbName != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrDbName = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "ShortName" ) ) {
					if( attrShortName != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrShortName = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "Label" ) ) {
					if( attrLabel != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrLabel = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "ShortDescription" ) ) {
					if( attrShortDescription != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrShortDescription = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "Description" ) ) {
					if( attrDescription != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrDescription = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "PublicLicenseName" ) ) {
					if( attrPublicLicenseName != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrPublicLicenseName = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "PublicLicenseText" ) ) {
					if( attrPublicLicenseText != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrPublicLicenseText = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "ImplementationLicenseName" ) ) {
					if( attrImplementationLicenseName != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrImplementationLicenseName = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "ImplementationLicenseText" ) ) {
					if( attrImplementationLicenseText != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrImplementationLicenseText = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CopyrightPeriod" ) ) {
					if( attrCopyrightPeriod != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCopyrightPeriod = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CopyrightHolder" ) ) {
					if( attrCopyrightHolder != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCopyrightHolder = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "AuthorEMail" ) ) {
					if( attrAuthorEMail != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrAuthorEMail = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "ProjectURL" ) ) {
					if( attrProjectURL != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrProjectURL = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "PublishURI" ) ) {
					if( attrPublishURI != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrPublishURI = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JSchemaObjImport" ) ) {
					if( attrJSchemaObjImport != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJSchemaObjImport = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JSchemaObjInterface" ) ) {
					if( attrJSchemaObjInterface != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJSchemaObjInterface = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JSchemaObjMembers" ) ) {
					if( attrJSchemaObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJSchemaObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JSchemaObjImplementation" ) ) {
					if( attrJSchemaObjImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJSchemaObjImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JDb2LUWSchemaObjMembers" ) ) {
					if( attrJDb2LUWSchemaObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJDb2LUWSchemaObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JDb2LUWSchemaObjImpl" ) ) {
					if( attrJDb2LUWSchemaObjImpl != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJDb2LUWSchemaObjImpl = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JDb2LUWSchemaObjImport" ) ) {
					if( attrJDb2LUWSchemaObjImport != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJDb2LUWSchemaObjImport = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JMSSqlSchemaObjMembers" ) ) {
					if( attrJMSSqlSchemaObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJMSSqlSchemaObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JMSSqlSchemaObjImpl" ) ) {
					if( attrJMSSqlSchemaObjImpl != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJMSSqlSchemaObjImpl = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JMSSqlSchemaObjImport" ) ) {
					if( attrJMSSqlSchemaObjImport != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJMSSqlSchemaObjImport = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JMySqlSchemaObjMembers" ) ) {
					if( attrJMySqlSchemaObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJMySqlSchemaObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JMySqlSchemaObjImpl" ) ) {
					if( attrJMySqlSchemaObjImpl != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJMySqlSchemaObjImpl = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JMySqlSchemaObjImport" ) ) {
					if( attrJMySqlSchemaObjImport != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJMySqlSchemaObjImport = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JOracleSchemaObjMembers" ) ) {
					if( attrJOracleSchemaObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJOracleSchemaObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JOracleSchemaObjImpl" ) ) {
					if( attrJOracleSchemaObjImpl != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJOracleSchemaObjImpl = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JOracleSchemaObjImport" ) ) {
					if( attrJOracleSchemaObjImport != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJOracleSchemaObjImport = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JPgSqlSchemaObjMembers" ) ) {
					if( attrJPgSqlSchemaObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJPgSqlSchemaObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JPgSqlSchemaObjImpl" ) ) {
					if( attrJPgSqlSchemaObjImpl != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJPgSqlSchemaObjImpl = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JPgSqlSchemaObjImport" ) ) {
					if( attrJPgSqlSchemaObjImport != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJPgSqlSchemaObjImport = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JRamSchemaObjMembers" ) ) {
					if( attrJRamSchemaObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJRamSchemaObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JRamSchemaObjImpl" ) ) {
					if( attrJRamSchemaObjImpl != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJRamSchemaObjImpl = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JRamSchemaObjImport" ) ) {
					if( attrJRamSchemaObjImport != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJRamSchemaObjImport = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JXMsgSchemaImport" ) ) {
					if( attrJXMsgSchemaImport != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJXMsgSchemaImport = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JXMsgSchemaFormatters" ) ) {
					if( attrJXMsgSchemaFormatters != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJXMsgSchemaFormatters = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JXMsgClientSchemaImport" ) ) {
					if( attrJXMsgClientSchemaImport != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJXMsgClientSchemaImport = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JXMsgClientSchemaBody" ) ) {
					if( attrJXMsgClientSchemaBody != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJXMsgClientSchemaBody = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JXMsgRqstSchemaBody" ) ) {
					if( attrJXMsgRqstSchemaBody != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJXMsgRqstSchemaBody = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JXMsgRqstSchemaImport" ) ) {
					if( attrJXMsgRqstSchemaImport != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJXMsgRqstSchemaImport = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JXMsgRqstSchemaWireParsers" ) ) {
					if( attrJXMsgRqstSchemaWireParsers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJXMsgRqstSchemaWireParsers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JXMsgRqstSchemaXsdSpec" ) ) {
					if( attrJXMsgRqstSchemaXsdSpec != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJXMsgRqstSchemaXsdSpec = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JXMsgRqstSchemaXsdElementList" ) ) {
					if( attrJXMsgRqstSchemaXsdElementList != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJXMsgRqstSchemaXsdElementList = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JXMsgRspnSchemaBody" ) ) {
					if( attrJXMsgRspnSchemaBody != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJXMsgRspnSchemaBody = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JXMsgRspnSchemaImport" ) ) {
					if( attrJXMsgRspnSchemaImport != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJXMsgRspnSchemaImport = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JXMsgRspnSchemaWireParsers" ) ) {
					if( attrJXMsgRspnSchemaWireParsers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJXMsgRspnSchemaWireParsers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JXMsgRspnSchemaXsdElementList" ) ) {
					if( attrJXMsgRspnSchemaXsdElementList != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJXMsgRspnSchemaXsdElementList = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JXMsgRspnSchemaXsdSpec" ) ) {
					if( attrJXMsgRspnSchemaXsdSpec != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJXMsgRspnSchemaXsdSpec = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppSchemaObjInclude" ) ) {
					if( attrCppSchemaObjInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppSchemaObjInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppSchemaObjInterface" ) ) {
					if( attrCppSchemaObjInterface != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppSchemaObjInterface = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppSchemaObjMembers" ) ) {
					if( attrCppSchemaObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppSchemaObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppSchemaObjImplementation" ) ) {
					if( attrCppSchemaObjImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppSchemaObjImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppDb2LUWSchemaObjMembers" ) ) {
					if( attrCppDb2LUWSchemaObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppDb2LUWSchemaObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppDb2LUWSchemaObjImpl" ) ) {
					if( attrCppDb2LUWSchemaObjImpl != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppDb2LUWSchemaObjImpl = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppDb2LUWSchemaObjInclude" ) ) {
					if( attrCppDb2LUWSchemaObjInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppDb2LUWSchemaObjInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppMSSqlSchemaObjMembers" ) ) {
					if( attrCppMSSqlSchemaObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppMSSqlSchemaObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppMSSqlSchemaObjImpl" ) ) {
					if( attrCppMSSqlSchemaObjImpl != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppMSSqlSchemaObjImpl = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppMSSqlSchemaObjInclude" ) ) {
					if( attrCppMSSqlSchemaObjInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppMSSqlSchemaObjInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppMySqlSchemaObjMembers" ) ) {
					if( attrCppMySqlSchemaObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppMySqlSchemaObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppMySqlSchemaObjImpl" ) ) {
					if( attrCppMySqlSchemaObjImpl != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppMySqlSchemaObjImpl = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppMySqlSchemaObjInclude" ) ) {
					if( attrCppMySqlSchemaObjInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppMySqlSchemaObjInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppOracleSchemaObjMembers" ) ) {
					if( attrCppOracleSchemaObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppOracleSchemaObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppOracleSchemaObjImpl" ) ) {
					if( attrCppOracleSchemaObjImpl != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppOracleSchemaObjImpl = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppOracleSchemaObjInclude" ) ) {
					if( attrCppOracleSchemaObjInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppOracleSchemaObjInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppPgSqlSchemaObjMembers" ) ) {
					if( attrCppPgSqlSchemaObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppPgSqlSchemaObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppPgSqlSchemaObjImpl" ) ) {
					if( attrCppPgSqlSchemaObjImpl != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppPgSqlSchemaObjImpl = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppPgSqlSchemaObjInclude" ) ) {
					if( attrCppPgSqlSchemaObjInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppPgSqlSchemaObjInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppRamSchemaObjMembers" ) ) {
					if( attrCppRamSchemaObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppRamSchemaObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppRamSchemaObjImpl" ) ) {
					if( attrCppRamSchemaObjImpl != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppRamSchemaObjImpl = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppRamSchemaObjInclude" ) ) {
					if( attrCppRamSchemaObjInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppRamSchemaObjInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppXMsgSchemaInclude" ) ) {
					if( attrCppXMsgSchemaInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppXMsgSchemaInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppXMsgSchemaFormatters" ) ) {
					if( attrCppXMsgSchemaFormatters != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppXMsgSchemaFormatters = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppXMsgClientSchemaInclude" ) ) {
					if( attrCppXMsgClientSchemaInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppXMsgClientSchemaInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppXMsgClientSchemaBody" ) ) {
					if( attrCppXMsgClientSchemaBody != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppXMsgClientSchemaBody = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppXMsgRqstSchemaBody" ) ) {
					if( attrCppXMsgRqstSchemaBody != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppXMsgRqstSchemaBody = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppXMsgRqstSchemaInclude" ) ) {
					if( attrCppXMsgRqstSchemaInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppXMsgRqstSchemaInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppXMsgRqstSchemaWireParsers" ) ) {
					if( attrCppXMsgRqstSchemaWireParsers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppXMsgRqstSchemaWireParsers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppXMsgRqstSchemaXsdSpec" ) ) {
					if( attrCppXMsgRqstSchemaXsdSpec != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppXMsgRqstSchemaXsdSpec = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppXMsgRqstSchemaXsdElementList" ) ) {
					if( attrCppXMsgRqstSchemaXsdElementList != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppXMsgRqstSchemaXsdElementList = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppXMsgRspnSchemaBody" ) ) {
					if( attrCppXMsgRspnSchemaBody != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppXMsgRspnSchemaBody = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppXMsgRspnSchemaInclude" ) ) {
					if( attrCppXMsgRspnSchemaInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppXMsgRspnSchemaInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppXMsgRspnSchemaWireParsers" ) ) {
					if( attrCppXMsgRspnSchemaWireParsers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppXMsgRspnSchemaWireParsers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppXMsgRspnSchemaXsdElementList" ) ) {
					if( attrCppXMsgRspnSchemaXsdElementList != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppXMsgRspnSchemaXsdElementList = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppXMsgRspnSchemaXsdSpec" ) ) {
					if( attrCppXMsgRspnSchemaXsdSpec != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppXMsgRspnSchemaXsdSpec = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppSchemaObjInclude" ) ) {
					if( attrHppSchemaObjInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppSchemaObjInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppSchemaObjInterface" ) ) {
					if( attrHppSchemaObjInterface != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppSchemaObjInterface = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppSchemaObjMembers" ) ) {
					if( attrHppSchemaObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppSchemaObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppSchemaObjImplementation" ) ) {
					if( attrHppSchemaObjImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppSchemaObjImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppDb2LUWSchemaObjMembers" ) ) {
					if( attrHppDb2LUWSchemaObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppDb2LUWSchemaObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppDb2LUWSchemaObjImpl" ) ) {
					if( attrHppDb2LUWSchemaObjImpl != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppDb2LUWSchemaObjImpl = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppDb2LUWSchemaObjInclude" ) ) {
					if( attrHppDb2LUWSchemaObjInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppDb2LUWSchemaObjInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppMSSqlSchemaObjMembers" ) ) {
					if( attrHppMSSqlSchemaObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppMSSqlSchemaObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppMSSqlSchemaObjImpl" ) ) {
					if( attrHppMSSqlSchemaObjImpl != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppMSSqlSchemaObjImpl = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppMSSqlSchemaObjInclude" ) ) {
					if( attrHppMSSqlSchemaObjInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppMSSqlSchemaObjInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppMySqlSchemaObjMembers" ) ) {
					if( attrHppMySqlSchemaObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppMySqlSchemaObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppMySqlSchemaObjImpl" ) ) {
					if( attrHppMySqlSchemaObjImpl != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppMySqlSchemaObjImpl = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppMySqlSchemaObjInclude" ) ) {
					if( attrHppMySqlSchemaObjInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppMySqlSchemaObjInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppOracleSchemaObjMembers" ) ) {
					if( attrHppOracleSchemaObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppOracleSchemaObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppOracleSchemaObjImpl" ) ) {
					if( attrHppOracleSchemaObjImpl != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppOracleSchemaObjImpl = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppOracleSchemaObjInclude" ) ) {
					if( attrHppOracleSchemaObjInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppOracleSchemaObjInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppPgSqlSchemaObjMembers" ) ) {
					if( attrHppPgSqlSchemaObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppPgSqlSchemaObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppPgSqlSchemaObjImpl" ) ) {
					if( attrHppPgSqlSchemaObjImpl != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppPgSqlSchemaObjImpl = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppPgSqlSchemaObjInclude" ) ) {
					if( attrHppPgSqlSchemaObjInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppPgSqlSchemaObjInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppRamSchemaObjMembers" ) ) {
					if( attrHppRamSchemaObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppRamSchemaObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppRamSchemaObjImpl" ) ) {
					if( attrHppRamSchemaObjImpl != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppRamSchemaObjImpl = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppRamSchemaObjInclude" ) ) {
					if( attrHppRamSchemaObjInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppRamSchemaObjInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppXMsgSchemaInclude" ) ) {
					if( attrHppXMsgSchemaInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppXMsgSchemaInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppXMsgSchemaFormatters" ) ) {
					if( attrHppXMsgSchemaFormatters != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppXMsgSchemaFormatters = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppXMsgClientSchemaInclude" ) ) {
					if( attrHppXMsgClientSchemaInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppXMsgClientSchemaInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppXMsgClientSchemaBody" ) ) {
					if( attrHppXMsgClientSchemaBody != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppXMsgClientSchemaBody = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppXMsgRqstSchemaBody" ) ) {
					if( attrHppXMsgRqstSchemaBody != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppXMsgRqstSchemaBody = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppXMsgRqstSchemaInclude" ) ) {
					if( attrHppXMsgRqstSchemaInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppXMsgRqstSchemaInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppXMsgRqstSchemaWireParsers" ) ) {
					if( attrHppXMsgRqstSchemaWireParsers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppXMsgRqstSchemaWireParsers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppXMsgRqstSchemaXsdSpec" ) ) {
					if( attrHppXMsgRqstSchemaXsdSpec != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppXMsgRqstSchemaXsdSpec = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppXMsgRqstSchemaXsdElementList" ) ) {
					if( attrHppXMsgRqstSchemaXsdElementList != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppXMsgRqstSchemaXsdElementList = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppXMsgRspnSchemaBody" ) ) {
					if( attrHppXMsgRspnSchemaBody != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppXMsgRspnSchemaBody = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppXMsgRspnSchemaInclude" ) ) {
					if( attrHppXMsgRspnSchemaInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppXMsgRspnSchemaInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppXMsgRspnSchemaWireParsers" ) ) {
					if( attrHppXMsgRspnSchemaWireParsers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppXMsgRspnSchemaWireParsers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppXMsgRspnSchemaXsdElementList" ) ) {
					if( attrHppXMsgRspnSchemaXsdElementList != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppXMsgRspnSchemaXsdElementList = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppXMsgRspnSchemaXsdSpec" ) ) {
					if( attrHppXMsgRspnSchemaXsdSpec != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppXMsgRspnSchemaXsdSpec = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsSchemaObjUsing" ) ) {
					if( attrCsSchemaObjUsing != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsSchemaObjUsing = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsSchemaObjInterface" ) ) {
					if( attrCsSchemaObjInterface != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsSchemaObjInterface = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsSchemaObjMembers" ) ) {
					if( attrCsSchemaObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsSchemaObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsSchemaObjImplementation" ) ) {
					if( attrCsSchemaObjImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsSchemaObjImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsDb2LUWSchemaObjMembers" ) ) {
					if( attrCsDb2LUWSchemaObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsDb2LUWSchemaObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsDb2LUWSchemaObjImpl" ) ) {
					if( attrCsDb2LUWSchemaObjImpl != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsDb2LUWSchemaObjImpl = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsDb2LUWSchemaObjUsing" ) ) {
					if( attrCsDb2LUWSchemaObjUsing != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsDb2LUWSchemaObjUsing = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsMSSqlSchemaObjMembers" ) ) {
					if( attrCsMSSqlSchemaObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsMSSqlSchemaObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsMSSqlSchemaObjImpl" ) ) {
					if( attrCsMSSqlSchemaObjImpl != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsMSSqlSchemaObjImpl = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsMSSqlSchemaObjUsing" ) ) {
					if( attrCsMSSqlSchemaObjUsing != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsMSSqlSchemaObjUsing = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsMySqlSchemaObjMembers" ) ) {
					if( attrCsMySqlSchemaObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsMySqlSchemaObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsMySqlSchemaObjImpl" ) ) {
					if( attrCsMySqlSchemaObjImpl != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsMySqlSchemaObjImpl = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsMySqlSchemaObjUsing" ) ) {
					if( attrCsMySqlSchemaObjUsing != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsMySqlSchemaObjUsing = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsOracleSchemaObjMembers" ) ) {
					if( attrCsOracleSchemaObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsOracleSchemaObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsOracleSchemaObjImpl" ) ) {
					if( attrCsOracleSchemaObjImpl != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsOracleSchemaObjImpl = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsOracleSchemaObjUsing" ) ) {
					if( attrCsOracleSchemaObjUsing != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsOracleSchemaObjUsing = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsPgSqlSchemaObjMembers" ) ) {
					if( attrCsPgSqlSchemaObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsPgSqlSchemaObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsPgSqlSchemaObjImpl" ) ) {
					if( attrCsPgSqlSchemaObjImpl != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsPgSqlSchemaObjImpl = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsPgSqlSchemaObjUsing" ) ) {
					if( attrCsPgSqlSchemaObjUsing != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsPgSqlSchemaObjUsing = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsRamSchemaObjMembers" ) ) {
					if( attrCsRamSchemaObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsRamSchemaObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsRamSchemaObjImpl" ) ) {
					if( attrCsRamSchemaObjImpl != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsRamSchemaObjImpl = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsRamSchemaObjUsing" ) ) {
					if( attrCsRamSchemaObjUsing != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsRamSchemaObjUsing = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsXMsgSchemaUsing" ) ) {
					if( attrCsXMsgSchemaUsing != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsXMsgSchemaUsing = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsXMsgSchemaFormatters" ) ) {
					if( attrCsXMsgSchemaFormatters != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsXMsgSchemaFormatters = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsXMsgClientSchemaUsing" ) ) {
					if( attrCsXMsgClientSchemaUsing != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsXMsgClientSchemaUsing = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsXMsgClientSchemaBody" ) ) {
					if( attrCsXMsgClientSchemaBody != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsXMsgClientSchemaBody = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsXMsgRqstSchemaBody" ) ) {
					if( attrCsXMsgRqstSchemaBody != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsXMsgRqstSchemaBody = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsXMsgRqstSchemaUsing" ) ) {
					if( attrCsXMsgRqstSchemaUsing != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsXMsgRqstSchemaUsing = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsXMsgRqstSchemaWireParsers" ) ) {
					if( attrCsXMsgRqstSchemaWireParsers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsXMsgRqstSchemaWireParsers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsXMsgRqstSchemaXsdSpec" ) ) {
					if( attrCsXMsgRqstSchemaXsdSpec != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsXMsgRqstSchemaXsdSpec = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsXMsgRqstSchemaXsdElementList" ) ) {
					if( attrCsXMsgRqstSchemaXsdElementList != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsXMsgRqstSchemaXsdElementList = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsXMsgRspnSchemaBody" ) ) {
					if( attrCsXMsgRspnSchemaBody != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsXMsgRspnSchemaBody = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsXMsgRspnSchemaUsing" ) ) {
					if( attrCsXMsgRspnSchemaUsing != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsXMsgRspnSchemaUsing = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsXMsgRspnSchemaWireParsers" ) ) {
					if( attrCsXMsgRspnSchemaWireParsers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsXMsgRspnSchemaWireParsers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsXMsgRspnSchemaXsdElementList" ) ) {
					if( attrCsXMsgRspnSchemaXsdElementList != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsXMsgRspnSchemaXsdElementList = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsXMsgRspnSchemaXsdSpec" ) ) {
					if( attrCsXMsgRspnSchemaXsdSpec != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsXMsgRspnSchemaXsdSpec = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "schemaLocation" ) ) {
					// ignored
				}
				else {
					throw new CFLibUnrecognizedAttributeException( getClass(),
						S_ProcName,
						getParser().getLocationInfo(),
						attrLocalName );
				}
			}

			// Ensure that required attributes have values
			if( ( attrTenantId == null ) || ( attrTenantId.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"TenantId" );
			}
			if( ( attrId == null ) || ( attrId.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"Id" );
			}
			if( ( attrRevision == null ) || ( attrRevision.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"Revision" );
			}
			if( ( attrMinorVersionId == null ) || ( attrMinorVersionId.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"MinorVersionId" );
			}
			if( attrName == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"Name" );
			}
			if( attrPublicLicenseName == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"PublicLicenseName" );
			}
			if( attrPublicLicenseText == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"PublicLicenseText" );
			}
			if( attrCopyrightPeriod == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"CopyrightPeriod" );
			}
			if( attrCopyrightHolder == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"CopyrightHolder" );
			}
			if( attrAuthorEMail == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"AuthorEMail" );
			}
			if( attrProjectURL == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"ProjectURL" );
			}
			if( attrPublishURI == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"PublishURI" );
			}

			// Save named attributes to context
			CFLibXmlCoreContext curContext = getParser().getCurContext();

			// Convert string attributes to native Java types

			long natTenantId = Long.parseLong( attrTenantId );

			long natId = Long.parseLong( attrId );

			int natRevision = Integer.parseInt( attrRevision );
			UUID createdBy = null;
			if( attrCreatedBy != null ) {
				createdBy = UUID.fromString( attrCreatedBy );
			}
			Calendar createdAt = null;
			if( attrCreatedAt != null ) {
				createdAt = CFLibXmlUtil.parseTimestamp( attrCreatedAt );
			}
			UUID updatedBy = null;
			if( attrUpdatedBy != null ) {
				updatedBy = UUID.fromString( attrUpdatedBy );
			}
			Calendar updatedAt = null;
			if( attrUpdatedAt != null ) {
				updatedAt = CFLibXmlUtil.parseTimestamp( attrUpdatedAt );
			}
			long natMinorVersionId = Long.parseLong( attrMinorVersionId );

			String natName = attrName;

			String natDbName = attrDbName;

			String natShortName = attrShortName;

			String natLabel = attrLabel;

			String natShortDescription = attrShortDescription;

			String natDescription = attrDescription;

			String natPublicLicenseName = attrPublicLicenseName;

			String natPublicLicenseText = attrPublicLicenseText;

			String natImplementationLicenseName = attrImplementationLicenseName;

			String natImplementationLicenseText = attrImplementationLicenseText;

			String natCopyrightPeriod = attrCopyrightPeriod;

			String natCopyrightHolder = attrCopyrightHolder;

			String natAuthorEMail = attrAuthorEMail;

			String natProjectURL = attrProjectURL;

			String natPublishURI = attrPublishURI;

			String natJSchemaObjImport = attrJSchemaObjImport;

			String natJSchemaObjInterface = attrJSchemaObjInterface;

			String natJSchemaObjMembers = attrJSchemaObjMembers;

			String natJSchemaObjImplementation = attrJSchemaObjImplementation;

			String natJDb2LUWSchemaObjMembers = attrJDb2LUWSchemaObjMembers;

			String natJDb2LUWSchemaObjImpl = attrJDb2LUWSchemaObjImpl;

			String natJDb2LUWSchemaObjImport = attrJDb2LUWSchemaObjImport;

			String natJMSSqlSchemaObjMembers = attrJMSSqlSchemaObjMembers;

			String natJMSSqlSchemaObjImpl = attrJMSSqlSchemaObjImpl;

			String natJMSSqlSchemaObjImport = attrJMSSqlSchemaObjImport;

			String natJMySqlSchemaObjMembers = attrJMySqlSchemaObjMembers;

			String natJMySqlSchemaObjImpl = attrJMySqlSchemaObjImpl;

			String natJMySqlSchemaObjImport = attrJMySqlSchemaObjImport;

			String natJOracleSchemaObjMembers = attrJOracleSchemaObjMembers;

			String natJOracleSchemaObjImpl = attrJOracleSchemaObjImpl;

			String natJOracleSchemaObjImport = attrJOracleSchemaObjImport;

			String natJPgSqlSchemaObjMembers = attrJPgSqlSchemaObjMembers;

			String natJPgSqlSchemaObjImpl = attrJPgSqlSchemaObjImpl;

			String natJPgSqlSchemaObjImport = attrJPgSqlSchemaObjImport;

			String natJRamSchemaObjMembers = attrJRamSchemaObjMembers;

			String natJRamSchemaObjImpl = attrJRamSchemaObjImpl;

			String natJRamSchemaObjImport = attrJRamSchemaObjImport;

			String natJXMsgSchemaImport = attrJXMsgSchemaImport;

			String natJXMsgSchemaFormatters = attrJXMsgSchemaFormatters;

			String natJXMsgClientSchemaImport = attrJXMsgClientSchemaImport;

			String natJXMsgClientSchemaBody = attrJXMsgClientSchemaBody;

			String natJXMsgRqstSchemaBody = attrJXMsgRqstSchemaBody;

			String natJXMsgRqstSchemaImport = attrJXMsgRqstSchemaImport;

			String natJXMsgRqstSchemaWireParsers = attrJXMsgRqstSchemaWireParsers;

			String natJXMsgRqstSchemaXsdSpec = attrJXMsgRqstSchemaXsdSpec;

			String natJXMsgRqstSchemaXsdElementList = attrJXMsgRqstSchemaXsdElementList;

			String natJXMsgRspnSchemaBody = attrJXMsgRspnSchemaBody;

			String natJXMsgRspnSchemaImport = attrJXMsgRspnSchemaImport;

			String natJXMsgRspnSchemaWireParsers = attrJXMsgRspnSchemaWireParsers;

			String natJXMsgRspnSchemaXsdElementList = attrJXMsgRspnSchemaXsdElementList;

			String natJXMsgRspnSchemaXsdSpec = attrJXMsgRspnSchemaXsdSpec;

			String natCppSchemaObjInclude = attrCppSchemaObjInclude;

			String natCppSchemaObjInterface = attrCppSchemaObjInterface;

			String natCppSchemaObjMembers = attrCppSchemaObjMembers;

			String natCppSchemaObjImplementation = attrCppSchemaObjImplementation;

			String natCppDb2LUWSchemaObjMembers = attrCppDb2LUWSchemaObjMembers;

			String natCppDb2LUWSchemaObjImpl = attrCppDb2LUWSchemaObjImpl;

			String natCppDb2LUWSchemaObjInclude = attrCppDb2LUWSchemaObjInclude;

			String natCppMSSqlSchemaObjMembers = attrCppMSSqlSchemaObjMembers;

			String natCppMSSqlSchemaObjImpl = attrCppMSSqlSchemaObjImpl;

			String natCppMSSqlSchemaObjInclude = attrCppMSSqlSchemaObjInclude;

			String natCppMySqlSchemaObjMembers = attrCppMySqlSchemaObjMembers;

			String natCppMySqlSchemaObjImpl = attrCppMySqlSchemaObjImpl;

			String natCppMySqlSchemaObjInclude = attrCppMySqlSchemaObjInclude;

			String natCppOracleSchemaObjMembers = attrCppOracleSchemaObjMembers;

			String natCppOracleSchemaObjImpl = attrCppOracleSchemaObjImpl;

			String natCppOracleSchemaObjInclude = attrCppOracleSchemaObjInclude;

			String natCppPgSqlSchemaObjMembers = attrCppPgSqlSchemaObjMembers;

			String natCppPgSqlSchemaObjImpl = attrCppPgSqlSchemaObjImpl;

			String natCppPgSqlSchemaObjInclude = attrCppPgSqlSchemaObjInclude;

			String natCppRamSchemaObjMembers = attrCppRamSchemaObjMembers;

			String natCppRamSchemaObjImpl = attrCppRamSchemaObjImpl;

			String natCppRamSchemaObjInclude = attrCppRamSchemaObjInclude;

			String natCppXMsgSchemaInclude = attrCppXMsgSchemaInclude;

			String natCppXMsgSchemaFormatters = attrCppXMsgSchemaFormatters;

			String natCppXMsgClientSchemaInclude = attrCppXMsgClientSchemaInclude;

			String natCppXMsgClientSchemaBody = attrCppXMsgClientSchemaBody;

			String natCppXMsgRqstSchemaBody = attrCppXMsgRqstSchemaBody;

			String natCppXMsgRqstSchemaInclude = attrCppXMsgRqstSchemaInclude;

			String natCppXMsgRqstSchemaWireParsers = attrCppXMsgRqstSchemaWireParsers;

			String natCppXMsgRqstSchemaXsdSpec = attrCppXMsgRqstSchemaXsdSpec;

			String natCppXMsgRqstSchemaXsdElementList = attrCppXMsgRqstSchemaXsdElementList;

			String natCppXMsgRspnSchemaBody = attrCppXMsgRspnSchemaBody;

			String natCppXMsgRspnSchemaInclude = attrCppXMsgRspnSchemaInclude;

			String natCppXMsgRspnSchemaWireParsers = attrCppXMsgRspnSchemaWireParsers;

			String natCppXMsgRspnSchemaXsdElementList = attrCppXMsgRspnSchemaXsdElementList;

			String natCppXMsgRspnSchemaXsdSpec = attrCppXMsgRspnSchemaXsdSpec;

			String natHppSchemaObjInclude = attrHppSchemaObjInclude;

			String natHppSchemaObjInterface = attrHppSchemaObjInterface;

			String natHppSchemaObjMembers = attrHppSchemaObjMembers;

			String natHppSchemaObjImplementation = attrHppSchemaObjImplementation;

			String natHppDb2LUWSchemaObjMembers = attrHppDb2LUWSchemaObjMembers;

			String natHppDb2LUWSchemaObjImpl = attrHppDb2LUWSchemaObjImpl;

			String natHppDb2LUWSchemaObjInclude = attrHppDb2LUWSchemaObjInclude;

			String natHppMSSqlSchemaObjMembers = attrHppMSSqlSchemaObjMembers;

			String natHppMSSqlSchemaObjImpl = attrHppMSSqlSchemaObjImpl;

			String natHppMSSqlSchemaObjInclude = attrHppMSSqlSchemaObjInclude;

			String natHppMySqlSchemaObjMembers = attrHppMySqlSchemaObjMembers;

			String natHppMySqlSchemaObjImpl = attrHppMySqlSchemaObjImpl;

			String natHppMySqlSchemaObjInclude = attrHppMySqlSchemaObjInclude;

			String natHppOracleSchemaObjMembers = attrHppOracleSchemaObjMembers;

			String natHppOracleSchemaObjImpl = attrHppOracleSchemaObjImpl;

			String natHppOracleSchemaObjInclude = attrHppOracleSchemaObjInclude;

			String natHppPgSqlSchemaObjMembers = attrHppPgSqlSchemaObjMembers;

			String natHppPgSqlSchemaObjImpl = attrHppPgSqlSchemaObjImpl;

			String natHppPgSqlSchemaObjInclude = attrHppPgSqlSchemaObjInclude;

			String natHppRamSchemaObjMembers = attrHppRamSchemaObjMembers;

			String natHppRamSchemaObjImpl = attrHppRamSchemaObjImpl;

			String natHppRamSchemaObjInclude = attrHppRamSchemaObjInclude;

			String natHppXMsgSchemaInclude = attrHppXMsgSchemaInclude;

			String natHppXMsgSchemaFormatters = attrHppXMsgSchemaFormatters;

			String natHppXMsgClientSchemaInclude = attrHppXMsgClientSchemaInclude;

			String natHppXMsgClientSchemaBody = attrHppXMsgClientSchemaBody;

			String natHppXMsgRqstSchemaBody = attrHppXMsgRqstSchemaBody;

			String natHppXMsgRqstSchemaInclude = attrHppXMsgRqstSchemaInclude;

			String natHppXMsgRqstSchemaWireParsers = attrHppXMsgRqstSchemaWireParsers;

			String natHppXMsgRqstSchemaXsdSpec = attrHppXMsgRqstSchemaXsdSpec;

			String natHppXMsgRqstSchemaXsdElementList = attrHppXMsgRqstSchemaXsdElementList;

			String natHppXMsgRspnSchemaBody = attrHppXMsgRspnSchemaBody;

			String natHppXMsgRspnSchemaInclude = attrHppXMsgRspnSchemaInclude;

			String natHppXMsgRspnSchemaWireParsers = attrHppXMsgRspnSchemaWireParsers;

			String natHppXMsgRspnSchemaXsdElementList = attrHppXMsgRspnSchemaXsdElementList;

			String natHppXMsgRspnSchemaXsdSpec = attrHppXMsgRspnSchemaXsdSpec;

			String natCsSchemaObjUsing = attrCsSchemaObjUsing;

			String natCsSchemaObjInterface = attrCsSchemaObjInterface;

			String natCsSchemaObjMembers = attrCsSchemaObjMembers;

			String natCsSchemaObjImplementation = attrCsSchemaObjImplementation;

			String natCsDb2LUWSchemaObjMembers = attrCsDb2LUWSchemaObjMembers;

			String natCsDb2LUWSchemaObjImpl = attrCsDb2LUWSchemaObjImpl;

			String natCsDb2LUWSchemaObjUsing = attrCsDb2LUWSchemaObjUsing;

			String natCsMSSqlSchemaObjMembers = attrCsMSSqlSchemaObjMembers;

			String natCsMSSqlSchemaObjImpl = attrCsMSSqlSchemaObjImpl;

			String natCsMSSqlSchemaObjUsing = attrCsMSSqlSchemaObjUsing;

			String natCsMySqlSchemaObjMembers = attrCsMySqlSchemaObjMembers;

			String natCsMySqlSchemaObjImpl = attrCsMySqlSchemaObjImpl;

			String natCsMySqlSchemaObjUsing = attrCsMySqlSchemaObjUsing;

			String natCsOracleSchemaObjMembers = attrCsOracleSchemaObjMembers;

			String natCsOracleSchemaObjImpl = attrCsOracleSchemaObjImpl;

			String natCsOracleSchemaObjUsing = attrCsOracleSchemaObjUsing;

			String natCsPgSqlSchemaObjMembers = attrCsPgSqlSchemaObjMembers;

			String natCsPgSqlSchemaObjImpl = attrCsPgSqlSchemaObjImpl;

			String natCsPgSqlSchemaObjUsing = attrCsPgSqlSchemaObjUsing;

			String natCsRamSchemaObjMembers = attrCsRamSchemaObjMembers;

			String natCsRamSchemaObjImpl = attrCsRamSchemaObjImpl;

			String natCsRamSchemaObjUsing = attrCsRamSchemaObjUsing;

			String natCsXMsgSchemaUsing = attrCsXMsgSchemaUsing;

			String natCsXMsgSchemaFormatters = attrCsXMsgSchemaFormatters;

			String natCsXMsgClientSchemaUsing = attrCsXMsgClientSchemaUsing;

			String natCsXMsgClientSchemaBody = attrCsXMsgClientSchemaBody;

			String natCsXMsgRqstSchemaBody = attrCsXMsgRqstSchemaBody;

			String natCsXMsgRqstSchemaUsing = attrCsXMsgRqstSchemaUsing;

			String natCsXMsgRqstSchemaWireParsers = attrCsXMsgRqstSchemaWireParsers;

			String natCsXMsgRqstSchemaXsdSpec = attrCsXMsgRqstSchemaXsdSpec;

			String natCsXMsgRqstSchemaXsdElementList = attrCsXMsgRqstSchemaXsdElementList;

			String natCsXMsgRspnSchemaBody = attrCsXMsgRspnSchemaBody;

			String natCsXMsgRspnSchemaUsing = attrCsXMsgRspnSchemaUsing;

			String natCsXMsgRspnSchemaWireParsers = attrCsXMsgRspnSchemaWireParsers;

			String natCsXMsgRspnSchemaXsdElementList = attrCsXMsgRspnSchemaXsdElementList;

			String natCsXMsgRspnSchemaXsdSpec = attrCsXMsgRspnSchemaXsdSpec;

			// Instantiate a buffer for the parsed information
			ICFBamSchemaDefObj obj = (ICFBamSchemaDefObj)schemaObj.getSchemaDefTableObj().newInstance();
			CFBamSchemaDefBuff dataBuff = obj.getSchemaDefBuff();
			dataBuff.setRequiredTenantId( natTenantId );
			dataBuff.setRequiredId( natId );
			dataBuff.setRequiredRevision( natRevision );
			if( createdBy != null ) {
				dataBuff.setCreatedByUserId( createdBy );
			}
			if( createdAt != null ) {
				dataBuff.setCreatedAt( createdAt );
			}
			if( updatedBy != null ) {
				dataBuff.setUpdatedByUserId( updatedBy );
			}
			if( updatedAt != null ) {
				dataBuff.setUpdatedAt( updatedAt );
			}
			dataBuff.setRequiredMinorVersionId( natMinorVersionId );
			dataBuff.setRequiredName( natName );
			dataBuff.setOptionalDbName( natDbName );
			dataBuff.setOptionalShortName( natShortName );
			dataBuff.setOptionalLabel( natLabel );
			dataBuff.setOptionalShortDescription( natShortDescription );
			dataBuff.setOptionalDescription( natDescription );
			dataBuff.setRequiredPublicLicenseName( natPublicLicenseName );
			dataBuff.setRequiredPublicLicenseText( natPublicLicenseText );
			dataBuff.setOptionalImplementationLicenseName( natImplementationLicenseName );
			dataBuff.setOptionalImplementationLicenseText( natImplementationLicenseText );
			dataBuff.setRequiredCopyrightPeriod( natCopyrightPeriod );
			dataBuff.setRequiredCopyrightHolder( natCopyrightHolder );
			dataBuff.setRequiredAuthorEMail( natAuthorEMail );
			dataBuff.setRequiredProjectURL( natProjectURL );
			dataBuff.setRequiredPublishURI( natPublishURI );
			dataBuff.setOptionalJSchemaObjImport( natJSchemaObjImport );
			dataBuff.setOptionalJSchemaObjInterface( natJSchemaObjInterface );
			dataBuff.setOptionalJSchemaObjMembers( natJSchemaObjMembers );
			dataBuff.setOptionalJSchemaObjImplementation( natJSchemaObjImplementation );
			dataBuff.setOptionalJDb2LUWSchemaObjMembers( natJDb2LUWSchemaObjMembers );
			dataBuff.setOptionalJDb2LUWSchemaObjImpl( natJDb2LUWSchemaObjImpl );
			dataBuff.setOptionalJDb2LUWSchemaObjImport( natJDb2LUWSchemaObjImport );
			dataBuff.setOptionalJMSSqlSchemaObjMembers( natJMSSqlSchemaObjMembers );
			dataBuff.setOptionalJMSSqlSchemaObjImpl( natJMSSqlSchemaObjImpl );
			dataBuff.setOptionalJMSSqlSchemaObjImport( natJMSSqlSchemaObjImport );
			dataBuff.setOptionalJMySqlSchemaObjMembers( natJMySqlSchemaObjMembers );
			dataBuff.setOptionalJMySqlSchemaObjImpl( natJMySqlSchemaObjImpl );
			dataBuff.setOptionalJMySqlSchemaObjImport( natJMySqlSchemaObjImport );
			dataBuff.setOptionalJOracleSchemaObjMembers( natJOracleSchemaObjMembers );
			dataBuff.setOptionalJOracleSchemaObjImpl( natJOracleSchemaObjImpl );
			dataBuff.setOptionalJOracleSchemaObjImport( natJOracleSchemaObjImport );
			dataBuff.setOptionalJPgSqlSchemaObjMembers( natJPgSqlSchemaObjMembers );
			dataBuff.setOptionalJPgSqlSchemaObjImpl( natJPgSqlSchemaObjImpl );
			dataBuff.setOptionalJPgSqlSchemaObjImport( natJPgSqlSchemaObjImport );
			dataBuff.setOptionalJRamSchemaObjMembers( natJRamSchemaObjMembers );
			dataBuff.setOptionalJRamSchemaObjImpl( natJRamSchemaObjImpl );
			dataBuff.setOptionalJRamSchemaObjImport( natJRamSchemaObjImport );
			dataBuff.setOptionalJXMsgSchemaImport( natJXMsgSchemaImport );
			dataBuff.setOptionalJXMsgSchemaFormatters( natJXMsgSchemaFormatters );
			dataBuff.setOptionalJXMsgClientSchemaImport( natJXMsgClientSchemaImport );
			dataBuff.setOptionalJXMsgClientSchemaBody( natJXMsgClientSchemaBody );
			dataBuff.setOptionalJXMsgRqstSchemaBody( natJXMsgRqstSchemaBody );
			dataBuff.setOptionalJXMsgRqstSchemaImport( natJXMsgRqstSchemaImport );
			dataBuff.setOptionalJXMsgRqstSchemaWireParsers( natJXMsgRqstSchemaWireParsers );
			dataBuff.setOptionalJXMsgRqstSchemaXsdSpec( natJXMsgRqstSchemaXsdSpec );
			dataBuff.setOptionalJXMsgRqstSchemaXsdElementList( natJXMsgRqstSchemaXsdElementList );
			dataBuff.setOptionalJXMsgRspnSchemaBody( natJXMsgRspnSchemaBody );
			dataBuff.setOptionalJXMsgRspnSchemaImport( natJXMsgRspnSchemaImport );
			dataBuff.setOptionalJXMsgRspnSchemaWireParsers( natJXMsgRspnSchemaWireParsers );
			dataBuff.setOptionalJXMsgRspnSchemaXsdElementList( natJXMsgRspnSchemaXsdElementList );
			dataBuff.setOptionalJXMsgRspnSchemaXsdSpec( natJXMsgRspnSchemaXsdSpec );
			dataBuff.setOptionalCppSchemaObjInclude( natCppSchemaObjInclude );
			dataBuff.setOptionalCppSchemaObjInterface( natCppSchemaObjInterface );
			dataBuff.setOptionalCppSchemaObjMembers( natCppSchemaObjMembers );
			dataBuff.setOptionalCppSchemaObjImplementation( natCppSchemaObjImplementation );
			dataBuff.setOptionalCppDb2LUWSchemaObjMembers( natCppDb2LUWSchemaObjMembers );
			dataBuff.setOptionalCppDb2LUWSchemaObjImpl( natCppDb2LUWSchemaObjImpl );
			dataBuff.setOptionalCppDb2LUWSchemaObjInclude( natCppDb2LUWSchemaObjInclude );
			dataBuff.setOptionalCppMSSqlSchemaObjMembers( natCppMSSqlSchemaObjMembers );
			dataBuff.setOptionalCppMSSqlSchemaObjImpl( natCppMSSqlSchemaObjImpl );
			dataBuff.setOptionalCppMSSqlSchemaObjInclude( natCppMSSqlSchemaObjInclude );
			dataBuff.setOptionalCppMySqlSchemaObjMembers( natCppMySqlSchemaObjMembers );
			dataBuff.setOptionalCppMySqlSchemaObjImpl( natCppMySqlSchemaObjImpl );
			dataBuff.setOptionalCppMySqlSchemaObjInclude( natCppMySqlSchemaObjInclude );
			dataBuff.setOptionalCppOracleSchemaObjMembers( natCppOracleSchemaObjMembers );
			dataBuff.setOptionalCppOracleSchemaObjImpl( natCppOracleSchemaObjImpl );
			dataBuff.setOptionalCppOracleSchemaObjInclude( natCppOracleSchemaObjInclude );
			dataBuff.setOptionalCppPgSqlSchemaObjMembers( natCppPgSqlSchemaObjMembers );
			dataBuff.setOptionalCppPgSqlSchemaObjImpl( natCppPgSqlSchemaObjImpl );
			dataBuff.setOptionalCppPgSqlSchemaObjInclude( natCppPgSqlSchemaObjInclude );
			dataBuff.setOptionalCppRamSchemaObjMembers( natCppRamSchemaObjMembers );
			dataBuff.setOptionalCppRamSchemaObjImpl( natCppRamSchemaObjImpl );
			dataBuff.setOptionalCppRamSchemaObjInclude( natCppRamSchemaObjInclude );
			dataBuff.setOptionalCppXMsgSchemaInclude( natCppXMsgSchemaInclude );
			dataBuff.setOptionalCppXMsgSchemaFormatters( natCppXMsgSchemaFormatters );
			dataBuff.setOptionalCppXMsgClientSchemaInclude( natCppXMsgClientSchemaInclude );
			dataBuff.setOptionalCppXMsgClientSchemaBody( natCppXMsgClientSchemaBody );
			dataBuff.setOptionalCppXMsgRqstSchemaBody( natCppXMsgRqstSchemaBody );
			dataBuff.setOptionalCppXMsgRqstSchemaInclude( natCppXMsgRqstSchemaInclude );
			dataBuff.setOptionalCppXMsgRqstSchemaWireParsers( natCppXMsgRqstSchemaWireParsers );
			dataBuff.setOptionalCppXMsgRqstSchemaXsdSpec( natCppXMsgRqstSchemaXsdSpec );
			dataBuff.setOptionalCppXMsgRqstSchemaXsdElementList( natCppXMsgRqstSchemaXsdElementList );
			dataBuff.setOptionalCppXMsgRspnSchemaBody( natCppXMsgRspnSchemaBody );
			dataBuff.setOptionalCppXMsgRspnSchemaInclude( natCppXMsgRspnSchemaInclude );
			dataBuff.setOptionalCppXMsgRspnSchemaWireParsers( natCppXMsgRspnSchemaWireParsers );
			dataBuff.setOptionalCppXMsgRspnSchemaXsdElementList( natCppXMsgRspnSchemaXsdElementList );
			dataBuff.setOptionalCppXMsgRspnSchemaXsdSpec( natCppXMsgRspnSchemaXsdSpec );
			dataBuff.setOptionalHppSchemaObjInclude( natHppSchemaObjInclude );
			dataBuff.setOptionalHppSchemaObjInterface( natHppSchemaObjInterface );
			dataBuff.setOptionalHppSchemaObjMembers( natHppSchemaObjMembers );
			dataBuff.setOptionalHppSchemaObjImplementation( natHppSchemaObjImplementation );
			dataBuff.setOptionalHppDb2LUWSchemaObjMembers( natHppDb2LUWSchemaObjMembers );
			dataBuff.setOptionalHppDb2LUWSchemaObjImpl( natHppDb2LUWSchemaObjImpl );
			dataBuff.setOptionalHppDb2LUWSchemaObjInclude( natHppDb2LUWSchemaObjInclude );
			dataBuff.setOptionalHppMSSqlSchemaObjMembers( natHppMSSqlSchemaObjMembers );
			dataBuff.setOptionalHppMSSqlSchemaObjImpl( natHppMSSqlSchemaObjImpl );
			dataBuff.setOptionalHppMSSqlSchemaObjInclude( natHppMSSqlSchemaObjInclude );
			dataBuff.setOptionalHppMySqlSchemaObjMembers( natHppMySqlSchemaObjMembers );
			dataBuff.setOptionalHppMySqlSchemaObjImpl( natHppMySqlSchemaObjImpl );
			dataBuff.setOptionalHppMySqlSchemaObjInclude( natHppMySqlSchemaObjInclude );
			dataBuff.setOptionalHppOracleSchemaObjMembers( natHppOracleSchemaObjMembers );
			dataBuff.setOptionalHppOracleSchemaObjImpl( natHppOracleSchemaObjImpl );
			dataBuff.setOptionalHppOracleSchemaObjInclude( natHppOracleSchemaObjInclude );
			dataBuff.setOptionalHppPgSqlSchemaObjMembers( natHppPgSqlSchemaObjMembers );
			dataBuff.setOptionalHppPgSqlSchemaObjImpl( natHppPgSqlSchemaObjImpl );
			dataBuff.setOptionalHppPgSqlSchemaObjInclude( natHppPgSqlSchemaObjInclude );
			dataBuff.setOptionalHppRamSchemaObjMembers( natHppRamSchemaObjMembers );
			dataBuff.setOptionalHppRamSchemaObjImpl( natHppRamSchemaObjImpl );
			dataBuff.setOptionalHppRamSchemaObjInclude( natHppRamSchemaObjInclude );
			dataBuff.setOptionalHppXMsgSchemaInclude( natHppXMsgSchemaInclude );
			dataBuff.setOptionalHppXMsgSchemaFormatters( natHppXMsgSchemaFormatters );
			dataBuff.setOptionalHppXMsgClientSchemaInclude( natHppXMsgClientSchemaInclude );
			dataBuff.setOptionalHppXMsgClientSchemaBody( natHppXMsgClientSchemaBody );
			dataBuff.setOptionalHppXMsgRqstSchemaBody( natHppXMsgRqstSchemaBody );
			dataBuff.setOptionalHppXMsgRqstSchemaInclude( natHppXMsgRqstSchemaInclude );
			dataBuff.setOptionalHppXMsgRqstSchemaWireParsers( natHppXMsgRqstSchemaWireParsers );
			dataBuff.setOptionalHppXMsgRqstSchemaXsdSpec( natHppXMsgRqstSchemaXsdSpec );
			dataBuff.setOptionalHppXMsgRqstSchemaXsdElementList( natHppXMsgRqstSchemaXsdElementList );
			dataBuff.setOptionalHppXMsgRspnSchemaBody( natHppXMsgRspnSchemaBody );
			dataBuff.setOptionalHppXMsgRspnSchemaInclude( natHppXMsgRspnSchemaInclude );
			dataBuff.setOptionalHppXMsgRspnSchemaWireParsers( natHppXMsgRspnSchemaWireParsers );
			dataBuff.setOptionalHppXMsgRspnSchemaXsdElementList( natHppXMsgRspnSchemaXsdElementList );
			dataBuff.setOptionalHppXMsgRspnSchemaXsdSpec( natHppXMsgRspnSchemaXsdSpec );
			dataBuff.setOptionalCsSchemaObjUsing( natCsSchemaObjUsing );
			dataBuff.setOptionalCsSchemaObjInterface( natCsSchemaObjInterface );
			dataBuff.setOptionalCsSchemaObjMembers( natCsSchemaObjMembers );
			dataBuff.setOptionalCsSchemaObjImplementation( natCsSchemaObjImplementation );
			dataBuff.setOptionalCsDb2LUWSchemaObjMembers( natCsDb2LUWSchemaObjMembers );
			dataBuff.setOptionalCsDb2LUWSchemaObjImpl( natCsDb2LUWSchemaObjImpl );
			dataBuff.setOptionalCsDb2LUWSchemaObjUsing( natCsDb2LUWSchemaObjUsing );
			dataBuff.setOptionalCsMSSqlSchemaObjMembers( natCsMSSqlSchemaObjMembers );
			dataBuff.setOptionalCsMSSqlSchemaObjImpl( natCsMSSqlSchemaObjImpl );
			dataBuff.setOptionalCsMSSqlSchemaObjUsing( natCsMSSqlSchemaObjUsing );
			dataBuff.setOptionalCsMySqlSchemaObjMembers( natCsMySqlSchemaObjMembers );
			dataBuff.setOptionalCsMySqlSchemaObjImpl( natCsMySqlSchemaObjImpl );
			dataBuff.setOptionalCsMySqlSchemaObjUsing( natCsMySqlSchemaObjUsing );
			dataBuff.setOptionalCsOracleSchemaObjMembers( natCsOracleSchemaObjMembers );
			dataBuff.setOptionalCsOracleSchemaObjImpl( natCsOracleSchemaObjImpl );
			dataBuff.setOptionalCsOracleSchemaObjUsing( natCsOracleSchemaObjUsing );
			dataBuff.setOptionalCsPgSqlSchemaObjMembers( natCsPgSqlSchemaObjMembers );
			dataBuff.setOptionalCsPgSqlSchemaObjImpl( natCsPgSqlSchemaObjImpl );
			dataBuff.setOptionalCsPgSqlSchemaObjUsing( natCsPgSqlSchemaObjUsing );
			dataBuff.setOptionalCsRamSchemaObjMembers( natCsRamSchemaObjMembers );
			dataBuff.setOptionalCsRamSchemaObjImpl( natCsRamSchemaObjImpl );
			dataBuff.setOptionalCsRamSchemaObjUsing( natCsRamSchemaObjUsing );
			dataBuff.setOptionalCsXMsgSchemaUsing( natCsXMsgSchemaUsing );
			dataBuff.setOptionalCsXMsgSchemaFormatters( natCsXMsgSchemaFormatters );
			dataBuff.setOptionalCsXMsgClientSchemaUsing( natCsXMsgClientSchemaUsing );
			dataBuff.setOptionalCsXMsgClientSchemaBody( natCsXMsgClientSchemaBody );
			dataBuff.setOptionalCsXMsgRqstSchemaBody( natCsXMsgRqstSchemaBody );
			dataBuff.setOptionalCsXMsgRqstSchemaUsing( natCsXMsgRqstSchemaUsing );
			dataBuff.setOptionalCsXMsgRqstSchemaWireParsers( natCsXMsgRqstSchemaWireParsers );
			dataBuff.setOptionalCsXMsgRqstSchemaXsdSpec( natCsXMsgRqstSchemaXsdSpec );
			dataBuff.setOptionalCsXMsgRqstSchemaXsdElementList( natCsXMsgRqstSchemaXsdElementList );
			dataBuff.setOptionalCsXMsgRspnSchemaBody( natCsXMsgRspnSchemaBody );
			dataBuff.setOptionalCsXMsgRspnSchemaUsing( natCsXMsgRspnSchemaUsing );
			dataBuff.setOptionalCsXMsgRspnSchemaWireParsers( natCsXMsgRspnSchemaWireParsers );
			dataBuff.setOptionalCsXMsgRspnSchemaXsdElementList( natCsXMsgRspnSchemaXsdElementList );
			dataBuff.setOptionalCsXMsgRspnSchemaXsdSpec( natCsXMsgRspnSchemaXsdSpec );
			obj.copyBuffToPKey();
			ICFBamSchemaDefObj realised = (ICFBamSchemaDefObj)obj.realise();
			xmsgRspn.setLastObjectProcessed( realised );
		}
		catch( RuntimeException e ) {
			throw new RuntimeException( "Near " + getParser().getLocationInfo() + ": Caught and rethrew " + e.getClass().getName() + " - " + e.getMessage(),
				e );
		}
		catch( Error e ) {
			throw new Error( "Near " + getParser().getLocationInfo() + ": Caught and rethrew " + e.getClass().getName() + " - " + e.getMessage(),
				e );
		}
	}

	public void endElement(
		String		uri,
		String		localName,
		String		qName )
	throws SAXException
	{
	}
}
