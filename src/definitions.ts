import { ListenerCallback, PluginListenerHandle } from '@capacitor/core';

export interface RequestProxyProps {
  url: string;
  method: 'GET' | 'POST' | 'DELETE' | 'PUT';
  data?: Record<string, any>;
}
export interface ExamplePlugin {
  sendLoginBroadcast: () => Promise<any>;
  sendLogOutBroadcast: () => Promise<any>;
  getRecord: () => Promise<any>;
  requestProxy: (props: RequestProxyProps) => Promise<any>;
  addListener: (
    eventName: 'message',
    listenerFunc: ListenerCallback,
  ) => Promise<PluginListenerHandle>;
}
