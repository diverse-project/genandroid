/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genandroid.impl;

import genandroid.AndroidProject;
import genandroid.BackgroundActivity;
import genandroid.ClassDetail;
import genandroid.DataModel;
import genandroid.GenandroidPackage;
import genandroid.PresentationModel;
import genandroid.PreferenceViewActivity;
import genandroid.ViewActivity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Android Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link genandroid.impl.AndroidProjectImpl#getDataModel <em>Data Model</em>}</li>
 *   <li>{@link genandroid.impl.AndroidProjectImpl#getPackagePrefix <em>Package Prefix</em>}</li>
 *   <li>{@link genandroid.impl.AndroidProjectImpl#getFileHeader <em>File Header</em>}</li>
 *   <li>{@link genandroid.impl.AndroidProjectImpl#getPresentationModel <em>Presentation Model</em>}</li>
 *   <li>{@link genandroid.impl.AndroidProjectImpl#getJavaSourceFolder <em>Java Source Folder</em>}</li>
 *   <li>{@link genandroid.impl.AndroidProjectImpl#getResFolder <em>Res Folder</em>}</li>
 *   <li>{@link genandroid.impl.AndroidProjectImpl#getManifestFolder <em>Manifest Folder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AndroidProjectImpl extends NamedElementImpl implements AndroidProject {
	/**
	 * The cached value of the '{@link #getDataModel() <em>Data Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataModel()
	 * @generated
	 * @ordered
	 */
	protected DataModel dataModel;

	/**
	 * The default value of the '{@link #getPackagePrefix() <em>Package Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagePrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackagePrefix() <em>Package Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagePrefix()
	 * @generated
	 * @ordered
	 */
	protected String packagePrefix = PACKAGE_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileHeader() <em>File Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileHeader()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_HEADER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileHeader() <em>File Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileHeader()
	 * @generated
	 * @ordered
	 */
	protected String fileHeader = FILE_HEADER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPresentationModel() <em>Presentation Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationModel()
	 * @generated
	 * @ordered
	 */
	protected PresentationModel presentationModel;

	/**
	 * The default value of the '{@link #getJavaSourceFolder() <em>Java Source Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaSourceFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_SOURCE_FOLDER_EDEFAULT = "src/main/java/";

	/**
	 * The cached value of the '{@link #getJavaSourceFolder() <em>Java Source Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaSourceFolder()
	 * @generated
	 * @ordered
	 */
	protected String javaSourceFolder = JAVA_SOURCE_FOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getResFolder() <em>Res Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String RES_FOLDER_EDEFAULT = "src/main/res/";

	/**
	 * The cached value of the '{@link #getResFolder() <em>Res Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResFolder()
	 * @generated
	 * @ordered
	 */
	protected String resFolder = RES_FOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getManifestFolder() <em>Manifest Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifestFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String MANIFEST_FOLDER_EDEFAULT = "src/main/";

	/**
	 * The cached value of the '{@link #getManifestFolder() <em>Manifest Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifestFolder()
	 * @generated
	 * @ordered
	 */
	protected String manifestFolder = MANIFEST_FOLDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndroidProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenandroidPackage.Literals.ANDROID_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModel getDataModel() {
		return dataModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataModel(DataModel newDataModel, NotificationChain msgs) {
		DataModel oldDataModel = dataModel;
		dataModel = newDataModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenandroidPackage.ANDROID_PROJECT__DATA_MODEL, oldDataModel, newDataModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataModel(DataModel newDataModel) {
		if (newDataModel != dataModel) {
			NotificationChain msgs = null;
			if (dataModel != null)
				msgs = ((InternalEObject)dataModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenandroidPackage.ANDROID_PROJECT__DATA_MODEL, null, msgs);
			if (newDataModel != null)
				msgs = ((InternalEObject)newDataModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenandroidPackage.ANDROID_PROJECT__DATA_MODEL, null, msgs);
			msgs = basicSetDataModel(newDataModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.ANDROID_PROJECT__DATA_MODEL, newDataModel, newDataModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackagePrefix() {
		return packagePrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackagePrefix(String newPackagePrefix) {
		String oldPackagePrefix = packagePrefix;
		packagePrefix = newPackagePrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.ANDROID_PROJECT__PACKAGE_PREFIX, oldPackagePrefix, packagePrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileHeader() {
		return fileHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileHeader(String newFileHeader) {
		String oldFileHeader = fileHeader;
		fileHeader = newFileHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.ANDROID_PROJECT__FILE_HEADER, oldFileHeader, fileHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationModel getPresentationModel() {
		return presentationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresentationModel(PresentationModel newPresentationModel, NotificationChain msgs) {
		PresentationModel oldPresentationModel = presentationModel;
		presentationModel = newPresentationModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenandroidPackage.ANDROID_PROJECT__PRESENTATION_MODEL, oldPresentationModel, newPresentationModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentationModel(PresentationModel newPresentationModel) {
		if (newPresentationModel != presentationModel) {
			NotificationChain msgs = null;
			if (presentationModel != null)
				msgs = ((InternalEObject)presentationModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenandroidPackage.ANDROID_PROJECT__PRESENTATION_MODEL, null, msgs);
			if (newPresentationModel != null)
				msgs = ((InternalEObject)newPresentationModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenandroidPackage.ANDROID_PROJECT__PRESENTATION_MODEL, null, msgs);
			msgs = basicSetPresentationModel(newPresentationModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.ANDROID_PROJECT__PRESENTATION_MODEL, newPresentationModel, newPresentationModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJavaSourceFolder() {
		return javaSourceFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaSourceFolder(String newJavaSourceFolder) {
		String oldJavaSourceFolder = javaSourceFolder;
		javaSourceFolder = newJavaSourceFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.ANDROID_PROJECT__JAVA_SOURCE_FOLDER, oldJavaSourceFolder, javaSourceFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResFolder() {
		return resFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResFolder(String newResFolder) {
		String oldResFolder = resFolder;
		resFolder = newResFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.ANDROID_PROJECT__RES_FOLDER, oldResFolder, resFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManifestFolder() {
		return manifestFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManifestFolder(String newManifestFolder) {
		String oldManifestFolder = manifestFolder;
		manifestFolder = newManifestFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenandroidPackage.ANDROID_PROJECT__MANIFEST_FOLDER, oldManifestFolder, manifestFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenandroidPackage.ANDROID_PROJECT__DATA_MODEL:
				return basicSetDataModel(null, msgs);
			case GenandroidPackage.ANDROID_PROJECT__PRESENTATION_MODEL:
				return basicSetPresentationModel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenandroidPackage.ANDROID_PROJECT__DATA_MODEL:
				return getDataModel();
			case GenandroidPackage.ANDROID_PROJECT__PACKAGE_PREFIX:
				return getPackagePrefix();
			case GenandroidPackage.ANDROID_PROJECT__FILE_HEADER:
				return getFileHeader();
			case GenandroidPackage.ANDROID_PROJECT__PRESENTATION_MODEL:
				return getPresentationModel();
			case GenandroidPackage.ANDROID_PROJECT__JAVA_SOURCE_FOLDER:
				return getJavaSourceFolder();
			case GenandroidPackage.ANDROID_PROJECT__RES_FOLDER:
				return getResFolder();
			case GenandroidPackage.ANDROID_PROJECT__MANIFEST_FOLDER:
				return getManifestFolder();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GenandroidPackage.ANDROID_PROJECT__DATA_MODEL:
				setDataModel((DataModel)newValue);
				return;
			case GenandroidPackage.ANDROID_PROJECT__PACKAGE_PREFIX:
				setPackagePrefix((String)newValue);
				return;
			case GenandroidPackage.ANDROID_PROJECT__FILE_HEADER:
				setFileHeader((String)newValue);
				return;
			case GenandroidPackage.ANDROID_PROJECT__PRESENTATION_MODEL:
				setPresentationModel((PresentationModel)newValue);
				return;
			case GenandroidPackage.ANDROID_PROJECT__JAVA_SOURCE_FOLDER:
				setJavaSourceFolder((String)newValue);
				return;
			case GenandroidPackage.ANDROID_PROJECT__RES_FOLDER:
				setResFolder((String)newValue);
				return;
			case GenandroidPackage.ANDROID_PROJECT__MANIFEST_FOLDER:
				setManifestFolder((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GenandroidPackage.ANDROID_PROJECT__DATA_MODEL:
				setDataModel((DataModel)null);
				return;
			case GenandroidPackage.ANDROID_PROJECT__PACKAGE_PREFIX:
				setPackagePrefix(PACKAGE_PREFIX_EDEFAULT);
				return;
			case GenandroidPackage.ANDROID_PROJECT__FILE_HEADER:
				setFileHeader(FILE_HEADER_EDEFAULT);
				return;
			case GenandroidPackage.ANDROID_PROJECT__PRESENTATION_MODEL:
				setPresentationModel((PresentationModel)null);
				return;
			case GenandroidPackage.ANDROID_PROJECT__JAVA_SOURCE_FOLDER:
				setJavaSourceFolder(JAVA_SOURCE_FOLDER_EDEFAULT);
				return;
			case GenandroidPackage.ANDROID_PROJECT__RES_FOLDER:
				setResFolder(RES_FOLDER_EDEFAULT);
				return;
			case GenandroidPackage.ANDROID_PROJECT__MANIFEST_FOLDER:
				setManifestFolder(MANIFEST_FOLDER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GenandroidPackage.ANDROID_PROJECT__DATA_MODEL:
				return dataModel != null;
			case GenandroidPackage.ANDROID_PROJECT__PACKAGE_PREFIX:
				return PACKAGE_PREFIX_EDEFAULT == null ? packagePrefix != null : !PACKAGE_PREFIX_EDEFAULT.equals(packagePrefix);
			case GenandroidPackage.ANDROID_PROJECT__FILE_HEADER:
				return FILE_HEADER_EDEFAULT == null ? fileHeader != null : !FILE_HEADER_EDEFAULT.equals(fileHeader);
			case GenandroidPackage.ANDROID_PROJECT__PRESENTATION_MODEL:
				return presentationModel != null;
			case GenandroidPackage.ANDROID_PROJECT__JAVA_SOURCE_FOLDER:
				return JAVA_SOURCE_FOLDER_EDEFAULT == null ? javaSourceFolder != null : !JAVA_SOURCE_FOLDER_EDEFAULT.equals(javaSourceFolder);
			case GenandroidPackage.ANDROID_PROJECT__RES_FOLDER:
				return RES_FOLDER_EDEFAULT == null ? resFolder != null : !RES_FOLDER_EDEFAULT.equals(resFolder);
			case GenandroidPackage.ANDROID_PROJECT__MANIFEST_FOLDER:
				return MANIFEST_FOLDER_EDEFAULT == null ? manifestFolder != null : !MANIFEST_FOLDER_EDEFAULT.equals(manifestFolder);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (packagePrefix: ");
		result.append(packagePrefix);
		result.append(", fileHeader: ");
		result.append(fileHeader);
		result.append(", javaSourceFolder: ");
		result.append(javaSourceFolder);
		result.append(", resFolder: ");
		result.append(resFolder);
		result.append(", manifestFolder: ");
		result.append(manifestFolder);
		result.append(')');
		return result.toString();
	}

} //AndroidProjectImpl
