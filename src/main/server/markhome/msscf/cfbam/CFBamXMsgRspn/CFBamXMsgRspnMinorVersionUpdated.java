
// Description: Java 11 XML Message SAX Response Record Element  for MinorVersion

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
 *	CFBamXMsgRspnMinorVersionUpdated XML SAX Element  implementation
 *	for MinorVersion.
 */
public class CFBamXMsgRspnMinorVersionUpdated
	extends CFLibXmlCoreElementHandler
{
	public CFBamXMsgRspnMinorVersionUpdated( CFBamXMsgRspn xmsgRspn ) {
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
			// MinorVersion Attributes
			String	attrTenantId = null;
			String	attrMajorVersionId = null;
			String	attrName = null;
			String	attrDescription = null;
			String attrCreatedAt = null;
			String attrCreatedBy = null;
			String attrUpdatedAt = null;
			String attrUpdatedBy = null;
			// Attribute Extraction
			String	attrLocalName;
			int		numAttrs;
			int		idxAttr;
			final String S_ProcName = "startElement";
			final String S_LocalName = "LocalName";

			assert qName.equals( "RspnMinorVersionUpdated" );

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
				else if( attrLocalName.equals( "MajorVersionId" ) ) {
					if( attrMajorVersionId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrMajorVersionId = attrs.getValue( idxAttr );
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
				else if( attrLocalName.equals( "Description" ) ) {
					if( attrDescription != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrDescription = attrs.getValue( idxAttr );
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
			if( ( attrMajorVersionId == null ) || ( attrMajorVersionId.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"MajorVersionId" );
			}
			if( attrName == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"Name" );
			}
			if( ( attrRevision == null ) || ( attrRevision.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"Revision" );
			}

			// Save named attributes to context
			CFLibXmlCoreContext curContext = getParser().getCurContext();

			// Convert string attributes to native Java types

			long natTenantId = Long.parseLong( attrTenantId );

			long natId = Long.parseLong( attrId );

			long natMajorVersionId = Long.parseLong( attrMajorVersionId );

			String natName = attrName;

			String natDescription = attrDescription;

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
			// Instantiate a buffer for the parsed information
			ICFBamMinorVersionObj obj = (ICFBamMinorVersionObj)schemaObj.getMinorVersionTableObj().newInstance();
			CFIntMinorVersionBuff dataBuff = obj.getMinorVersionBuff();
			dataBuff.setRequiredTenantId( natTenantId );
			dataBuff.setRequiredId( natId );
			dataBuff.setRequiredMajorVersionId( natMajorVersionId );
			dataBuff.setRequiredName( natName );
			dataBuff.setOptionalDescription( natDescription );
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
			obj.copyBuffToPKey();
			ICFBamMinorVersionObj realised = (ICFBamMinorVersionObj)obj.realise();
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
