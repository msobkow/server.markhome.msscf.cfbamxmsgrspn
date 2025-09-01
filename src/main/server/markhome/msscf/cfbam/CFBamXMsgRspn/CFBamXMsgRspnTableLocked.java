
// Description: Java 11 XML Message SAX Response Record Element  for Table

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
 *	CFBamXMsgRspnTableLocked XML SAX Element  implementation
 *	for Table.
 */
public class CFBamXMsgRspnTableLocked
	extends CFLibXmlCoreElementHandler
{
	public CFBamXMsgRspnTableLocked( CFBamXMsgRspn xmsgRspn ) {
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
			// Table Attributes
			String	attrSchemaDefId = null;
			String	attrDefSchemaTenantId = null;
			String	attrDefSchemaId = null;
			String	attrName = null;
			String	attrDbName = null;
			String	attrShortName = null;
			String	attrLabel = null;
			String	attrShortDescription = null;
			String	attrDescription = null;
			String	attrPageData = null;
			String	attrPrimaryIndexTenantId = null;
			String	attrPrimaryIndexId = null;
			String	attrTableClassCode = null;
			String	attrLookupIndexTenantId = null;
			String	attrLookupIndexId = null;
			String	attrAltIndexTenantId = null;
			String	attrAltIndexId = null;
			String	attrQualifyingTenantId = null;
			String	attrQualifyingTableId = null;
			String	attrIsInstantiable = null;
			String	attrHasHistory = null;
			String	attrHasAuditColumns = null;
			String	attrIsMutable = null;
			String	attrIsServerOnly = null;
			String	attrLoaderBehaviour = null;
			String	attrSecScope = null;
			String	attrJObjMembers = null;
			String	attrJObjInterface = null;
			String	attrJObjImport = null;
			String	attrJObjImplementation = null;
			String	attrJEditObjMembers = null;
			String	attrJEditObjInterface = null;
			String	attrJEditObjImport = null;
			String	attrJEditObjImplementation = null;
			String	attrJTableImport = null;
			String	attrJTableMembers = null;
			String	attrJTableInterface = null;
			String	attrJTableImplementation = null;
			String	attrJTableObjImport = null;
			String	attrJTableObjMembers = null;
			String	attrJTableObjInterface = null;
			String	attrJTableObjImplementation = null;
			String	attrJDb2LUWTableImport = null;
			String	attrJDb2LUWTableMembers = null;
			String	attrJDb2LUWTableImplementation = null;
			String	attrJMSSqlTableImport = null;
			String	attrJMSSqlTableMembers = null;
			String	attrJMSSqlTableImplementation = null;
			String	attrJMySqlTableImport = null;
			String	attrJMySqlTableMembers = null;
			String	attrJMySqlTableImplementation = null;
			String	attrJOracleTableImport = null;
			String	attrJOracleTableMembers = null;
			String	attrJOracleTableImplementation = null;
			String	attrJPgSqlTableImport = null;
			String	attrJPgSqlTableMembers = null;
			String	attrJPgSqlTableImplementation = null;
			String	attrJRamTableImport = null;
			String	attrJRamTableMembers = null;
			String	attrJRamTableImplementation = null;
			String	attrJSaxLoaderImport = null;
			String	attrJSaxLoaderStartElement = null;
			String	attrJSaxLoaderEndElement = null;
			String	attrJXMsgTableImport = null;
			String	attrJXMsgTableFormatters = null;
			String	attrJXMsgRqstTableImport = null;
			String	attrJXMsgRspnTableImport = null;
			String	attrJXMsgClientTableImport = null;
			String	attrJXMsgRqstTableBody = null;
			String	attrJXMsgRspnTableBody = null;
			String	attrJXMsgClientTableBody = null;
			String	attrCppObjMembers = null;
			String	attrCppObjInterface = null;
			String	attrCppObjInclude = null;
			String	attrCppObjImplementation = null;
			String	attrCppEditObjMembers = null;
			String	attrCppEditObjInterface = null;
			String	attrCppEditObjInclude = null;
			String	attrCppEditObjImplementation = null;
			String	attrCppTableInclude = null;
			String	attrCppTableMembers = null;
			String	attrCppTableInterface = null;
			String	attrCppTableImplementation = null;
			String	attrCppTableObjInclude = null;
			String	attrCppTableObjMembers = null;
			String	attrCppTableObjInterface = null;
			String	attrCppTableObjImplementation = null;
			String	attrCppDb2LUWTableInclude = null;
			String	attrCppDb2LUWTableMembers = null;
			String	attrCppDb2LUWTableImplementation = null;
			String	attrCppMSSqlTableInclude = null;
			String	attrCppMSSqlTableMembers = null;
			String	attrCppMSSqlTableImplementation = null;
			String	attrCppMySqlTableInclude = null;
			String	attrCppMySqlTableMembers = null;
			String	attrCppMySqlTableImplementation = null;
			String	attrCppOracleTableInclude = null;
			String	attrCppOracleTableMembers = null;
			String	attrCppOracleTableImplementation = null;
			String	attrCppPgSqlTableInclude = null;
			String	attrCppPgSqlTableMembers = null;
			String	attrCppPgSqlTableImplementation = null;
			String	attrCppRamTableInclude = null;
			String	attrCppRamTableMembers = null;
			String	attrCppRamTableImplementation = null;
			String	attrCppSaxLoaderInclude = null;
			String	attrCppSaxLoaderStartElement = null;
			String	attrCppSaxLoaderEndElement = null;
			String	attrCppXMsgTableInclude = null;
			String	attrCppXMsgTableFormatters = null;
			String	attrCppXMsgRqstTableInclude = null;
			String	attrCppXMsgRspnTableInclude = null;
			String	attrCppXMsgClientTableInclude = null;
			String	attrCppXMsgRqstTableBody = null;
			String	attrCppXMsgRspnTableBody = null;
			String	attrCppXMsgClientTableBody = null;
			String	attrHppObjMembers = null;
			String	attrHppObjInterface = null;
			String	attrHppObjInclude = null;
			String	attrHppObjImplementation = null;
			String	attrHppEditObjMembers = null;
			String	attrHppEditObjInterface = null;
			String	attrHppEditObjInclude = null;
			String	attrHppEditObjImplementation = null;
			String	attrHppTableInclude = null;
			String	attrHppTableMembers = null;
			String	attrHppTableInterface = null;
			String	attrHppTableImplementation = null;
			String	attrHppTableObjInclude = null;
			String	attrHppTableObjMembers = null;
			String	attrHppTableObjInterface = null;
			String	attrHppTableObjImplementation = null;
			String	attrHppDb2LUWTableInclude = null;
			String	attrHppDb2LUWTableMembers = null;
			String	attrHppDb2LUWTableImplementation = null;
			String	attrHppMSSqlTableInclude = null;
			String	attrHppMSSqlTableMembers = null;
			String	attrHppMSSqlTableImplementation = null;
			String	attrHppMySqlTableInclude = null;
			String	attrHppMySqlTableMembers = null;
			String	attrHppMySqlTableImplementation = null;
			String	attrHppOracleTableInclude = null;
			String	attrHppOracleTableMembers = null;
			String	attrHppOracleTableImplementation = null;
			String	attrHppPgSqlTableInclude = null;
			String	attrHppPgSqlTableMembers = null;
			String	attrHppPgSqlTableImplementation = null;
			String	attrHppRamTableInclude = null;
			String	attrHppRamTableMembers = null;
			String	attrHppRamTableImplementation = null;
			String	attrHppSaxLoaderInclude = null;
			String	attrHppSaxLoaderStartElement = null;
			String	attrHppSaxLoaderEndElement = null;
			String	attrHppXMsgTableInclude = null;
			String	attrHppXMsgTableFormatters = null;
			String	attrHppXMsgRqstTableInclude = null;
			String	attrHppXMsgRspnTableInclude = null;
			String	attrHppXMsgClientTableInclude = null;
			String	attrHppXMsgRqstTableBody = null;
			String	attrHppXMsgRspnTableBody = null;
			String	attrHppXMsgClientTableBody = null;
			String	attrCsObjMembers = null;
			String	attrCsObjInterface = null;
			String	attrCsObjUsing = null;
			String	attrCsObjImplementation = null;
			String	attrCsEditObjMembers = null;
			String	attrCsEditObjInterface = null;
			String	attrCsEditObjUsing = null;
			String	attrCsEditObjImplementation = null;
			String	attrCsTableUsing = null;
			String	attrCsTableMembers = null;
			String	attrCsTableInterface = null;
			String	attrCsTableImplementation = null;
			String	attrCsTableObjUsing = null;
			String	attrCsTableObjMembers = null;
			String	attrCsTableObjInterface = null;
			String	attrCsTableObjImplementation = null;
			String	attrCsDb2LUWTableUsing = null;
			String	attrCsDb2LUWTableMembers = null;
			String	attrCsDb2LUWTableImplementation = null;
			String	attrCsMSSqlTableUsing = null;
			String	attrCsMSSqlTableMembers = null;
			String	attrCsMSSqlTableImplementation = null;
			String	attrCsMySqlTableUsing = null;
			String	attrCsMySqlTableMembers = null;
			String	attrCsMySqlTableImplementation = null;
			String	attrCsOracleTableUsing = null;
			String	attrCsOracleTableMembers = null;
			String	attrCsOracleTableImplementation = null;
			String	attrCsPgSqlTableUsing = null;
			String	attrCsPgSqlTableMembers = null;
			String	attrCsPgSqlTableImplementation = null;
			String	attrCsRamTableUsing = null;
			String	attrCsRamTableMembers = null;
			String	attrCsRamTableImplementation = null;
			String	attrCsSaxLoaderUsing = null;
			String	attrCsSaxLoaderStartElement = null;
			String	attrCsSaxLoaderEndElement = null;
			String	attrCsXMsgTableUsing = null;
			String	attrCsXMsgTableFormatters = null;
			String	attrCsXMsgRqstTableUsing = null;
			String	attrCsXMsgRspnTableUsing = null;
			String	attrCsXMsgClientTableUsing = null;
			String	attrCsXMsgRqstTableBody = null;
			String	attrCsXMsgRspnTableBody = null;
			String	attrCsXMsgClientTableBody = null;
			// Attribute Extraction
			String	attrLocalName;
			int		numAttrs;
			int		idxAttr;
			final String S_ProcName = "startElement";
			final String S_LocalName = "LocalName";

			assert qName.equals( "RspnTableLocked" );

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
				else if( attrLocalName.equals( "SchemaDefId" ) ) {
					if( attrSchemaDefId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrSchemaDefId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "DefSchemaTenantId" ) ) {
					if( attrDefSchemaTenantId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrDefSchemaTenantId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "DefSchemaId" ) ) {
					if( attrDefSchemaId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrDefSchemaId = attrs.getValue( idxAttr );
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
				else if( attrLocalName.equals( "PageData" ) ) {
					if( attrPageData != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrPageData = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "PrimaryIndexTenantId" ) ) {
					if( attrPrimaryIndexTenantId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrPrimaryIndexTenantId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "PrimaryIndexId" ) ) {
					if( attrPrimaryIndexId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrPrimaryIndexId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "TableClassCode" ) ) {
					if( attrTableClassCode != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrTableClassCode = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "LookupIndexTenantId" ) ) {
					if( attrLookupIndexTenantId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrLookupIndexTenantId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "LookupIndexId" ) ) {
					if( attrLookupIndexId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrLookupIndexId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "AltIndexTenantId" ) ) {
					if( attrAltIndexTenantId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrAltIndexTenantId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "AltIndexId" ) ) {
					if( attrAltIndexId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrAltIndexId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "QualifyingTenantId" ) ) {
					if( attrQualifyingTenantId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrQualifyingTenantId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "QualifyingTableId" ) ) {
					if( attrQualifyingTableId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrQualifyingTableId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "IsInstantiable" ) ) {
					if( attrIsInstantiable != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrIsInstantiable = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HasHistory" ) ) {
					if( attrHasHistory != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHasHistory = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HasAuditColumns" ) ) {
					if( attrHasAuditColumns != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHasAuditColumns = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "IsMutable" ) ) {
					if( attrIsMutable != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrIsMutable = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "IsServerOnly" ) ) {
					if( attrIsServerOnly != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrIsServerOnly = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "LoaderBehaviour" ) ) {
					if( attrLoaderBehaviour != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrLoaderBehaviour = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "SecScope" ) ) {
					if( attrSecScope != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrSecScope = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JObjMembers" ) ) {
					if( attrJObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JObjInterface" ) ) {
					if( attrJObjInterface != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJObjInterface = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JObjImport" ) ) {
					if( attrJObjImport != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJObjImport = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JObjImplementation" ) ) {
					if( attrJObjImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJObjImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JEditObjMembers" ) ) {
					if( attrJEditObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJEditObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JEditObjInterface" ) ) {
					if( attrJEditObjInterface != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJEditObjInterface = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JEditObjImport" ) ) {
					if( attrJEditObjImport != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJEditObjImport = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JEditObjImplementation" ) ) {
					if( attrJEditObjImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJEditObjImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JTableImport" ) ) {
					if( attrJTableImport != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJTableImport = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JTableMembers" ) ) {
					if( attrJTableMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJTableMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JTableInterface" ) ) {
					if( attrJTableInterface != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJTableInterface = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JTableImplementation" ) ) {
					if( attrJTableImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJTableImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JTableObjImport" ) ) {
					if( attrJTableObjImport != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJTableObjImport = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JTableObjMembers" ) ) {
					if( attrJTableObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJTableObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JTableObjInterface" ) ) {
					if( attrJTableObjInterface != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJTableObjInterface = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JTableObjImplementation" ) ) {
					if( attrJTableObjImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJTableObjImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JDb2LUWTableImport" ) ) {
					if( attrJDb2LUWTableImport != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJDb2LUWTableImport = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JDb2LUWTableMembers" ) ) {
					if( attrJDb2LUWTableMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJDb2LUWTableMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JDb2LUWTableImplementation" ) ) {
					if( attrJDb2LUWTableImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJDb2LUWTableImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JMSSqlTableImport" ) ) {
					if( attrJMSSqlTableImport != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJMSSqlTableImport = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JMSSqlTableMembers" ) ) {
					if( attrJMSSqlTableMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJMSSqlTableMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JMSSqlTableImplementation" ) ) {
					if( attrJMSSqlTableImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJMSSqlTableImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JMySqlTableImport" ) ) {
					if( attrJMySqlTableImport != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJMySqlTableImport = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JMySqlTableMembers" ) ) {
					if( attrJMySqlTableMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJMySqlTableMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JMySqlTableImplementation" ) ) {
					if( attrJMySqlTableImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJMySqlTableImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JOracleTableImport" ) ) {
					if( attrJOracleTableImport != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJOracleTableImport = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JOracleTableMembers" ) ) {
					if( attrJOracleTableMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJOracleTableMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JOracleTableImplementation" ) ) {
					if( attrJOracleTableImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJOracleTableImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JPgSqlTableImport" ) ) {
					if( attrJPgSqlTableImport != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJPgSqlTableImport = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JPgSqlTableMembers" ) ) {
					if( attrJPgSqlTableMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJPgSqlTableMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JPgSqlTableImplementation" ) ) {
					if( attrJPgSqlTableImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJPgSqlTableImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JRamTableImport" ) ) {
					if( attrJRamTableImport != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJRamTableImport = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JRamTableMembers" ) ) {
					if( attrJRamTableMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJRamTableMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JRamTableImplementation" ) ) {
					if( attrJRamTableImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJRamTableImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JSaxLoaderImport" ) ) {
					if( attrJSaxLoaderImport != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJSaxLoaderImport = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JSaxLoaderStartElement" ) ) {
					if( attrJSaxLoaderStartElement != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJSaxLoaderStartElement = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JSaxLoaderEndElement" ) ) {
					if( attrJSaxLoaderEndElement != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJSaxLoaderEndElement = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JXMsgTableImport" ) ) {
					if( attrJXMsgTableImport != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJXMsgTableImport = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JXMsgTableFormatters" ) ) {
					if( attrJXMsgTableFormatters != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJXMsgTableFormatters = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JXMsgRqstTableImport" ) ) {
					if( attrJXMsgRqstTableImport != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJXMsgRqstTableImport = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JXMsgRspnTableImport" ) ) {
					if( attrJXMsgRspnTableImport != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJXMsgRspnTableImport = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JXMsgClientTableImport" ) ) {
					if( attrJXMsgClientTableImport != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJXMsgClientTableImport = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JXMsgRqstTableBody" ) ) {
					if( attrJXMsgRqstTableBody != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJXMsgRqstTableBody = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JXMsgRspnTableBody" ) ) {
					if( attrJXMsgRspnTableBody != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJXMsgRspnTableBody = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "JXMsgClientTableBody" ) ) {
					if( attrJXMsgClientTableBody != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrJXMsgClientTableBody = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppObjMembers" ) ) {
					if( attrCppObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppObjInterface" ) ) {
					if( attrCppObjInterface != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppObjInterface = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppObjInclude" ) ) {
					if( attrCppObjInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppObjInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppObjImplementation" ) ) {
					if( attrCppObjImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppObjImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppEditObjMembers" ) ) {
					if( attrCppEditObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppEditObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppEditObjInterface" ) ) {
					if( attrCppEditObjInterface != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppEditObjInterface = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppEditObjInclude" ) ) {
					if( attrCppEditObjInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppEditObjInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppEditObjImplementation" ) ) {
					if( attrCppEditObjImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppEditObjImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppTableInclude" ) ) {
					if( attrCppTableInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppTableInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppTableMembers" ) ) {
					if( attrCppTableMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppTableMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppTableInterface" ) ) {
					if( attrCppTableInterface != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppTableInterface = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppTableImplementation" ) ) {
					if( attrCppTableImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppTableImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppTableObjInclude" ) ) {
					if( attrCppTableObjInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppTableObjInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppTableObjMembers" ) ) {
					if( attrCppTableObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppTableObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppTableObjInterface" ) ) {
					if( attrCppTableObjInterface != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppTableObjInterface = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppTableObjImplementation" ) ) {
					if( attrCppTableObjImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppTableObjImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppDb2LUWTableInclude" ) ) {
					if( attrCppDb2LUWTableInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppDb2LUWTableInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppDb2LUWTableMembers" ) ) {
					if( attrCppDb2LUWTableMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppDb2LUWTableMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppDb2LUWTableImplementation" ) ) {
					if( attrCppDb2LUWTableImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppDb2LUWTableImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppMSSqlTableInclude" ) ) {
					if( attrCppMSSqlTableInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppMSSqlTableInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppMSSqlTableMembers" ) ) {
					if( attrCppMSSqlTableMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppMSSqlTableMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppMSSqlTableImplementation" ) ) {
					if( attrCppMSSqlTableImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppMSSqlTableImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppMySqlTableInclude" ) ) {
					if( attrCppMySqlTableInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppMySqlTableInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppMySqlTableMembers" ) ) {
					if( attrCppMySqlTableMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppMySqlTableMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppMySqlTableImplementation" ) ) {
					if( attrCppMySqlTableImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppMySqlTableImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppOracleTableInclude" ) ) {
					if( attrCppOracleTableInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppOracleTableInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppOracleTableMembers" ) ) {
					if( attrCppOracleTableMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppOracleTableMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppOracleTableImplementation" ) ) {
					if( attrCppOracleTableImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppOracleTableImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppPgSqlTableInclude" ) ) {
					if( attrCppPgSqlTableInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppPgSqlTableInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppPgSqlTableMembers" ) ) {
					if( attrCppPgSqlTableMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppPgSqlTableMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppPgSqlTableImplementation" ) ) {
					if( attrCppPgSqlTableImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppPgSqlTableImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppRamTableInclude" ) ) {
					if( attrCppRamTableInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppRamTableInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppRamTableMembers" ) ) {
					if( attrCppRamTableMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppRamTableMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppRamTableImplementation" ) ) {
					if( attrCppRamTableImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppRamTableImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppSaxLoaderInclude" ) ) {
					if( attrCppSaxLoaderInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppSaxLoaderInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppSaxLoaderStartElement" ) ) {
					if( attrCppSaxLoaderStartElement != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppSaxLoaderStartElement = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppSaxLoaderEndElement" ) ) {
					if( attrCppSaxLoaderEndElement != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppSaxLoaderEndElement = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppXMsgTableInclude" ) ) {
					if( attrCppXMsgTableInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppXMsgTableInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppXMsgTableFormatters" ) ) {
					if( attrCppXMsgTableFormatters != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppXMsgTableFormatters = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppXMsgRqstTableInclude" ) ) {
					if( attrCppXMsgRqstTableInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppXMsgRqstTableInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppXMsgRspnTableInclude" ) ) {
					if( attrCppXMsgRspnTableInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppXMsgRspnTableInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppXMsgClientTableInclude" ) ) {
					if( attrCppXMsgClientTableInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppXMsgClientTableInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppXMsgRqstTableBody" ) ) {
					if( attrCppXMsgRqstTableBody != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppXMsgRqstTableBody = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppXMsgRspnTableBody" ) ) {
					if( attrCppXMsgRspnTableBody != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppXMsgRspnTableBody = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CppXMsgClientTableBody" ) ) {
					if( attrCppXMsgClientTableBody != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCppXMsgClientTableBody = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppObjMembers" ) ) {
					if( attrHppObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppObjInterface" ) ) {
					if( attrHppObjInterface != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppObjInterface = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppObjInclude" ) ) {
					if( attrHppObjInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppObjInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppObjImplementation" ) ) {
					if( attrHppObjImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppObjImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppEditObjMembers" ) ) {
					if( attrHppEditObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppEditObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppEditObjInterface" ) ) {
					if( attrHppEditObjInterface != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppEditObjInterface = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppEditObjInclude" ) ) {
					if( attrHppEditObjInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppEditObjInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppEditObjImplementation" ) ) {
					if( attrHppEditObjImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppEditObjImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppTableInclude" ) ) {
					if( attrHppTableInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppTableInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppTableMembers" ) ) {
					if( attrHppTableMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppTableMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppTableInterface" ) ) {
					if( attrHppTableInterface != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppTableInterface = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppTableImplementation" ) ) {
					if( attrHppTableImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppTableImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppTableObjInclude" ) ) {
					if( attrHppTableObjInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppTableObjInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppTableObjMembers" ) ) {
					if( attrHppTableObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppTableObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppTableObjInterface" ) ) {
					if( attrHppTableObjInterface != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppTableObjInterface = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppTableObjImplementation" ) ) {
					if( attrHppTableObjImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppTableObjImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppDb2LUWTableInclude" ) ) {
					if( attrHppDb2LUWTableInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppDb2LUWTableInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppDb2LUWTableMembers" ) ) {
					if( attrHppDb2LUWTableMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppDb2LUWTableMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppDb2LUWTableImplementation" ) ) {
					if( attrHppDb2LUWTableImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppDb2LUWTableImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppMSSqlTableInclude" ) ) {
					if( attrHppMSSqlTableInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppMSSqlTableInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppMSSqlTableMembers" ) ) {
					if( attrHppMSSqlTableMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppMSSqlTableMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppMSSqlTableImplementation" ) ) {
					if( attrHppMSSqlTableImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppMSSqlTableImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppMySqlTableInclude" ) ) {
					if( attrHppMySqlTableInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppMySqlTableInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppMySqlTableMembers" ) ) {
					if( attrHppMySqlTableMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppMySqlTableMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppMySqlTableImplementation" ) ) {
					if( attrHppMySqlTableImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppMySqlTableImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppOracleTableInclude" ) ) {
					if( attrHppOracleTableInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppOracleTableInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppOracleTableMembers" ) ) {
					if( attrHppOracleTableMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppOracleTableMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppOracleTableImplementation" ) ) {
					if( attrHppOracleTableImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppOracleTableImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppPgSqlTableInclude" ) ) {
					if( attrHppPgSqlTableInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppPgSqlTableInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppPgSqlTableMembers" ) ) {
					if( attrHppPgSqlTableMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppPgSqlTableMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppPgSqlTableImplementation" ) ) {
					if( attrHppPgSqlTableImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppPgSqlTableImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppRamTableInclude" ) ) {
					if( attrHppRamTableInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppRamTableInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppRamTableMembers" ) ) {
					if( attrHppRamTableMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppRamTableMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppRamTableImplementation" ) ) {
					if( attrHppRamTableImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppRamTableImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppSaxLoaderInclude" ) ) {
					if( attrHppSaxLoaderInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppSaxLoaderInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppSaxLoaderStartElement" ) ) {
					if( attrHppSaxLoaderStartElement != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppSaxLoaderStartElement = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppSaxLoaderEndElement" ) ) {
					if( attrHppSaxLoaderEndElement != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppSaxLoaderEndElement = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppXMsgTableInclude" ) ) {
					if( attrHppXMsgTableInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppXMsgTableInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppXMsgTableFormatters" ) ) {
					if( attrHppXMsgTableFormatters != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppXMsgTableFormatters = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppXMsgRqstTableInclude" ) ) {
					if( attrHppXMsgRqstTableInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppXMsgRqstTableInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppXMsgRspnTableInclude" ) ) {
					if( attrHppXMsgRspnTableInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppXMsgRspnTableInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppXMsgClientTableInclude" ) ) {
					if( attrHppXMsgClientTableInclude != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppXMsgClientTableInclude = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppXMsgRqstTableBody" ) ) {
					if( attrHppXMsgRqstTableBody != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppXMsgRqstTableBody = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppXMsgRspnTableBody" ) ) {
					if( attrHppXMsgRspnTableBody != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppXMsgRspnTableBody = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "HppXMsgClientTableBody" ) ) {
					if( attrHppXMsgClientTableBody != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrHppXMsgClientTableBody = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsObjMembers" ) ) {
					if( attrCsObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsObjInterface" ) ) {
					if( attrCsObjInterface != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsObjInterface = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsObjUsing" ) ) {
					if( attrCsObjUsing != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsObjUsing = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsObjImplementation" ) ) {
					if( attrCsObjImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsObjImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsEditObjMembers" ) ) {
					if( attrCsEditObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsEditObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsEditObjInterface" ) ) {
					if( attrCsEditObjInterface != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsEditObjInterface = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsEditObjUsing" ) ) {
					if( attrCsEditObjUsing != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsEditObjUsing = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsEditObjImplementation" ) ) {
					if( attrCsEditObjImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsEditObjImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsTableUsing" ) ) {
					if( attrCsTableUsing != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsTableUsing = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsTableMembers" ) ) {
					if( attrCsTableMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsTableMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsTableInterface" ) ) {
					if( attrCsTableInterface != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsTableInterface = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsTableImplementation" ) ) {
					if( attrCsTableImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsTableImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsTableObjUsing" ) ) {
					if( attrCsTableObjUsing != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsTableObjUsing = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsTableObjMembers" ) ) {
					if( attrCsTableObjMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsTableObjMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsTableObjInterface" ) ) {
					if( attrCsTableObjInterface != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsTableObjInterface = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsTableObjImplementation" ) ) {
					if( attrCsTableObjImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsTableObjImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsDb2LUWTableUsing" ) ) {
					if( attrCsDb2LUWTableUsing != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsDb2LUWTableUsing = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsDb2LUWTableMembers" ) ) {
					if( attrCsDb2LUWTableMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsDb2LUWTableMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsDb2LUWTableImplementation" ) ) {
					if( attrCsDb2LUWTableImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsDb2LUWTableImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsMSSqlTableUsing" ) ) {
					if( attrCsMSSqlTableUsing != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsMSSqlTableUsing = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsMSSqlTableMembers" ) ) {
					if( attrCsMSSqlTableMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsMSSqlTableMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsMSSqlTableImplementation" ) ) {
					if( attrCsMSSqlTableImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsMSSqlTableImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsMySqlTableUsing" ) ) {
					if( attrCsMySqlTableUsing != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsMySqlTableUsing = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsMySqlTableMembers" ) ) {
					if( attrCsMySqlTableMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsMySqlTableMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsMySqlTableImplementation" ) ) {
					if( attrCsMySqlTableImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsMySqlTableImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsOracleTableUsing" ) ) {
					if( attrCsOracleTableUsing != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsOracleTableUsing = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsOracleTableMembers" ) ) {
					if( attrCsOracleTableMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsOracleTableMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsOracleTableImplementation" ) ) {
					if( attrCsOracleTableImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsOracleTableImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsPgSqlTableUsing" ) ) {
					if( attrCsPgSqlTableUsing != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsPgSqlTableUsing = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsPgSqlTableMembers" ) ) {
					if( attrCsPgSqlTableMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsPgSqlTableMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsPgSqlTableImplementation" ) ) {
					if( attrCsPgSqlTableImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsPgSqlTableImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsRamTableUsing" ) ) {
					if( attrCsRamTableUsing != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsRamTableUsing = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsRamTableMembers" ) ) {
					if( attrCsRamTableMembers != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsRamTableMembers = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsRamTableImplementation" ) ) {
					if( attrCsRamTableImplementation != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsRamTableImplementation = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsSaxLoaderUsing" ) ) {
					if( attrCsSaxLoaderUsing != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsSaxLoaderUsing = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsSaxLoaderStartElement" ) ) {
					if( attrCsSaxLoaderStartElement != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsSaxLoaderStartElement = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsSaxLoaderEndElement" ) ) {
					if( attrCsSaxLoaderEndElement != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsSaxLoaderEndElement = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsXMsgTableUsing" ) ) {
					if( attrCsXMsgTableUsing != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsXMsgTableUsing = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsXMsgTableFormatters" ) ) {
					if( attrCsXMsgTableFormatters != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsXMsgTableFormatters = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsXMsgRqstTableUsing" ) ) {
					if( attrCsXMsgRqstTableUsing != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsXMsgRqstTableUsing = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsXMsgRspnTableUsing" ) ) {
					if( attrCsXMsgRspnTableUsing != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsXMsgRspnTableUsing = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsXMsgClientTableUsing" ) ) {
					if( attrCsXMsgClientTableUsing != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsXMsgClientTableUsing = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsXMsgRqstTableBody" ) ) {
					if( attrCsXMsgRqstTableBody != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsXMsgRqstTableBody = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsXMsgRspnTableBody" ) ) {
					if( attrCsXMsgRspnTableBody != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsXMsgRspnTableBody = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CsXMsgClientTableBody" ) ) {
					if( attrCsXMsgClientTableBody != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCsXMsgClientTableBody = attrs.getValue( idxAttr );
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
			if( ( attrSchemaDefId == null ) || ( attrSchemaDefId.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"SchemaDefId" );
			}
			if( attrName == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"Name" );
			}
			if( ( attrPageData == null ) || ( attrPageData.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"PageData" );
			}
			if( attrTableClassCode == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"TableClassCode" );
			}
			if( ( attrIsInstantiable == null ) || ( attrIsInstantiable.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"IsInstantiable" );
			}
			if( ( attrHasHistory == null ) || ( attrHasHistory.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"HasHistory" );
			}
			if( ( attrHasAuditColumns == null ) || ( attrHasAuditColumns.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"HasAuditColumns" );
			}
			if( ( attrIsMutable == null ) || ( attrIsMutable.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"IsMutable" );
			}
			if( ( attrIsServerOnly == null ) || ( attrIsServerOnly.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"IsServerOnly" );
			}
			if( ( attrLoaderBehaviour == null ) || ( attrLoaderBehaviour.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"LoaderBehaviour" );
			}
			if( ( attrSecScope == null ) || ( attrSecScope.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"SecScope" );
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
			long natSchemaDefId = Long.parseLong( attrSchemaDefId );

			Long natDefSchemaTenantId;
			if( ( attrDefSchemaTenantId == null ) || ( attrDefSchemaTenantId.length() <= 0 ) ) {
				natDefSchemaTenantId = null;
			}
			else {
				natDefSchemaTenantId = Long.valueOf( Long.parseLong( attrDefSchemaTenantId ) );
			}

			Long natDefSchemaId;
			if( ( attrDefSchemaId == null ) || ( attrDefSchemaId.length() <= 0 ) ) {
				natDefSchemaId = null;
			}
			else {
				natDefSchemaId = Long.valueOf( Long.parseLong( attrDefSchemaId ) );
			}

			String natName = attrName;

			String natDbName = attrDbName;

			String natShortName = attrShortName;

			String natLabel = attrLabel;

			String natShortDescription = attrShortDescription;

			String natDescription = attrDescription;

			boolean natPageData;
			if( attrPageData.equals( "true" ) || attrPageData.equals( "yes" ) || attrPageData.equals( "1" ) ) {
				natPageData = true;
			}
			else if( attrPageData.equals( "false" ) || attrPageData.equals( "no" ) || attrPageData.equals( "0" ) ) {
				natPageData = false;
			}
			else {
				throw new CFLibUsageException( getClass(),
					S_ProcName,
					"Unexpected PageData value, must be one of true, false, yes, no, 1, or 0, not \"" + attrPageData + "\"" );
			}

			Long natPrimaryIndexTenantId;
			if( ( attrPrimaryIndexTenantId == null ) || ( attrPrimaryIndexTenantId.length() <= 0 ) ) {
				natPrimaryIndexTenantId = null;
			}
			else {
				natPrimaryIndexTenantId = Long.valueOf( Long.parseLong( attrPrimaryIndexTenantId ) );
			}

			Long natPrimaryIndexId;
			if( ( attrPrimaryIndexId == null ) || ( attrPrimaryIndexId.length() <= 0 ) ) {
				natPrimaryIndexId = null;
			}
			else {
				natPrimaryIndexId = Long.valueOf( Long.parseLong( attrPrimaryIndexId ) );
			}

			String natTableClassCode = attrTableClassCode;

			Long natLookupIndexTenantId;
			if( ( attrLookupIndexTenantId == null ) || ( attrLookupIndexTenantId.length() <= 0 ) ) {
				natLookupIndexTenantId = null;
			}
			else {
				natLookupIndexTenantId = Long.valueOf( Long.parseLong( attrLookupIndexTenantId ) );
			}

			Long natLookupIndexId;
			if( ( attrLookupIndexId == null ) || ( attrLookupIndexId.length() <= 0 ) ) {
				natLookupIndexId = null;
			}
			else {
				natLookupIndexId = Long.valueOf( Long.parseLong( attrLookupIndexId ) );
			}

			Long natAltIndexTenantId;
			if( ( attrAltIndexTenantId == null ) || ( attrAltIndexTenantId.length() <= 0 ) ) {
				natAltIndexTenantId = null;
			}
			else {
				natAltIndexTenantId = Long.valueOf( Long.parseLong( attrAltIndexTenantId ) );
			}

			Long natAltIndexId;
			if( ( attrAltIndexId == null ) || ( attrAltIndexId.length() <= 0 ) ) {
				natAltIndexId = null;
			}
			else {
				natAltIndexId = Long.valueOf( Long.parseLong( attrAltIndexId ) );
			}

			Long natQualifyingTenantId;
			if( ( attrQualifyingTenantId == null ) || ( attrQualifyingTenantId.length() <= 0 ) ) {
				natQualifyingTenantId = null;
			}
			else {
				natQualifyingTenantId = Long.valueOf( Long.parseLong( attrQualifyingTenantId ) );
			}

			Long natQualifyingTableId;
			if( ( attrQualifyingTableId == null ) || ( attrQualifyingTableId.length() <= 0 ) ) {
				natQualifyingTableId = null;
			}
			else {
				natQualifyingTableId = Long.valueOf( Long.parseLong( attrQualifyingTableId ) );
			}

			boolean natIsInstantiable;
			if( attrIsInstantiable.equals( "true" ) || attrIsInstantiable.equals( "yes" ) || attrIsInstantiable.equals( "1" ) ) {
				natIsInstantiable = true;
			}
			else if( attrIsInstantiable.equals( "false" ) || attrIsInstantiable.equals( "no" ) || attrIsInstantiable.equals( "0" ) ) {
				natIsInstantiable = false;
			}
			else {
				throw new CFLibUsageException( getClass(),
					S_ProcName,
					"Unexpected IsInstantiable value, must be one of true, false, yes, no, 1, or 0, not \"" + attrIsInstantiable + "\"" );
			}

			boolean natHasHistory;
			if( attrHasHistory.equals( "true" ) || attrHasHistory.equals( "yes" ) || attrHasHistory.equals( "1" ) ) {
				natHasHistory = true;
			}
			else if( attrHasHistory.equals( "false" ) || attrHasHistory.equals( "no" ) || attrHasHistory.equals( "0" ) ) {
				natHasHistory = false;
			}
			else {
				throw new CFLibUsageException( getClass(),
					S_ProcName,
					"Unexpected HasHistory value, must be one of true, false, yes, no, 1, or 0, not \"" + attrHasHistory + "\"" );
			}

			boolean natHasAuditColumns;
			if( attrHasAuditColumns.equals( "true" ) || attrHasAuditColumns.equals( "yes" ) || attrHasAuditColumns.equals( "1" ) ) {
				natHasAuditColumns = true;
			}
			else if( attrHasAuditColumns.equals( "false" ) || attrHasAuditColumns.equals( "no" ) || attrHasAuditColumns.equals( "0" ) ) {
				natHasAuditColumns = false;
			}
			else {
				throw new CFLibUsageException( getClass(),
					S_ProcName,
					"Unexpected HasAuditColumns value, must be one of true, false, yes, no, 1, or 0, not \"" + attrHasAuditColumns + "\"" );
			}

			boolean natIsMutable;
			if( attrIsMutable.equals( "true" ) || attrIsMutable.equals( "yes" ) || attrIsMutable.equals( "1" ) ) {
				natIsMutable = true;
			}
			else if( attrIsMutable.equals( "false" ) || attrIsMutable.equals( "no" ) || attrIsMutable.equals( "0" ) ) {
				natIsMutable = false;
			}
			else {
				throw new CFLibUsageException( getClass(),
					S_ProcName,
					"Unexpected IsMutable value, must be one of true, false, yes, no, 1, or 0, not \"" + attrIsMutable + "\"" );
			}

			boolean natIsServerOnly;
			if( attrIsServerOnly.equals( "true" ) || attrIsServerOnly.equals( "yes" ) || attrIsServerOnly.equals( "1" ) ) {
				natIsServerOnly = true;
			}
			else if( attrIsServerOnly.equals( "false" ) || attrIsServerOnly.equals( "no" ) || attrIsServerOnly.equals( "0" ) ) {
				natIsServerOnly = false;
			}
			else {
				throw new CFLibUsageException( getClass(),
					S_ProcName,
					"Unexpected IsServerOnly value, must be one of true, false, yes, no, 1, or 0, not \"" + attrIsServerOnly + "\"" );
			}

			ICFBamSchema.LoaderBehaviourEnum natLoaderBehaviour = CFBamSchema.parseLoaderBehaviourEnum( attrLoaderBehaviour );

			ICFBamSchema.SecScopeEnum natSecScope = CFBamSchema.parseSecScopeEnum( attrSecScope );

			String natJObjMembers = attrJObjMembers;

			String natJObjInterface = attrJObjInterface;

			String natJObjImport = attrJObjImport;

			String natJObjImplementation = attrJObjImplementation;

			String natJEditObjMembers = attrJEditObjMembers;

			String natJEditObjInterface = attrJEditObjInterface;

			String natJEditObjImport = attrJEditObjImport;

			String natJEditObjImplementation = attrJEditObjImplementation;

			String natJTableImport = attrJTableImport;

			String natJTableMembers = attrJTableMembers;

			String natJTableInterface = attrJTableInterface;

			String natJTableImplementation = attrJTableImplementation;

			String natJTableObjImport = attrJTableObjImport;

			String natJTableObjMembers = attrJTableObjMembers;

			String natJTableObjInterface = attrJTableObjInterface;

			String natJTableObjImplementation = attrJTableObjImplementation;

			String natJDb2LUWTableImport = attrJDb2LUWTableImport;

			String natJDb2LUWTableMembers = attrJDb2LUWTableMembers;

			String natJDb2LUWTableImplementation = attrJDb2LUWTableImplementation;

			String natJMSSqlTableImport = attrJMSSqlTableImport;

			String natJMSSqlTableMembers = attrJMSSqlTableMembers;

			String natJMSSqlTableImplementation = attrJMSSqlTableImplementation;

			String natJMySqlTableImport = attrJMySqlTableImport;

			String natJMySqlTableMembers = attrJMySqlTableMembers;

			String natJMySqlTableImplementation = attrJMySqlTableImplementation;

			String natJOracleTableImport = attrJOracleTableImport;

			String natJOracleTableMembers = attrJOracleTableMembers;

			String natJOracleTableImplementation = attrJOracleTableImplementation;

			String natJPgSqlTableImport = attrJPgSqlTableImport;

			String natJPgSqlTableMembers = attrJPgSqlTableMembers;

			String natJPgSqlTableImplementation = attrJPgSqlTableImplementation;

			String natJRamTableImport = attrJRamTableImport;

			String natJRamTableMembers = attrJRamTableMembers;

			String natJRamTableImplementation = attrJRamTableImplementation;

			String natJSaxLoaderImport = attrJSaxLoaderImport;

			String natJSaxLoaderStartElement = attrJSaxLoaderStartElement;

			String natJSaxLoaderEndElement = attrJSaxLoaderEndElement;

			String natJXMsgTableImport = attrJXMsgTableImport;

			String natJXMsgTableFormatters = attrJXMsgTableFormatters;

			String natJXMsgRqstTableImport = attrJXMsgRqstTableImport;

			String natJXMsgRspnTableImport = attrJXMsgRspnTableImport;

			String natJXMsgClientTableImport = attrJXMsgClientTableImport;

			String natJXMsgRqstTableBody = attrJXMsgRqstTableBody;

			String natJXMsgRspnTableBody = attrJXMsgRspnTableBody;

			String natJXMsgClientTableBody = attrJXMsgClientTableBody;

			String natCppObjMembers = attrCppObjMembers;

			String natCppObjInterface = attrCppObjInterface;

			String natCppObjInclude = attrCppObjInclude;

			String natCppObjImplementation = attrCppObjImplementation;

			String natCppEditObjMembers = attrCppEditObjMembers;

			String natCppEditObjInterface = attrCppEditObjInterface;

			String natCppEditObjInclude = attrCppEditObjInclude;

			String natCppEditObjImplementation = attrCppEditObjImplementation;

			String natCppTableInclude = attrCppTableInclude;

			String natCppTableMembers = attrCppTableMembers;

			String natCppTableInterface = attrCppTableInterface;

			String natCppTableImplementation = attrCppTableImplementation;

			String natCppTableObjInclude = attrCppTableObjInclude;

			String natCppTableObjMembers = attrCppTableObjMembers;

			String natCppTableObjInterface = attrCppTableObjInterface;

			String natCppTableObjImplementation = attrCppTableObjImplementation;

			String natCppDb2LUWTableInclude = attrCppDb2LUWTableInclude;

			String natCppDb2LUWTableMembers = attrCppDb2LUWTableMembers;

			String natCppDb2LUWTableImplementation = attrCppDb2LUWTableImplementation;

			String natCppMSSqlTableInclude = attrCppMSSqlTableInclude;

			String natCppMSSqlTableMembers = attrCppMSSqlTableMembers;

			String natCppMSSqlTableImplementation = attrCppMSSqlTableImplementation;

			String natCppMySqlTableInclude = attrCppMySqlTableInclude;

			String natCppMySqlTableMembers = attrCppMySqlTableMembers;

			String natCppMySqlTableImplementation = attrCppMySqlTableImplementation;

			String natCppOracleTableInclude = attrCppOracleTableInclude;

			String natCppOracleTableMembers = attrCppOracleTableMembers;

			String natCppOracleTableImplementation = attrCppOracleTableImplementation;

			String natCppPgSqlTableInclude = attrCppPgSqlTableInclude;

			String natCppPgSqlTableMembers = attrCppPgSqlTableMembers;

			String natCppPgSqlTableImplementation = attrCppPgSqlTableImplementation;

			String natCppRamTableInclude = attrCppRamTableInclude;

			String natCppRamTableMembers = attrCppRamTableMembers;

			String natCppRamTableImplementation = attrCppRamTableImplementation;

			String natCppSaxLoaderInclude = attrCppSaxLoaderInclude;

			String natCppSaxLoaderStartElement = attrCppSaxLoaderStartElement;

			String natCppSaxLoaderEndElement = attrCppSaxLoaderEndElement;

			String natCppXMsgTableInclude = attrCppXMsgTableInclude;

			String natCppXMsgTableFormatters = attrCppXMsgTableFormatters;

			String natCppXMsgRqstTableInclude = attrCppXMsgRqstTableInclude;

			String natCppXMsgRspnTableInclude = attrCppXMsgRspnTableInclude;

			String natCppXMsgClientTableInclude = attrCppXMsgClientTableInclude;

			String natCppXMsgRqstTableBody = attrCppXMsgRqstTableBody;

			String natCppXMsgRspnTableBody = attrCppXMsgRspnTableBody;

			String natCppXMsgClientTableBody = attrCppXMsgClientTableBody;

			String natHppObjMembers = attrHppObjMembers;

			String natHppObjInterface = attrHppObjInterface;

			String natHppObjInclude = attrHppObjInclude;

			String natHppObjImplementation = attrHppObjImplementation;

			String natHppEditObjMembers = attrHppEditObjMembers;

			String natHppEditObjInterface = attrHppEditObjInterface;

			String natHppEditObjInclude = attrHppEditObjInclude;

			String natHppEditObjImplementation = attrHppEditObjImplementation;

			String natHppTableInclude = attrHppTableInclude;

			String natHppTableMembers = attrHppTableMembers;

			String natHppTableInterface = attrHppTableInterface;

			String natHppTableImplementation = attrHppTableImplementation;

			String natHppTableObjInclude = attrHppTableObjInclude;

			String natHppTableObjMembers = attrHppTableObjMembers;

			String natHppTableObjInterface = attrHppTableObjInterface;

			String natHppTableObjImplementation = attrHppTableObjImplementation;

			String natHppDb2LUWTableInclude = attrHppDb2LUWTableInclude;

			String natHppDb2LUWTableMembers = attrHppDb2LUWTableMembers;

			String natHppDb2LUWTableImplementation = attrHppDb2LUWTableImplementation;

			String natHppMSSqlTableInclude = attrHppMSSqlTableInclude;

			String natHppMSSqlTableMembers = attrHppMSSqlTableMembers;

			String natHppMSSqlTableImplementation = attrHppMSSqlTableImplementation;

			String natHppMySqlTableInclude = attrHppMySqlTableInclude;

			String natHppMySqlTableMembers = attrHppMySqlTableMembers;

			String natHppMySqlTableImplementation = attrHppMySqlTableImplementation;

			String natHppOracleTableInclude = attrHppOracleTableInclude;

			String natHppOracleTableMembers = attrHppOracleTableMembers;

			String natHppOracleTableImplementation = attrHppOracleTableImplementation;

			String natHppPgSqlTableInclude = attrHppPgSqlTableInclude;

			String natHppPgSqlTableMembers = attrHppPgSqlTableMembers;

			String natHppPgSqlTableImplementation = attrHppPgSqlTableImplementation;

			String natHppRamTableInclude = attrHppRamTableInclude;

			String natHppRamTableMembers = attrHppRamTableMembers;

			String natHppRamTableImplementation = attrHppRamTableImplementation;

			String natHppSaxLoaderInclude = attrHppSaxLoaderInclude;

			String natHppSaxLoaderStartElement = attrHppSaxLoaderStartElement;

			String natHppSaxLoaderEndElement = attrHppSaxLoaderEndElement;

			String natHppXMsgTableInclude = attrHppXMsgTableInclude;

			String natHppXMsgTableFormatters = attrHppXMsgTableFormatters;

			String natHppXMsgRqstTableInclude = attrHppXMsgRqstTableInclude;

			String natHppXMsgRspnTableInclude = attrHppXMsgRspnTableInclude;

			String natHppXMsgClientTableInclude = attrHppXMsgClientTableInclude;

			String natHppXMsgRqstTableBody = attrHppXMsgRqstTableBody;

			String natHppXMsgRspnTableBody = attrHppXMsgRspnTableBody;

			String natHppXMsgClientTableBody = attrHppXMsgClientTableBody;

			String natCsObjMembers = attrCsObjMembers;

			String natCsObjInterface = attrCsObjInterface;

			String natCsObjUsing = attrCsObjUsing;

			String natCsObjImplementation = attrCsObjImplementation;

			String natCsEditObjMembers = attrCsEditObjMembers;

			String natCsEditObjInterface = attrCsEditObjInterface;

			String natCsEditObjUsing = attrCsEditObjUsing;

			String natCsEditObjImplementation = attrCsEditObjImplementation;

			String natCsTableUsing = attrCsTableUsing;

			String natCsTableMembers = attrCsTableMembers;

			String natCsTableInterface = attrCsTableInterface;

			String natCsTableImplementation = attrCsTableImplementation;

			String natCsTableObjUsing = attrCsTableObjUsing;

			String natCsTableObjMembers = attrCsTableObjMembers;

			String natCsTableObjInterface = attrCsTableObjInterface;

			String natCsTableObjImplementation = attrCsTableObjImplementation;

			String natCsDb2LUWTableUsing = attrCsDb2LUWTableUsing;

			String natCsDb2LUWTableMembers = attrCsDb2LUWTableMembers;

			String natCsDb2LUWTableImplementation = attrCsDb2LUWTableImplementation;

			String natCsMSSqlTableUsing = attrCsMSSqlTableUsing;

			String natCsMSSqlTableMembers = attrCsMSSqlTableMembers;

			String natCsMSSqlTableImplementation = attrCsMSSqlTableImplementation;

			String natCsMySqlTableUsing = attrCsMySqlTableUsing;

			String natCsMySqlTableMembers = attrCsMySqlTableMembers;

			String natCsMySqlTableImplementation = attrCsMySqlTableImplementation;

			String natCsOracleTableUsing = attrCsOracleTableUsing;

			String natCsOracleTableMembers = attrCsOracleTableMembers;

			String natCsOracleTableImplementation = attrCsOracleTableImplementation;

			String natCsPgSqlTableUsing = attrCsPgSqlTableUsing;

			String natCsPgSqlTableMembers = attrCsPgSqlTableMembers;

			String natCsPgSqlTableImplementation = attrCsPgSqlTableImplementation;

			String natCsRamTableUsing = attrCsRamTableUsing;

			String natCsRamTableMembers = attrCsRamTableMembers;

			String natCsRamTableImplementation = attrCsRamTableImplementation;

			String natCsSaxLoaderUsing = attrCsSaxLoaderUsing;

			String natCsSaxLoaderStartElement = attrCsSaxLoaderStartElement;

			String natCsSaxLoaderEndElement = attrCsSaxLoaderEndElement;

			String natCsXMsgTableUsing = attrCsXMsgTableUsing;

			String natCsXMsgTableFormatters = attrCsXMsgTableFormatters;

			String natCsXMsgRqstTableUsing = attrCsXMsgRqstTableUsing;

			String natCsXMsgRspnTableUsing = attrCsXMsgRspnTableUsing;

			String natCsXMsgClientTableUsing = attrCsXMsgClientTableUsing;

			String natCsXMsgRqstTableBody = attrCsXMsgRqstTableBody;

			String natCsXMsgRspnTableBody = attrCsXMsgRspnTableBody;

			String natCsXMsgClientTableBody = attrCsXMsgClientTableBody;

			// Instantiate a buffer for the parsed information
			ICFBamTableObj obj = (ICFBamTableObj)schemaObj.getTableTableObj().newInstance();
			CFBamTableBuff dataBuff = obj.getTableBuff();
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
			dataBuff.setRequiredSchemaDefId( natSchemaDefId );
			dataBuff.setOptionalDefSchemaTenantId( natDefSchemaTenantId );
			dataBuff.setOptionalDefSchemaId( natDefSchemaId );
			dataBuff.setRequiredName( natName );
			dataBuff.setOptionalDbName( natDbName );
			dataBuff.setOptionalShortName( natShortName );
			dataBuff.setOptionalLabel( natLabel );
			dataBuff.setOptionalShortDescription( natShortDescription );
			dataBuff.setOptionalDescription( natDescription );
			dataBuff.setRequiredPageData( natPageData );
			dataBuff.setOptionalPrimaryIndexTenantId( natPrimaryIndexTenantId );
			dataBuff.setOptionalPrimaryIndexId( natPrimaryIndexId );
			dataBuff.setRequiredTableClassCode( natTableClassCode );
			dataBuff.setOptionalLookupIndexTenantId( natLookupIndexTenantId );
			dataBuff.setOptionalLookupIndexId( natLookupIndexId );
			dataBuff.setOptionalAltIndexTenantId( natAltIndexTenantId );
			dataBuff.setOptionalAltIndexId( natAltIndexId );
			dataBuff.setOptionalQualifyingTenantId( natQualifyingTenantId );
			dataBuff.setOptionalQualifyingTableId( natQualifyingTableId );
			dataBuff.setRequiredIsInstantiable( natIsInstantiable );
			dataBuff.setRequiredHasHistory( natHasHistory );
			dataBuff.setRequiredHasAuditColumns( natHasAuditColumns );
			dataBuff.setRequiredIsMutable( natIsMutable );
			dataBuff.setRequiredIsServerOnly( natIsServerOnly );
			dataBuff.setRequiredLoaderBehaviour( natLoaderBehaviour );
			dataBuff.setRequiredSecScope( natSecScope );
			dataBuff.setOptionalJObjMembers( natJObjMembers );
			dataBuff.setOptionalJObjInterface( natJObjInterface );
			dataBuff.setOptionalJObjImport( natJObjImport );
			dataBuff.setOptionalJObjImplementation( natJObjImplementation );
			dataBuff.setOptionalJEditObjMembers( natJEditObjMembers );
			dataBuff.setOptionalJEditObjInterface( natJEditObjInterface );
			dataBuff.setOptionalJEditObjImport( natJEditObjImport );
			dataBuff.setOptionalJEditObjImplementation( natJEditObjImplementation );
			dataBuff.setOptionalJTableImport( natJTableImport );
			dataBuff.setOptionalJTableMembers( natJTableMembers );
			dataBuff.setOptionalJTableInterface( natJTableInterface );
			dataBuff.setOptionalJTableImplementation( natJTableImplementation );
			dataBuff.setOptionalJTableObjImport( natJTableObjImport );
			dataBuff.setOptionalJTableObjMembers( natJTableObjMembers );
			dataBuff.setOptionalJTableObjInterface( natJTableObjInterface );
			dataBuff.setOptionalJTableObjImplementation( natJTableObjImplementation );
			dataBuff.setOptionalJDb2LUWTableImport( natJDb2LUWTableImport );
			dataBuff.setOptionalJDb2LUWTableMembers( natJDb2LUWTableMembers );
			dataBuff.setOptionalJDb2LUWTableImplementation( natJDb2LUWTableImplementation );
			dataBuff.setOptionalJMSSqlTableImport( natJMSSqlTableImport );
			dataBuff.setOptionalJMSSqlTableMembers( natJMSSqlTableMembers );
			dataBuff.setOptionalJMSSqlTableImplementation( natJMSSqlTableImplementation );
			dataBuff.setOptionalJMySqlTableImport( natJMySqlTableImport );
			dataBuff.setOptionalJMySqlTableMembers( natJMySqlTableMembers );
			dataBuff.setOptionalJMySqlTableImplementation( natJMySqlTableImplementation );
			dataBuff.setOptionalJOracleTableImport( natJOracleTableImport );
			dataBuff.setOptionalJOracleTableMembers( natJOracleTableMembers );
			dataBuff.setOptionalJOracleTableImplementation( natJOracleTableImplementation );
			dataBuff.setOptionalJPgSqlTableImport( natJPgSqlTableImport );
			dataBuff.setOptionalJPgSqlTableMembers( natJPgSqlTableMembers );
			dataBuff.setOptionalJPgSqlTableImplementation( natJPgSqlTableImplementation );
			dataBuff.setOptionalJRamTableImport( natJRamTableImport );
			dataBuff.setOptionalJRamTableMembers( natJRamTableMembers );
			dataBuff.setOptionalJRamTableImplementation( natJRamTableImplementation );
			dataBuff.setOptionalJSaxLoaderImport( natJSaxLoaderImport );
			dataBuff.setOptionalJSaxLoaderStartElement( natJSaxLoaderStartElement );
			dataBuff.setOptionalJSaxLoaderEndElement( natJSaxLoaderEndElement );
			dataBuff.setOptionalJXMsgTableImport( natJXMsgTableImport );
			dataBuff.setOptionalJXMsgTableFormatters( natJXMsgTableFormatters );
			dataBuff.setOptionalJXMsgRqstTableImport( natJXMsgRqstTableImport );
			dataBuff.setOptionalJXMsgRspnTableImport( natJXMsgRspnTableImport );
			dataBuff.setOptionalJXMsgClientTableImport( natJXMsgClientTableImport );
			dataBuff.setOptionalJXMsgRqstTableBody( natJXMsgRqstTableBody );
			dataBuff.setOptionalJXMsgRspnTableBody( natJXMsgRspnTableBody );
			dataBuff.setOptionalJXMsgClientTableBody( natJXMsgClientTableBody );
			dataBuff.setOptionalCppObjMembers( natCppObjMembers );
			dataBuff.setOptionalCppObjInterface( natCppObjInterface );
			dataBuff.setOptionalCppObjInclude( natCppObjInclude );
			dataBuff.setOptionalCppObjImplementation( natCppObjImplementation );
			dataBuff.setOptionalCppEditObjMembers( natCppEditObjMembers );
			dataBuff.setOptionalCppEditObjInterface( natCppEditObjInterface );
			dataBuff.setOptionalCppEditObjInclude( natCppEditObjInclude );
			dataBuff.setOptionalCppEditObjImplementation( natCppEditObjImplementation );
			dataBuff.setOptionalCppTableInclude( natCppTableInclude );
			dataBuff.setOptionalCppTableMembers( natCppTableMembers );
			dataBuff.setOptionalCppTableInterface( natCppTableInterface );
			dataBuff.setOptionalCppTableImplementation( natCppTableImplementation );
			dataBuff.setOptionalCppTableObjInclude( natCppTableObjInclude );
			dataBuff.setOptionalCppTableObjMembers( natCppTableObjMembers );
			dataBuff.setOptionalCppTableObjInterface( natCppTableObjInterface );
			dataBuff.setOptionalCppTableObjImplementation( natCppTableObjImplementation );
			dataBuff.setOptionalCppDb2LUWTableInclude( natCppDb2LUWTableInclude );
			dataBuff.setOptionalCppDb2LUWTableMembers( natCppDb2LUWTableMembers );
			dataBuff.setOptionalCppDb2LUWTableImplementation( natCppDb2LUWTableImplementation );
			dataBuff.setOptionalCppMSSqlTableInclude( natCppMSSqlTableInclude );
			dataBuff.setOptionalCppMSSqlTableMembers( natCppMSSqlTableMembers );
			dataBuff.setOptionalCppMSSqlTableImplementation( natCppMSSqlTableImplementation );
			dataBuff.setOptionalCppMySqlTableInclude( natCppMySqlTableInclude );
			dataBuff.setOptionalCppMySqlTableMembers( natCppMySqlTableMembers );
			dataBuff.setOptionalCppMySqlTableImplementation( natCppMySqlTableImplementation );
			dataBuff.setOptionalCppOracleTableInclude( natCppOracleTableInclude );
			dataBuff.setOptionalCppOracleTableMembers( natCppOracleTableMembers );
			dataBuff.setOptionalCppOracleTableImplementation( natCppOracleTableImplementation );
			dataBuff.setOptionalCppPgSqlTableInclude( natCppPgSqlTableInclude );
			dataBuff.setOptionalCppPgSqlTableMembers( natCppPgSqlTableMembers );
			dataBuff.setOptionalCppPgSqlTableImplementation( natCppPgSqlTableImplementation );
			dataBuff.setOptionalCppRamTableInclude( natCppRamTableInclude );
			dataBuff.setOptionalCppRamTableMembers( natCppRamTableMembers );
			dataBuff.setOptionalCppRamTableImplementation( natCppRamTableImplementation );
			dataBuff.setOptionalCppSaxLoaderInclude( natCppSaxLoaderInclude );
			dataBuff.setOptionalCppSaxLoaderStartElement( natCppSaxLoaderStartElement );
			dataBuff.setOptionalCppSaxLoaderEndElement( natCppSaxLoaderEndElement );
			dataBuff.setOptionalCppXMsgTableInclude( natCppXMsgTableInclude );
			dataBuff.setOptionalCppXMsgTableFormatters( natCppXMsgTableFormatters );
			dataBuff.setOptionalCppXMsgRqstTableInclude( natCppXMsgRqstTableInclude );
			dataBuff.setOptionalCppXMsgRspnTableInclude( natCppXMsgRspnTableInclude );
			dataBuff.setOptionalCppXMsgClientTableInclude( natCppXMsgClientTableInclude );
			dataBuff.setOptionalCppXMsgRqstTableBody( natCppXMsgRqstTableBody );
			dataBuff.setOptionalCppXMsgRspnTableBody( natCppXMsgRspnTableBody );
			dataBuff.setOptionalCppXMsgClientTableBody( natCppXMsgClientTableBody );
			dataBuff.setOptionalHppObjMembers( natHppObjMembers );
			dataBuff.setOptionalHppObjInterface( natHppObjInterface );
			dataBuff.setOptionalHppObjInclude( natHppObjInclude );
			dataBuff.setOptionalHppObjImplementation( natHppObjImplementation );
			dataBuff.setOptionalHppEditObjMembers( natHppEditObjMembers );
			dataBuff.setOptionalHppEditObjInterface( natHppEditObjInterface );
			dataBuff.setOptionalHppEditObjInclude( natHppEditObjInclude );
			dataBuff.setOptionalHppEditObjImplementation( natHppEditObjImplementation );
			dataBuff.setOptionalHppTableInclude( natHppTableInclude );
			dataBuff.setOptionalHppTableMembers( natHppTableMembers );
			dataBuff.setOptionalHppTableInterface( natHppTableInterface );
			dataBuff.setOptionalHppTableImplementation( natHppTableImplementation );
			dataBuff.setOptionalHppTableObjInclude( natHppTableObjInclude );
			dataBuff.setOptionalHppTableObjMembers( natHppTableObjMembers );
			dataBuff.setOptionalHppTableObjInterface( natHppTableObjInterface );
			dataBuff.setOptionalHppTableObjImplementation( natHppTableObjImplementation );
			dataBuff.setOptionalHppDb2LUWTableInclude( natHppDb2LUWTableInclude );
			dataBuff.setOptionalHppDb2LUWTableMembers( natHppDb2LUWTableMembers );
			dataBuff.setOptionalHppDb2LUWTableImplementation( natHppDb2LUWTableImplementation );
			dataBuff.setOptionalHppMSSqlTableInclude( natHppMSSqlTableInclude );
			dataBuff.setOptionalHppMSSqlTableMembers( natHppMSSqlTableMembers );
			dataBuff.setOptionalHppMSSqlTableImplementation( natHppMSSqlTableImplementation );
			dataBuff.setOptionalHppMySqlTableInclude( natHppMySqlTableInclude );
			dataBuff.setOptionalHppMySqlTableMembers( natHppMySqlTableMembers );
			dataBuff.setOptionalHppMySqlTableImplementation( natHppMySqlTableImplementation );
			dataBuff.setOptionalHppOracleTableInclude( natHppOracleTableInclude );
			dataBuff.setOptionalHppOracleTableMembers( natHppOracleTableMembers );
			dataBuff.setOptionalHppOracleTableImplementation( natHppOracleTableImplementation );
			dataBuff.setOptionalHppPgSqlTableInclude( natHppPgSqlTableInclude );
			dataBuff.setOptionalHppPgSqlTableMembers( natHppPgSqlTableMembers );
			dataBuff.setOptionalHppPgSqlTableImplementation( natHppPgSqlTableImplementation );
			dataBuff.setOptionalHppRamTableInclude( natHppRamTableInclude );
			dataBuff.setOptionalHppRamTableMembers( natHppRamTableMembers );
			dataBuff.setOptionalHppRamTableImplementation( natHppRamTableImplementation );
			dataBuff.setOptionalHppSaxLoaderInclude( natHppSaxLoaderInclude );
			dataBuff.setOptionalHppSaxLoaderStartElement( natHppSaxLoaderStartElement );
			dataBuff.setOptionalHppSaxLoaderEndElement( natHppSaxLoaderEndElement );
			dataBuff.setOptionalHppXMsgTableInclude( natHppXMsgTableInclude );
			dataBuff.setOptionalHppXMsgTableFormatters( natHppXMsgTableFormatters );
			dataBuff.setOptionalHppXMsgRqstTableInclude( natHppXMsgRqstTableInclude );
			dataBuff.setOptionalHppXMsgRspnTableInclude( natHppXMsgRspnTableInclude );
			dataBuff.setOptionalHppXMsgClientTableInclude( natHppXMsgClientTableInclude );
			dataBuff.setOptionalHppXMsgRqstTableBody( natHppXMsgRqstTableBody );
			dataBuff.setOptionalHppXMsgRspnTableBody( natHppXMsgRspnTableBody );
			dataBuff.setOptionalHppXMsgClientTableBody( natHppXMsgClientTableBody );
			dataBuff.setOptionalCsObjMembers( natCsObjMembers );
			dataBuff.setOptionalCsObjInterface( natCsObjInterface );
			dataBuff.setOptionalCsObjUsing( natCsObjUsing );
			dataBuff.setOptionalCsObjImplementation( natCsObjImplementation );
			dataBuff.setOptionalCsEditObjMembers( natCsEditObjMembers );
			dataBuff.setOptionalCsEditObjInterface( natCsEditObjInterface );
			dataBuff.setOptionalCsEditObjUsing( natCsEditObjUsing );
			dataBuff.setOptionalCsEditObjImplementation( natCsEditObjImplementation );
			dataBuff.setOptionalCsTableUsing( natCsTableUsing );
			dataBuff.setOptionalCsTableMembers( natCsTableMembers );
			dataBuff.setOptionalCsTableInterface( natCsTableInterface );
			dataBuff.setOptionalCsTableImplementation( natCsTableImplementation );
			dataBuff.setOptionalCsTableObjUsing( natCsTableObjUsing );
			dataBuff.setOptionalCsTableObjMembers( natCsTableObjMembers );
			dataBuff.setOptionalCsTableObjInterface( natCsTableObjInterface );
			dataBuff.setOptionalCsTableObjImplementation( natCsTableObjImplementation );
			dataBuff.setOptionalCsDb2LUWTableUsing( natCsDb2LUWTableUsing );
			dataBuff.setOptionalCsDb2LUWTableMembers( natCsDb2LUWTableMembers );
			dataBuff.setOptionalCsDb2LUWTableImplementation( natCsDb2LUWTableImplementation );
			dataBuff.setOptionalCsMSSqlTableUsing( natCsMSSqlTableUsing );
			dataBuff.setOptionalCsMSSqlTableMembers( natCsMSSqlTableMembers );
			dataBuff.setOptionalCsMSSqlTableImplementation( natCsMSSqlTableImplementation );
			dataBuff.setOptionalCsMySqlTableUsing( natCsMySqlTableUsing );
			dataBuff.setOptionalCsMySqlTableMembers( natCsMySqlTableMembers );
			dataBuff.setOptionalCsMySqlTableImplementation( natCsMySqlTableImplementation );
			dataBuff.setOptionalCsOracleTableUsing( natCsOracleTableUsing );
			dataBuff.setOptionalCsOracleTableMembers( natCsOracleTableMembers );
			dataBuff.setOptionalCsOracleTableImplementation( natCsOracleTableImplementation );
			dataBuff.setOptionalCsPgSqlTableUsing( natCsPgSqlTableUsing );
			dataBuff.setOptionalCsPgSqlTableMembers( natCsPgSqlTableMembers );
			dataBuff.setOptionalCsPgSqlTableImplementation( natCsPgSqlTableImplementation );
			dataBuff.setOptionalCsRamTableUsing( natCsRamTableUsing );
			dataBuff.setOptionalCsRamTableMembers( natCsRamTableMembers );
			dataBuff.setOptionalCsRamTableImplementation( natCsRamTableImplementation );
			dataBuff.setOptionalCsSaxLoaderUsing( natCsSaxLoaderUsing );
			dataBuff.setOptionalCsSaxLoaderStartElement( natCsSaxLoaderStartElement );
			dataBuff.setOptionalCsSaxLoaderEndElement( natCsSaxLoaderEndElement );
			dataBuff.setOptionalCsXMsgTableUsing( natCsXMsgTableUsing );
			dataBuff.setOptionalCsXMsgTableFormatters( natCsXMsgTableFormatters );
			dataBuff.setOptionalCsXMsgRqstTableUsing( natCsXMsgRqstTableUsing );
			dataBuff.setOptionalCsXMsgRspnTableUsing( natCsXMsgRspnTableUsing );
			dataBuff.setOptionalCsXMsgClientTableUsing( natCsXMsgClientTableUsing );
			dataBuff.setOptionalCsXMsgRqstTableBody( natCsXMsgRqstTableBody );
			dataBuff.setOptionalCsXMsgRspnTableBody( natCsXMsgRspnTableBody );
			dataBuff.setOptionalCsXMsgClientTableBody( natCsXMsgClientTableBody );
			obj.copyBuffToPKey();
			ICFBamTableObj realised = (ICFBamTableObj)obj.realise();
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
