
// Description: Java 11 XML Message SAX Response Record Element  for DelSubDep3

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
 *	CFBamXMsgRspnDelSubDep3Created XML SAX Element  implementation
 *	for DelSubDep3.
 */
public class CFBamXMsgRspnDelSubDep3Created
	extends CFLibXmlCoreElementHandler
{
	public CFBamXMsgRspnDelSubDep3Created( CFBamXMsgRspn xmsgRspn ) {
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
			// DelDep Attributes
			String	attrDefSchemaTenantId = null;
			String	attrDefSchemaId = null;
			String	attrRelationTenantId = null;
			String	attrRelationId = null;
			// DelSubDep3 Attributes
			String	attrDelSubDep2TenantId = null;
			String	attrDelSubDep2Id = null;
			String	attrName = null;
			// Attribute Extraction
			String	attrLocalName;
			int		numAttrs;
			int		idxAttr;
			final String S_ProcName = "startElement";
			final String S_LocalName = "LocalName";

			assert qName.equals( "RspnDelSubDep3Created" );

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
				else if( attrLocalName.equals( "DelSubDep2TenantId" ) ) {
					if( attrDelSubDep2TenantId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrDelSubDep2TenantId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "DelSubDep2Id" ) ) {
					if( attrDelSubDep2Id != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrDelSubDep2Id = attrs.getValue( idxAttr );
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
			if( ( attrDelSubDep2TenantId == null ) || ( attrDelSubDep2TenantId.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"DelSubDep2TenantId" );
			}
			if( ( attrDelSubDep2Id == null ) || ( attrDelSubDep2Id.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"DelSubDep2Id" );
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

			long natDelSubDep2TenantId = Long.parseLong( attrDelSubDep2TenantId );

			long natDelSubDep2Id = Long.parseLong( attrDelSubDep2Id );

			String natName = attrName;

			// Instantiate a buffer for the parsed information
			ICFBamDelSubDep3Obj obj = (ICFBamDelSubDep3Obj)schemaObj.getDelSubDep3TableObj().newInstance();
			CFBamDelSubDep3Buff dataBuff = obj.getDelSubDep3Buff();
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
			dataBuff.setRequiredDelSubDep2TenantId( natDelSubDep2TenantId );
			dataBuff.setRequiredDelSubDep2Id( natDelSubDep2Id );
			dataBuff.setRequiredName( natName );
			obj.copyBuffToPKey();
			ICFBamDelSubDep3Obj realised = (ICFBamDelSubDep3Obj)obj.realise();
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
