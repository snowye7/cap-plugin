import {
  ListenerCallback,
  PluginListenerHandle,
  WebPlugin,
} from '@capacitor/core';

import type { ExamplePlugin, RequestProxyProps } from './definitions';

export class ExampleWeb extends WebPlugin implements ExamplePlugin {
  addListener(
    eventName: 'message',
    listenerFunc: ListenerCallback,
  ): Promise<PluginListenerHandle> {
    return super.addListener(eventName, listenerFunc);
  }
  async sendLoginBroadcast() {}
  async sendLogOutBroadcast() {}
  async getRecord() {}
  async requestProxy(props: RequestProxyProps) {}
}
