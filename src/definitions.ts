export interface ExamplePlugin {
  sendLoginBroadcast: () => Promise<any>;
  sendLogOutBroadcast: () => Promise<any>;
  getRecord: () => Promise<any>;
}
