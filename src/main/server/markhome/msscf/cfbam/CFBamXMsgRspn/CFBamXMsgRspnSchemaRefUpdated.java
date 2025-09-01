
// Description: Java 11 XML Message SAX Response Record Element  for SchemaRef

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
 *	CFBamXMsgRspnSchemaRefUpdated XML SAX Element  implementation
 *	for SchemaRef.
 */
public class CFBamXMsgRspnSchemaRefUpdated
	extends CFLibXmlCoreElementHandler
{
	public CFBamXMsgRspnSchemaRefUpdated( CFBamXMsgRspn xmsgRspn ) {
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
			// SchemaRef Attributes
			String	attrSchemaId = null;
			String	attrName = null;
			String	attrRefModelName = null;
			String	attrIncludeRoot = null;
			String	attrRefSchemaTenantId = null;
			String	attrRefSchemaId = null;
			String	attrPrevTenantId = null;
			String	attrPrevId = null;
			String	attrNextTenantId = null;
			String	attrNextId = null;
			// Attribute Extraction
			String	attrLocalName;
			int		numAttrs;
			int		idxAttr;
			final String S_ProcName = "startElement";
			final String S_LocalName = "LocalName";

			assert qName.equals( "RspnSchemaRefUpdated" );

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
				else if( attrLocalName.equals( "SchemaId" ) ) {
					if( attrSchemaId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrSchemaId = attrs.getValue( idxAttr );
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
				else if( attrLocalName.equals( "RefModelName" ) ) {
					if( attrRefModelName != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrRefModelName = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "IncludeRoot" ) ) {
					if( attrIncludeRoot != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrIncludeRoot = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "RefSchemaTenantId" ) ) {
					if( attrRefSchemaTenantId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrRefSchemaTenantId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "RefSchemaId" ) ) {
					if( attrRefSchemaId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrRefSchemaId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "PrevTenantId" ) ) {
					if( attrPrevTenantId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrPrevTenantId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "PrevId" ) ) {
					if( attrPrevId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrPrevId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "NextTenantId" ) ) {
					if( attrNextTenantId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrNextTenantId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "NextId" ) ) {
					if( attrNextId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrNextId = attrs.getValue( idxAttr );
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
			if( ( attrSchemaId == null ) || ( attrSchemaId.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"SchemaId" );
			}
			if( attrName == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"Name" );
			}
			if( attrRefModelName == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"RefModelName" );
			}
			if( attrIncludeRoot == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"IncludeRoot" );
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
			long natSchemaId = Long.parseLong( attrSchemaId );

			String natName = attrName;

			String natRefModelName = attrRefModelName;

			String natIncludeRoot = attrIncludeRoot;

			Long natRefSchemaTenantId;
			if( ( attrRefSchemaTenantId == null ) || ( attrRefSchemaTenantId.length() <= 0 ) ) {
				natRefSchemaTenantId = null;
			}
			else {
				natRefSchemaTenantId = Long.valueOf( Long.parseLong( attrRefSchemaTenantId ) );
			}

			Long natRefSchemaId;
			if( ( attrRefSchemaId == null ) || ( attrRefSchemaId.length() <= 0 ) ) {
				natRefSchemaId = null;
			}
			else {
				natRefSchemaId = Long.valueOf( Long.parseLong( attrRefSchemaId ) );
			}

			Long natPrevTenantId;
			if( ( attrPrevTenantId == null ) || ( attrPrevTenantId.length() <= 0 ) ) {
				natPrevTenantId = null;
			}
			else {
				natPrevTenantId = Long.valueOf( Long.parseLong( attrPrevTenantId ) );
			}

			Long natPrevId;
			if( ( attrPrevId == null ) || ( attrPrevId.length() <= 0 ) ) {
				natPrevId = null;
			}
			else {
				natPrevId = Long.valueOf( Long.parseLong( attrPrevId ) );
			}

			Long natNextTenantId;
			if( ( attrNextTenantId == null ) || ( attrNextTenantId.length() <= 0 ) ) {
				natNextTenantId = null;
			}
			else {
				natNextTenantId = Long.valueOf( Long.parseLong( attrNextTenantId ) );
			}

			Long natNextId;
			if( ( attrNextId == null ) || ( attrNextId.length() <= 0 ) ) {
				natNextId = null;
			}
			else {
				natNextId = Long.valueOf( Long.parseLong( attrNextId ) );
			}

			// Instantiate a buffer for the parsed information
			ICFBamSchemaRefObj obj = (ICFBamSchemaRefObj)schemaObj.getSchemaRefTableObj().newInstance();
			CFBamSchemaRefBuff dataBuff = obj.getSchemaRefBuff();
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
			dataBuff.setRequiredSchemaId( natSchemaId );
			dataBuff.setRequiredName( natName );
			dataBuff.setRequiredRefModelName( natRefModelName );
			dataBuff.setRequiredIncludeRoot( natIncludeRoot );
			dataBuff.setOptionalRefSchemaTenantId( natRefSchemaTenantId );
			dataBuff.setOptionalRefSchemaId( natRefSchemaId );
			dataBuff.setOptionalPrevTenantId( natPrevTenantId );
			dataBuff.setOptionalPrevId( natPrevId );
			dataBuff.setOptionalNextTenantId( natNextTenantId );
			dataBuff.setOptionalNextId( natNextId );
			obj.copyBuffToPKey();
			ICFBamSchemaRefObj realised = (ICFBamSchemaRefObj)obj.realise();
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
