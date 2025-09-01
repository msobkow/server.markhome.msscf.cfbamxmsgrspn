
// Description: Java 11 XML Message SAX Response Record Element  for PopSubDep1

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
 *	CFBamXMsgRspnPopSubDep1Created XML SAX Element  implementation
 *	for PopSubDep1.
 */
public class CFBamXMsgRspnPopSubDep1Created
	extends CFLibXmlCoreElementHandler
{
	public CFBamXMsgRspnPopSubDep1Created( CFBamXMsgRspn xmsgRspn ) {
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
			// PopDep Attributes
			String	attrDefSchemaTenantId = null;
			String	attrDefSchemaId = null;
			String	attrRelationTenantId = null;
			String	attrRelationId = null;
			// PopSubDep1 Attributes
			String	attrPopTopDepTenantId = null;
			String	attrPopTopDepId = null;
			String	attrName = null;
			// Attribute Extraction
			String	attrLocalName;
			int		numAttrs;
			int		idxAttr;
			final String S_ProcName = "startElement";
			final String S_LocalName = "LocalName";

			assert qName.equals( "RspnPopSubDep1Created" );

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
				else if( attrLocalName.equals( "RelationTenantId" ) ) {
					if( attrRelationTenantId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrRelationTenantId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "RelationId" ) ) {
					if( attrRelationId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrRelationId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "PopTopDepTenantId" ) ) {
					if( attrPopTopDepTenantId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrPopTopDepTenantId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "PopTopDepId" ) ) {
					if( attrPopTopDepId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrPopTopDepId = attrs.getValue( idxAttr );
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
			if( ( attrRelationTenantId == null ) || ( attrRelationTenantId.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"RelationTenantId" );
			}
			if( ( attrRelationId == null ) || ( attrRelationId.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"RelationId" );
			}
			if( ( attrPopTopDepTenantId == null ) || ( attrPopTopDepTenantId.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"PopTopDepTenantId" );
			}
			if( ( attrPopTopDepId == null ) || ( attrPopTopDepId.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"PopTopDepId" );
			}
			if( attrName == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"Name" );
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

			long natRelationTenantId = Long.parseLong( attrRelationTenantId );

			long natRelationId = Long.parseLong( attrRelationId );

			long natPopTopDepTenantId = Long.parseLong( attrPopTopDepTenantId );

			long natPopTopDepId = Long.parseLong( attrPopTopDepId );

			String natName = attrName;

			// Instantiate a buffer for the parsed information
			ICFBamPopSubDep1Obj obj = (ICFBamPopSubDep1Obj)schemaObj.getPopSubDep1TableObj().newInstance();
			CFBamPopSubDep1Buff dataBuff = obj.getPopSubDep1Buff();
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
			dataBuff.setOptionalDefSchemaTenantId( natDefSchemaTenantId );
			dataBuff.setOptionalDefSchemaId( natDefSchemaId );
			dataBuff.setRequiredRelationTenantId( natRelationTenantId );
			dataBuff.setRequiredRelationId( natRelationId );
			dataBuff.setRequiredPopTopDepTenantId( natPopTopDepTenantId );
			dataBuff.setRequiredPopTopDepId( natPopTopDepId );
			dataBuff.setRequiredName( natName );
			obj.copyBuffToPKey();
			ICFBamPopSubDep1Obj realised = (ICFBamPopSubDep1Obj)obj.realise();
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
